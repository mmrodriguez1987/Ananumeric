
package Ananumeric;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SistemaEcuaciones extends javax.swing.JInternalFrame {
    
   static DefaultTableModel modelo, modelo1,modelo2;
   int num_var = 0;
   Vector w,v;
    public SistemaEcuaciones() {
        initComponents();
       tg1.setVisible(false); tg2.setVisible(false);  tg3.setVisible(false); tg4.setVisible(false);
       tbp.setSelectedIndex(1);
       ta_ayuda.setEditable(false);
       ta_ayuda.setText(
                        "\n\n\n"+
                        "   1.- El Nº incógnitas de su Sistema de Ecuaciones \n  "+
                        "       deben ser entre 2 y 1200 \n\n "+
                        "   2.- Después de digitar los respectivos coeficentes \n  "+
                        "       haga CLICK sobre la primer Ecuación \n\n "+
                        "   3.- Luego Presione ENTER, asegúrese de no haber \n  "+
                        "       dejado toda una FILA o COLUMNA sin datos, para\n  "+
                        "       que pueda escojer su Método de Solución \n\n "+
                        "   4.- Después escoja su Método de Solución \n \n\n "+
                        "   NOTA: LAS SOLUCIONES PUEDEN VARIAR \n "+
                        "   EN DEPENDENCIA DEL MÉTODO QUE SE UTILICE \n \n\n\n"
                          );
    
    }
    
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButtonBar1 = new com.l2fprod.common.swing.JButtonBar();
        tg1 = new javax.swing.JToggleButton();
        tg2 = new javax.swing.JToggleButton();
        tg3 = new javax.swing.JToggleButton();
        tg4 = new javax.swing.JToggleButton();
        tr = new javax.swing.JToggleButton();
        tbp = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t_variable = new javax.swing.JTextField();
        b_crear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablasist = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablasol = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        l_fondo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_ayuda = new javax.swing.JTextArea();
        l_fondo1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        setResizable(true);
        jPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        com.l2fprod.common.swing.PercentLayout percentLayout1 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout1.setOrientation(1);
        jButtonBar1.setLayout(percentLayout1);

        tg1.setBackground(new java.awt.Color(0, 0, 153));
        buttonGroup1.add(tg1);
        tg1.setFont(new java.awt.Font("Verdana", 1, 12));
        tg1.setForeground(new java.awt.Color(0, 0, 153));
        tg1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\web.png"));
        tg1.setText("Gauss");
        tg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tg1ActionPerformed(evt);
            }
        });
        tg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tg1MousePressed(evt);
            }
        });

        jButtonBar1.add(tg1);

        tg2.setBackground(new java.awt.Color(0, 0, 153));
        buttonGroup1.add(tg2);
        tg2.setFont(new java.awt.Font("Verdana", 1, 12));
        tg2.setForeground(new java.awt.Color(0, 0, 153));
        tg2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\web.png"));
        tg2.setText("Gauss-Pivoteo");
        tg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tg2ActionPerformed(evt);
            }
        });
        tg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tg2MousePressed(evt);
            }
        });

        jButtonBar1.add(tg2);

        tg3.setBackground(new java.awt.Color(0, 0, 153));
        buttonGroup1.add(tg3);
        tg3.setFont(new java.awt.Font("Verdana", 1, 12));
        tg3.setForeground(new java.awt.Color(0, 0, 153));
        tg3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\web.png"));
        tg3.setText("Jacobi");
        tg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tg3ActionPerformed(evt);
            }
        });
        tg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tg3MousePressed(evt);
            }
        });

        jButtonBar1.add(tg3);

        tg4.setBackground(new java.awt.Color(0, 0, 153));
        buttonGroup1.add(tg4);
        tg4.setFont(new java.awt.Font("Verdana", 1, 12));
        tg4.setForeground(new java.awt.Color(0, 0, 153));
        tg4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\web.png"));
        tg4.setText("Gauss-Seidel");
        tg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tg4ActionPerformed(evt);
            }
        });
        tg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tg4MousePressed(evt);
            }
        });

        jButtonBar1.add(tg4);

        buttonGroup1.add(tr);
        tr.setFont(new java.awt.Font("Verdana", 1, 12));
        tr.setForeground(new java.awt.Color(0, 0, 153));
        tr.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__update.png"));
        tr.setText("Reestablecer");
        tr.setToolTipText("Reestablecer campos");
        tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trActionPerformed(evt);
            }
        });

        jButtonBar1.add(tr);

        jPanel1.add(jButtonBar1);
        jButtonBar1.setBounds(12, 90, 150, 300);

        tbp.setForeground(new java.awt.Color(0, 0, 204));
        tbp.setFont(new java.awt.Font("Verdana", 1, 12));
        jPanel2.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite el n\u00famero de variables:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(100, 60, 290, 30);

        t_variable.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        t_variable.setForeground(new java.awt.Color(0, 102, 0));
        t_variable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_variable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_variableActionPerformed(evt);
            }
        });
        t_variable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_variableKeyTyped(evt);
            }
        });

        jPanel2.add(t_variable);
        t_variable.setBounds(390, 60, 110, 30);

        b_crear.setBackground(new java.awt.Color(255, 255, 255));
        b_crear.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        b_crear.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__yes.png"));
        b_crear.setText("Crear Sistema");
        b_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearActionPerformed(evt);
            }
        });

        jPanel2.add(b_crear);
        b_crear.setBounds(539, 60, 170, 30);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tablasist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablasist.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablasist.setRequestFocusEnabled(false);
        tablasist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablasistKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tablasistKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(tablasist);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 460, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\FondoTabla.JPG"));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 110, 520, 260);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        tablasol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variables", "Soluciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
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
        jScrollPane2.setViewportView(tablasol);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(530, 130, 180, 230);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\blueStartPanelPlacesList.JPG"));
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(360, 110, 520, 270);

        l_fondo.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D081.jpg"));
        jPanel2.add(l_fondo);
        l_fondo.setBounds(0, 0, 740, 390);

        tbp.addTab("Crear Sistema de Ecuaciones", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\Flag.png"), jPanel2);

        jPanel3.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        ta_ayuda.setBackground(new java.awt.Color(255, 255, 204));
        ta_ayuda.setColumns(20);
        ta_ayuda.setEditable(false);
        ta_ayuda.setFont(new java.awt.Font("Lucida Console", 1, 14));
        ta_ayuda.setForeground(new java.awt.Color(0, 102, 102));
        ta_ayuda.setRows(5);
        ta_ayuda.setToolTipText("Sugerencias para utilizar esta parte de la Aplicaci\u00f3n");
        jScrollPane3.setViewportView(ta_ayuda);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(80, 40, 600, 300);

        l_fondo1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D081.jpg"));
        jPanel3.add(l_fondo1);
        l_fondo1.setBounds(0, 0, 730, 400);

        tbp.addTab("Ayuda", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\Flag.png"), jPanel3);

        jPanel1.add(tbp);
        tbp.setBounds(170, 10, 740, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 470);

        jMenu1.setText("Propiedades");
        jMenu1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        jMenuItem1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
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

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-926)/2, (screenSize.height-519)/2, 926, 519);
    }// </editor-fold>//GEN-END:initComponents

    private void tablasistKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablasistKeyPressed
     char c = evt.getKeyChar();  
    
       if(c == (java.awt.event.KeyEvent.VK_ENTER) && TablaC() == false)
        {        
          EstadoTogle(true);
        } 
    }//GEN-LAST:event_tablasistKeyPressed

    private void tg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg4ActionPerformed
   int n = 0; 
   int f = 0; 
   int c = 0; 
   int counter = 0;
   double valor = 0;
   Matrice a;
   
   n = Integer.parseInt(t_variable.getText());
   f = n; c = n + 1;
   a = new Matrice(f,c);
   double[][] coefi = new double[f][f];
   double[] term = new double[f];
   double[] x = new double[f];
   
//    try{   
     for( int i = 0 ; i < f ; i++ ) {
            for( int j = 1; j <= c ; j++) {
                
                if(j == c)
                {
                    if(tablasist.getValueAt(i,j) == null)
                        term[i] = 0.0;
                    else
                        term[i] = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
    
                }
                else
                {   
                    if(tablasist.getValueAt(i,j) == null)
                        coefi[i][j-1] = 0.0;
                    else
                        coefi[i][j-1] = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
                }  
                
                if(tablasist.getValueAt(i,j) == null)
                {
                 valor = 0.0;   
                 a.Asignar(i,j-1,valor);
                 tablasist.setValueAt(valor,i,j);
                }
                else
                {
                valor = 0.0;
                valor = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
                
                System.out.println("I = "+i+" J = "+j+" => "+valor);
                a.Asignar(i,j-1,valor);
                }
            }
        } 
       a.Print();  

       x = a.GaussSeidel(coefi,term,x);

       for( int i = 0 ; i < f ; i++ ) 
                for( int j = 0; j < f ; j++) 
                    System.out.println("Coeficientes [ "+i+" , "+j+" ] ="+coefi[i][j]);
       for( int i = 0 ; i < f ; i++ ) 
           System.out.println("Termino Ind [ "+i+" ] = "+term[i]);

       for( int i = 0 ; i < f ; i++ ) 
           System.out.println("X [ "+i+" ] = "+x[i]);
       for(int u = 0; u < f; u++)
       {
          v = new Vector();
          modelo2 = (DefaultTableModel)tablasol.getModel();
          v.add("x["+(u+1)+"]");
          v.add(x[u]);
          modelo2.addRow(v);
        }
//   } catch(Exception r) {
//        Utilidades.BoxDialog("Asegúrese de presionar 'ENTER',\n después de introducir su último","Información del Sistema","help.gif");}       

    }//GEN-LAST:event_tg4ActionPerformed

    private void tg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg3ActionPerformed
   int n = 0; 
   int f = 0; 
   int c = 0; 
   int counter = 0;
   double valor = 0;
   Matrice a;
   
   n = Integer.parseInt(t_variable.getText());
   f = n; c = n + 1;
   a = new Matrice(f,c);
   double[][] coefi = new double[f][f];
   double[] term = new double[f];
   double[] x = new double[f];
   
   
//    try{    
     for( int i = 0 ; i < f ; i++ ) {
            for( int j = 1; j <= c ; j++) {
                
                if(j == c)
                {
                    if(tablasist.getValueAt(i,j) == null)
                        term[i] = 0.0;
                    else
                        term[i] = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
    
                }
                else
                {   
                    if(tablasist.getValueAt(i,j) == null)
                        coefi[i][j-1] = 0.0;
                    else
                        coefi[i][j-1] = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
                }  
                
                if(tablasist.getValueAt(i,j) == null)
                {
                 valor = 0.0;   
                 a.Asignar(i,j-1,valor);
                 tablasist.setValueAt(valor,i,j);
                }
                else
                {
                valor = 0.0;
                valor = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
                
                System.out.println("I = "+i+" J = "+j+" => "+valor);
                a.Asignar(i,j-1,valor);
                }
            }
        }
       a.Print();

       x = a.Jacobi(coefi,term,x);
    
       for( int i = 0 ; i < f ; i++ ) 
                for( int j = 0; j < f ; j++) 
                    System.out.println("Coeficientes [ "+i+" , "+j+" ] ="+coefi[i][j]);
       for( int i = 0 ; i < f ; i++ ) 
           System.out.println("Termino Ind [ "+i+" ] = "+term[i]);

       for( int i = 0 ; i < f ; i++ ) 
           System.out.println("X [ "+i+" ] = "+x[i]);

       for(int u = 0; u < f; u++)
       {
          v = new Vector();
          modelo2 = (DefaultTableModel)tablasol.getModel();
          v.add("x["+(u+1)+"]");
          v.add(x[u]);
          modelo2.addRow(v);
        }
//    } catch(Exception r) {
//        Utilidades.BoxDialog("Asegúrese de presionar 'ENTER',\n después de introducir su último","Información del Sistema","help.gif");}
     
    }//GEN-LAST:event_tg3ActionPerformed

    private void trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trActionPerformed
      EstadoTogle(false);
      
      t_variable.setEnabled(true); t_variable.setText(""); b_crear.setEnabled(true);
      tablasol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variables", "Soluciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
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
        
      tablasist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));  
      
    }//GEN-LAST:event_trActionPerformed

    /**
     * 
     * @param evt 
     */
    private void tg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg1ActionPerformed
   
   
    int f = 0; boolean conf = false;
    int c = 0, counter = 0; 
    double valor = 0.0;
    Matrix a;
    f = num_var;
    c = num_var + 1;
    a = new Matrix(f,c);
 

//      try {  
        for( int i = 0 ; i < f ; i++ ) {
            for( int j = 1; j <= c ; j++) {
                if(tablasist.getValueAt(i,j) == null)
                {
                 valor = 0.0;   
                 a.setElement(i,j-1,valor);
                 tablasist.setValueAt(valor,i,j);
                }
                else
                {
                valor = 0.0;
                valor = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
                
                System.out.println("I = "+i+" J = "+j+" => "+valor);
                a.setElement(i,j-1,valor);
                }
                
                if(String.valueOf(tablasist.getValueAt(i,j)) == " ")
                {
                 counter += 1;
                }  
            }
        }  
           DiagonalSuperior(a);
            SustitucionInversa(a);
            
            for(int u = 0; u < num_var; u++) {
                v = new Vector();
                modelo2 = (DefaultTableModel)tablasol.getModel();
                v.add("x["+(u+1)+"]");
                v.add(a.getElement(u,c-1));
                modelo2.addRow(v);
            }
            a.print();      
          
//       } catch(Exception r) {
//        Utilidades.BoxDialog("Asegúrese de presionar 'ENTER',\n después de introducir su último","Información del Sistema","help.gif");}

    }//GEN-LAST:event_tg1ActionPerformed

 public static void DiagonalSuperior(Matrix q) 
  {
        int i, j, k, maxr, n;
        double t, pivot;
        n= q.getNumRows();
        
        for (i=0; i < n; i++) 
        {  
            maxr= i;		    
           for (j= i+1; j < n; j++) // Busca el máximo elmente por debajo de la diagonal
            if (Math.abs(q.getElement(j,i)) >Math.abs(q.getElement(maxr,i)))
              maxr= j;
                    
           if (maxr != i)		// Si la fila no es la actual, cambia a otra
            for (k=i; k <= n; k++)
            {
                  t= q.getElement(i,k);        
                  q.setElement(i,k, q.getElement(maxr, k));
                  q.setElement(maxr, k, t);    
            }
                
           for (j= i+1; j <n; j++)     // Calcula el elemento pivote
           { 
              pivot= q.getElement(j,i)/q.getElement(i,i);
              for (k= n; k >=i; k--)
              q.setElement(j, k, q.getElement(j,k) -  q.getElement(i,k)*pivot);
           }
        }
    }
 
    public static void SustitucionInversa(Matrix q) {
        int j, k, n;
        double t; 				
        n= q.getNumRows();
        
        for (j=n-1; j >=0; j--) 
        {
            t= 0.0;
            for (k = j + 1; k < n; k++)    
                t += q.getElement(j,k)* q.getElement(k,n);
            q.setElement(j, n,(q.getElement(j, n) -t)/q.getElement(j,j));
        }
    }   

    private void b_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearActionPerformed
   
  try
  {       
    num_var = Integer.parseInt(t_variable.getText());
    if(num_var < 2 || num_var > 1500) {
        Utilidades.DialogBurla("Las variables de su Sistema deben de ser entre 2 y 1200","Información del Sistema","help.gif","Intel_Inside");
        t_variable.setText("");
    } else{
        t_variable.setEnabled(false);
        b_crear.setEnabled(false);
        
        Matrix a = new Matrix(num_var,num_var+1);
        int c = 0;
        
        for(int j = 0; j < num_var; j++) {
            w = new Vector();
            modelo1 = (DefaultTableModel)tablasist.getModel();
            modelo1.addRow(w);
        }
        
        for(int i = 0; i <= num_var + 1; i++) {
            if(i == 0) {
                modelo = (DefaultTableModel)tablasist.getModel();
                modelo.addColumn("Ecuación ");
            } else {
                if(i == num_var +1) {
                    modelo = (DefaultTableModel)tablasist.getModel();
                    modelo.addColumn("b");
                } else {
                    modelo = (DefaultTableModel)tablasist.getModel();
                    modelo.addColumn("x["+i+"]");
                }
            }
        }
        
        tablasist.setEditingColumn(0);
        
        for(int d = 0; d < num_var; d++) {
            tablasist.setValueAt((d+1),d,0);
        }
       EstadoTogle(false); 
    }
  }catch(Exception k)
  {
  Utilidades.DialogBurla("Digite un dato permisible","Información del Sistema","help.gif","close.wav");
  }
    }//GEN-LAST:event_b_crearActionPerformed
 

    private void t_variableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_variableActionPerformed

    }//GEN-LAST:event_t_variableActionPerformed

    private void t_variableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_variableKeyTyped
    char c = evt.getKeyChar(); 
      int x = evt.getKeyChar(); 
      int keyCode = evt.getKeyCode();
    
      if (!((Character.isDigit(c)) ||(c == java.awt.event.KeyEvent.VK_ENTER) || keyCode==110))
          
      {
          try {
              evt.consume();
          } catch(Exception E){}
          
      }
    }//GEN-LAST:event_t_variableKeyTyped

    private void tg4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg4MousePressed
  tg4.setSelected(true);  tg2.setSelected(false); tg3.setSelected(false);
  tg1.setSelected(false);
    }//GEN-LAST:event_tg4MousePressed

    private void tg3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg3MousePressed
  tg3.setSelected(true);  tg2.setSelected(false); tg1.setSelected(false);
  tg4.setSelected(false);
    }//GEN-LAST:event_tg3MousePressed

    private void tg2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg2MousePressed
  tg2.setSelected(true);  tg1.setSelected(false); tg3.setSelected(false);
  tg4.setSelected(false);
    }//GEN-LAST:event_tg2MousePressed

    private void tg1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg1MousePressed
  tg1.setSelected(true);  tg2.setSelected(false); tg3.setSelected(false);
  tg4.setSelected(false);
    }//GEN-LAST:event_tg1MousePressed

    private void tg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg2ActionPerformed
   int n = 0; 
   int f = 0; 
   int c = 0; 
   int counter = 0;
   double valor = 0;
   Matrice a;
  
   n = Integer.parseInt(t_variable.getText());
   f = n; c = n + 1;
   a = new Matrice(f,c);
   
//    try{   
     for( int i = 0 ; i < f ; i++ ) {
            for( int j = 1; j <= c ; j++) {
                if(tablasist.getValueAt(i,j) == null)
                {
                 valor = 0.0;   
                 a.Asignar(i,j-1,valor);
                 tablasist.setValueAt(valor,i,j);
                }
                else
                {
                valor = 0.0;
                valor = Double.parseDouble(String.valueOf(tablasist.getValueAt(i,j)));
                
                System.out.println("I = "+i+" J = "+j+" => "+valor);
                a.Asignar(i,j-1,valor);
                }
            }
        }
    
      System.out.println("SEL");
      a.Print();
      System.out.println("Matriz diagonal superior");
      a.GaussPivoteo().Print();
      a = a.GaussPivoteo().SustitucionInversa();
      System.out.println("Solucion");
      a.Print();
      System.out.println();	

      for(int u = 0; u < num_var; u++) {
                    v = new Vector();
                    modelo2 = (DefaultTableModel)tablasol.getModel();
                    v.add("x["+(u+1)+"]");
                    v.add(a.getValor(u,c-1));
                    modelo2.addRow(v);
                }
//      } catch(Exception r) {
//            Utilidades.BoxDialog("Asegúrese de presionar 'ENTER',\n después de introducir su último","Información del Sistema","help.gif");}

      
    }//GEN-LAST:event_tg2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    hide();
    dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tablasistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablasistKeyTyped

    }//GEN-LAST:event_tablasistKeyTyped
  
   public void EstadoTogle(boolean r)
   {
     tg1.setVisible(r);   tg2.setVisible(r); tg3.setVisible(r);  tg4.setVisible(r);
     
   } 
   
   public boolean TablaF()
   {
     boolean r = false;  
     int valor_fila = 0, contador_fila = 0, r1 = 0;
     
     
     
     for( int i = 0 ; i < tablasist.getRowCount() ; i++ )
     {
          valor_fila = 0;
            for( int j = 1; j < tablasist.getColumnCount() ; j++)
            {
                if( tablasist.getValueAt(i,j) == null)            
                valor_fila++;  
                System.out.println("Dato FILA "+valor_fila);
            }  
          if(valor_fila == (tablasist.getColumnCount() - 1))
            contador_fila++;
                       
     }
         System.out.println("CONTADOR FILA "+contador_fila);
      
         if(contador_fila > 0)
         {
           r = true;
           Utilidades.DialogBurla("Al menos una de las Ecuaciones  todos sus coeficentes son cero","Información del Sistema","help.gif","close.wav");
         } 
     valor_fila = 0; contador_fila = 0;    
     return r;
   }
   
    
   public boolean TablaC()
   {
    boolean r = false;
    int valor_col = 0, contador_col = 0, r1 = 0;
    double valor = 0.0;
    
     for( int j = 1; j < tablasist.getColumnCount() ; j++ )
     {  
          valor_col = 0;
            for(int i = 0 ; i < tablasist.getRowCount() ; i++)
            {
                if(tablasist.getValueAt(i,j) == null)            
                valor_col++; 
                System.out.println("Dato COLUMNA"+tablasist.getValueAt(i,j));
            }  
        
          if(valor_col == tablasist.getRowCount())
            contador_col++;
          
              
     }
         System.out.println("CONTADOR COLUMNA "+contador_col);
      
         if(contador_col > 0 )
         {
           r = true;
           Utilidades.DialogBurla("Al menos una de las Columnas  todos sus coeficentes son cero","Información del Sistema","help.gif","close.wav");
         }   
     valor_col = 0; contador_col = 0;  
     
     int valor_fila = 0, contador_fila = 0;
     
     
     
     for( int i = 0 ; i < tablasist.getRowCount() ; i++ )
     {
          valor_fila = 0;
            for( int j = 1; j < tablasist.getColumnCount() ; j++)
            {
                if( tablasist.getValueAt(i,j) == null)            
                valor_fila++;  
                System.out.println("Dato FILA "+valor_fila);
            }  
          if(valor_fila == (tablasist.getColumnCount() - 1))
            contador_fila++;
                       
     }
         System.out.println("CONTADOR FILA "+contador_fila);
      
         if(contador_fila > 0)
         {
           r = true;
           Utilidades.DialogBurla("Al menos una de las Ecuaciones  todos sus coeficentes son cero","Información del Sistema","help.gif","close.wav");
         } 
         
         if(contador_fila > 0 && contador_col > 0)
         {
           r = true;
           Utilidades.DialogBurla("Al menos una de las Ecuaciones y una de las Columnas \n todos sus coeficentes son cero","Información del Sistema","help.gif","close.wav");
         } 
     valor_fila = 0; contador_fila = 0;    
     return r;
   }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_crear;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.l2fprod.common.swing.JButtonBar jButtonBar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel l_fondo;
    private javax.swing.JLabel l_fondo1;
    private javax.swing.JTextField t_variable;
    private javax.swing.JTextArea ta_ayuda;
    private javax.swing.JTable tablasist;
    private javax.swing.JTable tablasol;
    private javax.swing.JTabbedPane tbp;
    private javax.swing.JToggleButton tg1;
    private javax.swing.JToggleButton tg2;
    private javax.swing.JToggleButton tg3;
    private javax.swing.JToggleButton tg4;
    private javax.swing.JToggleButton tr;
    // End of variables declaration//GEN-END:variables
    
}
