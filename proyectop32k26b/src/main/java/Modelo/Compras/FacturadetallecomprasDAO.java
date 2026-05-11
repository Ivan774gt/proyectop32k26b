/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Compras;
import Controlador.Compras.clsFacturadetallecompras;
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
 * @author Isaias Cedillo
 */
public class FacturadetallecomprasDAO {
        private static final int APL_CODIGO = 3002;
         // LISTAR
    public List<clsFacturadetallecompras> listar() {

        List<clsFacturadetallecompras> lista = new ArrayList<>();

        String sql = "SELECT * FROM FacturaDetalleCompras";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                clsFacturadetallecompras detalle =
                        new clsFacturadetallecompras();

                detalle.setFaccomdetid(
                        rs.getInt("Faccomdetid"));

                detalle.setFaccomid(
                        rs.getInt("Faccomid"));

                detalle.setProid(
                        rs.getInt("Proid"));

                detalle.setFaccomcantidad(
                        rs.getDouble("Faccomcantidad"));

                detalle.setFaccomprecio(
                        rs.getDouble("Faccomprecio"));

                detalle.setFaccomsubtotal(
                        rs.getDouble("Faccomsubtotal"));

                lista.add(detalle);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    // ACTUALIZAR
    public void update(clsFacturadetallecompras detalle) {

        String sql =
                "UPDATE FacturaDetalleCompras SET "
              + "Faccomid=?, "
              + "Proid=?, "
              + "Faccomcantidad=?, "
              + "Faccomprecio=?, "
              + "Faccomsubtotal=? "
              + "WHERE Faccomdetid=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, detalle.getFaccomid());
            ps.setInt(2, detalle.getProid());
            ps.setDouble(3, detalle.getFaccomcantidad());
            ps.setDouble(4, detalle.getFaccomprecio());
            ps.setDouble(5, detalle.getFaccomsubtotal());

            ps.setInt(6, detalle.getFaccomdetid());

            int rows = ps.executeUpdate();

            if (rows == 0) {

                throw new RuntimeException(
                        "No se encontró el detalle para actualizar");
            }

            new BitacoraDAO().insert(
                    clsUsuarioConectado.getUsuId(),
                    APL_CODIGO,
                    "UPDATE"
            );

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Error al actualizar detalle", e);
        }
    }
    // ELIMINAR
    public void delete(int idDetalle) {

        String sql =
                "DELETE FROM FacturaDetalleCompras "
              + "WHERE Faccomdetid=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idDetalle);

            int rows = ps.executeUpdate();

            if (rows == 0) {

                throw new RuntimeException(
                        "No se encontró el detalle para eliminar");
            }

            new BitacoraDAO().insert(
                    clsUsuarioConectado.getUsuId(),
                    APL_CODIGO,
                    "DELETE"
            );

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Error al eliminar detalle", e);
        }
    }

    // CONSULTAR
    public clsFacturadetallecompras query(int idDetalle) {

        clsFacturadetallecompras detalle = null;

        String sql =
                "SELECT * FROM FacturaDetalleCompras "
              + "WHERE Faccomdetid=?";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idDetalle);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    detalle = new clsFacturadetallecompras();

                    detalle.setFaccomdetid(
                            rs.getInt("Faccomdetid"));

                    detalle.setFaccomid(
                            rs.getInt("Faccomid"));

                    detalle.setProid(
                            rs.getInt("Proid"));

                    detalle.setFaccomcantidad(
                            rs.getDouble("Faccomcantidad"));

                    detalle.setFaccomprecio(
                            rs.getDouble("Faccomprecio"));

                    detalle.setFaccomsubtotal(
                            rs.getDouble("Faccomsubtotal"));
                }
            }

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Error al consultar detalle", e);
        }

        return detalle;
    }
}
