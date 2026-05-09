package Modelo.Logistica;

import Modelo.Conexion;
import Controlador.Logistica.clsProductos;
import java.sql.*;
import java.util.*;

/**
 * Autor: Anthony Hetzael Suc Gomez
 * Carné: 9959-24-389
 * Fecha de creación: 2026
 * 
 * Descripción:
 * DAO encargado de gestionar las operaciones CRUD de la tabla productos.
 * Permite insertar, actualizar, eliminar, listar y buscar registros en la base de datos.
 */
public class ProductosDAO {

    // INSERTAR
    public boolean insertar(clsProductos obj) {
        String sql = "INSERT INTO productos (Prodnombre, Prodpuntoreorden) VALUES (?, ?)";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, obj.getProdnombre());
            ps.setInt(2, obj.getProdpuntoreorden());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ACTUALIZAR
    public boolean actualizar(clsProductos obj) {
        String sql = "UPDATE productos SET Prodnombre=?, Prodpuntoreorden=? WHERE Prodid=?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, obj.getProdnombre());
            ps.setInt(2, obj.getProdpuntoreorden());
            ps.setInt(3, obj.getProdid());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ELIMINAR
    public boolean eliminar(int id) {
        String sql = "DELETE FROM productos WHERE Prodid=?";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // LISTAR
    public List<clsProductos> listar() {
        List<clsProductos> lista = new ArrayList<>();
        String sql = "SELECT * FROM productos";

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                clsProductos obj = new clsProductos();

                obj.setProdid(rs.getInt("Prodid"));
                obj.setProdnombre(rs.getString("Prodnombre"));
                obj.setProdpuntoreorden(rs.getInt("Prodpuntoreorden"));

                lista.add(obj);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // BUSCAR POR ID
    public clsProductos buscarPorId(int id) {
        String sql = "SELECT * FROM productos WHERE Prodid=?";
        clsProductos obj = null;

        try (Connection con = Conexion.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                obj = new clsProductos();

                obj.setProdid(rs.getInt("Prodid"));
                obj.setProdnombre(rs.getString("Prodnombre"));
                obj.setProdpuntoreorden(rs.getInt("Prodpuntoreorden"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return obj;
    }
}