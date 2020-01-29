/*
 * MetodosInterpoladores.java
 *
 * Created on 16 de julio de 2007, 12:04 AM
 */

package Ananumeric;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Intel
 */
public class MetodosInterpoladores extends javax.swing.JInternalFrame {
    
   public Vector w;
   public DefaultTableModel modelo,modelo1;
   double [] dx = new double[100];
   double [] dy = new double[100];
    
   
    public MetodosInterpoladores() {
        initComponents();
        jbb.setVisible(false);  l_resp.setVisible(false); t_evaluar.setVisible(false);  b_evaluar.setVisible(false); l3.setVisible(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbb = new com.l2fprod.common.swing.JButtonBar();
        tg1 = new javax.swing.JToggleButton();
        tg2 = new javax.swing.JToggleButton();
        tr = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        t_variable = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_datos = new javax.swing.JTable();
        b_crear = new javax.swing.JButton();
        b_evaluar = new javax.swing.JButton();
        t_evaluar = new javax.swing.JTextField();
        l_resp = new javax.swing.JLabel();
        b_asig = new javax.swing.JButton();
        lfondo = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jButtonBar2 = new com.l2fprod.common.swing.JButtonBar();
        tg3 = new javax.swing.JToggleButton();
        tg4 = new javax.swing.JToggleButton();
        tr1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        t_variable1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab_datos1 = new javax.swing.JTable();
        b_crear1 = new javax.swing.JButton();
        b_evaluar1 = new javax.swing.JButton();
        t_evaluar1 = new javax.swing.JTextField();
        l_resp1 = new javax.swing.JLabel();
        lfondo1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        com.l2fprod.common.swing.PercentLayout percentLayout1 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout1.setOrientation(1);
        jbb.setLayout(percentLayout1);

        buttonGroup1.add(tg1);
        tg1.setFont(new java.awt.Font("Verdana", 1, 12));
        tg1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\flash.gif"));
        tg1.setText("Interpolaci\u00f3n Lineal");
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

        jbb.add(tg1);

        buttonGroup1.add(tg2);
        tg2.setFont(new java.awt.Font("Verdana", 1, 12));
        tg2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\flash.gif"));
        tg2.setText("Interpolaci\u00f3n Cuadr\u00e1tica");
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

        jbb.add(tg2);

        tr.setFont(new java.awt.Font("Verdana", 1, 12));
        tr.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__update.png"));
        tr.setText("Reestablecer");
        tr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trActionPerformed(evt);
            }
        });

        jbb.add(tr);

        jPanel1.add(jbb);
        jbb.setBounds(460, 83, 180, 150);

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Digite el N\u00ba de pares ordenados:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 30, 250, 30);

        t_variable.setFont(new java.awt.Font("Papyrus", 1, 14));
        t_variable.setForeground(new java.awt.Color(0, 0, 255));
        t_variable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_variable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_variableKeyTyped(evt);
            }
        });

        jPanel1.add(t_variable);
        t_variable.setBounds(270, 30, 80, 30);

        l3.setFont(new java.awt.Font("Papyrus", 1, 14));
        l3.setForeground(new java.awt.Color(51, 204, 0));
        l3.setText("Punto a evaluar:");
        jPanel1.add(l3);
        l3.setBounds(20, 280, 120, 30);

        tab_datos.setFont(new java.awt.Font("Verdana", 1, 12));
        tab_datos.setForeground(new java.awt.Color(0, 51, 204));
        tab_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         F( X)", "             X"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tab_datosKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(tab_datos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 250, 150);

        b_crear.setFont(new java.awt.Font("Papyrus", 1, 14));
        b_crear.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\businesssetup.png"));
        b_crear.setText("Crear Tabla");
        b_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearActionPerformed(evt);
            }
        });

        jPanel1.add(b_crear);
        b_crear.setBounds(380, 30, 170, 30);

        b_evaluar.setFont(new java.awt.Font("Papyrus", 1, 12));
        b_evaluar.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__yes.png"));
        b_evaluar.setText("Evaluar");
        b_evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_evaluarActionPerformed(evt);
            }
        });

        jPanel1.add(b_evaluar);
        b_evaluar.setBounds(230, 280, 110, 30);

        t_evaluar.setFont(new java.awt.Font("Papyrus", 1, 14));
        t_evaluar.setForeground(new java.awt.Color(0, 0, 255));
        t_evaluar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_evaluar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_evaluarKeyTyped(evt);
            }
        });

        jPanel1.add(t_evaluar);
        t_evaluar.setBounds(140, 280, 80, 30);

        l_resp.setFont(new java.awt.Font("Papyrus", 1, 12));
        l_resp.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.add(l_resp);
        l_resp.setBounds(270, 330, 350, 30);

        b_asig.setFont(new java.awt.Font("Papyrus", 1, 12));
        b_asig.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\Chat.png"));
        b_asig.setText("Asignar Datos");
        b_asig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_asigActionPerformed(evt);
            }
        });

        jPanel1.add(b_asig);
        b_asig.setBounds(280, 140, 160, 40);

        lfondo.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D037.jpg"));
        jPanel1.add(lfondo);
        lfondo.setBounds(0, 0, 660, 370);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 370);

        jInternalFrame1.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setLayout(null);

        com.l2fprod.common.swing.PercentLayout percentLayout3 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout3.setOrientation(1);
        jButtonBar2.setLayout(percentLayout3);

        buttonGroup1.add(tg3);
        tg3.setFont(new java.awt.Font("Verdana", 1, 12));
        tg3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\flash.gif"));
        tg3.setText("Interpolaci\u00f3n Lineal");
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

        jButtonBar2.add(tg3);

        buttonGroup1.add(tg4);
        tg4.setFont(new java.awt.Font("Verdana", 1, 12));
        tg4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\flash.gif"));
        tg4.setText("Interpolaci\u00f3n Cuadr\u00e1tica");
        tg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tg4MousePressed(evt);
            }
        });

        jButtonBar2.add(tg4);

        tr1.setFont(new java.awt.Font("Verdana", 1, 12));
        tr1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__update.png"));
        tr1.setText("Reestablecer");
        tr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tr1ActionPerformed(evt);
            }
        });

        jButtonBar2.add(tr1);

        jPanel2.add(jButtonBar2);
        jButtonBar2.setBounds(377, 83, 173, 150);

        jLabel4.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("Digite el N\u00ba de pares ordenados:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 30, 250, 30);

        t_variable1.setFont(new java.awt.Font("Papyrus", 1, 14));
        t_variable1.setForeground(new java.awt.Color(0, 0, 255));
        t_variable1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_variable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_variable1KeyTyped(evt);
            }
        });

        jPanel2.add(t_variable1);
        t_variable1.setBounds(270, 30, 80, 30);

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 14));
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setText("Punto a evaluar:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 280, 120, 30);

        tab_datos1.setFont(new java.awt.Font("Verdana", 1, 12));
        tab_datos1.setForeground(new java.awt.Color(0, 51, 204));
        tab_datos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         F( X)", "             X"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tab_datos1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 90, 250, 150);

        b_crear1.setFont(new java.awt.Font("Papyrus", 1, 14));
        b_crear1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\businesssetup.png"));
        b_crear1.setText("Crear Tabla");
        b_crear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crear1ActionPerformed(evt);
            }
        });

        jPanel2.add(b_crear1);
        b_crear1.setBounds(380, 30, 170, 30);

        b_evaluar1.setFont(new java.awt.Font("Papyrus", 1, 12));
        b_evaluar1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__yes.png"));
        b_evaluar1.setText("Evaluar");
        jPanel2.add(b_evaluar1);
        b_evaluar1.setBounds(230, 280, 110, 30);

        t_evaluar1.setFont(new java.awt.Font("Papyrus", 1, 14));
        t_evaluar1.setForeground(new java.awt.Color(0, 0, 255));
        t_evaluar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_evaluar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_evaluar1KeyTyped(evt);
            }
        });

        jPanel2.add(t_evaluar1);
        t_evaluar1.setBounds(140, 280, 80, 30);

        l_resp1.setFont(new java.awt.Font("Papyrus", 1, 12));
        l_resp1.setForeground(new java.awt.Color(255, 255, 204));
        jPanel2.add(l_resp1);
        l_resp1.setBounds(270, 330, 350, 40);

        lfondo1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D037.jpg"));
        jPanel2.add(lfondo1);
        lfondo1.setBounds(0, 0, 630, 390);

        jInternalFrame1.getContentPane().add(jPanel2);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 183, 629, 183);

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
        setBounds((screenSize.width-660)/2, (screenSize.height-421)/2, 660, 421);
    }// </editor-fold>//GEN-END:initComponents

    private void tg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg2ActionPerformed
  l_resp.setVisible(true); t_evaluar.setVisible(true);  l3.setVisible(true);  b_evaluar.setVisible(true); 
    }//GEN-LAST:event_tg2ActionPerformed

    private void tab_datosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tab_datosKeyTyped

    }//GEN-LAST:event_tab_datosKeyTyped

    private void b_evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_evaluarActionPerformed
    
        if(tg1.isSelected() == true)
          {
           double punto_x = Double.parseDouble(t_evaluar.getText()); 
           double rpta = (dy[0] + (((punto_x - dx[0])*(dy[1]-dy[0]))/(dx[1] - dx[0])));
           l_resp.setText("Respuesta. X = "+t_evaluar.getText()+ ",  F("+t_evaluar.getText()+") = "+ String.valueOf(rpta));          
          }
        else if(tg2.isSelected())
        {
            double bo,b1,b2, pb2;
            double valor = Double.parseDouble(t_evaluar.getText());
         
            bo = dy[0];
            b1 = ((dy[1] - dy[0])/(dx[1]-dx[0]));
            b2 = (((dy[2] - dy[1])/(dx[2]-dx[1]))-b1)/(dx[2]-dx[0]);            
           
            double resp = bo + (b1)*(valor-b1) + (b2)*(valor-b1)*(valor-b2);
            l_resp.setText("Respuesta. X = "+t_evaluar.getText()+ ",  f("+t_evaluar.getText()+") = "+ String.valueOf(resp));
        }
         
    }//GEN-LAST:event_b_evaluarActionPerformed

    private void b_asigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_asigActionPerformed
    try
    {      
     jbb.setVisible(true);
    }
         catch(Exception e)
         {
           Utilidades.DialogBurla("*Por favor pulse la tecla 'TAB' para que pueda asignar sus datos","Información del Sistema","help.gif","close.wav");
         } 
       
    }//GEN-LAST:event_b_asigActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        hide();
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void t_evaluar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_evaluar1KeyTyped
// TODO add your handling code here:
    }//GEN-LAST:event_t_evaluar1KeyTyped

    private void b_crear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crear1ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_b_crear1ActionPerformed

    private void t_variable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_variable1KeyTyped
// TODO add your handling code here:
    }//GEN-LAST:event_t_variable1KeyTyped

    private void tr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tr1ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_tr1ActionPerformed

    private void tg4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg4MousePressed
// TODO add your handling code here:
    }//GEN-LAST:event_tg4MousePressed

    private void tg3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg3MousePressed
// TODO add your handling code here:
    }//GEN-LAST:event_tg3MousePressed

    private void tg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg3ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_tg3ActionPerformed

    private void tg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tg1ActionPerformed
        
       l_resp.setVisible(true); t_evaluar.setVisible(true);  l3.setVisible(true);  b_evaluar.setVisible(true); 
    }//GEN-LAST:event_tg1ActionPerformed

    private void t_evaluarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_evaluarKeyTyped
   char c = evt.getKeyChar(); 
      int x = evt.getKeyChar(); 
      int keyCode = evt.getKeyCode();
    
      if (!((Character.isDigit(c)) ||(c == java.awt.event.KeyEvent.VK_ENTER) || keyCode==110) || c == '.')
          
      {
          try {
              evt.consume();
          } catch(Exception E){}
          
      } 
    }//GEN-LAST:event_t_evaluarKeyTyped

    private void trActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trActionPerformed
    tab_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "         F( X)", "             X"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
         
      t_variable.setText(""); t_variable.setEnabled(true); t_evaluar.setText("");
      b_crear.setEnabled(true);     l_resp.setVisible(false); t_evaluar.setVisible(false); l3.setVisible(false); b_evaluar.setVisible(false); jbb.setVisible(false);
      tg1.setSelected(false);   tg2.setSelected(false);   tg3.setSelected(false);
      
    }//GEN-LAST:event_trActionPerformed

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

    private void tg2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg2MousePressed
tg1.setSelected(false); tg2.setSelected(true);
    }//GEN-LAST:event_tg2MousePressed

    private void tg1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tg1MousePressed
tg1.setSelected(true); tg2.setSelected(false);
    }//GEN-LAST:event_tg1MousePressed

    private void b_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearActionPerformed
try
  {       
   int num_var = Integer.parseInt(t_variable.getText());
    if(num_var <  0 || num_var > 500) {
        Utilidades.DialogBurla("El Nº de pares ordenados debe ser mayor que 0 y menor que 500","Información del Sistema","help.gif","Intel_Inside");
        t_variable.setText("");
    } else{
        t_variable.setEnabled(false);
        b_crear.setEnabled(false);       
        int c = 0;
        
        for(int j = 0; j < num_var; j++) {
            w = new Vector();
            modelo1 = (DefaultTableModel)tab_datos.getModel();
            modelo1.addRow(w);
        }
           
    }
  }catch(Exception k)
  {
  Utilidades.DialogBurla("Digite un dato permisible","Información del Sistema","help.gif","close.wav");
  }
    }//GEN-LAST:event_b_crearActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_asig;
    private javax.swing.JButton b_crear;
    private javax.swing.JButton b_crear1;
    private javax.swing.JButton b_evaluar;
    private javax.swing.JButton b_evaluar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.l2fprod.common.swing.JButtonBar jButtonBar2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.l2fprod.common.swing.JButtonBar jbb;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l_resp;
    private javax.swing.JLabel l_resp1;
    private javax.swing.JLabel lfondo;
    private javax.swing.JLabel lfondo1;
    private javax.swing.JTextField t_evaluar;
    private javax.swing.JTextField t_evaluar1;
    private javax.swing.JTextField t_variable;
    private javax.swing.JTextField t_variable1;
    private javax.swing.JTable tab_datos;
    private javax.swing.JTable tab_datos1;
    private javax.swing.JToggleButton tg1;
    private javax.swing.JToggleButton tg2;
    private javax.swing.JToggleButton tg3;
    private javax.swing.JToggleButton tg4;
    private javax.swing.JToggleButton tr;
    private javax.swing.JToggleButton tr1;
    // End of variables declaration//GEN-END:variables
    
}
