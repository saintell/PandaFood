package DAO;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClientesDAO {

    
    Connection cn;
    String sSql = " ";
    ResultSet rs;
    Statement st;
    int totalregistros;

    public ClientesDAO(ConexionBD cc) {
    
        cn = cc.conectar();
    }
    
    

    public boolean CrearCliente(Cliente c) {

        sSql = "INSERT INTO cliente(cedula_cliente, nombre, apellido, celular, puntos)"
                + " values (?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sSql);

            pst.setInt(1, c.getCedula());
            pst.setString(2, c.getNombre());
            pst.setString(3, c.getApellido());
            pst.setLong(4, c.getCelular());
            pst.setInt(5, c.getPuntos());

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {

            if (e.getMessage().contains("duplicada")) {

                JOptionPane.showMessageDialog(null, "Cliente ya creado, ingrese uno nuevo por favor.");

            }
            return false;
        }
    }

    public ResultSet buscar(String cedula) throws SQLException {
        sSql = "SELECT * FROM cliente WHERE cedula_cliente = '" + cedula + "' ";
        st = cn.createStatement();
        rs = st.executeQuery(sSql);
        return rs;
    }

    public boolean actualizar(String cedula, String nombre, String apellido, String celular, String puntos) {

        sSql = "UPDATE cliente SET nombre = '" + nombre + "', apellido = '" + apellido + "'"
                + ", celular = '" + celular + "', puntos = '" + puntos + "' WHERE cedula_cliente = '" + cedula + "'";

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
    
    public DefaultTableModel listar(String busca) {

        DefaultTableModel modelo;
        String[] titulos = {"Cédula", "Nombre", "Celular", "Puntos Acumulados"};
        String registro[] = new String[4];
        modelo = new DefaultTableModel(null, titulos) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        int contador = 0;

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";

        sql = "SELECT * FROM cliente WHERE (CAST(cedula_cliente as VARCHAR(10)) LIKE  ('" + busca + "%') OR UPPER(nombre) LIKE  UPPER('" + busca + "%')"
                + " OR UPPER(apellido) LIKE  UPPER('" + busca + "%'))";

        try {
            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                contador++;
                registro[0] = rs.getString("cedula_cliente");
                registro[1] = rs.getString("nombre") + " " + rs.getString("apellido");
                registro[2] = rs.getString("celular");
                registro[3] = rs.getString("puntos");

                modelo.addRow(registro);

            }

            if (contador == 0 && !busca.equals("")) {
                registro[0] = "Sin resultados...";
                registro[1] = "Sin resultados...";
                registro[2] = "Sin resultados...";
                registro[3] = "Sin resultados...";
                modelo.addRow(registro);

            }

            return modelo;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage() + "JUM");
            return null;
        }
    }
}
