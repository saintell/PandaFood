package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {

    private Connection conexion = null;

    public Connection conectar() {
        try {

            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/PandaFood", "postgres", "Pinpo9807");

        } catch (ClassNotFoundException nf) {
            JOptionPane.showMessageDialog(null, nf.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "¡Error! Ejecute la base de datos primero.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }
        return conexion;

    }

    public void desconectar() throws SQLException {
        conexion = null;
        if (conexion != null) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion a la base de datos");
        }
    }

}
