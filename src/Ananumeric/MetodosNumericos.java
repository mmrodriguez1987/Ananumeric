package Ananumeric;
import edu.hws.jcm.awt.ExpressionInput;
import edu.hws.jcm.awt.VariableInput;
import edu.hws.jcm.data.Expression;
import edu.hws.jcm.data.Parser;
import edu.hws.jcm.data.Variable;
import edu.hws.jcm.functions.SummationParser;
import java.awt.event.KeyEvent;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MetodosNumericos extends javax.swing.JInternalFrame {
  static DefaultTableModel modelotabla;
  Vector newfila, newfila1, newfila2, newfila3, newfila4, newfila5, newfila6;
    public MetodosNumericos() {
        initComponents();
        modelotabla =  (DefaultTableModel)Table6.getModel();
        newfila = new Vector();
        newfila.add("Sumar, Restar, Multiplicar, Dividir, Potenciación");
        newfila.add("+, -, *, /, ** ");
        modelotabla.addRow(newfila);
        
        newfila1 = new Vector();
        newfila1.add("Digitar Coeficientes con variables, Ej.: 2x");
        newfila1.add("2*x");
        modelotabla.addRow(newfila1);
        
        newfila2 = new Vector();
        newfila2.add("Usando la función de Euler, Ej.: e^x");
        newfila2.add("e**(x)");
        modelotabla.addRow(newfila2);
        
        newfila3 = new Vector();
        newfila3.add("Usando el logaritmo natural, Ej.: ln(sen(x))");
        newfila3.add("ln(sin(x))");
        modelotabla.addRow(newfila3);
        
        newfila4 = new Vector();
        newfila4.add("Funciones Trigonométricas Inversas");
        newfila4.add("arcsin(x), arccos(x), arctan(x)");
        modelotabla.addRow(newfila4);
        
        newfila5 = new Vector();
        newfila5.add("Funciones que no admite la aplicación.");
        newfila5.add("Funciones Hiperbólicas, Logaritmo Neperiano");
        modelotabla.addRow(newfila5);
        
        newfila6 = new Vector();
        newfila6.add("Restablecer Campos del Método Actual");
        newfila6.add("Presione el último botón de la barra vertical");
        modelotabla.addRow(newfila6);
        
        Tabbed.setSelectedIndex(5);
        
    }
   
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jButtonBar1 = new com.l2fprod.common.swing.JButtonBar();
        tb1 = new javax.swing.JToggleButton();
        tb2 = new javax.swing.JToggleButton();
        tb3 = new javax.swing.JToggleButton();
        tb4 = new javax.swing.JToggleButton();
        tb5 = new javax.swing.JToggleButton();
        tb6 = new javax.swing.JToggleButton();
        Tabbed = new javax.swing.JTabbedPane();
        Tab1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        label_funcion = new javax.swing.JLabel();
        t_funcion = new javax.swing.JTextField();
        label_pto = new javax.swing.JLabel();
        t_punto = new javax.swing.JTextField();
        l_resp1 = new javax.swing.JLabel();
        b_tab1 = new javax.swing.JButton();
        Deri = new javax.swing.JLabel();
        l_tabla = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tab2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        l_funcion1 = new javax.swing.JLabel();
        t_funcion1 = new javax.swing.JTextField();
        label_pto1 = new javax.swing.JLabel();
        t_punto1 = new javax.swing.JTextField();
        b_tab2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        l_resp2 = new javax.swing.JLabel();
        Deri1 = new javax.swing.JLabel();
        Deri2 = new javax.swing.JLabel();
        l_tabla1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Tab3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        label_funcion2 = new javax.swing.JLabel();
        t_funcion2 = new javax.swing.JTextField();
        limite1 = new javax.swing.JLabel();
        t_limite1 = new javax.swing.JTextField();
        limite2 = new javax.swing.JLabel();
        t_limite2 = new javax.swing.JTextField();
        b_tab3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table3 = new javax.swing.JTable();
        l_resp3 = new javax.swing.JLabel();
        l_tabla2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tab4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        label_funcion3 = new javax.swing.JLabel();
        t_funcion3 = new javax.swing.JTextField();
        limite_a = new javax.swing.JLabel();
        t_limite_a = new javax.swing.JTextField();
        limite_b = new javax.swing.JLabel();
        t_limite_b = new javax.swing.JTextField();
        b_tab4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Table4 = new javax.swing.JTable();
        l_resp4 = new javax.swing.JLabel();
        l_tabla3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tab5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        label_funcion4 = new javax.swing.JLabel();
        t_funcion4 = new javax.swing.JTextField();
        limite_m = new javax.swing.JLabel();
        t_limite_m = new javax.swing.JTextField();
        limite_n = new javax.swing.JLabel();
        t_limite_n = new javax.swing.JTextField();
        b_tab5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Table5 = new javax.swing.JTable();
        l_resp5 = new javax.swing.JLabel();
        l_tabla4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tab6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Table6 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\outlook-trash.gif"));
        jMenu2.setText("Salir");
        jMenuBar2.add(jMenu2);

        setResizable(true);
        setTitle("Unidad II: M\u00e9todos N\u00famericos Iteractivos");
        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        com.l2fprod.common.swing.PercentLayout percentLayout1 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout1.setOrientation(1);
        jButtonBar1.setLayout(percentLayout1);

        tb1.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup1.add(tb1);
        tb1.setFont(new java.awt.Font("Verdana", 1, 10));
        tb1.setForeground(new java.awt.Color(0, 0, 153));
        tb1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\folder.gif"));
        tb1.setText(" M\u00e9t.  NewtonRaphson");
        tb1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tb1.setMaximumSize(new java.awt.Dimension(85, 80));
        tb1.setMinimumSize(new java.awt.Dimension(85, 80));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb1MousePressed(evt);
            }
        });

        jButtonBar1.add(tb1);

        tb2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(tb2);
        tb2.setFont(new java.awt.Font("Verdana", 1, 10));
        tb2.setForeground(new java.awt.Color(0, 0, 153));
        tb2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\folder.gif"));
        tb2.setText("  NewtonRaphson Mod");
        tb2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tb2.setMaximumSize(new java.awt.Dimension(139, 60));
        tb2.setMinimumSize(new java.awt.Dimension(139, 60));
        tb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb2MousePressed(evt);
            }
        });

        jButtonBar1.add(tb2);

        tb3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(tb3);
        tb3.setFont(new java.awt.Font("Verdana", 1, 10));
        tb3.setForeground(new java.awt.Color(0, 0, 153));
        tb3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\folder.gif"));
        tb3.setText("  M\u00e9todo de la Secante");
        tb3.setActionCommand("               Secante");
        tb3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tb3.setMaximumSize(new java.awt.Dimension(85, 80));
        tb3.setMinimumSize(new java.awt.Dimension(85, 80));
        tb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb3MousePressed(evt);
            }
        });

        jButtonBar1.add(tb3);

        tb4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(tb4);
        tb4.setFont(new java.awt.Font("Verdana", 1, 10));
        tb4.setForeground(new java.awt.Color(0, 0, 153));
        tb4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\folder.gif"));
        tb4.setText("   M\u00e9todo de  Bisecci\u00f3n");
        tb4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tb4.setMaximumSize(new java.awt.Dimension(85, 80));
        tb4.setMinimumSize(new java.awt.Dimension(85, 80));
        tb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb4MousePressed(evt);
            }
        });

        jButtonBar1.add(tb4);

        tb5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(tb5);
        tb5.setFont(new java.awt.Font("Verdana", 1, 10));
        tb5.setForeground(new java.awt.Color(0, 0, 153));
        tb5.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\folder.gif"));
        tb5.setText("M\u00e9todo de Regla Falsa");
        tb5.setActionCommand("M\u00e9todo de la Regla Falsa");
        tb5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tb5.setMaximumSize(new java.awt.Dimension(85, 80));
        tb5.setMinimumSize(new java.awt.Dimension(85, 80));
        tb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb5MousePressed(evt);
            }
        });

        jButtonBar1.add(tb5);

        tb6.setFont(new java.awt.Font("Verdana", 1, 10));
        tb6.setForeground(new java.awt.Color(0, 0, 153));
        tb6.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__update.png"));
        tb6.setText("Reestablecer");
        tb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb6ActionPerformed(evt);
            }
        });
        tb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb6MousePressed(evt);
            }
        });

        jButtonBar1.add(tb6);

        Tabbed.setFont(new java.awt.Font("Verdana", 1, 12));
        Tab1.setLayout(null);

        jPanel7.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setFont(new java.awt.Font("Verdana", 1, 12));
        Table1.setFont(new java.awt.Font("Verdana", 1, 10));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setCellSelectionEnabled(true);
        Table1.setDoubleBuffered(true);
        Table1.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(Table1);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(70, 140, 470, 130);

        label_funcion.setFont(new java.awt.Font("Verdana", 1, 14));
        label_funcion.setForeground(new java.awt.Color(255, 255, 255));
        label_funcion.setText("F ( x ) =");
        jPanel7.add(label_funcion);
        label_funcion.setBounds(44, 30, 80, 30);

        t_funcion.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_funcion.setForeground(new java.awt.Color(0, 102, 102));
        t_funcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(t_funcion);
        t_funcion.setBounds(130, 30, 260, 30);

        label_pto.setFont(new java.awt.Font("Verdana", 1, 14));
        label_pto.setForeground(new java.awt.Color(255, 255, 255));
        label_pto.setText("Punto X0 =");
        jPanel7.add(label_pto);
        label_pto.setBounds(404, 22, 90, 40);

        t_punto.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_punto.setForeground(new java.awt.Color(0, 102, 102));
        t_punto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_punto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_puntoKeyTyped(evt);
            }
        });

        jPanel7.add(t_punto);
        t_punto.setBounds(500, 30, 60, 30);

        l_resp1.setFont(new java.awt.Font("Verdana", 1, 14));
        l_resp1.setForeground(new java.awt.Color(255, 204, 51));
        l_resp1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_resp1.setToolTipText("Ra\u00edz de la Funci\u00f3n");
        jPanel7.add(l_resp1);
        l_resp1.setBounds(10, 300, 610, 40);

        b_tab1.setBackground(new java.awt.Color(255, 255, 255));
        b_tab1.setFont(new java.awt.Font("Verdana", 1, 12));
        b_tab1.setForeground(new java.awt.Color(0, 0, 153));
        b_tab1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\bModify.png"));
        b_tab1.setText("Evaluar Funci\u00f3n");
        b_tab1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        b_tab1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_tab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tab1ActionPerformed(evt);
            }
        });

        jPanel7.add(b_tab1);
        b_tab1.setBounds(135, 70, 180, 41);

        Deri.setFont(new java.awt.Font("Verdana", 1, 14));
        Deri.setForeground(new java.awt.Color(255, 204, 51));
        Deri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(Deri);
        Deri.setBounds(10, 340, 610, 40);

        l_tabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_tabla.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\FondoTabla1.JPG"));
        l_tabla.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l_tabla.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel7.add(l_tabla);
        l_tabla.setBounds(50, 120, 500, 170);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D069.jpg"));
        jPanel7.add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 420);

        Tab1.add(jPanel7);
        jPanel7.setBounds(0, 0, 630, 420);

        Tabbed.addTab("N-R", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lightning.png"), Tab1);

        Tab2.setLayout(null);

        jPanel8.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        l_funcion1.setFont(new java.awt.Font("Verdana", 1, 14));
        l_funcion1.setForeground(new java.awt.Color(255, 255, 255));
        l_funcion1.setText("F ( x ) =");
        jPanel8.add(l_funcion1);
        l_funcion1.setBounds(34, 32, 70, 30);

        t_funcion1.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_funcion1.setForeground(new java.awt.Color(0, 102, 102));
        t_funcion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel8.add(t_funcion1);
        t_funcion1.setBounds(110, 33, 270, 26);

        label_pto1.setFont(new java.awt.Font("Verdana", 1, 14));
        label_pto1.setForeground(new java.awt.Color(255, 255, 255));
        label_pto1.setText("Punto X0 =");
        jPanel8.add(label_pto1);
        label_pto1.setBounds(404, 32, 90, 30);

        t_punto1.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_punto1.setForeground(new java.awt.Color(0, 102, 102));
        t_punto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_punto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_punto1KeyTyped(evt);
            }
        });

        jPanel8.add(t_punto1);
        t_punto1.setBounds(500, 30, 50, 30);

        b_tab2.setBackground(new java.awt.Color(255, 255, 255));
        b_tab2.setFont(new java.awt.Font("Verdana", 1, 12));
        b_tab2.setForeground(new java.awt.Color(0, 153, 102));
        b_tab2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\businesssetup.png"));
        b_tab2.setText("Evaluar Funci\u00f3n");
        b_tab2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        b_tab2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_tab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tab2ActionPerformed(evt);
            }
        });

        jPanel8.add(b_tab2);
        b_tab2.setBounds(115, 70, 170, 40);

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane2.setFont(new java.awt.Font("Verdana", 1, 12));
        Table2.setFont(new java.awt.Font("Verdana", 1, 10));
        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table2.setCellSelectionEnabled(true);
        Table2.setDoubleBuffered(true);
        Table2.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(Table2);

        jPanel8.add(jScrollPane2);
        jScrollPane2.setBounds(70, 140, 470, 130);

        l_resp2.setFont(new java.awt.Font("Verdana", 1, 14));
        l_resp2.setForeground(new java.awt.Color(255, 204, 51));
        l_resp2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_resp2.setToolTipText("Ra\u00edz de la Funci\u00f3n");
        jPanel8.add(l_resp2);
        l_resp2.setBounds(10, 300, 610, 30);

        Deri1.setFont(new java.awt.Font("Verdana", 1, 14));
        Deri1.setForeground(new java.awt.Color(255, 204, 51));
        Deri1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(Deri1);
        Deri1.setBounds(10, 330, 610, 30);

        Deri2.setFont(new java.awt.Font("Verdana", 1, 14));
        Deri2.setForeground(new java.awt.Color(255, 204, 51));
        Deri2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(Deri2);
        Deri2.setBounds(10, 370, 610, 30);

        l_tabla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_tabla1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\FondoTabla1.JPG"));
        l_tabla1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l_tabla1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel8.add(l_tabla1);
        l_tabla1.setBounds(50, 120, 500, 170);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D069.jpg"));
        jPanel8.add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 420);

        Tab2.add(jPanel8);
        jPanel8.setBounds(0, 0, 630, 420);

        Tabbed.addTab("N-R Mod", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lightning.png"), Tab2);

        Tab3.setLayout(null);

        jPanel9.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        label_funcion2.setFont(new java.awt.Font("Verdana", 1, 14));
        label_funcion2.setForeground(new java.awt.Color(255, 255, 255));
        label_funcion2.setText("F ( x ) =");
        jPanel9.add(label_funcion2);
        label_funcion2.setBounds(94, 32, 70, 30);

        t_funcion2.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_funcion2.setForeground(new java.awt.Color(0, 102, 102));
        t_funcion2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel9.add(t_funcion2);
        t_funcion2.setBounds(170, 33, 270, 26);

        limite1.setFont(new java.awt.Font("Verdana", 1, 14));
        limite1.setForeground(new java.awt.Color(255, 255, 255));
        limite1.setText("X o =");
        jPanel9.add(limite1);
        limite1.setBounds(94, 72, 50, 30);

        t_limite1.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_limite1.setForeground(new java.awt.Color(0, 102, 102));
        t_limite1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_limite1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_limite1KeyTyped(evt);
            }
        });

        jPanel9.add(t_limite1);
        t_limite1.setBounds(150, 73, 60, 30);

        limite2.setFont(new java.awt.Font("Verdana", 1, 14));
        limite2.setForeground(new java.awt.Color(255, 255, 255));
        limite2.setText("X 1 =");
        jPanel9.add(limite2);
        limite2.setBounds(234, 72, 50, 30);

        t_limite2.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_limite2.setForeground(new java.awt.Color(0, 102, 102));
        t_limite2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_limite2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_limite2KeyTyped(evt);
            }
        });

        jPanel9.add(t_limite2);
        t_limite2.setBounds(290, 73, 60, 30);

        b_tab3.setBackground(new java.awt.Color(255, 255, 255));
        b_tab3.setFont(new java.awt.Font("Verdana", 1, 12));
        b_tab3.setForeground(new java.awt.Color(102, 0, 102));
        b_tab3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\acgt2.gif"));
        b_tab3.setText("Evaluar Funci\u00f3n");
        b_tab3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        b_tab3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_tab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tab3ActionPerformed(evt);
            }
        });

        jPanel9.add(b_tab3);
        b_tab3.setBounds(436, 70, 160, 40);

        jScrollPane3.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane3.setFont(new java.awt.Font("Verdana", 1, 12));
        Table3.setFont(new java.awt.Font("Verdana", 1, 10));
        Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table3.setCellSelectionEnabled(true);
        Table3.setDoubleBuffered(true);
        Table3.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(Table3);

        jPanel9.add(jScrollPane3);
        jScrollPane3.setBounds(70, 140, 470, 130);

        l_resp3.setFont(new java.awt.Font("Verdana", 1, 14));
        l_resp3.setForeground(new java.awt.Color(255, 204, 51));
        l_resp3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_resp3.setToolTipText("Ra\u00edz de la Funci\u00f3n");
        jPanel9.add(l_resp3);
        l_resp3.setBounds(20, 300, 600, 30);

        l_tabla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_tabla2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\FondoTabla1.JPG"));
        l_tabla2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l_tabla2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel9.add(l_tabla2);
        l_tabla2.setBounds(50, 120, 500, 170);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D069.jpg"));
        jPanel9.add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 420);

        Tab3.add(jPanel9);
        jPanel9.setBounds(0, 0, 630, 420);

        Tabbed.addTab("Secante", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lightning.png"), Tab3);

        Tab4.setLayout(null);

        jPanel10.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        label_funcion3.setFont(new java.awt.Font("Verdana", 1, 14));
        label_funcion3.setForeground(new java.awt.Color(255, 255, 255));
        label_funcion3.setText("F ( x ) =");
        jPanel10.add(label_funcion3);
        label_funcion3.setBounds(94, 32, 70, 30);

        t_funcion3.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_funcion3.setForeground(new java.awt.Color(0, 102, 102));
        t_funcion3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel10.add(t_funcion3);
        t_funcion3.setBounds(170, 33, 270, 26);

        limite_a.setFont(new java.awt.Font("Verdana", 1, 14));
        limite_a.setForeground(new java.awt.Color(255, 255, 255));
        limite_a.setText("X o =");
        jPanel10.add(limite_a);
        limite_a.setBounds(94, 72, 50, 40);

        t_limite_a.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_limite_a.setForeground(new java.awt.Color(0, 102, 102));
        t_limite_a.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_limite_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_limite_aKeyTyped(evt);
            }
        });

        jPanel10.add(t_limite_a);
        t_limite_a.setBounds(150, 73, 60, 30);

        limite_b.setFont(new java.awt.Font("Verdana", 1, 14));
        limite_b.setForeground(new java.awt.Color(255, 255, 255));
        limite_b.setText("X 1 =");
        jPanel10.add(limite_b);
        limite_b.setBounds(234, 72, 50, 40);

        t_limite_b.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_limite_b.setForeground(new java.awt.Color(0, 102, 102));
        t_limite_b.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_limite_b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_limite_bKeyTyped(evt);
            }
        });

        jPanel10.add(t_limite_b);
        t_limite_b.setBounds(290, 73, 60, 30);

        b_tab4.setBackground(new java.awt.Color(255, 255, 255));
        b_tab4.setFont(new java.awt.Font("Verdana", 1, 12));
        b_tab4.setForeground(new java.awt.Color(102, 0, 102));
        b_tab4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\enteprise_35.gif"));
        b_tab4.setText("Evaluar Funci\u00f3n");
        b_tab4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        b_tab4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_tab4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tab4ActionPerformed(evt);
            }
        });

        jPanel10.add(b_tab4);
        b_tab4.setBounds(416, 67, 180, 43);

        jScrollPane4.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane4.setFont(new java.awt.Font("Verdana", 1, 12));
        Table4.setFont(new java.awt.Font("Verdana", 1, 10));
        Table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table4.setCellSelectionEnabled(true);
        Table4.setDoubleBuffered(true);
        Table4.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(Table4);

        jPanel10.add(jScrollPane4);
        jScrollPane4.setBounds(70, 140, 470, 130);

        l_resp4.setFont(new java.awt.Font("Verdana", 1, 14));
        l_resp4.setForeground(new java.awt.Color(255, 204, 51));
        l_resp4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_resp4.setToolTipText("Ra\u00edz de la Funci\u00f3n");
        jPanel10.add(l_resp4);
        l_resp4.setBounds(10, 300, 610, 30);

        l_tabla3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_tabla3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\FondoTabla1.JPG"));
        l_tabla3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l_tabla3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel10.add(l_tabla3);
        l_tabla3.setBounds(50, 120, 500, 170);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D069.jpg"));
        jPanel10.add(jLabel6);
        jLabel6.setBounds(0, 0, 630, 420);

        Tab4.add(jPanel10);
        jPanel10.setBounds(0, 0, 630, 420);

        Tabbed.addTab("Bisecci\u00f3n", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lightning.png"), Tab4);

        Tab5.setLayout(null);

        jPanel11.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        label_funcion4.setFont(new java.awt.Font("Verdana", 1, 14));
        label_funcion4.setForeground(new java.awt.Color(255, 255, 255));
        label_funcion4.setText("F ( x ) =");
        jPanel11.add(label_funcion4);
        label_funcion4.setBounds(94, 32, 70, 30);

        t_funcion4.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_funcion4.setForeground(new java.awt.Color(0, 102, 102));
        t_funcion4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(t_funcion4);
        t_funcion4.setBounds(170, 33, 270, 26);

        limite_m.setFont(new java.awt.Font("Verdana", 1, 14));
        limite_m.setForeground(new java.awt.Color(255, 255, 255));
        limite_m.setText("X o =");
        jPanel11.add(limite_m);
        limite_m.setBounds(94, 72, 50, 40);

        t_limite_m.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_limite_m.setForeground(new java.awt.Color(0, 102, 102));
        t_limite_m.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_limite_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_limite_mKeyTyped(evt);
            }
        });

        jPanel11.add(t_limite_m);
        t_limite_m.setBounds(150, 73, 60, 30);

        limite_n.setFont(new java.awt.Font("Verdana", 1, 14));
        limite_n.setForeground(new java.awt.Color(255, 255, 255));
        limite_n.setText("X 1 =");
        jPanel11.add(limite_n);
        limite_n.setBounds(234, 72, 50, 40);

        t_limite_n.setFont(new java.awt.Font("Comic Sans MS", 0, 14));
        t_limite_n.setForeground(new java.awt.Color(0, 102, 102));
        t_limite_n.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_limite_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_limite_nKeyTyped(evt);
            }
        });

        jPanel11.add(t_limite_n);
        t_limite_n.setBounds(290, 73, 60, 30);

        b_tab5.setBackground(new java.awt.Color(255, 255, 255));
        b_tab5.setFont(new java.awt.Font("Verdana", 1, 12));
        b_tab5.setForeground(new java.awt.Color(204, 0, 204));
        b_tab5.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\visualweb_35.gif"));
        b_tab5.setText("Evaluar Funci\u00f3n");
        b_tab5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        b_tab5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        b_tab5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_tab5ActionPerformed(evt);
            }
        });

        jPanel11.add(b_tab5);
        b_tab5.setBounds(416, 70, 180, 40);

        jScrollPane5.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane5.setFont(new java.awt.Font("Verdana", 1, 12));
        Table5.setFont(new java.awt.Font("Verdana", 1, 10));
        Table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table5.setCellSelectionEnabled(true);
        Table5.setDoubleBuffered(true);
        Table5.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane5.setViewportView(Table5);

        jPanel11.add(jScrollPane5);
        jScrollPane5.setBounds(70, 140, 470, 130);

        l_resp5.setBackground(new java.awt.Color(255, 255, 255));
        l_resp5.setFont(new java.awt.Font("Verdana", 1, 14));
        l_resp5.setForeground(new java.awt.Color(255, 204, 51));
        l_resp5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_resp5.setToolTipText("Ra\u00edz de la Funci\u00f3n");
        jPanel11.add(l_resp5);
        l_resp5.setBounds(10, 300, 610, 20);

        l_tabla4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_tabla4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\FondoTabla1.JPG"));
        l_tabla4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        l_tabla4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel11.add(l_tabla4);
        l_tabla4.setBounds(50, 120, 500, 170);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D069.jpg"));
        jPanel11.add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 420);

        Tab5.add(jPanel11);
        jPanel11.setBounds(0, 0, 630, 420);

        Tabbed.addTab("Regla Falsa", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lightning.png"), Tab5);

        jPanel2.setLayout(null);

        jScrollPane6.setDoubleBuffered(true);
        Table6.setFont(new java.awt.Font("Verdana", 1, 12));
        Table6.setForeground(new java.awt.Color(102, 0, 102));
        Table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operaciones Básicas", "Sintaxis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Table6);

        jPanel2.add(jScrollPane6);
        jScrollPane6.setBounds(30, 50, 570, 220);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D791.jpg"));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 630, 420);

        org.jdesktop.layout.GroupLayout Tab6Layout = new org.jdesktop.layout.GroupLayout(Tab6);
        Tab6.setLayout(Tab6Layout);
        Tab6Layout.setHorizontalGroup(
            Tab6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        Tab6Layout.setVerticalGroup(
            Tab6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(Tab6Layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 428, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Tabbed.addTab("Ayuda", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lightning.png"), Tab6);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jButtonBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(Tabbed, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 637, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Tabbed, 0, 0, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButtonBar1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 446, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(179, 179, 179))
        );

        jMenuBar1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        jMenu1.setText("Propiedades");
        jMenu1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        jMenuItem1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 204));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\stop.png"));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
        setBounds(100, 100, 838, 546);
    }// </editor-fold>//GEN-END:initComponents

    private void tb6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb6MousePressed
  tb5.setSelected(false);  tb1.setSelected(false); tb3.setSelected(false);
  tb4.setSelected(false); tb5.setSelected(false); tb6.setSelected(true);
 
    }//GEN-LAST:event_tb6MousePressed

    private void tb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb6ActionPerformed

  int op = Tabbed.getSelectedIndex();
  
  if (op == 0)
  {
      Restablecer1();
  }
  if (op == 1)
  {
      Restablecer2();
  }
  if (op == 2)
  {
      Restablecer3();
  }
  if (op == 3)
  {
      Restablecer4();
  }
  if (op == 4)
  {
      Restablecer5();
  }
    }//GEN-LAST:event_tb6ActionPerformed

    private void t_limite_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_limite_nKeyTyped
          char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_limite_nKeyTyped

    private void t_limite_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_limite_mKeyTyped
         char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_limite_mKeyTyped

    private void t_limite_bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_limite_bKeyTyped
       char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_limite_bKeyTyped

    private void t_limite_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_limite_aKeyTyped
       char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_limite_aKeyTyped

    private void t_limite2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_limite2KeyTyped
         char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_limite2KeyTyped

    private void t_limite1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_limite1KeyTyped
        char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_limite1KeyTyped

    private void t_punto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_punto1KeyTyped
char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_punto1KeyTyped

    private void t_puntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_puntoKeyTyped

        char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.') || (c == '-') ))
            evt.consume();
    }//GEN-LAST:event_t_puntoKeyTyped

    private void b_tab5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tab5ActionPerformed

       String FuncionString = null,lim_izq = null,lim_der = null, s = null, s1 = null, s2 = null;
       int i = 0;
       Vector nuevafila;
       double[] x = new double[10000]; 
       double[] x1 = new double[10000];
       double[] x2 = new double[10000]; 
       double[] x3 = new double[10000];
       double[] valor = new double[10000];
       double error = 0, v1 = 0, v2 = 0, v3 = 0;
    
       try
       {       
 	FuncionString = t_funcion4.getText();
 	lim_izq = t_limite_m.getText();
 	lim_der = t_limite_n.getText();
        
        VariableInput xInput;
  	xInput = new VariableInput();
        Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression F;
  	parser= new Parser(null,0);
  	
  	parser.addOptions(Parser.STANDARD_FUNCTIONS);
  	parser.addOptions(Parser.BOOLEANS);
  	parser.addOptions(Parser.OPTIONAL_STARS);
  	parser.addOptions(Parser.OPTIONAL_PARENS);
  	parser.addOptions(Parser.FACTORIAL);
  	parser.add(new SummationParser());
  	xVar = new Variable("x");
        parser.add( xVar );
    
        FunctionInput = new ExpressionInput(FuncionString,parser);
        F = FunctionInput.getExpression();
     
      if(F.dependsOn(xVar) == false)
      {
        Utilidades.DialogBurla("La función no depende de 'X'","Información del Sistema","help.gif","close.wav");
      }
      else 
      {
        
 	if(Utilidades.ConfIntervalo(FuncionString,lim_izq,lim_der) == true)
 	{
 	 x1[1] = Double.parseDouble(lim_izq);
 	 x3[1] = Double.parseDouble(lim_der);
 	 x2[1] = Utilidades.RuleFalse(FuncionString,s2.valueOf(x1[1]),s2.valueOf(x3[1]));	
         x[1] = Utilidades.RuleFalse(FuncionString,s2.valueOf(x1[1]),s2.valueOf(x3[1]));
         
        modelotabla =  (DefaultTableModel)Table5.getModel();
        nuevafila = new Vector();
        nuevafila.add(1);
        nuevafila.add(x[1]);
        nuevafila.add(0);
        modelotabla.addRow(nuevafila);
        
 	 i = 2;
 	 do
 	  {
 	   
 	   v1 = Utilidades.EvaluarFuncion(FuncionString,s.valueOf(x1[i - 1]));
 	   v2 = Utilidades.EvaluarFuncion(FuncionString,s.valueOf(x[i - 1]));
 	   v3 = Utilidades.EvaluarFuncion(FuncionString,s.valueOf(x3[i - 1]));
 	   	
 	   if( (v1 < 0 && v2 > 0) || (v1 > 0 && v2 < 0) )
 	    {
 	 	x[i] = Utilidades.RuleFalse(FuncionString,s2.valueOf(x1[i - 1]),s2.valueOf(x2[i - 1]));
 	 	error = Utilidades.Error(x[i],x[i - 1]);
 	 	
 	 	x1[i] = x1[i - 1];
 	 	x2[i] = x[i];
 	 	x3[i] = x2[i - 1];
 	        
                modelotabla =  (DefaultTableModel)Table5.getModel();
                nuevafila = new Vector();
                nuevafila.add(i);
                nuevafila.add(x[i]);
                nuevafila.add(error);
                modelotabla.addRow(nuevafila);
                
 	   }
 	   
 	   if( (v2 < 0 && v3 > 0) || (v2 > 0 && v3 < 0) )
 	    {
 	 	x[i] = Utilidades.RuleFalse(FuncionString,s2.valueOf(x2[i - 1]),s2.valueOf(x3[i - 1]));
 	 	error = Utilidades.Error(x[i],x[i - 1]);
 	 	
 	 	x1[i] = x2[i - 1];
 	 	x2[i] = x[i];
 	 	x3[i] = x3[i - 1];
 	 	
                modelotabla =  (DefaultTableModel)Table5.getModel();
                nuevafila = new Vector();
                nuevafila.add(i);
                nuevafila.add(x[i]);
                nuevafila.add(error);
                modelotabla.addRow(nuevafila);
               
 	   }
 	   
 	   i++;
 	  }while(error > 1);
           if(Utilidades.EvaluarFuncion(FuncionString,lim_izq) == 0 || Utilidades.EvaluarFuncion(FuncionString,lim_der) == 0  )
           {     if(Utilidades.EvaluarFuncion(FuncionString,lim_izq) == 0 )
                 { 
                    l_resp5.setText("Raíz de la Función = "+lim_izq);
                 }
     
                 if(Utilidades.EvaluarFuncion(FuncionString,lim_der) == 0 )
                 {
                    l_resp5.setText("Raíz de la Función = "+lim_der);
                 }
                 
                  if(Utilidades.EvaluarFuncion(FuncionString,lim_der) == 0 && Utilidades.EvaluarFuncion(FuncionString,lim_izq) == 0)
                 {
                     Table5.setModel(new javax.swing.table.DefaultTableModel(
                             new Object [][] {
                         
                     },
                             new String [] {
                         " Interacción Nº", " Xi", "               Error"
                     }
                     ) {
                         Class[] types = new Class [] {
                             java.lang.String.class, java.lang.String.class, java.lang.String.class
                         };
                         boolean[] canEdit = new boolean [] {
                             false, false, false
                         };
                         
                         public Class getColumnClass(int columnIndex) {
                             return types [columnIndex];
                         }
                         
                         public boolean isCellEditable(int rowIndex, int columnIndex) {
                             return canEdit [columnIndex];
                         }
                     });
                     
                    l_resp5.setText("Raíz de la Función = "+lim_der);
                    modelotabla =  (DefaultTableModel)Table5.getModel();
                    nuevafila = new Vector();
                    nuevafila.add(1);
                    nuevafila.add(lim_der);
                    nuevafila.add(0);
                    modelotabla.addRow(nuevafila);
                 }    
           }
           else
           {  
               l_resp5.setText("Raíz de la Función = "+x[i - 1]);
           }
                 b_tab5.setEnabled(false); 
                 System.out.println("Izq "+Utilidades.EvaluarFuncion(FuncionString,lim_izq)+" Der "+Utilidades.EvaluarFuncion(FuncionString,lim_der));
 	}
        else
        {
        Utilidades.BoxDialog("En intervalo digitado no existe una raíz real para F(x)","Error de Lectura de Datos.","help.gif");
        t_limite_m.setText(" "); t_limite_n.setText(" ");
        
        }  
       }
      }
       catch(Exception e) 
      {
        Utilidades.BoxDialog("Digite sólo datos permisibles y/o asegúrese de que la función dependa de ' X '","Error de Lectura de Datos.","help.gif");
        Restablecer5();
       }
    }//GEN-LAST:event_b_tab5ActionPerformed

    private void b_tab4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tab4ActionPerformed
   String FuncionString = null,lim_izq = null,lim_der = null, s = null, s1 = null;
   int i = 0;
   Vector nuevafila;
   double[] Xm = new double[1000]; 
   double[] x1 = new double[1000];
   double[] x2 = new double[1000]; 
   double[] x3 = new double[1000];
   double[] valor = new double[1000];
   double error = 0, v1 = 0, v2 = 0, v3 = 0;
 
   try
   {       
 	FuncionString = t_funcion3.getText();
 	lim_izq = t_limite_a.getText();
 	lim_der = t_limite_b.getText();
 	
         VariableInput xInput;
  	xInput = new VariableInput();
        Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression F;
  	parser= new Parser(null,0);
  	
  	parser.addOptions(Parser.STANDARD_FUNCTIONS);
  	parser.addOptions(Parser.BOOLEANS);
  	parser.addOptions(Parser.OPTIONAL_STARS);
  	parser.addOptions(Parser.OPTIONAL_PARENS);
  	parser.addOptions(Parser.FACTORIAL);
  	parser.add(new SummationParser());
  	xVar = new Variable("x");
        parser.add( xVar );
    
        FunctionInput = new ExpressionInput(FuncionString,parser);
        F = FunctionInput.getExpression();
     
      if(F.dependsOn(xVar) == false || lim_izq == lim_der)
      {
        Utilidades.DialogBurla("La función no depende de 'X'","Información del Sistema","help.gif","close.wav");
      }
      else 
      {
        
 	if(Utilidades.ConfIntervalo(FuncionString,lim_izq,lim_der) == true)
 	{
 	 x1[1] = Double.parseDouble(lim_izq);
 	 x3[1] = Double.parseDouble(lim_der);
 	 x2[1] = Utilidades.PuntoMedio(x1[1],x3[1]);	
         Xm[1] = Utilidades.PuntoMedio(x1[1],x3[1]);
                
 	 i = 2;
 	 do
 	  {
 	   
 	   v1 = Utilidades.EvaluarFuncion(FuncionString,s.valueOf(x1[i - 1]));
 	   v2 = Utilidades.EvaluarFuncion(FuncionString,s.valueOf(Xm[i - 1]));
 	   v3 = Utilidades.EvaluarFuncion(FuncionString,s.valueOf(x3[i - 1]));
 	   	
 	   if( (v1 < 0 && v2 > 0) || (v1 > 0 && v2 < 0) )
 	    {
 	 	Xm[i] = Utilidades.PuntoMedio(x1[i - 1],x2[i - 1]);
 	 	error = Utilidades.Error(Xm[i],Xm[i - 1]);
 	 	
                modelotabla =  (DefaultTableModel)Table4.getModel();
                nuevafila = new Vector();
                nuevafila.add(i - 1);
                nuevafila.add(Xm[i]);
                nuevafila.add(error);
                modelotabla.addRow(nuevafila);
                
 	 	x1[i] = x1[i - 1];
 	 	x2[i] = Xm[i];
 	 	x3[i] = x2[i - 1];
 		
 	   }
 	   
 	   if( (v2 < 0 && v3 > 0) || (v2 > 0 && v3 < 0) )
 	    {
 	 	Xm[i] = Utilidades.PuntoMedio(x2[i - 1],x3[i - 1]);
 	 	error = Utilidades.Error(Xm[i],Xm[i - 1]);
 	 	
                modelotabla =  (DefaultTableModel)Table4.getModel();
                nuevafila = new Vector();
                nuevafila.add(i - 1);
                nuevafila.add(Xm[i]);
                nuevafila.add(error);
                modelotabla.addRow(nuevafila);
                
 	 	x1[i] = x2[i - 1];
 	 	x2[i] = Xm[i];
 	 	x3[i] = x3[i - 1];
 	 	
 	   }
 	   
 	   i++;
 	  }while(error > 1);
 	  
          if(Utilidades.EvaluarFuncion(FuncionString,lim_izq) == 0 || Utilidades.EvaluarFuncion(FuncionString,lim_der) == 0  )
           {     if(Utilidades.EvaluarFuncion(FuncionString,lim_izq) == 0 )
                 { 
                    l_resp4.setText("Raíz de la Función = "+lim_izq);
                    modelotabla =  (DefaultTableModel)Table4.getModel();
                    nuevafila = new Vector();
                    nuevafila.add(1);
                    nuevafila.add(lim_izq);
                    nuevafila.add(0);
                    modelotabla.addRow(nuevafila);
                 }
     
                 if(Utilidades.EvaluarFuncion(FuncionString,lim_der) == 0 )
                 {
                    l_resp4.setText("Raíz de la Función = "+lim_der);
                    modelotabla =  (DefaultTableModel)Table4.getModel();
                    nuevafila = new Vector();
                    nuevafila.add(1);
                    nuevafila.add(lim_der);
                    nuevafila.add(0);
                    modelotabla.addRow(nuevafila);
                 }
                 
                 if(Utilidades.EvaluarFuncion(FuncionString,lim_der) == 0 && Utilidades.EvaluarFuncion(FuncionString,lim_izq) == 0)
                 {
                     Table4.setModel(new javax.swing.table.DefaultTableModel(
                             new Object [][] {
                         
                     },
                             new String [] {
                         " Interacción Nº", " Xi", "               Error"
                     }
                     ) {
                         Class[] types = new Class [] {
                             java.lang.String.class, java.lang.String.class, java.lang.String.class
                         };
                         boolean[] canEdit = new boolean [] {
                             false, false, false
                         };
                         
                         public Class getColumnClass(int columnIndex) {
                             return types [columnIndex];
                         }
                         
                         public boolean isCellEditable(int rowIndex, int columnIndex) {
                             return canEdit [columnIndex];
                         }
                     });
                     
                    l_resp4.setText("Raíz de la Función = "+lim_der);
                    modelotabla =  (DefaultTableModel)Table4.getModel();
                    nuevafila = new Vector();
                    nuevafila.add(1);
                    nuevafila.add(lim_der);
                    nuevafila.add(0);
                    modelotabla.addRow(nuevafila);
                 }    
           }
           else
           {  
               l_resp4.setText("Raíz de la Función = "+Xm[i - 1]);
           }
 	 
          b_tab4.setEnabled(false);
 	}
        else
        {
         Utilidades.BoxDialog("En intervalo digitado no existe una raíz real para F(x)","Información del Sistema","help.gif"); 
        t_limite_a.setText(" "); t_limite_b.setText(" ");
        
        
        }   
      }     
   }
   catch(Exception e) 
     {
        Utilidades.BoxDialog("Digite sólo datos permisibles y/o asegúrese de que la función dependa de ' X '","Información del Sistema","help.gif");
        Restablecer4();
     }
    }//GEN-LAST:event_b_tab4ActionPerformed

    private void b_tab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tab3ActionPerformed

       String FuncionString = null, pto1 = null, pto2 = null,g = null, p = null;
       Vector nuevafila;
       double[] x = new double[1000];
       int i = 0;
       double error = 0, d = 0;
 try 
 {           
 	FuncionString = t_funcion2.getText();
 	pto1 = t_limite1.getText();
 	pto2 = t_limite2.getText();;
 	
         VariableInput xInput;
  	xInput = new VariableInput();
        Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression F;
  	parser= new Parser(null,0);
  	
  	parser.addOptions(Parser.STANDARD_FUNCTIONS);
  	parser.addOptions(Parser.BOOLEANS);
  	parser.addOptions(Parser.OPTIONAL_STARS);
  	parser.addOptions(Parser.OPTIONAL_PARENS);
  	parser.addOptions(Parser.FACTORIAL);
  	parser.add(new SummationParser());
  	xVar = new Variable("x");
        parser.add( xVar );
    
        FunctionInput = new ExpressionInput(FuncionString,parser);
        F = FunctionInput.getExpression();
     
      if(F.dependsOn(xVar) == false )
      {
         Utilidades.DialogBurla("La función no depende de 'X'","Información del Sistema","help.gif","close.wav");
      }
      else 
      {
        
        if(Utilidades.ConfIntervalo(FuncionString,pto1,pto2) == true)
        { 
        x[0] = Double.parseDouble(pto1);		
	x[1] = Double.parseDouble(pto2);  
      
 	i = 1;
 	do
 	{
 	 x[i+1] = Utilidades.MSecante(FuncionString,g.valueOf(x[i]),g.valueOf(x[i - 1]));
 	 error = Utilidades.Error(x[i],x[i - 1]);
 	 
 	 modelotabla =  (DefaultTableModel)Table3.getModel();
         nuevafila = new Vector();
         nuevafila.add(p.valueOf(i));
         nuevafila.add(p.valueOf(x[i]));
         nuevafila.add(p.valueOf(error));
         modelotabla.addRow(nuevafila);
 	 i++;	
 	}while(error > 1);
 	
        l_resp3.setText("Raiz de la Función = "+x[i - 1]);
        b_tab3.setEnabled(false);
        
        }
        else
            {
               Utilidades.DialogBurla("En este intervalo no existe raíz real para F(x) ","Información del Sistema","help.gif","close.wav");
        }
      }     
   }
    catch(Exception e) 
     {
        Utilidades.BoxDialog("Digite sólo datos permisibles y/o asegúrese de que la función dependa de ' X '","Información del Sistema","help.gif");
        Restablecer3();
     }
    }//GEN-LAST:event_b_tab3ActionPerformed

    private void b_tab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tab2ActionPerformed
  
    String FuncionString = null, pto = null,p = null;
    Vector nuevafila;
    double[] x = new double[1000];
    int i = 0;
    double error = 0, d = 0;
 try
 {          
   FuncionString = t_funcion1.getText();	
   pto = t_punto1.getText();
   
        VariableInput xInput;
  	xInput = new VariableInput();
        Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression F;
  	parser= new Parser(null,0);
  	
  	parser.addOptions(Parser.STANDARD_FUNCTIONS);
  	parser.addOptions(Parser.BOOLEANS);
  	parser.addOptions(Parser.OPTIONAL_STARS);
  	parser.addOptions(Parser.OPTIONAL_PARENS);
  	parser.addOptions(Parser.FACTORIAL);
  	parser.add(new SummationParser());
  	xVar = new Variable("x");
        parser.add( xVar );
    
        FunctionInput = new ExpressionInput(FuncionString,parser);
        F = FunctionInput.getExpression();
     
      if(F.dependsOn(xVar) == false)
      {
        Utilidades.DialogBurla("La función no depende de 'X'","Información del Sistema","help.gif","close.wav");
      }
      else 
      {
 	
       x[0] = Double.parseDouble(pto);
       x[1] = Utilidades.NewtonRaphsonM(FuncionString,pto);
       error = Utilidades.Error(x[1],x[0]);

       modelotabla =  (DefaultTableModel)Table2.getModel();
       nuevafila = new Vector();
       nuevafila.add(1);
       nuevafila.add(x[1]);
       nuevafila.add(0);
       modelotabla.addRow(nuevafila);
 	
 	i = 2;
 	do
 	{
 	 x[i] = Utilidades.NewtonRaphsonM(FuncionString,p.valueOf(x[i -1]));
 	 error = Utilidades.Error(x[i],x[i - 1]);
         
         modelotabla =  (DefaultTableModel)Table2.getModel();
         nuevafila = new Vector();
         nuevafila.add(p.valueOf(i));
         nuevafila.add(p.valueOf(x[i]));
         nuevafila.add(p.valueOf(error));
         modelotabla.addRow(nuevafila);
 	
 	 i++;	
 	}while(error > 1);
 	
 	l_resp2.setText("Raíz de la Función = "+x[i - 1]);
        Deri1.setText("F'( x ) = "+Utilidades.Derivar(FuncionString).toString());
        Deri2.setText("F''( x ) = "+Utilidades.Derivar(Utilidades.Derivar(FuncionString).toString()).toString());
        Deri1.setVisible(true);
        Deri2.setVisible(true);
        b_tab2.setEnabled(false);
      } 
   }
   catch(Exception e) 
     {
        Utilidades.BoxDialog("Digite sólo datos permisibles y/o asegúrese de que la función dependa de ' X '","Error de Lectura de Datos.","help.gif");
        Restablecer2();
   }
    }//GEN-LAST:event_b_tab2ActionPerformed

    private void b_tab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_tab1ActionPerformed

   String FuncionString = null, pto = null,p = null;
   
   Vector nuevafila;
   double[] x = new double[1000];
   int i = 0;
   double error = 0, d = 0;
  try 
  {	
        FuncionString = t_funcion.getText();	
        pto = t_punto.getText();
     
        VariableInput xInput;
  	xInput = new VariableInput();
        Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression F;
  	parser= new Parser(null,0);
  	
  	parser.addOptions(Parser.STANDARD_FUNCTIONS);
  	parser.addOptions(Parser.BOOLEANS);
  	parser.addOptions(Parser.OPTIONAL_STARS);
  	parser.addOptions(Parser.OPTIONAL_PARENS);
  	parser.addOptions(Parser.FACTORIAL);
  	parser.add(new SummationParser());
  	xVar = new Variable("x");
        parser.add( xVar );
    
        FunctionInput = new ExpressionInput(FuncionString,parser);
        F = FunctionInput.getExpression();
     
      if(F.dependsOn(xVar) == false)
      {
        Utilidades.DialogBurla("La función no depende de 'X'","Información del Sistema","help.gif","close.wav");
      }
      else 
      {          
        x[0] = Double.parseDouble(pto);
        x[1] = Utilidades.NewtonRaphson(FuncionString,pto);
        error = Utilidades.Error(x[1],x[0]);
       
         modelotabla =  (DefaultTableModel)Table1.getModel();

 	i = 2;
 	do
 	{
 	 x[i] = Utilidades.NewtonRaphson(FuncionString,p.valueOf(x[i -1]));
 	 error = Utilidades.Error(x[i],x[i - 1]);
 	 System.out.println(i);

 	 i++;	
 	}while(error >= 1);
        System.out.println("ghghgghg"+i);
        
        for(int u = 1; u < (i - 1); u++)
        {  
         modelotabla =  (DefaultTableModel)Table1.getModel();
         nuevafila = new Vector();
         nuevafila.add(p.valueOf(u));
         nuevafila.add(p.valueOf(x[u]));
         nuevafila.add(p.valueOf(Utilidades.Error(x[u + 1],x[u])));
         modelotabla.addRow(nuevafila);
        }
       
              l_resp1.setText("Raíz de la Función = "+x[i - 2]);
           
        Deri.setText("F`( x ) = "+Utilidades.Derivar(FuncionString).toString());
        Deri.setVisible(true);
        b_tab1.setEnabled(false);
      }
    }
    catch(Exception a) 
     {
        Utilidades.BoxDialog("Digite sólo datos permisibles y/o asegúrese de que la función dependa de ' X '","Error de Lectura de Datos.","help.gif");
        Restablecer1();
    }
  
    }//GEN-LAST:event_b_tab1ActionPerformed

    public void Restablecer1()
    {
      Deri.setText("");
      l_resp1.setText("");
      t_funcion.setText("");
      t_punto.setText("");
      b_tab1.setEnabled(true);
      Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table1.setCellSelectionEnabled(true);
        Table1.setDoubleBuffered(true);
        Table1.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(Table1);
      
    }
    
    public void Restablecer2()
    {
      Deri1.setText("");
      Deri2.setText("");
      l_resp2.setText("");
      t_funcion1.setText("");
      t_punto1.setText("");
      b_tab2.setEnabled(true);
      Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table2.setCellSelectionEnabled(true);
        Table2.setDoubleBuffered(true);
        Table2.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(Table2);
      
    }
    
    public void Restablecer3()
    {
      l_resp3.setText("");
      t_funcion2.setText("");
      t_limite1.setText("");
      t_limite2.setText("");
      b_tab3.setEnabled(true);
      Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table3.setCellSelectionEnabled(true);
        Table3.setDoubleBuffered(true);
        Table3.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(Table3);
      
    }
    
    public void Restablecer4()
    {
      l_resp4.setText("");
      t_funcion3.setText("");
      t_limite_a.setText("");
      t_limite_b.setText("");
      b_tab4.setEnabled(true);
      Table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table4.setCellSelectionEnabled(true);
        Table4.setDoubleBuffered(true);
        Table4.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane4.setViewportView(Table4);
      
    }
    
    public void Restablecer5()
    {
      l_resp5.setText("");
      t_funcion4.setText("");
      t_limite_m.setText("");
      t_limite_n.setText("");
      b_tab5.setEnabled(true);
      Table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                " Interacción Nº", " Xi", "               Error"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table5.setCellSelectionEnabled(true);
        Table5.setDoubleBuffered(true);
        Table5.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane5.setViewportView(Table5);
      
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
hide();
dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tb5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb5MousePressed
  tb5.setSelected(true);  tb1.setSelected(false); tb3.setSelected(false);
  tb4.setSelected(false); tb5.setSelected(false); tb6.setSelected(false);
  Tabbed.setSelectedIndex(4);
    }//GEN-LAST:event_tb5MousePressed

    private void tb4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb4MousePressed
  tb4.setSelected(true);  tb1.setSelected(false); tb3.setSelected(false);
  tb4.setSelected(false); tb5.setSelected(false); tb6.setSelected(false);
  Tabbed.setSelectedIndex(3);
    }//GEN-LAST:event_tb4MousePressed

    private void tb3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb3MousePressed
  tb3.setSelected(true);  tb1.setSelected(false); tb3.setSelected(false);
  tb4.setSelected(false); tb5.setSelected(false); tb6.setSelected(false);
  Tabbed.setSelectedIndex(2);
    }//GEN-LAST:event_tb3MousePressed

    private void tb2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb2MousePressed
  tb2.setSelected(true);  tb1.setSelected(false); tb3.setSelected(false);
  tb4.setSelected(false); tb5.setSelected(false); tb6.setSelected(false);
  Tabbed.setSelectedIndex(1);
    }//GEN-LAST:event_tb2MousePressed

    private void tb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MousePressed
  tb1.setSelected(true);  tb2.setSelected(false); tb3.setSelected(false);
  tb4.setSelected(false); tb5.setSelected(false); tb6.setSelected(false);
  Tabbed.setSelectedIndex(0);
    }//GEN-LAST:event_tb1MousePressed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Deri;
    private javax.swing.JLabel Deri1;
    private javax.swing.JLabel Deri2;
    private javax.swing.JPanel Tab1;
    private javax.swing.JPanel Tab2;
    private javax.swing.JPanel Tab3;
    private javax.swing.JPanel Tab4;
    private javax.swing.JPanel Tab5;
    private javax.swing.JPanel Tab6;
    private javax.swing.JTabbedPane Tabbed;
    private javax.swing.JTable Table1;
    private javax.swing.JTable Table2;
    private javax.swing.JTable Table3;
    private javax.swing.JTable Table4;
    private javax.swing.JTable Table5;
    private javax.swing.JTable Table6;
    private javax.swing.JButton b_tab1;
    private javax.swing.JButton b_tab2;
    private javax.swing.JButton b_tab3;
    private javax.swing.JButton b_tab4;
    private javax.swing.JButton b_tab5;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.l2fprod.common.swing.JButtonBar jButtonBar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel l_funcion1;
    private javax.swing.JLabel l_resp1;
    private javax.swing.JLabel l_resp2;
    private javax.swing.JLabel l_resp3;
    private javax.swing.JLabel l_resp4;
    private javax.swing.JLabel l_resp5;
    private javax.swing.JLabel l_tabla;
    private javax.swing.JLabel l_tabla1;
    private javax.swing.JLabel l_tabla2;
    private javax.swing.JLabel l_tabla3;
    private javax.swing.JLabel l_tabla4;
    private javax.swing.JLabel label_funcion;
    private javax.swing.JLabel label_funcion2;
    private javax.swing.JLabel label_funcion3;
    private javax.swing.JLabel label_funcion4;
    private javax.swing.JLabel label_pto;
    private javax.swing.JLabel label_pto1;
    private javax.swing.JLabel limite1;
    private javax.swing.JLabel limite2;
    private javax.swing.JLabel limite_a;
    private javax.swing.JLabel limite_b;
    private javax.swing.JLabel limite_m;
    private javax.swing.JLabel limite_n;
    private javax.swing.JTextField t_funcion;
    private javax.swing.JTextField t_funcion1;
    private javax.swing.JTextField t_funcion2;
    private javax.swing.JTextField t_funcion3;
    private javax.swing.JTextField t_funcion4;
    private javax.swing.JTextField t_limite1;
    private javax.swing.JTextField t_limite2;
    private javax.swing.JTextField t_limite_a;
    private javax.swing.JTextField t_limite_b;
    private javax.swing.JTextField t_limite_m;
    private javax.swing.JTextField t_limite_n;
    private javax.swing.JTextField t_punto;
    private javax.swing.JTextField t_punto1;
    private javax.swing.JToggleButton tb1;
    private javax.swing.JToggleButton tb2;
    private javax.swing.JToggleButton tb3;
    private javax.swing.JToggleButton tb4;
    private javax.swing.JToggleButton tb5;
    private javax.swing.JToggleButton tb6;
    // End of variables declaration//GEN-END:variables
    
}
