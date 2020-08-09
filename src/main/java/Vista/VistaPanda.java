package Vista;

import DAO.ClientesDAO;
import DAO.ConexionBD;
import DAO.FacturasDAO;
import Modelo.Cliente;
import Modelo.Factura;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * Autores: Alvaro José Tobar y Santiago Pineda.
 */
public class VistaPanda extends javax.swing.JFrame {

    ConexionBD cc = new ConexionBD();
    private ClientesDAO cDao = new ClientesDAO(cc);
    private FacturasDAO fDao = new FacturasDAO(cc);

    ResultSet rs;

    public VistaPanda() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuLateral = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        BarraSuperior = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        PerfilPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblNumUsuarios = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lblNumSalidas = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lblNumVentas = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaAgotados = new javax.swing.JTable();
        SignOut = new javax.swing.JButton();
        FacturaPanel = new javax.swing.JPanel();
        TituloPanel = new javax.swing.JPanel();
        lblTituloFactura = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPuntosCompra = new javax.swing.JLabel();
        btnAsignar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnLimpiarProveedor3 = new javax.swing.JButton();
        txfIdentificacion = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txfApellidos = new javax.swing.JTextField();
        txfCelular = new javax.swing.JTextField();
        txfTotalCompra = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        txfPuntos = new javax.swing.JTextField();
        txfNumFactura = new javax.swing.JTextField();
        ConsutarCientesPanel = new javax.swing.JPanel();
        TituloPanel2 = new javax.swing.JPanel();
        lblTituloCliente = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        txfIdentificacionCliente = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        txfNombreCliente = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        txfApellidosCliente = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        txfCelularCliente = new javax.swing.JTextField();
        txfPuntosCliente = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        txfBuscar = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnLimpiarCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnActualizarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MenuLateral.setBackground(new java.awt.Color(20, 20, 20));

        btn_1.setBackground(new java.awt.Color(236, 37, 32));
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setBackground(new java.awt.Color(20, 20, 20));
        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Perfil");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_2.setBackground(new java.awt.Color(0, 0, 0));
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
        });

        ind_2.setBackground(new java.awt.Color(20, 20, 20));
        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Asignar Factura");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_3.setBackground(new java.awt.Color(0, 0, 0));
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3consultarEmpleados(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_3MouseReleased(evt);
            }
        });

        ind_3.setBackground(new java.awt.Color(20, 20, 20));
        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Gestionar Clientes");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoPandaFood.png"))); // NOI18N

        javax.swing.GroupLayout MenuLateralLayout = new javax.swing.GroupLayout(MenuLateral);
        MenuLateral.setLayout(MenuLateralLayout);
        MenuLateralLayout.setHorizontalGroup(
            MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLateralLayout.createSequentialGroup()
                .addGroup(MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLateralLayout.setVerticalGroup(
            MenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLateralLayout.createSequentialGroup()
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarraSuperior.setBackground(new java.awt.Color(20, 20, 20));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Expand_Arrow_32px.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        btnCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_Multiply_32px.png"))); // NOI18N
        btnCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addGap(884, 884, 884)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 20, 20)));
        Contenedor.setLayout(new java.awt.CardLayout());

        PerfilPanel.setBackground(new java.awt.Color(255, 255, 255));
        PerfilPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(20, 20, 20)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Apellido: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Cargo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Direccion:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblNombre.setText("Nombre");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblUsuario.setText("Usuario");

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblApellido.setText("Apellido");

        lblCelular.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCelular.setText("Celular");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Usuario:");

        lblDireccion.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblDireccion.setText("Dirección");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        lblCargo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCargo.setText("Cargo");

        jPanel2.setBackground(new java.awt.Color(20, 20, 20));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(235, 36, 31));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PERFIL PANDA  FOOD ");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 520, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PandaIcono.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 0, 70, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblUsuario))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblNombre))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblCelular))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion)
                            .addComponent(jLabel12))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblCargo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblCelular)
                    .addComponent(lblDireccion)
                    .addComponent(lblCargo))
                .addGap(22, 22, 22))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clientes.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Clientes");

        lblNumUsuarios.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumUsuarios.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNumUsuarios)
                        .addGap(49, 49, 49))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cerdito.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(204, 204, 204));
        jLabel34.setText("Ventas este Mes");

        lblNumSalidas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumSalidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumSalidas.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(lblNumSalidas)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumSalidas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(21, 21, 21))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventasIcon.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setText("Ventas este Mes");

        lblNumVentas.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumVentas.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel38))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblNumVentas)))
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("CLIENTES CON MÁS PUNTOS");

        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuIco.PNG"))); // NOI18N
        btnCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCambiarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCambiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        tablaAgotados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaAgotados);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        SignOut.setBackground(new java.awt.Color(255, 255, 255));
        SignOut.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        SignOut.setForeground(new java.awt.Color(20, 20, 20));
        SignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Patita.png"))); // NOI18N
        SignOut.setText("SALIR");
        SignOut.setToolTipText("");
        SignOut.setBorderPainted(false);
        SignOut.setContentAreaFilled(false);
        SignOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignOut.setFocusable(false);
        SignOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SignOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PerfilPanelLayout = new javax.swing.GroupLayout(PerfilPanel);
        PerfilPanel.setLayout(PerfilPanelLayout);
        PerfilPanelLayout.setHorizontalGroup(
            PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PerfilPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerfilPanelLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PerfilPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SignOut)
                .addGap(449, 449, 449))
        );
        PerfilPanelLayout.setVerticalGroup(
            PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PerfilPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addGroup(PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PerfilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        Contenedor.add(PerfilPanel, "card2");

        FacturaPanel.setBackground(new java.awt.Color(255, 255, 255));

        TituloPanel.setBackground(new java.awt.Color(20, 20, 20));
        TituloPanel.setForeground(new java.awt.Color(255, 255, 255));

        lblTituloFactura.setBackground(new java.awt.Color(235, 36, 31));
        lblTituloFactura.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTituloFactura.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloFactura.setText("ASIGNAR FACTURA");

        javax.swing.GroupLayout TituloPanelLayout = new javax.swing.GroupLayout(TituloPanel);
        TituloPanel.setLayout(TituloPanelLayout);
        TituloPanelLayout.setHorizontalGroup(
            TituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        TituloPanelLayout.setVerticalGroup(
            TituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel136.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel136.setText("N° de Factura:");

        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel137.setText("Identificación del Cliente:");

        fechaIngreso.setForeground(new java.awt.Color(153, 153, 153));
        fechaIngreso.setDateFormatString("dd-MM-yyyy");
        fechaIngreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaIngreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaIngresoKeyTyped(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel84.setText("Fecha:");

        jLabel138.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel138.setText("Nombres:");

        jLabel139.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel139.setText("Apellidos:");

        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel140.setText("Total Compra:");

        jLabel141.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel141.setText("Celular:");

        jLabel3.setBackground(new java.awt.Color(236, 37, 32));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 20, 20));
        jLabel3.setText("Puntos totales de la compra");

        lblPuntosCompra.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        lblPuntosCompra.setForeground(new java.awt.Color(236, 37, 32));
        lblPuntosCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPuntosCompra.setText("0");

        btnAsignar.setBackground(new java.awt.Color(255, 255, 255));
        btnAsignar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónAsignar.png"))); // NOI18N
        btnAsignar.setBorderPainted(false);
        btnAsignar.setContentAreaFilled(false);
        btnAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAsignar.setFocusable(false);
        btnAsignar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónAsignarOscuro.png"))); // NOI18N
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónLimpiar.png"))); // NOI18N
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFocusable(false);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónLimpiarOscuro.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnLimpiarProveedor3.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarProveedor3.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarProveedor3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónRegistrarCliente.png"))); // NOI18N
        btnLimpiarProveedor3.setBorderPainted(false);
        btnLimpiarProveedor3.setContentAreaFilled(false);
        btnLimpiarProveedor3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarProveedor3.setFocusable(false);
        btnLimpiarProveedor3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónRegistrarClienteOscuro.png"))); // NOI18N
        btnLimpiarProveedor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarProveedor3ActionPerformed(evt);
            }
        });

        txfIdentificacion.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfIdentificacion.setForeground(new java.awt.Color(153, 153, 153));
        txfIdentificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdentificacion.setText("IDENTIFICACIÓN");
        txfIdentificacion.setToolTipText("");
        txfIdentificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfIdentificacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIdentificacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfIdentificacionFocusLost(evt);
            }
        });
        txfIdentificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfIdentificacionMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfIdentificacionMouseReleased(evt);
            }
        });
        txfIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdentificacionActionPerformed(evt);
            }
        });
        txfIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfIdentificacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIdentificacionKeyTyped(evt);
            }
        });

        txfNombre.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfNombre.setForeground(new java.awt.Color(153, 153, 153));
        txfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombre.setText("NOMBRES");
        txfNombre.setToolTipText("");
        txfNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfNombreFocusLost(evt);
            }
        });
        txfNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfNombreMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfNombreMouseReleased(evt);
            }
        });
        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreKeyTyped(evt);
            }
        });

        txfApellidos.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfApellidos.setForeground(new java.awt.Color(153, 153, 153));
        txfApellidos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfApellidos.setText("APELLIDOS");
        txfApellidos.setToolTipText("");
        txfApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfApellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfApellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfApellidosFocusLost(evt);
            }
        });
        txfApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfApellidosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfApellidosMouseReleased(evt);
            }
        });
        txfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfApellidosActionPerformed(evt);
            }
        });
        txfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfApellidosKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfApellidosKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfApellidosKeyTyped(evt);
            }
        });

        txfCelular.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfCelular.setForeground(new java.awt.Color(153, 153, 153));
        txfCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelular.setText("CELULAR");
        txfCelular.setToolTipText("");
        txfCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfCelular.setNextFocusableComponent(txfTotalCompra);
        txfCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCelularFocusLost(evt);
            }
        });
        txfCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfCelularMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfCelularMouseReleased(evt);
            }
        });
        txfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCelularActionPerformed(evt);
            }
        });
        txfCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfCelularKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularKeyTyped(evt);
            }
        });

        txfTotalCompra.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfTotalCompra.setForeground(new java.awt.Color(153, 153, 153));
        txfTotalCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTotalCompra.setText("TOTAL");
        txfTotalCompra.setToolTipText("");
        txfTotalCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfTotalCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfTotalCompraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfTotalCompraFocusLost(evt);
            }
        });
        txfTotalCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfTotalCompraMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfTotalCompraMouseReleased(evt);
            }
        });
        txfTotalCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTotalCompraActionPerformed(evt);
            }
        });
        txfTotalCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfTotalCompraKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTotalCompraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfTotalCompraKeyTyped(evt);
            }
        });

        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel143.setText("Puntos de cliente:");

        txfPuntos.setEditable(false);
        txfPuntos.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfPuntos.setForeground(new java.awt.Color(153, 153, 153));
        txfPuntos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPuntos.setText("PUNTOS");
        txfPuntos.setToolTipText("");
        txfPuntos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfPuntos.setFocusable(false);
        txfPuntos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfPuntosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfPuntosFocusLost(evt);
            }
        });
        txfPuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfPuntosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfPuntosMouseReleased(evt);
            }
        });
        txfPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPuntosActionPerformed(evt);
            }
        });
        txfPuntos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPuntosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfPuntosKeyTyped(evt);
            }
        });

        txfNumFactura.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        txfNumFactura.setForeground(new java.awt.Color(153, 153, 153));
        txfNumFactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNumFactura.setToolTipText("");
        txfNumFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfNumFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfNumFacturaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfNumFacturaMouseReleased(evt);
            }
        });
        txfNumFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNumFacturaActionPerformed(evt);
            }
        });
        txfNumFactura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfNumFacturaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNumFacturaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout FacturaPanelLayout = new javax.swing.GroupLayout(FacturaPanel);
        FacturaPanel.setLayout(FacturaPanelLayout);
        FacturaPanelLayout.setHorizontalGroup(
            FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaPanelLayout.createSequentialGroup()
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FacturaPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel136)
                            .addComponent(txfNumFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(TituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel84)))
                    .addGroup(FacturaPanelLayout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPuntosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(FacturaPanelLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FacturaPanelLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139)
                    .addComponent(txfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143)
                    .addComponent(jLabel137))
                .addGap(48, 48, 48)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel138)
                    .addGroup(FacturaPanelLayout.createSequentialGroup()
                        .addComponent(txfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarProveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel141)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140)
                    .addComponent(txfTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        FacturaPanelLayout.setVerticalGroup(
            FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FacturaPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FacturaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FacturaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNumFactura))
                    .addComponent(TituloPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(jLabel138))
                .addGap(8, 8, 8)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(jLabel141))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpiarProveedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FacturaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FacturaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel143)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(lblPuntosCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(FacturaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        Contenedor.add(FacturaPanel, "card3");

        ConsutarCientesPanel.setBackground(new java.awt.Color(255, 255, 255));

        TituloPanel2.setBackground(new java.awt.Color(20, 20, 20));
        TituloPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblTituloCliente.setBackground(new java.awt.Color(235, 36, 31));
        lblTituloCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTituloCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCliente.setText("CONSULTAR CLIENTES");

        javax.swing.GroupLayout TituloPanel2Layout = new javax.swing.GroupLayout(TituloPanel2);
        TituloPanel2.setLayout(TituloPanel2Layout);
        TituloPanel2Layout.setHorizontalGroup(
            TituloPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        TituloPanel2Layout.setVerticalGroup(
            TituloPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel142.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel142.setText("Identificación del Cliente:");

        txfIdentificacionCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfIdentificacionCliente.setForeground(new java.awt.Color(153, 153, 153));
        txfIdentificacionCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfIdentificacionCliente.setText("IDENTIFICACIÓN");
        txfIdentificacionCliente.setToolTipText("");
        txfIdentificacionCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfIdentificacionCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfIdentificacionClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfIdentificacionClienteFocusLost(evt);
            }
        });
        txfIdentificacionCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfIdentificacionClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfIdentificacionClienteMouseReleased(evt);
            }
        });
        txfIdentificacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIdentificacionClienteActionPerformed(evt);
            }
        });
        txfIdentificacionCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfIdentificacionClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIdentificacionClienteKeyTyped(evt);
            }
        });

        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel144.setText("Nombres:");

        txfNombreCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfNombreCliente.setForeground(new java.awt.Color(153, 153, 153));
        txfNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreCliente.setText("NOMBRES");
        txfNombreCliente.setToolTipText("");
        txfNombreCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfNombreCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfNombreClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfNombreClienteFocusLost(evt);
            }
        });
        txfNombreCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfNombreClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfNombreClienteMouseReleased(evt);
            }
        });
        txfNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreClienteActionPerformed(evt);
            }
        });
        txfNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfNombreClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreClienteKeyTyped(evt);
            }
        });

        jLabel145.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel145.setText("Apellidos:");

        txfApellidosCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfApellidosCliente.setForeground(new java.awt.Color(153, 153, 153));
        txfApellidosCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfApellidosCliente.setText("APELLIDOS");
        txfApellidosCliente.setToolTipText("");
        txfApellidosCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfApellidosCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfApellidosClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfApellidosClienteFocusLost(evt);
            }
        });
        txfApellidosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfApellidosClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfApellidosClienteMouseReleased(evt);
            }
        });
        txfApellidosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfApellidosClienteActionPerformed(evt);
            }
        });
        txfApellidosCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfApellidosClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfApellidosClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfApellidosClienteKeyTyped(evt);
            }
        });

        jLabel146.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel146.setText("Celular:");

        txfCelularCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfCelularCliente.setForeground(new java.awt.Color(153, 153, 153));
        txfCelularCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfCelularCliente.setText("CELULAR");
        txfCelularCliente.setToolTipText("");
        txfCelularCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfCelularCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCelularClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCelularClienteFocusLost(evt);
            }
        });
        txfCelularCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfCelularClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfCelularClienteMouseReleased(evt);
            }
        });
        txfCelularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCelularClienteActionPerformed(evt);
            }
        });
        txfCelularCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfCelularClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCelularClienteKeyTyped(evt);
            }
        });

        txfPuntosCliente.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfPuntosCliente.setForeground(new java.awt.Color(153, 153, 153));
        txfPuntosCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfPuntosCliente.setText("PUNTOS");
        txfPuntosCliente.setToolTipText("");
        txfPuntosCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfPuntosCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfPuntosClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfPuntosClienteFocusLost(evt);
            }
        });
        txfPuntosCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfPuntosClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfPuntosClienteMouseReleased(evt);
            }
        });
        txfPuntosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPuntosClienteActionPerformed(evt);
            }
        });
        txfPuntosCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPuntosClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfPuntosClienteKeyTyped(evt);
            }
        });

        jLabel147.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel147.setText("Puntos del cliente:");

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cédula", "Nombre", "Celular", "Puntos Acumulados"
            }
        ));
        tablaClientes.setSelectionBackground(new java.awt.Color(236, 37, 32));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        txfBuscar.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txfBuscar.setForeground(new java.awt.Color(153, 153, 153));
        txfBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfBuscar.setToolTipText("");
        txfBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txfBuscar.setNextFocusableComponent(txfIdentificacionCliente);
        txfBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfBuscarFocusLost(evt);
            }
        });
        txfBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txfBuscarMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txfBuscarMouseReleased(evt);
            }
        });
        txfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarActionPerformed(evt);
            }
        });
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarKeyTyped(evt);
            }
        });

        jLabel148.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel148.setText("Buscar:");

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónBuscar.png"))); // NOI18N
        btnBuscarCliente.setFocusable(false);
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnRegistrarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónRegistrarCliente.png"))); // NOI18N
        btnRegistrarCliente.setBorderPainted(false);
        btnRegistrarCliente.setContentAreaFilled(false);
        btnRegistrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarCliente.setFocusable(false);
        btnRegistrarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónRegistrarClienteOscuro.png"))); // NOI18N
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónEditar.png"))); // NOI18N
        btnEditarCliente.setBorderPainted(false);
        btnEditarCliente.setContentAreaFilled(false);
        btnEditarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCliente.setFocusable(false);
        btnEditarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónEditarOscuro.png"))); // NOI18N
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnLimpiarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnLimpiarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónLimpiar.png"))); // NOI18N
        btnLimpiarCliente.setBorderPainted(false);
        btnLimpiarCliente.setContentAreaFilled(false);
        btnLimpiarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCliente.setFocusable(false);
        btnLimpiarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónLimpiarOscuro.png"))); // NOI18N
        btnLimpiarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarClienteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(220, 53, 69));
        jLabel9.setText("*");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(220, 53, 69));
        jLabel10.setText("*");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(220, 53, 69));
        jLabel13.setText("*");

        btnActualizarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarCliente.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        btnActualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónActualizar.png"))); // NOI18N
        btnActualizarCliente.setBorderPainted(false);
        btnActualizarCliente.setContentAreaFilled(false);
        btnActualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizarCliente.setEnabled(false);
        btnActualizarCliente.setFocusable(false);
        btnActualizarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/BotónActualizarOscuro.png"))); // NOI18N
        btnActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsutarCientesPanelLayout = new javax.swing.GroupLayout(ConsutarCientesPanel);
        ConsutarCientesPanel.setLayout(ConsutarCientesPanelLayout);
        ConsutarCientesPanelLayout.setHorizontalGroup(
            ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel148)
                    .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                        .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txfCelularCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ConsutarCientesPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel142)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13))
                                .addComponent(txfIdentificacionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                            .addComponent(jLabel146))
                        .addGap(35, 35, 35)
                        .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel147)
                            .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                                .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txfPuntosCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ConsutarCientesPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel144)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addComponent(txfNombreCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel145)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10))
                                            .addComponent(txfApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsutarCientesPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsutarCientesPanelLayout.createSequentialGroup()
                        .addComponent(TituloPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsutarCientesPanelLayout.createSequentialGroup()
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(316, 316, 316))))
        );
        ConsutarCientesPanelLayout.setVerticalGroup(
            ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                        .addComponent(TituloPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel142)
                                .addComponent(jLabel144)
                                .addComponent(jLabel9)
                                .addComponent(jLabel13))
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfIdentificacionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                        .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel145)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel146)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsutarCientesPanelLayout.createSequentialGroup()
                        .addComponent(jLabel147)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPuntosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegistrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel148)
                .addGap(8, 8, 8)
                .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsutarCientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActualizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Contenedor.add(ConsutarCientesPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(MenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked

        asignarColor(btn_1);
        ind_1.setOpaque(false);
        resetearColor(new JPanel[]{btn_2, btn_3}, new JPanel[]{ind_2, ind_3});
        Contenedor.removeAll();
        Contenedor.add(PerfilPanel);
        Contenedor.repaint();
        Contenedor.revalidate();
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseEntered

        asignarColor(btn_1);
    }//GEN-LAST:event_btn_1MouseEntered

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited

        if (!PerfilPanel.isShowing()) {
            btn_1.setBackground(new Color(0, 0, 0));
            ind_1.setOpaque(true);
        }
    }//GEN-LAST:event_btn_1MouseExited

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed

        asignarColor(btn_1);
        ind_1.setOpaque(false);
        resetearColor(new JPanel[]{btn_2, btn_3}, new JPanel[]{ind_2, ind_3});
        Contenedor.removeAll();
        Contenedor.add(PerfilPanel);
        Contenedor.repaint();
        Contenedor.revalidate();
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_2consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2consultarEmpleados

        try {
            asignarColor(btn_2);
            ind_2.setOpaque(true);
            resetearColor(new JPanel[]{btn_1, btn_3}, new JPanel[]{ind_1, ind_3});
            Contenedor.removeAll();
            Contenedor.add(FacturaPanel);
            txfNumFactura.requestFocus(true);
            java.util.Date fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
            fechaIngreso.setDate(fechaParseada);
            Contenedor.repaint();
            Contenedor.revalidate();
        } catch (ParseException ex) {
        }
    }//GEN-LAST:event_btn_2consultarEmpleados

    private void btn_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseEntered

        asignarColor(btn_2);
    }//GEN-LAST:event_btn_2MouseEntered

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited

        if (!FacturaPanel.isShowing()) {
            btn_2.setBackground(new Color(0, 0, 0));
            ind_2.setOpaque(false);
        }
    }//GEN-LAST:event_btn_2MouseExited

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed

        try {
            asignarColor(btn_2);
            ind_2.setOpaque(true);
            resetearColor(new JPanel[]{btn_1, btn_3}, new JPanel[]{ind_1, ind_3});
            Contenedor.removeAll();
            Contenedor.add(FacturaPanel);
            txfNumFactura.requestFocus(true);
            java.util.Date fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
            fechaIngreso.setDate(fechaParseada);
            Contenedor.repaint();
            Contenedor.revalidate();
        } catch (ParseException ex) {
        }
    }//GEN-LAST:event_btn_2MousePressed

    private void btn_3consultarEmpleados(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3consultarEmpleados

        asignarColor(btn_3);
        ind_3.setOpaque(true);
        resetearColor(new JPanel[]{btn_1, btn_2}, new JPanel[]{ind_1, ind_2});
        Contenedor.removeAll();
        Contenedor.add(ConsutarCientesPanel);
        txfIdentificacionCliente.requestFocus(true);
        Contenedor.repaint();
        Contenedor.revalidate();
    }//GEN-LAST:event_btn_3consultarEmpleados

    private void btn_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseEntered

        asignarColor(btn_3);
    }//GEN-LAST:event_btn_3MouseEntered

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited

        if (!ConsutarCientesPanel.isShowing()) {
            btn_3.setBackground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed

        asignarColor(btn_3);
        ind_3.setOpaque(true);
        resetearColor(new JPanel[]{btn_1, btn_2}, new JPanel[]{ind_1, ind_2});
        Contenedor.removeAll();
        Contenedor.add(ConsutarCientesPanel);
        txfIdentificacionCliente.requestFocus(true);
        Contenedor.repaint();
        Contenedor.revalidate();
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseReleased
    }//GEN-LAST:event_btn_3MouseReleased

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked

        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btnCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrar1MouseClicked
        System.exit(0);

    }//GEN-LAST:event_btnCerrar1MouseClicked

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged

    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        // TODO add your handling code here:
        //drag this pane
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void btnCambiarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarMouseReleased

        if (lblTitulo.getText().equalsIgnoreCase("CLIENTES CON MÁS PUNTOS")) {

            lblTitulo.setText("CLIENTES FRECUENTES");

        } else {

            lblTitulo.setText("CLIENTES CON MÁS PUNTOS");

        }

    }//GEN-LAST:event_btnCambiarMouseReleased

    private void SignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignOutActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SignOutActionPerformed

    private void fechaIngresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaIngresoKeyTyped

        char c = evt.getKeyChar();

        if (Character.isAlphabetic(c) || Character.isSpaceChar(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_fechaIngresoKeyTyped

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        try {
            registrarFactura();
        } catch (ParseException ex) {
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarFactura();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiarProveedor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarProveedor3ActionPerformed
        registrarClienteEnFactura();
    }//GEN-LAST:event_btnLimpiarProveedor3ActionPerformed

    private void txfIdentificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfIdentificacionMouseClicked
    }//GEN-LAST:event_txfIdentificacionMouseClicked

    private void txfIdentificacionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfIdentificacionMouseReleased
    }//GEN-LAST:event_txfIdentificacionMouseReleased

    private void txfIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdentificacionActionPerformed
        buscarClienteFactura();
    }//GEN-LAST:event_txfIdentificacionActionPerformed

    private void txfIdentificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionKeyPressed
    }//GEN-LAST:event_txfIdentificacionKeyPressed

    private void txfIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txfIdentificacion.getText().length() >= 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txfIdentificacionKeyTyped

    private void txfNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreMouseClicked

    private void txfNombreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNombreMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreMouseReleased

    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreActionPerformed

    private void txfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreKeyPressed

    private void txfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c) && !Character.isSpaceChar(c)) {
            evt.consume();
        }

        if (txfNombre.getText().length() >= 20) {

            evt.consume();

        }
    }//GEN-LAST:event_txfNombreKeyTyped

    private void txfApellidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfApellidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosMouseClicked

    private void txfApellidosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfApellidosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosMouseReleased

    private void txfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfApellidosActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosActionPerformed

    private void txfApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosKeyPressed

    private void txfApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidosKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c) && !Character.isSpaceChar(c)) {
            evt.consume();
        }

        if (txfApellidos.getText().length() >= 20) {

            evt.consume();

        }
    }//GEN-LAST:event_txfApellidosKeyTyped

    private void txfCelularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCelularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularMouseClicked

    private void txfCelularMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCelularMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularMouseReleased

    private void txfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularActionPerformed

    private void txfCelularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularKeyPressed

    private void txfCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txfCelular.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_txfCelularKeyTyped

    private void txfTotalCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfTotalCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTotalCompraMouseClicked

    private void txfTotalCompraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfTotalCompraMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTotalCompraMouseReleased

    private void txfTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTotalCompraActionPerformed

    private void txfTotalCompraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTotalCompraKeyPressed

        try {

            int total = Integer.parseInt(txfTotalCompra.getText().trim());

            if (txfTotalCompra.getText().trim().length() == 0) {

                lblPuntosCompra.setText("0");
            } else {

                if (total < 2000) {

                    lblPuntosCompra.setText("0");

                } else {

                    int res = 0;

                    for (int i = 2000; i <= total; i += 2000) {

                        res += 1;
                        lblPuntosCompra.setText(Integer.toString(res));
                    }
                }
            }
        } catch (NumberFormatException nfe) {

        }

    }//GEN-LAST:event_txfTotalCompraKeyPressed

    private void txfTotalCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTotalCompraKeyTyped

        try {

            char c = evt.getKeyChar();

            if (!Character.isDigit(c)) {
                evt.consume();
            }

            if (txfTotalCompra.getText().length() >= 6) {

                evt.consume();

            }
        } catch (NumberFormatException nfe) {

        }
    }//GEN-LAST:event_txfTotalCompraKeyTyped

    private void txfPuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfPuntosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosMouseClicked

    private void txfPuntosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfPuntosMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosMouseReleased

    private void txfPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPuntosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosActionPerformed

    private void txfPuntosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPuntosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosKeyPressed

    private void txfPuntosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPuntosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosKeyTyped

    private void txfTotalCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTotalCompraKeyReleased

        try {

            int total = Integer.parseInt(txfTotalCompra.getText().trim());

            if (txfTotalCompra.getText().trim().length() == 0) {

                lblPuntosCompra.setText("0");
            } else {

                if (total < 2000) {

                    lblPuntosCompra.setText("0");

                } else {

                    int res = 0;

                    for (int i = 2000; i <= total; i += 2000) {

                        res += 1;
                        lblPuntosCompra.setText(Integer.toString(res));
                    }
                }
            }
        } catch (NumberFormatException nfe) {

        }
    }//GEN-LAST:event_txfTotalCompraKeyReleased

    private void txfNumFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNumFacturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNumFacturaMouseClicked

    private void txfNumFacturaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNumFacturaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNumFacturaMouseReleased

    private void txfNumFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNumFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNumFacturaActionPerformed

    private void txfNumFacturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNumFacturaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNumFacturaKeyPressed

    private void txfNumFacturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNumFacturaKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txfNumFactura.getText().length() >= 5) {

            evt.consume();

        }
    }//GEN-LAST:event_txfNumFacturaKeyTyped

    private void txfIdentificacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdentificacionFocusGained

        if (txfIdentificacion.getText().trim().equalsIgnoreCase("IDENTIFICACIÓN")) {

            txfIdentificacion.setText(null);
        }
    }//GEN-LAST:event_txfIdentificacionFocusGained

    private void txfIdentificacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdentificacionFocusLost

        if (txfIdentificacion.getText().trim().length() == 0) {

            txfIdentificacion.setText("IDENTIFICACIÓN");
        }
    }//GEN-LAST:event_txfIdentificacionFocusLost

    private void txfNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreFocusGained

        if (txfNombre.getText().trim().equalsIgnoreCase("NOMBRES")) {

            txfNombre.setText(null);
        }
    }//GEN-LAST:event_txfNombreFocusGained

    private void txfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreFocusLost

        if (txfNombre.getText().trim().length() == 0) {

            txfNombre.setText("NOMBRES");
        }
    }//GEN-LAST:event_txfNombreFocusLost

    private void txfApellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfApellidosFocusGained

        if (txfApellidos.getText().trim().equalsIgnoreCase("APELLIDOS")) {

            txfApellidos.setText(null);
        }
    }//GEN-LAST:event_txfApellidosFocusGained

    private void txfApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidosKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosKeyReleased

    private void txfApellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfApellidosFocusLost

        if (txfApellidos.getText().trim().length() == 0) {

            txfApellidos.setText("APELLIDOS");
        }
    }//GEN-LAST:event_txfApellidosFocusLost

    private void txfCelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCelularFocusGained

        if (txfCelular.getText().trim().equalsIgnoreCase("CELULAR")) {

            txfCelular.setText(null);
        }
    }//GEN-LAST:event_txfCelularFocusGained

    private void txfCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCelularFocusLost

        if (txfCelular.getText().trim().length() == 0) {

            txfCelular.setText("CELULAR");
        }
    }//GEN-LAST:event_txfCelularFocusLost

    private void txfPuntosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfPuntosFocusGained

        if (txfPuntos.getText().trim().equalsIgnoreCase("PUNTOS")) {

            txfPuntos.setText(null);
        }

    }//GEN-LAST:event_txfPuntosFocusGained

    private void txfPuntosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfPuntosFocusLost

        if (txfPuntos.getText().trim().length() == 0) {

            txfPuntos.setText("PUNTOS");
        }
    }//GEN-LAST:event_txfPuntosFocusLost

    private void txfTotalCompraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfTotalCompraFocusGained

        if (txfTotalCompra.getText().trim().equalsIgnoreCase("TOTAL")) {

            txfTotalCompra.setText(null);
        }
    }//GEN-LAST:event_txfTotalCompraFocusGained

    private void txfTotalCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfTotalCompraFocusLost

        if (txfTotalCompra.getText().trim().length() == 0) {

            txfTotalCompra.setText("TOTAL");
        }
    }//GEN-LAST:event_txfTotalCompraFocusLost

    private void txfIdentificacionClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteFocusGained

        if (txfIdentificacionCliente.getText().trim().equalsIgnoreCase("IDENTIFICACIÓN")) {

            txfIdentificacionCliente.setText(null);
        }

    }//GEN-LAST:event_txfIdentificacionClienteFocusGained

    private void txfIdentificacionClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteFocusLost

        if (txfIdentificacionCliente.getText().trim().length() == 0) {

            txfIdentificacionCliente.setText("IDENTIFICACIÓN");
        }
    }//GEN-LAST:event_txfIdentificacionClienteFocusLost

    private void txfIdentificacionClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionClienteMouseClicked

    private void txfIdentificacionClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionClienteMouseReleased

    private void txfIdentificacionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteActionPerformed

        String cedula = txfIdentificacionCliente.getText().trim();
        buscarCliente(cedula);
    }//GEN-LAST:event_txfIdentificacionClienteActionPerformed

    private void txfIdentificacionClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIdentificacionClienteKeyPressed

    private void txfIdentificacionClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIdentificacionClienteKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txfIdentificacionCliente.getText().length() >= 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txfIdentificacionClienteKeyTyped

    private void txfNombreClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreClienteFocusGained

        if (txfNombreCliente.getText().trim().equalsIgnoreCase("NOMBRES")) {

            txfNombreCliente.setText(null);
        }
    }//GEN-LAST:event_txfNombreClienteFocusGained

    private void txfNombreClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfNombreClienteFocusLost

        if (txfNombreCliente.getText().trim().length() == 0) {

            txfNombreCliente.setText("NOMBRES");
        }
    }//GEN-LAST:event_txfNombreClienteFocusLost

    private void txfNombreClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNombreClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClienteMouseClicked

    private void txfNombreClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfNombreClienteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClienteMouseReleased

    private void txfNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreClienteActionPerformed

        if (txfIdentificacionCliente.isEditable()) {
            registrarCliente();
        } else {
            actualizarCliente();
        }
    }//GEN-LAST:event_txfNombreClienteActionPerformed

    private void txfNombreClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNombreClienteKeyPressed

    private void txfNombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreClienteKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c) && !Character.isSpaceChar(c)) {
            evt.consume();
        }

        if (txfNombreCliente.getText().length() >= 20) {

            evt.consume();

        }
    }//GEN-LAST:event_txfNombreClienteKeyTyped

    private void txfApellidosClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfApellidosClienteFocusGained

        if (txfApellidosCliente.getText().trim().equalsIgnoreCase("APELLIDOS")) {

            txfApellidosCliente.setText(null);
        }
    }//GEN-LAST:event_txfApellidosClienteFocusGained

    private void txfApellidosClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfApellidosClienteFocusLost

        if (txfApellidosCliente.getText().trim().length() == 0) {

            txfApellidosCliente.setText("APELLIDOS");
        }
    }//GEN-LAST:event_txfApellidosClienteFocusLost

    private void txfApellidosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfApellidosClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosClienteMouseClicked

    private void txfApellidosClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfApellidosClienteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosClienteMouseReleased

    private void txfApellidosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfApellidosClienteActionPerformed

        if (txfIdentificacionCliente.isEditable()) {
            registrarCliente();
        } else {
            actualizarCliente();
        }
    }//GEN-LAST:event_txfApellidosClienteActionPerformed

    private void txfApellidosClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidosClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosClienteKeyPressed

    private void txfApellidosClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidosClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfApellidosClienteKeyReleased

    private void txfApellidosClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfApellidosClienteKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isAlphabetic(c) && !Character.isSpaceChar(c)) {
            evt.consume();
        }

        if (txfApellidosCliente.getText().length() >= 20) {

            evt.consume();

        }

    }//GEN-LAST:event_txfApellidosClienteKeyTyped

    private void txfCelularClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCelularClienteFocusGained

        if (txfCelularCliente.getText().trim().equalsIgnoreCase("CELULAR")) {

            txfCelularCliente.setText(null);
        }
    }//GEN-LAST:event_txfCelularClienteFocusGained

    private void txfCelularClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCelularClienteFocusLost

        if (txfCelularCliente.getText().trim().length() == 0) {

            txfCelularCliente.setText("CELULAR");
        }
    }//GEN-LAST:event_txfCelularClienteFocusLost

    private void txfCelularClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCelularClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClienteMouseClicked

    private void txfCelularClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfCelularClienteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClienteMouseReleased

    private void txfCelularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCelularClienteActionPerformed

        if (txfIdentificacionCliente.isEditable()) {
            registrarCliente();
        } else {
            actualizarCliente();
        }
    }//GEN-LAST:event_txfCelularClienteActionPerformed

    private void txfCelularClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCelularClienteKeyPressed

    private void txfCelularClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCelularClienteKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txfCelularCliente.getText().length() >= 10) {

            evt.consume();

        }
    }//GEN-LAST:event_txfCelularClienteKeyTyped

    private void txfPuntosClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfPuntosClienteFocusGained

        if (txfPuntosCliente.getText().trim().equalsIgnoreCase("PUNTOS")) {

            txfPuntosCliente.setText(null);
        }
    }//GEN-LAST:event_txfPuntosClienteFocusGained

    private void txfPuntosClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfPuntosClienteFocusLost

        if (txfPuntosCliente.getText().trim().length() == 0) {

            txfPuntosCliente.setText("PUNTOS");
        }
    }//GEN-LAST:event_txfPuntosClienteFocusLost

    private void txfPuntosClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfPuntosClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosClienteMouseClicked

    private void txfPuntosClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfPuntosClienteMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosClienteMouseReleased

    private void txfPuntosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPuntosClienteActionPerformed

        if (txfIdentificacionCliente.isEditable()) {
            registrarCliente();
        } else {
            actualizarCliente();
        }
    }//GEN-LAST:event_txfPuntosClienteActionPerformed

    private void txfPuntosClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPuntosClienteKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfPuntosClienteKeyPressed

    private void txfPuntosClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPuntosClienteKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }

        if (txfPuntosCliente.getText().length() >= 5) {

            evt.consume();

        }
    }//GEN-LAST:event_txfPuntosClienteKeyTyped

    private void txfBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfBuscarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarFocusGained

    private void txfBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfBuscarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarFocusLost

    private void txfBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarMouseClicked

    private void txfBuscarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfBuscarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarMouseReleased

    private void txfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarActionPerformed

    private void txfBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarKeyPressed

    private void txfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && !Character.isAlphabetic(c)) {
            evt.consume();
        }

    }//GEN-LAST:event_txfBuscarKeyTyped

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed

        registrarCliente();
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

        String cedula = txfIdentificacionCliente.getText().trim();
        buscarCliente(cedula);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        if (!txfIdentificacionCliente.isEditable()) {
            activarCamposCliente();
            this.txfIdentificacionCliente.setEditable(false);
            this.txfNombreCliente.requestFocus(true);
            this.btnEditarCliente.setEnabled(false);
            this.btnActualizarCliente.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnLimpiarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarClienteActionPerformed

        limpiarCliente();
    }//GEN-LAST:event_btnLimpiarClienteActionPerformed

    private void btnActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarClienteActionPerformed

        actualizarCliente();
    }//GEN-LAST:event_btnActualizarClienteActionPerformed

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased

        if (txfBuscar.getText().trim().length() == 0) {

            limpiarTablaClientes();

        } else {

            listarClientes();
        }

    }//GEN-LAST:event_txfBuscarKeyReleased

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked

        String cedula = tablaClientes.getValueAt(tablaClientes.getSelectedRow(), 0).toString();
        if (!cedula.equalsIgnoreCase("Sin resultados...")) {
            buscarCliente(cedula);
            txfIdentificacionCliente.setText(cedula);
            txfIdentificacionCliente.setEditable(false);
        }
    }//GEN-LAST:event_tablaClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JPanel ConsutarCientesPanel;
    public static javax.swing.JPanel Contenedor;
    private javax.swing.JPanel FacturaPanel;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MenuLateral;
    public static javax.swing.JPanel PerfilPanel;
    private javax.swing.JButton SignOut;
    private javax.swing.JPanel TituloPanel;
    private javax.swing.JPanel TituloPanel2;
    private javax.swing.JButton btnActualizarCliente;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JLabel btnCambiar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarCliente;
    private javax.swing.JButton btnLimpiarProveedor3;
    private javax.swing.JButton btnRegistrarCliente;
    public static javax.swing.JPanel btn_1;
    public static javax.swing.JPanel btn_2;
    public static javax.swing.JPanel btn_3;
    public static final com.toedter.calendar.JDateChooser fechaIngreso = new com.toedter.calendar.JDateChooser();
    public static javax.swing.JPanel ind_1;
    public static javax.swing.JPanel ind_2;
    public static javax.swing.JPanel ind_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JLabel lblApellido;
    public static javax.swing.JLabel lblCargo;
    public static javax.swing.JLabel lblCelular;
    public static javax.swing.JLabel lblDireccion;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumSalidas;
    private javax.swing.JLabel lblNumUsuarios;
    private javax.swing.JLabel lblNumVentas;
    private javax.swing.JLabel lblPuntosCompra;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloCliente;
    private javax.swing.JLabel lblTituloFactura;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tablaAgotados;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txfApellidos;
    private javax.swing.JTextField txfApellidosCliente;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfCelular;
    private javax.swing.JTextField txfCelularCliente;
    private javax.swing.JTextField txfIdentificacion;
    private javax.swing.JTextField txfIdentificacionCliente;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfNombreCliente;
    private javax.swing.JTextField txfNumFactura;
    private javax.swing.JTextField txfPuntos;
    private javax.swing.JTextField txfPuntosCliente;
    private javax.swing.JTextField txfTotalCompra;
    // End of variables declaration//GEN-END:variables

    private void asignarColor(JPanel pane) {
        pane.setBackground(new Color(236, 37, 32));
    }

    private void resetearColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(0, 0, 0));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }

    public void limpiarTablaClientes() {
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    public void activarCamposFactura() {

        txfIdentificacion.setEditable(true);
        txfNombre.setEditable(true);
        txfApellidos.setEditable(true);
        txfCelular.setEditable(true);
    }

    public void desactivarCamposFactura() {
        txfIdentificacion.setEditable(false);
        txfNombre.setEditable(false);
        txfApellidos.setEditable(false);
        txfCelular.setEditable(false);

    }

    public void limpiarFactura() {

        try {
            this.txfNumFactura.setText(null);
            java.util.Date fechaParseada = new SimpleDateFormat("dd/MM/yyyy").parse(fechaActual());
            fechaIngreso.setDate(fechaParseada);
            this.txfIdentificacion.setText("IDENTIFICACIÓN");
            this.txfNombre.setText("NOMBRES");
            this.txfApellidos.setText("APELLIDOS");
            this.txfCelular.setText("CELULAR");
            this.txfPuntos.setText("PUNTOS");
            this.txfTotalCompra.setText("TOTAL");
            this.lblPuntosCompra.setText("0");
            this.txfNumFactura.requestFocus(true);
            activarCamposFactura();
        } catch (ParseException ex) {
        }
    }

    public void limpiarCliente() {

        this.txfIdentificacionCliente.setText(null);
        this.txfIdentificacionCliente.requestFocus(true);
        this.txfNombreCliente.setText("NOMBRES");
        this.txfApellidosCliente.setText("APELLIDOS");
        this.txfCelularCliente.setText("CELULAR");
        this.txfPuntosCliente.setText("PUNTOS");
        this.txfBuscar.setText(null);
        activarCamposCliente();
        this.btnEditarCliente.setEnabled(true);
        this.btnActualizarCliente.setEnabled(false);
        limpiarTablaClientes();
    }

    public void activarCamposCliente() {

        this.txfIdentificacionCliente.setEditable(true);
        this.txfNombreCliente.setEditable(true);
        this.txfApellidosCliente.setEditable(true);
        this.txfCelularCliente.setEditable(true);
        this.txfPuntosCliente.setEditable(true);
    }

    public void desactivarCamposCliente() {

        this.txfIdentificacionCliente.setEditable(false);
        this.txfNombreCliente.setEditable(false);
        this.txfApellidosCliente.setEditable(false);
        this.txfCelularCliente.setEditable(false);
        this.txfPuntosCliente.setEditable(false);
        this.txfBuscar.requestFocus(true);
    }

    public void registrarCliente() {

        try {
            if (txfIdentificacionCliente.getText().trim().length() == 0 || txfNombreCliente.getText().trim().length() == 0
                    || txfApellidosCliente.getText().trim().length() == 0 || txfIdentificacionCliente.getText().trim().equalsIgnoreCase("IDENTIFICACIÓN")
                    || txfNombreCliente.getText().trim().equalsIgnoreCase("NOMBRES") || txfApellidosCliente.getText().trim().equalsIgnoreCase("APELLIDOS")) {
                JOptionPane.showMessageDialog(null, "Digite información en los campos obligatorios por favor.");
            } else if (txfCelularCliente.getText().trim().length() != 0 && !txfCelularCliente.getText().trim().equalsIgnoreCase("CELULAR") && txfCelularCliente.getText().trim().length() < 10) {
                JOptionPane.showMessageDialog(null, "El celular que ha ingresado no es válido, verifique su información..");
            } else if (txfIdentificacionCliente.getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "La C.C o T.I que ha ingresado no es válida, verifique su información..");
            } else {
                int cedula = Integer.parseInt(txfIdentificacionCliente.getText());
                String nombre = txfNombreCliente.getText().trim();
                String apellido = txfApellidosCliente.getText().trim();
                long celular = 0;
                if (txfCelularCliente.getText().trim().length() != 0 && !txfCelularCliente.getText().trim().equalsIgnoreCase("CELULAR")) {
                    celular = Long.parseLong(txfCelularCliente.getText());
                }
                int puntos = 0;
                if (txfPuntosCliente.getText().trim().length() != 0 && !txfPuntosCliente.getText().trim().equalsIgnoreCase("PUNTOS")) {
                    puntos = Integer.parseInt(txfPuntosCliente.getText());
                }
                Cliente c = new Cliente(cedula, nombre, apellido, celular, puntos);

                if (cDao.CrearCliente(c)) {

                    JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
                    limpiarCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error, verifique que su información esté correcta.");
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
    }

    public void registrarClienteEnFactura() {

        try {
            if (txfIdentificacion.getText().trim().length() == 0 || txfNombre.getText().trim().length() == 0
                    || txfApellidos.getText().trim().length() == 0 || txfIdentificacion.getText().trim().equalsIgnoreCase("IDENTIFICACIÓN")
                    || txfNombre.getText().trim().equalsIgnoreCase("NOMBRES") || txfApellidos.getText().trim().equalsIgnoreCase("APELLIDOS")) {
                JOptionPane.showMessageDialog(null, "Digite información en los campos obligatorios por favor.");
            } else if (txfCelular.getText().trim().length() != 0 && !txfCelular.getText().trim().equalsIgnoreCase("CELULAR") && txfCelular.getText().trim().length() < 10) {
                JOptionPane.showMessageDialog(null, "El celular que ha ingresado no es válido, verifique su información..");
            } else if (txfIdentificacion.getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "La C.C o T.I que ha ingresado no es válida, verifique su información..");
            } else {
                int cedula = Integer.parseInt(txfIdentificacion.getText());
                String nombre = txfNombre.getText().trim();
                String apellido = txfApellidos.getText().trim();
                long celular = 0;
                if (txfCelular.getText().trim().length() != 0 && !txfCelular.getText().trim().equalsIgnoreCase("CELULAR")) {
                    celular = Long.parseLong(txfCelular.getText());
                }
                int puntos = 0;
                if (txfPuntos.getText().trim().length() != 0 && !txfPuntos.getText().trim().equalsIgnoreCase("PUNTOS")) {
                    puntos = Integer.parseInt(txfPuntos.getText());
                }
                Cliente c = new Cliente(cedula, nombre, apellido, celular, puntos);

                if (cDao.CrearCliente(c)) {

                    JOptionPane.showMessageDialog(null, "Cliente registrado correctamente.");
                    desactivarCamposFactura();
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error, verifique que su información esté correcta.");
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
    }

    public void registrarFactura() throws ParseException {

        try {
            if (txfNumFactura.getText().trim().length() == 0 || txfIdentificacion.getText().trim().length() == 0 || txfNombre.getText().trim().length() == 0
                    || txfApellidos.getText().trim().length() == 0 || txfIdentificacion.getText().trim().equalsIgnoreCase("IDENTIFICACIÓN")
                    || txfNombre.getText().trim().equalsIgnoreCase("NOMBRES") || txfApellidos.getText().trim().equalsIgnoreCase("APELLIDOS")) {
                JOptionPane.showMessageDialog(null, "Digite información en los campos obligatorios por favor.");
            } else if (txfCelular.getText().trim().length() != 0 && !txfCelular.getText().trim().equalsIgnoreCase("CELULAR") && txfCelular.getText().trim().length() < 10) {
                JOptionPane.showMessageDialog(null, "El celular que ha ingresado no es válido, verifique su información..");
            } else if (txfIdentificacion.getText().length() < 8) {
                JOptionPane.showMessageDialog(null, "La C.C o T.I que ha ingresado no es válida, verifique su información..");
            } else {
                int cedula = Integer.parseInt(txfIdentificacion.getText());

                int codigo = Integer.parseInt(txfNumFactura.getText());
                int total_compra = Integer.parseInt(txfTotalCompra.getText());

                java.sql.Date fecha = null;
                SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                fecha = new java.sql.Date(sdf.parse(fechaSalida()).getTime());

                Factura f = new Factura(codigo, fecha, total_compra, cedula);

                if (fDao.CrearFactura(f)) {
                    if (cDao.acumularPuntos(Integer.toString(cedula), lblPuntosCompra.getText())) {
                        JOptionPane.showMessageDialog(null, "Factura registrada correctamente.");
                        limpiarFactura();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se han acumulado los puntos edita al cliente para asignarlos");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error, verifique que su información esté correcta.");
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getMessage());
        }
    }

    public void buscarCliente(String cedula) {

        try {

            ResultSet rs;
            rs = cDao.buscar(cedula);

            if (rs.next()) {

                txfNombreCliente.setText(rs.getString("nombre"));
                txfApellidosCliente.setText(rs.getString("apellido"));
                if (!rs.getString("celular").equalsIgnoreCase("0")) {
                    txfCelularCliente.setText(rs.getString("celular"));
                } else {
                    txfCelularCliente.setText(null);
                }
                txfPuntosCliente.setText(rs.getString("puntos"));
                desactivarCamposCliente();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente, proceda a registrarlo por favor.");
            }
        } catch (SQLException ex) {
        }
    }

    public void listarClientes() {

        try {

            DefaultTableModel modelo;
            TableColumnModel column = tablaClientes.getColumnModel();
            modelo = cDao.listar(txfBuscar.getText());
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tablaClientes.setModel(modelo);
            tcr.setHorizontalAlignment(SwingConstants.LEFT);
            tablaClientes.getColumnModel().getColumn(1).setCellRenderer(tcr);
            column.getColumn(1).setPreferredWidth(200);

        } catch (IllegalArgumentException a) {
        }
    }

    public void actualizarCliente() {

        try {

            if (txfIdentificacionCliente.getText().trim().length() == 0 || txfNombreCliente.getText().trim().length() == 0
                    || txfApellidosCliente.getText().trim().length() == 0 || txfIdentificacionCliente.getText().trim().equalsIgnoreCase("IDENTIFICACIÓN")
                    || txfNombreCliente.getText().trim().equalsIgnoreCase("NOMBRES") || txfNombreCliente.getText().trim().equalsIgnoreCase("APELLIDOS")) {
                JOptionPane.showMessageDialog(null, "Digite información en los campos obligatorios por favor.");
            } else if (txfCelularCliente.getText().trim().length() != 0 && !txfCelularCliente.getText().trim().equalsIgnoreCase("CELULAR") && txfCelularCliente.getText().trim().length() < 10) {
                JOptionPane.showMessageDialog(null, "El celular que ha ingresado no es válido, verifique su información..");
            } else {
                String cedula = txfIdentificacionCliente.getText().trim();
                String nombre = txfNombreCliente.getText().trim();
                String apellido = txfApellidosCliente.getText().trim();
                String celular = "0";
                if (txfCelularCliente.getText().trim().length() != 0 && !txfCelularCliente.getText().trim().equalsIgnoreCase("CELULAR")) {
                    celular = txfCelularCliente.getText();
                }
                String puntos = "0";
                if (txfPuntosCliente.getText().trim().length() != 0 && !txfPuntosCliente.getText().trim().equalsIgnoreCase("PUNTOS")) {
                    puntos = txfPuntosCliente.getText();
                }

                if (cDao.actualizar(cedula, nombre, apellido, celular, puntos)) {

                    JOptionPane.showMessageDialog(null, "Información del cliente actualizada correctamente.");
                    limpiarCliente();
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error, verifique que su información esté correcta.");
                }
            }
        } catch (NumberFormatException nfe) {

        }
    }

    public static String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }

    public static String mesActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM");
        return formatoFecha.format(fecha);
    }

    public static String fechaSalida() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-MM-dd");
        return formatoFecha.format(fecha);
    }

    public void buscarClienteFactura() {

        try {
            String nombre_cliente = "";
            String apellido_cliente = "";
            String celular = "";
            String puntos = "";
            String cedula = txfIdentificacion.getText().trim();

            rs = cDao.buscar(cedula);

            if (rs.next()) {
                nombre_cliente = rs.getString("nombre");
                apellido_cliente = rs.getString("apellido");
                celular = rs.getString("celular");
                puntos = rs.getString("puntos");
                txfIdentificacion.setEditable(false);
                txfNombre.setText(nombre_cliente);
                txfApellidos.setText(apellido_cliente);
                txfCelular.setText(celular);
                txfPuntos.setText(puntos);
                txfNombre.setEditable(false);
                txfApellidos.setEditable(false);
                txfCelular.setEditable(false);
                txfPuntos.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente, verifique su información por favor o registre el cliente.");
            }
        } catch (SQLException ex) {
        }
    }

}
