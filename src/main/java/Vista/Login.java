package Vista;

import DAO.UsuarioDAO;
import static Vista.VistaPanda.btn_1;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Santiago
 */
public class Login extends javax.swing.JFrame {

    private UsuarioDAO uDao = new UsuarioDAO();

    private VistaPanda vistaPanda;
    private boolean estado = true;
    private final ImageIcon iconoMostrar = new ImageIcon("src/main/resources/btnMostrar.png");
    private final ImageIcon iconoOcultar = new ImageIcon("src/main/resources/btnOcultar.png");

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass().getResource("/Miniatura.png")).getImage();
        super.setIconImage(icon);
        Font dvs = new Font("DejaVu Sans", Font.PLAIN, 18);
        txfContraseña.setFont(dvs);
        txfContraseña.setEchoChar('•');
        this.getContentPane().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostrarContraseña = new javax.swing.JButton();
        txfUsuario = new javax.swing.JTextField();
        txfContraseña = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        signIn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMostrarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnMostrar.png"))); // NOI18N
        btnMostrarContraseña.setBorderPainted(false);
        btnMostrarContraseña.setContentAreaFilled(false);
        btnMostrarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMostrarContraseña.setFocusable(false);
        btnMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 40, -1));

        txfUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsuario.setText("USUARIO");
        txfUsuario.setToolTipText("");
        txfUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfUsuarioMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfUsuarioMouseReleased(evt);
            }
        });
        txfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfUsuarioActionPerformed(evt);
            }
        });
        txfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 40));

        txfContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txfContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfContraseña.setText("••••••••");
        txfContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfContraseñaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfContraseñaMouseReleased(evt);
            }
        });
        txfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfContraseñaActionPerformed(evt);
            }
        });
        txfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfContraseñaKeyPressed(evt);
            }
        });
        getContentPane().add(txfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 40));

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bton salida.png"))); // NOI18N
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bton salida cursor oscuro.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 100, 50));

        signIn.setBackground(new java.awt.Color(255, 255, 255));
        signIn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signIn.setForeground(new java.awt.Color(255, 255, 255));
        signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bton Login.png"))); // NOI18N
        signIn.setBorderPainted(false);
        signIn.setContentAreaFilled(false);
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/bton login cursor oscuro.png"))); // NOI18N
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        getContentPane().add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 96, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoLogin.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfUsuarioMouseClicked
        // TODO add your handling code here:

        if (evt.getClickCount() == 1) {

            if (txfContraseña.getText().length() == 0) {
                txfContraseña.setText("••••••••");
            } else {

                if (txfUsuario.getText().equalsIgnoreCase("USUARIO")) {
                    txfUsuario.setText(null);

                } else {
                }
            }
        }
    }//GEN-LAST:event_txfUsuarioMouseClicked

    private void txfUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfUsuarioMouseReleased
        // TODO add your handling code here:

        if (txfContraseña.getText().length() == 0) {
            txfContraseña.setText("••••••••");
        } else {

            if (txfUsuario.getText().equalsIgnoreCase("USUARIO")) {
                txfUsuario.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txfUsuarioMouseReleased

    private void txfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsuarioKeyPressed
        // TODO add your handling code here:

        if (txfContraseña.getText().length() == 0) {
            txfContraseña.setText("••••••••");
        } else {

            if (txfUsuario.getText().equalsIgnoreCase("USUARIO")) {
                txfUsuario.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txfUsuarioKeyPressed

    private void txfContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfContraseñaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            if (txfUsuario.getText().length() == 0) {
                txfUsuario.setText("USUARIO");
            } else {

                if (txfContraseña.getText().equalsIgnoreCase("••••••••")) {
                    txfContraseña.setText(null);
                } else {
                }
            }
        }
    }//GEN-LAST:event_txfContraseñaMouseClicked

    private void txfContraseñaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfContraseñaMouseReleased
        // TODO add your handling code here:

        if (txfUsuario.getText().length() == 0) {
            txfUsuario.setText("USUARIO");
        } else {

            if (txfContraseña.getText().equalsIgnoreCase("••••••••")) {
                txfContraseña.setText(null);
            } else {
            }
        }

    }//GEN-LAST:event_txfContraseñaMouseReleased

    private void txfContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfContraseñaKeyPressed
        // TODO add your handling code here:
        if (txfUsuario.getText().length() == 0) {
            txfUsuario.setText("USUARIO");
        } else {

            if (txfContraseña.getText().equalsIgnoreCase("••••••••")) {
                txfContraseña.setText(null);

            } else {
            }
        }
    }//GEN-LAST:event_txfContraseñaKeyPressed

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        verificar();
        asignarColor(vistaPanda.btn_1);
        vistaPanda.ind_1.setOpaque(false);
        resetColor(new JPanel[]{vistaPanda.btn_2, vistaPanda.btn_3}, new JPanel[]{vistaPanda.ind_2, vistaPanda.ind_3});
        vistaPanda.Contenedor.removeAll();
        vistaPanda.Contenedor.add(vistaPanda.PerfilPanel);
        vistaPanda.Contenedor.repaint();
        vistaPanda.Contenedor.revalidate();


    }//GEN-LAST:event_signInActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfContraseñaActionPerformed

        try {
            verificar();

            asignarColor(btn_1);
            vistaPanda.ind_1.setOpaque(false);
            resetColor(new JPanel[]{vistaPanda.btn_2, vistaPanda.btn_3}, new JPanel[]{vistaPanda.ind_2, vistaPanda.ind_3});
            vistaPanda.Contenedor.removeAll();
            vistaPanda.Contenedor.add(vistaPanda.PerfilPanel);
            vistaPanda.Contenedor.repaint();
            vistaPanda.Contenedor.revalidate();

        } catch (NullPointerException npe) {

        }
    }//GEN-LAST:event_txfContraseñaActionPerformed

    private void txfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfUsuarioActionPerformed
        verificar();
    }//GEN-LAST:event_txfUsuarioActionPerformed

    private void txfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfUsuarioKeyTyped

        char c = evt.getKeyChar();

        if (Character.isLowerCase(c)) {

            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);

        } else {

        }

    }//GEN-LAST:event_txfUsuarioKeyTyped

    private void btnMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarContraseñaActionPerformed

        if (estado) {
            txfContraseña.setEchoChar((char) 0);
            btnMostrarContraseña.setIcon(iconoOcultar);
        } else {
            txfContraseña.setEchoChar('•');
            btnMostrarContraseña.setIcon(iconoMostrar);
        }

        estado = !estado;
    }//GEN-LAST:event_btnMostrarContraseñaActionPerformed

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(0, 0, 0));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMostrarContraseña;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton signIn;
    private javax.swing.JPasswordField txfContraseña;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables

    public void verificar() {

        String usuario = txfUsuario.getText();
        ResultSet rs;

        try {

            rs = uDao.buscar(usuario);

            if (!rs.next()) {

                JOptionPane.showMessageDialog(null, "El nombre de usuario no está registrado o está mal escrito. Verifique su información.");

            } else {

                if (!rs.getString(2).equals(txfContraseña.getText())) {

                    JOptionPane.showMessageDialog(null, "La contraseña es incorrecta. Verifique su información.");

                } else {

                    vistaPanda = new VistaPanda();
                    vistaPanda.setVisible(true);
                    vistaPanda.lblUsuario.setText(rs.getString(1));
                    vistaPanda.lblNombre.setText("Panda Food Palmira");
                    vistaPanda.lblCelular.setText("315 4167302");
                    vistaPanda.lblDireccion.setText("Calle 16B # 26-29");
                    vistaPanda.lblCargo.setText("Administrador");
                    dispose();
                }
            }

        } catch (SQLException ex) {

        }

    }

    private void asignarColor(JPanel pane) {
        try {
            pane.setBackground(new Color(236, 37, 32));
        } catch (NullPointerException npe) {

        }
    }
}
