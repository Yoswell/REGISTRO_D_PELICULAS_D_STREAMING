package proyecto_n2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class GUI extends javax.swing.JFrame {
    
    public int id;
    public String descripcion, dni, nombreP, categoriaP, audienciaP, formatoP, proveedorSplit, proveedorSplitPeliculas, proveedorSplitDelete, proveedorSplitCombo;
    public int contarRegistrosProvedores, contarRegistrosPeliculas, proveedorP, proveedorPeliculasDelete, idGenerado = 0;
    public int proveedoresRegistrados = -1, peliculasRegistradas = -1;
    
    private Set<String> generatedIDs = new HashSet<>();
    
    public Proveedor proveedorClass = new Proveedor();
    public Proveedor[] proveedores = new Proveedor[1000];
    public Metodos metodos = new Metodos();
  
    DefaultTableModel modeloT1 = new DefaultTableModel();
    DefaultTableModel modeloT2 = new DefaultTableModel();

    public GUI() {
        initComponents();
        this.setLocationRelativeTo(this);
        idTextField.setText(Integer.toString(idGenerado));
        idPeliculasTField.setText(generarDNIUnico());
        comboCategoria.setUI(ComboBox.createUI(rootPane));
        comboAudiencia.setUI(ComboBox.createUI(rootPane));
        comboProveedores.setUI(ComboBox.createUI(rootPane));
        comboPeliculas.setUI(ComboBox.createUI(rootPane));
        comboCategoria.setMaximumRowCount(2);
        comboAudiencia.setMaximumRowCount(2);
        comboProveedores.setMaximumRowCount(2);
        comboPeliculas.setMaximumRowCount(2);
        registrarPelicualasPanel.setVisible(false);
        eliminarPeliculasPanel.setVisible(false);
        eliminarProveedorPanel.setVisible(false);
        
        personalizarTablePeliculas(jTablePeliculas, jScrollPane, modeloT1);
        personalizarTableProveedores(jTableProveedores, jScrollPane1, modeloT2);
        personalizarHeaderTable(jTablePeliculas);
        personalizarHeaderTable(jTableProveedores);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        proveedorButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        peliculasButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        eliminarPelisButton = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        eliminarProButton = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        salirPanelButton = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        eliminarPeliculasPanel = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        mensajeLabelDeletePeliculas = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        labelM13 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        labelM14 = new javax.swing.JLabel();
        labelM15 = new javax.swing.JLabel();
        labelM16 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        eliminarPeliculaButton = new javax.swing.JButton();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTablePeliculas = new javax.swing.JTable();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        comboPeliculas = new javax.swing.JComboBox<>();
        eliminarProveedorPanel = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        mensajeLabelDeleteProveedores = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        eliminarProveedoresButton = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveedores = new javax.swing.JTable();
        registrarPelicualasPanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        idPeliculasTField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        guardarPeliculasButton = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        mensajeLabelPeliculas = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        nombrePeliculasTField = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        comboAudiencia = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        labelM2 = new javax.swing.JLabel();
        labelM4 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        labelM1 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        labelM3 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        labelM5 = new javax.swing.JLabel();
        labelM6 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        labelM7 = new javax.swing.JLabel();
        labelM8 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        radioButtonIMAX = new javax.swing.JRadioButton();
        radioButton2D = new javax.swing.JRadioButton();
        radioButton3D = new javax.swing.JRadioButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();
        jPanel47 = new javax.swing.JPanel();
        labelM9 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        labelM10 = new javax.swing.JLabel();
        labelM11 = new javax.swing.JLabel();
        labelM12 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        registrarProveedorPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        mensajeLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        idTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        descripcionTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        guardarProveedorButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(176, 95, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(127, 63, 69));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/movie.png"))); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, 190, 140));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 180));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 10, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 10, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 10, -1));

        jPanel6.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 130));

        jPanel7.setBackground(new java.awt.Color(248, 239, 229));
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proveedorButton.setBackground(new java.awt.Color(248, 239, 229));
        proveedorButton.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        proveedorButton.setForeground(new java.awt.Color(51, 51, 51));
        proveedorButton.setText("Registrar proveedor");
        proveedorButton.setBorder(null);
        proveedorButton.setBorderPainted(false);
        proveedorButton.setContentAreaFilled(false);
        proveedorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proveedorButton.setFocusPainted(false);
        proveedorButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        proveedorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorButtonActionPerformed(evt);
            }
        });
        jPanel7.add(proveedorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 180, 40));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 10, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 10, -1));

        jPanel8.setBackground(new java.awt.Color(248, 239, 229));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        peliculasButton.setBackground(new java.awt.Color(248, 239, 229));
        peliculasButton.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        peliculasButton.setForeground(new java.awt.Color(51, 51, 51));
        peliculasButton.setText("Registrar peliculas");
        peliculasButton.setBorder(null);
        peliculasButton.setBorderPainted(false);
        peliculasButton.setContentAreaFilled(false);
        peliculasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        peliculasButton.setFocusPainted(false);
        peliculasButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        peliculasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculasButtonActionPerformed(evt);
            }
        });
        jPanel8.add(peliculasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 180, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 10, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 10, -1));

        jPanel10.setBackground(new java.awt.Color(248, 239, 229));
        jPanel10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarPelisButton.setBackground(new java.awt.Color(248, 239, 229));
        eliminarPelisButton.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        eliminarPelisButton.setForeground(new java.awt.Color(51, 51, 51));
        eliminarPelisButton.setText("Eliminar peliculas");
        eliminarPelisButton.setBorder(null);
        eliminarPelisButton.setBorderPainted(false);
        eliminarPelisButton.setContentAreaFilled(false);
        eliminarPelisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarPelisButton.setFocusPainted(false);
        eliminarPelisButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eliminarPelisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPelisButtonActionPerformed(evt);
            }
        });
        jPanel10.add(eliminarPelisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 180, 40));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 10, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 10, -1));

        jPanel11.setBackground(new java.awt.Color(248, 239, 229));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarProButton.setBackground(new java.awt.Color(248, 239, 229));
        eliminarProButton.setFont(new java.awt.Font("Century", 0, 17)); // NOI18N
        eliminarProButton.setForeground(new java.awt.Color(51, 51, 51));
        eliminarProButton.setText("Eliminar proveedor");
        eliminarProButton.setBorder(null);
        eliminarProButton.setBorderPainted(false);
        eliminarProButton.setContentAreaFilled(false);
        eliminarProButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarProButton.setFocusPainted(false);
        eliminarProButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eliminarProButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProButtonActionPerformed(evt);
            }
        });
        jPanel11.add(eliminarProButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 180, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 10, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 10, -1));

        jPanel29.setBackground(new java.awt.Color(127, 63, 69));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salirPanelButton.setBackground(new java.awt.Color(176, 95, 103));
        salirPanelButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        salirPanelButton.setForeground(new java.awt.Color(255, 255, 255));
        salirPanelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        salirPanelButton.setBorder(null);
        salirPanelButton.setContentAreaFilled(false);
        salirPanelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirPanelButton.setFocusPainted(false);
        salirPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirPanelButtonActionPerformed(evt);
            }
        });
        jPanel29.add(salirPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        jPanel1.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 180, 40));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel1.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 10, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel1.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 10, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 650));

        jPanel2.setBackground(new java.awt.Color(248, 239, 229));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarPeliculasPanel.setBackground(new java.awt.Color(248, 239, 229));
        eliminarPeliculasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeLabelDeletePeliculas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabelDeletePeliculas.setForeground(new java.awt.Color(51, 51, 51));
        mensajeLabelDeletePeliculas.setText("Mensajes de dialogo");
        jPanel32.add(mensajeLabelDeletePeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 540, 20));

        jLabel74.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(51, 51, 51));
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel32.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        jPanel32.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 20, 20));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        jPanel32.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        jPanel32.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        eliminarPeliculasPanel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 710, 50));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 10, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 10, -1));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 10, -1));

        jLabel82.setBackground(new java.awt.Color(255, 153, 153));
        jLabel82.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(51, 51, 51));
        jLabel82.setText("Proveedores disponibles");
        eliminarPeliculasPanel.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        eliminarPeliculasPanel.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 460, 50));

        labelM13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        eliminarPeliculasPanel.add(labelM13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 10, -1));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 10, -1));

        labelM14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        eliminarPeliculasPanel.add(labelM14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 10, -1));

        labelM15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(labelM15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 10, -1));

        labelM16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(labelM16, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 10, -1));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 10, -1));

        jPanel36.setBackground(new java.awt.Color(127, 63, 69));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarPeliculaButton.setBackground(new java.awt.Color(176, 95, 103));
        eliminarPeliculaButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        eliminarPeliculaButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarPeliculaButton.setText("Eliminar");
        eliminarPeliculaButton.setBorder(null);
        eliminarPeliculaButton.setContentAreaFilled(false);
        eliminarPeliculaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarPeliculaButton.setFocusPainted(false);
        eliminarPeliculaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPeliculaButtonActionPerformed(evt);
            }
        });
        jPanel36.add(eliminarPeliculaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 40));

        eliminarPeliculasPanel.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 200, 40));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 10, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 10, -1));

        jPanel34.setBackground(new java.awt.Color(127, 63, 69));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane.setFocusable(false);
        jScrollPane.setOpaque(false);
        jScrollPane.setViewportView(jTablePeliculas);

        jTablePeliculas.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        jTablePeliculas.setForeground(new java.awt.Color(51, 51, 51));
        jTablePeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePeliculas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTablePeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablePeliculas.setFocusable(false);
        jTablePeliculas.setGridColor(new java.awt.Color(0, 0, 0));
        jTablePeliculas.setIntercellSpacing(new java.awt.Dimension(0, 2));
        jTablePeliculas.setRequestFocusEnabled(false);
        jTablePeliculas.setRowHeight(40);
        jTablePeliculas.setSelectionBackground(new java.awt.Color(176, 95, 103));
        jTablePeliculas.setSelectionForeground(new java.awt.Color(248, 239, 229));
        jTablePeliculas.setShowGrid(false);
        jScrollPane.setViewportView(jTablePeliculas);

        jPanel34.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 300));
        jScrollPane.getAccessibleContext().setAccessibleParent(jScrollPane);

        eliminarPeliculasPanel.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 710, 320));

        jPanel37.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        eliminarPeliculasPanel.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 10, 280));

        jPanel38.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        eliminarPeliculasPanel.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 10, 270));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 10, 40));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 10, 40));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 480, -1, -1));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        eliminarPeliculasPanel.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 10, -1));

        comboPeliculas.setBackground(new java.awt.Color(255, 255, 255));
        comboPeliculas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboPeliculas.setForeground(new java.awt.Color(51, 51, 51));
        comboPeliculas.setMaximumRowCount(150);
        comboPeliculas.setBorder(null);
        comboPeliculas.setLightWeightPopupEnabled(false);
        comboPeliculas.setRequestFocusEnabled(false);
        comboPeliculas.setVerifyInputWhenFocusTarget(false);
        comboPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPeliculasActionPerformed(evt);
            }
        });
        eliminarPeliculasPanel.add(comboPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 460, 40));

        jPanel2.add(eliminarPeliculasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 770, 600));

        eliminarProveedorPanel.setBackground(new java.awt.Color(248, 239, 229));
        eliminarProveedorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, -1));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeLabelDeleteProveedores.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabelDeleteProveedores.setForeground(new java.awt.Color(51, 51, 51));
        mensajeLabelDeleteProveedores.setText("Mensajes de dialogo");
        jPanel30.add(mensajeLabelDeleteProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 550, 20));

        jLabel57.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(51, 51, 51));
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel30.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        jPanel30.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 20, 20));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        jPanel30.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        jPanel30.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        eliminarProveedorPanel.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 710, 50));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 10, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 10, -1));

        jPanel40.setBackground(new java.awt.Color(127, 63, 69));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eliminarProveedoresButton.setBackground(new java.awt.Color(176, 95, 103));
        eliminarProveedoresButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        eliminarProveedoresButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarProveedoresButton.setText("Eliminar");
        eliminarProveedoresButton.setBorder(null);
        eliminarProveedoresButton.setContentAreaFilled(false);
        eliminarProveedoresButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarProveedoresButton.setFocusPainted(false);
        eliminarProveedoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProveedoresButtonActionPerformed(evt);
            }
        });
        jPanel40.add(eliminarProveedoresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 40));

        eliminarProveedorPanel.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, 200, 40));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 10, -1));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, 10, -1));

        jPanel41.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        eliminarProveedorPanel.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 10, 370));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 10, 40));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 10, 40));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 10, -1));

        jPanel42.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        eliminarProveedorPanel.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 10, 380));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        eliminarProveedorPanel.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 10, -1));

        jPanel43.setBackground(new java.awt.Color(127, 63, 69));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.setViewportView(jTableProveedores);

        jTableProveedores.setFont(new java.awt.Font("Century Schoolbook", 0, 16)); // NOI18N
        jTableProveedores.setForeground(new java.awt.Color(51, 51, 51));
        jTableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProveedores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableProveedores.setFocusable(false);
        jTableProveedores.setGridColor(new java.awt.Color(0, 0, 0));
        jTableProveedores.setIntercellSpacing(new java.awt.Dimension(0, 2));
        jTableProveedores.setRequestFocusEnabled(false);
        jTableProveedores.setRowHeight(40);
        jTableProveedores.setSelectionBackground(new java.awt.Color(176, 95, 103));
        jTableProveedores.setSelectionForeground(new java.awt.Color(248, 239, 229));
        jTableProveedores.setShowGrid(false);
        jScrollPane1.setViewportView(jTableProveedores);

        jPanel43.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 410));

        eliminarProveedorPanel.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 710, 430));

        jPanel2.add(eliminarProveedorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 770, 590));

        registrarPelicualasPanel.setBackground(new java.awt.Color(248, 239, 229));
        registrarPelicualasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setBackground(new java.awt.Color(255, 153, 153));
        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("DNI de la película");
        registrarPelicualasPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel39.setBackground(new java.awt.Color(255, 153, 153));
        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 51));
        jLabel39.setText("Catergorías disponibles");
        registrarPelicualasPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 10, -1));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idPeliculasTField.setEditable(false);
        idPeliculasTField.setBackground(new java.awt.Color(255, 255, 255));
        idPeliculasTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        idPeliculasTField.setForeground(new java.awt.Color(51, 51, 51));
        idPeliculasTField.setBorder(null);
        jPanel13.add(idPeliculasTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 450, 40));

        registrarPelicualasPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 460, 40));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 10, -1));

        jPanel14.setBackground(new java.awt.Color(127, 63, 69));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarPeliculasButton.setBackground(new java.awt.Color(176, 95, 103));
        guardarPeliculasButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        guardarPeliculasButton.setForeground(new java.awt.Color(255, 255, 255));
        guardarPeliculasButton.setText("Guardar");
        guardarPeliculasButton.setBorder(null);
        guardarPeliculasButton.setContentAreaFilled(false);
        guardarPeliculasButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarPeliculasButton.setFocusPainted(false);
        guardarPeliculasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPeliculasButtonActionPerformed(evt);
            }
        });
        jPanel14.add(guardarPeliculasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        registrarPelicualasPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 150, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 10, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 10, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, -1));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeLabelPeliculas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabelPeliculas.setForeground(new java.awt.Color(51, 51, 51));
        mensajeLabelPeliculas.setText("Mensajes de dialogo");
        jPanel21.add(mensajeLabelPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 550, 20));

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(51, 51, 51));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel21.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        jPanel21.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 20, 20));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        jPanel21.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        jPanel21.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        registrarPelicualasPanel.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 710, 50));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 10, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 10, -1));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrePeliculasTField.setBackground(new java.awt.Color(255, 255, 255));
        nombrePeliculasTField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        nombrePeliculasTField.setForeground(new java.awt.Color(51, 51, 51));
        nombrePeliculasTField.setBorder(null);
        jPanel22.add(nombrePeliculasTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 450, 40));

        registrarPelicualasPanel.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 460, 40));

        jLabel53.setBackground(new java.awt.Color(255, 153, 153));
        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("Nombre de la película");
        registrarPelicualasPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        comboCategoria.setBackground(new java.awt.Color(255, 255, 255));
        comboCategoria.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboCategoria.setForeground(new java.awt.Color(51, 51, 51));
        comboCategoria.setMaximumRowCount(150);
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Aventura", "Ciencia Ficción", "Comedia", "Documental", "Drama", "Fantasía", "Musical", "Suspenso", "Terror" }));
        comboCategoria.setBorder(null);
        comboCategoria.setLightWeightPopupEnabled(false);
        comboCategoria.setRequestFocusEnabled(false);
        comboCategoria.setVerifyInputWhenFocusTarget(false);
        registrarPelicualasPanel.add(comboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 460, 40));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 10, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 10, -1));

        jLabel51.setBackground(new java.awt.Color(255, 153, 153));
        jLabel51.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Audiencias disponibles");
        registrarPelicualasPanel.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        comboAudiencia.setBackground(new java.awt.Color(255, 255, 255));
        comboAudiencia.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboAudiencia.setForeground(new java.awt.Color(51, 51, 51));
        comboAudiencia.setMaximumRowCount(150);
        comboAudiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantil", "Juvenil", "Adultos", "Familiares" }));
        comboAudiencia.setBorder(null);
        comboAudiencia.setLightWeightPopupEnabled(false);
        comboAudiencia.setRequestFocusEnabled(false);
        comboAudiencia.setVerifyInputWhenFocusTarget(false);
        registrarPelicualasPanel.add(comboAudiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 460, 40));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 10, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 10, -1));

        labelM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 10, -1));

        labelM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 10, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 10, -1));

        labelM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 10, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 10, -1));

        labelM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 10, -1));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        registrarPelicualasPanel.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 460, 50));

        labelM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 10, -1));

        labelM6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 10, -1));

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        registrarPelicualasPanel.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 460, 50));

        labelM7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 10, -1));

        labelM8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 10, -1));

        jLabel59.setBackground(new java.awt.Color(255, 153, 153));
        jLabel59.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(51, 51, 51));
        jLabel59.setText("Proveedores disponibles");
        registrarPelicualasPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 10, -1));

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        radioButtonIMAX.setBackground(new java.awt.Color(255, 255, 255));
        radioButtonIMAX.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        radioButtonIMAX.setForeground(new java.awt.Color(51, 51, 51));
        radioButtonIMAX.setText("IMAX");
        radioButtonIMAX.setBorder(null);
        radioButtonIMAX.setContentAreaFilled(false);
        radioButtonIMAX.setRequestFocusEnabled(false);
        radioButtonIMAX.setRolloverEnabled(false);
        radioButtonIMAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonIMAXActionPerformed(evt);
            }
        });
        jPanel23.add(radioButtonIMAX, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        radioButton2D.setBackground(new java.awt.Color(255, 255, 255));
        radioButton2D.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        radioButton2D.setForeground(new java.awt.Color(51, 51, 51));
        radioButton2D.setText("2D");
        radioButton2D.setBorder(null);
        radioButton2D.setContentAreaFilled(false);
        radioButton2D.setRequestFocusEnabled(false);
        radioButton2D.setRolloverEnabled(false);
        radioButton2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton2DActionPerformed(evt);
            }
        });
        jPanel23.add(radioButton2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        radioButton3D.setBackground(new java.awt.Color(255, 255, 255));
        radioButton3D.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        radioButton3D.setForeground(new java.awt.Color(51, 51, 51));
        radioButton3D.setText("3D");
        radioButton3D.setBorder(null);
        radioButton3D.setContentAreaFilled(false);
        radioButton3D.setRequestFocusEnabled(false);
        radioButton3D.setRolloverEnabled(false);
        radioButton3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton3DActionPerformed(evt);
            }
        });
        jPanel23.add(radioButton3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        registrarPelicualasPanel.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 270, 40));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 530, 10, -1));

        jLabel67.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setText("Formato de la película");
        jLabel67.setToolTipText("");
        registrarPelicualasPanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        comboProveedores.setBackground(new java.awt.Color(255, 255, 255));
        comboProveedores.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboProveedores.setForeground(new java.awt.Color(51, 51, 51));
        comboProveedores.setMaximumRowCount(150);
        comboProveedores.setBorder(null);
        comboProveedores.setLightWeightPopupEnabled(false);
        comboProveedores.setRequestFocusEnabled(false);
        comboProveedores.setVerifyInputWhenFocusTarget(false);
        registrarPelicualasPanel.add(comboProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 460, 40));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        registrarPelicualasPanel.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 460, 50));

        labelM9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 10, -1));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 10, -1));

        labelM10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 10, -1));

        labelM11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 10, -1));

        labelM12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(labelM12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 10, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarPelicualasPanel.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 10, -1));

        jPanel2.add(registrarPelicualasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 770, 590));

        registrarProveedorPanel.setBackground(new java.awt.Color(248, 239, 229));
        registrarProveedorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 10, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 10, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mensajeLabel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(51, 51, 51));
        mensajeLabel.setText("Mensajes de dialogo");
        jPanel5.add(mensajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 16, 550, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/warning.png"))); // NOI18N
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 20, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3.png"))); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        registrarProveedorPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 710, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 10, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 10, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("ID del proveedor");
        registrarProveedorPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Descripción del proveedor");
        registrarProveedorPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 10, -1));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTextField.setEditable(false);
        idTextField.setBackground(new java.awt.Color(255, 255, 255));
        idTextField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        idTextField.setForeground(new java.awt.Color(51, 51, 51));
        idTextField.setBorder(null);
        jPanel9.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, 40));

        registrarProveedorPanel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 460, 40));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 10, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        descripcionTextField.setBackground(new java.awt.Color(255, 255, 255));
        descripcionTextField.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        descripcionTextField.setForeground(new java.awt.Color(51, 51, 51));
        descripcionTextField.setBorder(null);
        jPanel12.add(descripcionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 440, 40));

        registrarProveedorPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 460, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 10, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 10, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 10, 40));

        jPanel4.setBackground(new java.awt.Color(127, 63, 69));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guardarProveedorButton.setBackground(new java.awt.Color(176, 95, 103));
        guardarProveedorButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        guardarProveedorButton.setForeground(new java.awt.Color(255, 255, 255));
        guardarProveedorButton.setText("Guardar");
        guardarProveedorButton.setBorder(null);
        guardarProveedorButton.setContentAreaFilled(false);
        guardarProveedorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarProveedorButton.setFocusPainted(false);
        guardarProveedorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarProveedorButtonActionPerformed(evt);
            }
        });
        jPanel4.add(guardarProveedorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 270, 40));

        registrarProveedorPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 330, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 10, 40));

        jPanel15.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        registrarProveedorPanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 430, 120));

        jPanel16.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        registrarProveedorPanel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 80, 80));

        jPanel17.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        registrarProveedorPanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 80, 80));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 10, 40));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 10, 40));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 10, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 10, 40));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 10, 40));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        registrarProveedorPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 10, 40));

        jPanel18.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        registrarProveedorPanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 100, 50));

        jPanel19.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        registrarProveedorPanel.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 100, 50));

        jPanel20.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        registrarProveedorPanel.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 450, 90));

        jPanel2.add(registrarProveedorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 770, 590));

        jPanel35.setBackground(new java.awt.Color(127, 63, 69));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(248, 239, 229));
        titulo.setText("Registro de proveedores de Streaming");
        jPanel35.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 340, 40));

        jPanel2.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 440, 40));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas.png"))); // NOI18N
        jPanel2.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 10, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadas - copia.png"))); // NOI18N
        jPanel2.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 10, -1));

        jPanel26.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -20, 10, 40));

        jPanel27.setBackground(new java.awt.Color(127, 63, 69));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, -10, 10, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void personalizarTablePeliculas(JTable table, JScrollPane scroll, DefaultTableModel modelo) {
        scroll.getViewport().setBackground(new Color(248,239,229));
        scroll.setBorder(null);
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Categoría");
        modelo.addColumn("Audiencia");
        modelo.addColumn("Formato");
        table.setModel(modelo);
    }
    
    public void personalizarTableProveedores(JTable table, JScrollPane scroll, DefaultTableModel modelo) {
        scroll.getViewport().setBackground(new Color(248,239,229));
        scroll.setBorder(null);
        modelo.addColumn("ID");
        modelo.addColumn("Descripción");
        modelo.addColumn("Registro de peliculas");
        table.setModel(modelo);
    }
    
    public void personalizarHeaderTable(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(176,95,103));
        header.setForeground(new Color(248,239,229));
        header.getHeight();
        header.setBorder(new LineBorder(new Color(248,239,229), 2));
        header.setFont(new Font("Century Gothic", Font.PLAIN, 14));
        Dimension headerDimension = header.getPreferredSize();
        headerDimension.height = 30;
        header.setPreferredSize(headerDimension);
    }
    
    private void guardarProveedorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarProveedorButtonActionPerformed
        if (!descripcionTextField.getText().isEmpty()) {
            id = Integer.parseInt(idTextField.getText());
            descripcion = descripcionTextField.getText();
            Proveedor proveedor = new Proveedor();
            proveedor.Proveedor(id, descripcion);
            proveedores[++proveedoresRegistrados] = proveedor;
            mensajeLabel.setText("El proveedor con ID : [ " + id + " ] ha sido agregado correctamente");  
            comboProveedores.addItem("[ " + id + " ]" + descripcion);
            comboPeliculas.addItem("[ " + id + " ]" + descripcion);
            idTextField.setText(generarId());
        } else {
            metodos.smsCampos(mensajeLabel);
        }
    }//GEN-LAST:event_guardarProveedorButtonActionPerformed

    private void guardarPeliculasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPeliculasButtonActionPerformed
        if (proveedoresRegistrados == -1) {
            mensajeLabelPeliculas.setText("Primero debe de agregar un proveedor");
        } else {
            if(!nombrePeliculasTField.getText().isEmpty()) {
                if(radioButton2D.isSelected() || radioButton3D.isSelected() || radioButtonIMAX.isSelected()) {
                    dni = idPeliculasTField.getText();
                    nombreP = nombrePeliculasTField.getText();
                    categoriaP = comboCategoria.getSelectedItem().toString();
                    audienciaP = comboAudiencia.getSelectedItem().toString();
                    try {
                        proveedorSplit = comboProveedores.getSelectedItem().toString();
                        String separarDatos = proveedorSplit.split("\\[")[1].split("\\]")[0];
                        separarDatos = separarDatos.replaceAll("[^0-9]", "");
                        proveedorP = Integer.parseInt(separarDatos);
                    } catch (NumberFormatException e) {
                        mensajeLabelPeliculas.setText("Error al tomar el valor del combo de proveedores");
                    }
                    formatoP = (radioButton2D.isSelected()) ? "2D" : (radioButton3D.isSelected()) ? "3D" : (radioButtonIMAX.isSelected()) ? "IMAX" : null;

                    if (proveedorP >= 0) {
                        Pelicula pelicula = new Pelicula();
                        pelicula.Pelicula(dni, nombreP, categoriaP, audienciaP, formatoP);
                        proveedores[proveedorP].agregarPelicula(pelicula);
                        peliculasRegistradas++;
                        mensajeLabelPeliculas.setText("Pelicula agregada correctamente al proveedor con ID : [" + proveedorP + "]");
                        idPeliculasTField.setText(generarDNIUnico());
                    }
                } else {
                    metodos.smsCampos(mensajeLabelPeliculas);
                }
            } else {
                metodos.smsCampos(mensajeLabelPeliculas);
            }
        }
    }//GEN-LAST:event_guardarPeliculasButtonActionPerformed

    private void proveedorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorButtonActionPerformed
        metodos.mostrarPaneles(eliminarPeliculasPanel, registrarPelicualasPanel, eliminarProveedorPanel, registrarProveedorPanel);
    }//GEN-LAST:event_proveedorButtonActionPerformed

    private void peliculasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculasButtonActionPerformed
        metodos.mostrarPaneles(registrarProveedorPanel, eliminarPeliculasPanel, eliminarProveedorPanel, registrarPelicualasPanel);
    }//GEN-LAST:event_peliculasButtonActionPerformed

    private void salirPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPanelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirPanelButtonActionPerformed

    private void eliminarPeliculaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPeliculaButtonActionPerformed
        if (proveedoresRegistrados != -1 && peliculasRegistradas != -1) {
            metodos.vaciarRows(modeloT1);

            int proveedorSeleccionado = -1;
            int continuar = -1;
            
            try {
                proveedorSplitDelete = comboPeliculas.getSelectedItem().toString();
                String separarDatos = proveedorSplitDelete.split("\\[")[1].split("\\]")[0];
                separarDatos = separarDatos.replaceAll("[^0-9]", "");
                proveedorSeleccionado = Integer.parseInt(separarDatos);
            } catch (NumberFormatException e) {
                mensajeLabelPeliculas.setText("Error al tomar el valor del combo de proveedores");
            }

            for (int i = 0; i < proveedores.length; i++) {
                if (proveedores[i].getIdProveedor() == proveedorSeleccionado) {
                    proveedores[i] = proveedorClass.eliminarPrimeraPelicula(proveedores[i]);
                    continuar++;
                    break;
                }
            }
            metodos.actualizarTablaPeliculas_AfterDelete(proveedores, modeloT1, proveedorSeleccionado, continuar);
        } else {
            mensajeLabelDeletePeliculas.setText("Primero debe de registrar un proveedor y registrarle peliculas");
        }
    }//GEN-LAST:event_eliminarPeliculaButtonActionPerformed

    private void eliminarPelisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPelisButtonActionPerformed
        metodos.mostrarPaneles(registrarProveedorPanel, registrarPelicualasPanel, eliminarProveedorPanel, eliminarPeliculasPanel);
        boolean continuar = proveedores != null && proveedores.length > 0;
        
        if (continuar) {
            actualizarTablePeliculas();
        } else {
            mensajeLabelDeletePeliculas.setText("Primero debe de registrar una pelicula");
        }
    }//GEN-LAST:event_eliminarPelisButtonActionPerformed

    private void eliminarProButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProButtonActionPerformed
        metodos.mostrarPaneles(registrarProveedorPanel, registrarPelicualasPanel, eliminarPeliculasPanel, eliminarProveedorPanel);
        boolean continuar = proveedores != null && proveedores.length > 0;
        
        if (continuar) {
            actualizarTableProveedores();
        } else {
            mensajeLabelDeletePeliculas.setText("Primero debe de registrar un proveedor");
        }
    }//GEN-LAST:event_eliminarProButtonActionPerformed

    private void eliminarProveedoresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProveedoresButtonActionPerformed
        if (proveedoresRegistrados != -1) {
            metodos.vaciarRows(modeloT2);
            Proveedor proveedor = new Proveedor();
            Proveedor[] nuevosProveedores = proveedor.eliminarUltimoProveedor(proveedores);

            if (nuevosProveedores == null) {
                mensajeLabelDeleteProveedores.setText("El último proveedor posee películas en su cola");
                Proveedor llenarTable = new Proveedor();
                llenarTable.mostrarProveedores(proveedores, modeloT2);   
            } else {
                proveedores = nuevosProveedores;
                Proveedor llenarTable = new Proveedor();
                llenarTable.mostrarProveedores(proveedores, modeloT2);
                comboPeliculas.removeAllItems();
                comboProveedores.removeAllItems();

                for (Proveedor pro : proveedores) {
                    if (pro != null) {
                        comboPeliculas.addItem("[ " + pro.getIdProveedor() + " ]" + pro.getDescripcion());
                        comboProveedores.addItem("[ " + pro.getIdProveedor() + " ]" + pro.getDescripcion());
                    }
                }
            } 
        } else {
            mensajeLabelDeleteProveedores.setText("Primero debe de registrar un proveedor para poder eliminarlo");
        }
    }//GEN-LAST:event_eliminarProveedoresButtonActionPerformed

    private void radioButton2DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton2DActionPerformed
        metodos.desabilitarRadioButton(radioButton2D, radioButton3D, radioButtonIMAX);
    }//GEN-LAST:event_radioButton2DActionPerformed

    private void radioButton3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton3DActionPerformed
        metodos.desabilitarRadioButton(radioButton3D, radioButton2D, radioButtonIMAX);
    }//GEN-LAST:event_radioButton3DActionPerformed

    private void radioButtonIMAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonIMAXActionPerformed
        metodos.desabilitarRadioButton(radioButtonIMAX, radioButton2D, radioButton3D);
    }//GEN-LAST:event_radioButtonIMAXActionPerformed

    private void comboPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPeliculasActionPerformed
        metodos.vaciarRows(modeloT1);
        int index = comboPeliculas.getSelectedIndex();
        
        for (int i = 0; i < index; i++) {
            llenarTablaPeliculas(proveedores);
        }
        
        if (index == 0) {
            llenarTablaPeliculas(proveedores);
        }
    }//GEN-LAST:event_comboPeliculasActionPerformed
    
    public void actualizarTablePeliculas() {
        metodos.vaciarRows(modeloT1);
        if (peliculasRegistradas != -1) {
            boolean continuar = proveedores != null && proveedores.length > 0;
            if (continuar) {
                llenarTablaPeliculas(proveedores);
            } else {
                mensajeLabelDeletePeliculas.setText("Primero debe de registrar una pelicula");
            }
        } else {
            mensajeLabelDeletePeliculas.setText("La cola de peliculas esta vacía");
        }
    }
    
    public void actualizarTableProveedores() {
        metodos.vaciarRows(modeloT2);
        if (proveedoresRegistrados != -1) {
            boolean continuar = proveedores != null && proveedores.length > 0;
            if (continuar) {
                llenarTablaProveedores(proveedores);
            } else {
                mensajeLabelDeleteProveedores.setText("Primero debe de registrar un proveedor");
            }
        } else {
            mensajeLabelDeleteProveedores.setText("La pila de proveedores esta vacía");
        }
    }
    
    public void llenarTablaPeliculas(Proveedor[] proveedores) {
        int proveedorSeleccionado = -1;
        int continuar = -1;
        
        if (comboPeliculas.getSelectedItem() != null) {
            try {
                proveedorSplitDelete = comboPeliculas.getSelectedItem().toString();
                String separarDatos = proveedorSplitDelete.split("\\[")[1].split("\\]")[0];
                separarDatos = separarDatos.replaceAll("[^0-9]", "");
                proveedorSeleccionado = Integer.parseInt(separarDatos);
            } catch (NumberFormatException e) {
                mensajeLabelPeliculas.setText("Error al tomar el valor del combo de proveedores");
            }
            
            for (Proveedor locateID : proveedores) {
                if (locateID != null) {
                    if (locateID.getIdProveedor() == proveedorSeleccionado) {
                        continuar = locateID.getIdProveedor();
                        break;
                    }
                }
            }

            if (continuar >= 0) {
                Pelicula[] peliculas = {};
                if (proveedores[proveedorSeleccionado].getPeliculas() != null) {
                    peliculas = proveedores[proveedorSeleccionado].getPeliculas(); 
                    for (int i = 0; i < proveedores[proveedorSeleccionado].getPeliculas().length; i++) {
                        Pelicula pelicula = peliculas[i];
                        if (pelicula != null) {
                            Object[] datos = {pelicula.getDni(), pelicula.getNombre(), pelicula.getCategoria(), pelicula.getAudiencia(), pelicula.getFormato()};
                            Object[] x = new Object[5];
                            System.arraycopy(datos, 0, x, 0, 5);
                            modeloT1.addRow(x);
                        } else {
                            mensajeLabelDeletePeliculas.setText("La cola de peliculas del proveedor con id : [" + proveedorSeleccionado + "] esta vacía");
                        }
                    }
                }  
            } else {
                mensajeLabelDeletePeliculas.setText("La cola de peliculas del proveedor con id : [" + proveedorSeleccionado + "] esta vacía");
            }
        } else {
            mensajeLabelDeletePeliculas.setText("Primero debe de registrar un proveedor");
        }
    }
    
    public void llenarTablaProveedores(Proveedor[] proveedores) {
        Object[] datos = {};
        for (Proveedor pro : proveedores) {
            if (pro != null) {
                Pelicula[] peliculas = pro.getPeliculas();
                datos = metodos.colasVaciasOLlenas(peliculas, datos, pro);
                Object[] x = new Object[3];
                System.arraycopy(datos, 0, x, 0, 3);
                modeloT2.addRow(datos);
            }
        }
    }
    
    public String generarId() {
        idGenerado += 1;
        return Integer.toString(idGenerado);
    }
    
    private String generarDNIUnico() {
        String id;
        do {
            id = generarDNI();
        } while (generatedIDs.contains(id));

        return id;
    }

    private String generarDNI() {
        UUID guid = UUID.randomUUID();
        String guidString = guid.toString();
        return guidString;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboAudiencia;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboPeliculas;
    private javax.swing.JComboBox<String> comboProveedores;
    private javax.swing.JTextField descripcionTextField;
    private javax.swing.JButton eliminarPeliculaButton;
    private javax.swing.JPanel eliminarPeliculasPanel;
    private javax.swing.JButton eliminarPelisButton;
    private javax.swing.JButton eliminarProButton;
    private javax.swing.JPanel eliminarProveedorPanel;
    private javax.swing.JButton eliminarProveedoresButton;
    private javax.swing.JButton guardarPeliculasButton;
    private javax.swing.JButton guardarProveedorButton;
    private javax.swing.JTextField idPeliculasTField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePeliculas;
    private javax.swing.JTable jTableProveedores;
    private javax.swing.JLabel labelM1;
    private javax.swing.JLabel labelM10;
    private javax.swing.JLabel labelM11;
    private javax.swing.JLabel labelM12;
    private javax.swing.JLabel labelM13;
    private javax.swing.JLabel labelM14;
    private javax.swing.JLabel labelM15;
    private javax.swing.JLabel labelM16;
    private javax.swing.JLabel labelM2;
    private javax.swing.JLabel labelM3;
    private javax.swing.JLabel labelM4;
    private javax.swing.JLabel labelM5;
    private javax.swing.JLabel labelM6;
    private javax.swing.JLabel labelM7;
    private javax.swing.JLabel labelM8;
    private javax.swing.JLabel labelM9;
    private javax.swing.JLabel mensajeLabel;
    private javax.swing.JLabel mensajeLabelDeletePeliculas;
    private javax.swing.JLabel mensajeLabelDeleteProveedores;
    private javax.swing.JLabel mensajeLabelPeliculas;
    private javax.swing.JTextField nombrePeliculasTField;
    private javax.swing.JButton peliculasButton;
    private javax.swing.JButton proveedorButton;
    private javax.swing.JRadioButton radioButton2D;
    private javax.swing.JRadioButton radioButton3D;
    private javax.swing.JRadioButton radioButtonIMAX;
    private javax.swing.JPanel registrarPelicualasPanel;
    private javax.swing.JPanel registrarProveedorPanel;
    private javax.swing.JButton salirPanelButton;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}