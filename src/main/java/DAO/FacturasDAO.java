package DAO;

import Modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FacturasDAO {

    ConexionBD cc = new ConexionBD();
    Connection cn;
    String sSql = " ";
    ResultSet rs;
    Statement st;

    public FacturasDAO() {

        cn = cc.conectar();
    }

    public boolean CrearFactura(Factura f) {
        sSql = "INSERT INTO factura(codigo_factura,fecha,precio_total,cedula_cliente)"
                + " values (?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setInt(1, f.getCodigo_factura());
            pst.setDate(2, f.getFecha());
            pst.setInt(3, f.getPrecio_total());
            pst.setLong(4, f.getCedula_cliente());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            if (e.getMessage().contains("duplicada")) {

                JOptionPane.showMessageDialog(null, "Factura ya registrada, ingrese una nueva por favor.");

            }
            return false;
        }

    }

}
