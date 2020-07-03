package DAO;

import Modelo.DetalleIngreso_;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Álvaro
 */
public class DetalleIngresoDAO {

    ConexionBD cc = new ConexionBD();
    Connection cn = cc.conectar();
    String sSql = " ";
    ResultSet rs;
    Statement st;
    int totalregistros;

    public boolean CrearDetalle(DetalleIngreso_ d) {

        sSql = "INSERT INTO detalle_ingreso(nit, codigo_planta, cantidad, fecha, costo_compra, codigo_ingreso)"
                + " values (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setString(1, d.getNit());
            pst.setInt(2, d.getCodigoEspecie());
            pst.setInt(3, d.getCantidad());
            pst.setDate(4, d.getFecha());
            pst.setLong(5, d.getCosto_compra());
            pst.setInt(6, d.getCodigo_ingreso());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {

            if (ex.getMessage().contains("Duplicate")) {

                JOptionPane.showMessageDialog(null, "Especie ya creada.");

            } else {
                System.out.println(ex.getMessage());
            }

            return false;
        }
    }

    public ResultSet buscarEspecie(String busca, String fechaInicio, String fechaFin) throws SQLException {
        sSql = "SELECT d.cantidad, to_char(d.fecha, 'DD/MM/YYYY') AS fecha, p.nombre_vulgar, i.tamaño_bolsa, i.rango, r.nombre, d.costo_compra FROM ingreso_planta i, detalle_ingreso d, planta p, proveedor r WHERE (p.nombre_vulgar LIKE '" + busca + "%' OR "
                + "p.nombre_cientifico LIKE '" + busca + "%' OR r.nombre LIKE '" + busca + "%' OR r.nit LIKE '" + busca + "%')"
                + " AND d.fecha BETWEEN '" + fechaInicio + "' AND '" + fechaFin + "' AND p.codigo_planta = d.codigo_planta AND "
                + "i.codigo_planta = d.codigo_planta AND d.codigo_ingreso = i.codigo_ingreso ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscarEspecieFecha(String fechaInicio, String fechaFin) throws SQLException {
        sSql = "SELECT d.cantidad, to_char(d.fecha, 'DD/MM/YYYY') AS fecha, p.nombre_vulgar, i.tamaño_bolsa, i.rango, r.nombre, d.costo_compra FROM ingreso_planta i, detalle_ingreso d, planta p, proveedor r WHERE d.fecha BETWEEN '" + fechaInicio + "' AND "
                + "'" + fechaFin + "' AND p.codigo_planta = d.codigo_planta AND r.nit = d.nit AND p.codigo_planta = i.codigo_planta AND "
                + "i.codigo_planta = d.codigo_planta AND d.codigo_ingreso = i.codigo_ingreso ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public boolean eliminar(int codigo_planta, int nit, String tamaño_bolsa, String fecha) {

        sSql = "DELETE FROM detalle_ingreso WHERE codigo_planta = '" + codigo_planta + "'"
                + "AND tamaño_bolsa = '" + tamaño_bolsa + "' AND nit = '" + nit + "' AND fecha = '" + fecha + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean restar(int codigo_ingreso, int cantidad, String tamaño_bolsa, String rango) {

        sSql = "UPDATE ingreso_planta SET disponibles = disponibles - '" + cantidad + "', stock = (disponibles - '" + cantidad + "') + reservas  WHERE "
                + " tamaño_bolsa = '" + tamaño_bolsa + "' AND rango = '" + rango + "' AND codigo_ingreso = '" + codigo_ingreso + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public boolean sumar(int codigo_ingreso, int cantidad, String tamaño_bolsa, String rango) {

        sSql = "UPDATE ingreso_planta SET disponibles = disponibles + '" + cantidad + "'  WHERE "
                + " tamaño_bolsa = '" + tamaño_bolsa + "' AND rango = '" + rango + "' AND codigo_ingreso = '" + codigo_ingreso + "'";

        try {

            PreparedStatement pst = cn.prepareStatement(sSql);

            int i = pst.executeUpdate();

            if (i != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

}
