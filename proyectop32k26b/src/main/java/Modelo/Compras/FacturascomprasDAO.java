/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Compras;
//Librerias
import Controlador.Compras.clsFacturascompras ;
import Modelo.Conexion;
import Modelo.BitacoraDAO;
import Controlador.clsUsuarioConectado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Isaias Cedillo 9959-24-1672
 */
public class FacturascomprasDAO {
        private static final int APL_CODIGO = 3000; //codigo de app
        public List<clsFacturascompras > listar() {

        List<clsFacturascompras > lista = new ArrayList<>();

        String sql = "SELECT * FROM Facturascompras ";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                clsFacturascompras  factura = new clsFacturascompras ();

                factura.setFaccomid(rs.getInt("Faccomid"));
                factura.setFaccomnumero(rs.getString("Faccomnumero"));
                factura.setFaccomfecha(rs.getDate("Faccomfecha"));
                factura.setAcrecodigo(rs.getInt("Acrecodigo"));
                factura.setFaccomsubtotal(rs.getDouble("Faccomsubtotal"));
                factura.setFaccomiva(rs.getDouble("Faccomiva"));
                factura.setFaccomtotal(rs.getDouble("Faccomtotal"));
                factura.setFaccomestado(rs.getString("Faccomestado"));

                lista.add(factura);
            }
            } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
        // INSERTAR
    public void insert(clsFacturascompras  factura) {

        String sql = "INSERT INTO Facturascompras  "
                + "(Faccomnumero, Faccomfecha, Acrecodigo, "
                + "Faccomsubtotal, Faccomiva, Faccomtotal, Faccomestado) "
                + "VALUES (?,?,?,?,?,?,?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, factura.getFaccomnumero());

            // Conversión de java.util.Date a java.sql.Date
            ps.setDate(2, new java.sql.Date(
                    factura.getFaccomfecha().getTime()));

            ps.setInt(3, factura.getAcrecodigo());
            ps.setDouble(4, factura.getFaccomsubtotal());
            ps.setDouble(5, factura.getFaccomiva());
            ps.setDouble(6, factura.getFaccomtotal());
            ps.setString(7, factura.getFaccomestado());
             ps.executeUpdate();

            new BitacoraDAO().insert(
                    clsUsuarioConectado.getUsuId(),
                    APL_CODIGO,
                    "INSERT"
            );

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(
                    "Error al insertar factura de compra", e);
        }
    }
    // ACTUALIZAR
    public void update(clsFacturascompras  factura) {

        String sql = "UPDATE Facturascompras  SET "
                + "Faccomnumero=?, "
                + "Faccomfecha=?, "
                + "Acrecodigo=?, "
                + "Faccomsubtotal=?, "
                + "Faccomiva=?, "
                + "Faccomtotal=?, "
                + "Faccomestado=? "
                + "WHERE Faccomid=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, factura.getFaccomnumero());

            ps.setDate(2, new java.sql.Date(
                    factura.getFaccomfecha().getTime()));

            ps.setInt(3, factura.getAcrecodigo());
            ps.setDouble(4, factura.getFaccomsubtotal());
            ps.setDouble(5, factura.getFaccomiva());
            ps.setDouble(6, factura.getFaccomtotal());
            ps.setString(7, factura.getFaccomestado());

            ps.setInt(8, factura.getFaccomid());

            int rows = ps.executeUpdate();

            if (rows == 0) {
                throw new RuntimeException(
                        "No se encontró la factura para actualizar");
            }

            new BitacoraDAO().insert(
                    clsUsuarioConectado.getUsuId(),
                    APL_CODIGO,
                    "UPDATE"
            );

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(
                    "Error al actualizar factura", e);
        }
    }
    // ELIMINAR
    public void delete(int idFactura) {

        String sql = "DELETE FROM Facturascompras  "
                + "WHERE Faccomid=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idFactura);

            int rows = ps.executeUpdate();

            if (rows == 0) {
                throw new RuntimeException(
                        "No se encontró la factura para eliminar");
            }

            new BitacoraDAO().insert(
                    clsUsuarioConectado.getUsuId(),
                    APL_CODIGO,
                    "DELETE"
            );

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(
                    "Error al eliminar factura", e);
        }
    }
     // CONSULTAR POR ID
    public clsFacturascompras  query(int idFactura) {

        clsFacturascompras  factura = null;

        String sql = "SELECT * FROM Facturascompras  "
                + "WHERE Faccomid=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idFactura);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    factura = new clsFacturascompras ();

                    factura.setFaccomid(rs.getInt("Faccomid"));
                    factura.setFaccomnumero(rs.getString("Faccomnumero"));
                    factura.setFaccomfecha(rs.getDate("Faccomfecha"));
                    factura.setAcrecodigo(rs.getInt("Acrecodigo"));
                    factura.setFaccomsubtotal(rs.getDouble("Faccomsubtotal"));
                    factura.setFaccomiva(rs.getDouble("Faccomiva"));
                    factura.setFaccomtotal(rs.getDouble("Faccomtotal"));
                    factura.setFaccomestado(rs.getString("Faccomestado"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(
                    "Error al consultar factura", e);
        }

        return factura;
    }
}
