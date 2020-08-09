package DAO;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection cn;
    String sSql = " ";
    ResultSet rs;
    Statement st;

    public UsuarioDAO(ConexionBD cc) {

        cn = cc.conectar();
    }

    public boolean CrearUsuario(Usuario d) {
        sSql = "INSERT INTO usuario(nombre_usuario,contraseña)"
                + " values (?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setString(1, d.getNom_usuario());
            pst.setString(2, d.getContraseña());

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

    public ResultSet buscar(String usuario) throws SQLException {
        sSql = "SELECT * FROM usuario WHERE nombre_usuario = '" + usuario + "' ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public ResultSet buscar1() throws SQLException {
        sSql = "SELECT * FROM usuario WHERE nombre_usuario != ''";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }
}
