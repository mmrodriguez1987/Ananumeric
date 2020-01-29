/*
 * Principal.java
 *
 * Created on 9 de marzo de 2007, 21:12
 *
 */

package Ananumeric;
/**
 * Diseñadores:
 * Br. Elvin Gregorio Loáisiga Mendoza.
 * Br. Roberto Carlos Rodríguez Castellón.
 * Grupo: 3T1 - IS
 */
import com.hexidec.ekit.Ekit;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import com.l2fprod.common.swing.plaf.LookAndFeelAddons;
import com.l2fprod.common.swing.plaf.windows.WindowsLookAndFeelAddons;
import java.util.Calendar;
import javazoom.jlgui.player.amp.StandalonePlayer;
        
public class Principal extends javax.swing.JFrame {
   Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
   private Calendar cal;
   private String hora;
   private Thread hilo;
   int base_orig = 0, base_des = 0;
   
   public Principal() 
    {
        initComponents();
       long time=System.currentTimeMillis();
        Date fecha = new Date(time);
        String s=fecha.toString();
        String[] fechaString=s.split(" ");
        String diaSemanaS=fechaString[0];
        String mesS=fechaString[1];
        String diaNumeroS=fechaString[2];
        String[] horaS=fechaString[3].split(":");
        String horasS=horaS[0];
        String minutosS=horaS[1];
        String segundosS=horaS[2];
        String zonaHorariaS=fechaString[4];
        String anhoS=fechaString[5];        
    
        labelhora.setText("Fecha: "+diaNumeroS+"/"+mesS+"/"+anhoS);
    }
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jLinkButton1 = new com.l2fprod.common.swing.JLinkButton();
        jLinkButton2 = new com.l2fprod.common.swing.JLinkButton();
        jLinkButton3 = new com.l2fprod.common.swing.JLinkButton();
        jLinkButton4 = new com.l2fprod.common.swing.JLinkButton();
        jTaskPaneGroup2 = new com.l2fprod.common.swing.JTaskPaneGroup();
        jLinkButton7 = new com.l2fprod.common.swing.JLinkButton();
        jLinkButton8 = new com.l2fprod.common.swing.JLinkButton();
        jLinkButton9 = new com.l2fprod.common.swing.JLinkButton();
        jLinkButton10 = new com.l2fprod.common.swing.JLinkButton();
        jTaskPaneGroup3 = new com.l2fprod.common.swing.JTaskPaneGroup();
        labelhora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        LabelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VNumerical Soft Versi\u00f3n Empresarial 1.0.0");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getAccessibleContext().setAccessibleName("");
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\word.PNG"));
        jButton1.setText("Microsoft Word");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton1);

        jButton2.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\excel.PNG"));
        jButton2.setText("Microsoft Excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton2);

        jButton3.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\pps.PNG"));
        jButton3.setText("Microsoft Power Point");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton3);

        jButton4.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\access.PNG"));
        jButton4.setText("Microsoft Access");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton4);

        jButton5.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\color_wheel.png"));
        jButton5.setText("Paint");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton5);

        jButton6.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__document.png"));
        jButton6.setText("Bloc de Notas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jToolBar1.add(jButton6);

        jToolBar1.setBounds(0, 0, 1010, 40);
        jDesktopPane1.add(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSplitPane1.setDividerLocation(255);
        jSplitPane1.setDividerSize(6);
        jSplitPane1.setOpaque(false);
        jSplitPane2.setDividerLocation(500);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        com.l2fprod.common.swing.PercentLayout percentLayout4 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout4.setGap(14);
        percentLayout4.setOrientation(1);
        jTaskPane1.setLayout(percentLayout4);

        jTaskPane1.setBackground(new java.awt.Color(102, 102, 102));
        com.l2fprod.common.swing.PercentLayout percentLayout5 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout5.setOrientation(1);
        jTaskPaneGroup1.getContentPane().setLayout(percentLayout5);

        jTaskPaneGroup1.setBackground(new java.awt.Color(15, 179, 255));
        jTaskPaneGroup1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\welcome32x32.png"));
        jTaskPaneGroup1.setTitle("Unidades de Estudio");
        jLinkButton1.setBackground(new java.awt.Color(153, 204, 255));
        jLinkButton1.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\star.png"));
        jLinkButton1.setText("Sistemas Num\u00e9ricos");
        jLinkButton1.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton1ActionPerformed(evt);
            }
        });
        jLinkButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLinkButton1MousePressed(evt);
            }
        });

        jTaskPaneGroup1.getContentPane().add(jLinkButton1);

        jLinkButton2.setBackground(new java.awt.Color(255, 252, 254));
        jLinkButton2.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\star.png"));
        jLinkButton2.setText("M\u00e9todos Num\u00e9ricos");
        jLinkButton2.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLinkButton2MousePressed(evt);
            }
        });

        jTaskPaneGroup1.getContentPane().add(jLinkButton2);

        jLinkButton3.setBackground(new java.awt.Color(255, 252, 254));
        jLinkButton3.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\page.png"));
        jLinkButton3.setText("Sistemas de Ecuaciones");
        jLinkButton3.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton3ActionPerformed(evt);
            }
        });

        jTaskPaneGroup1.getContentPane().add(jLinkButton3);

        jLinkButton4.setBackground(new java.awt.Color(255, 255, 255));
        jLinkButton4.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\page.png"));
        jLinkButton4.setText("Interpolaci\u00f3n");
        jLinkButton4.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton4ActionPerformed(evt);
            }
        });

        jTaskPaneGroup1.getContentPane().add(jLinkButton4);

        jTaskPane1.add(jTaskPaneGroup1);

        com.l2fprod.common.swing.PercentLayout percentLayout6 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout6.setGap(2);
        percentLayout6.setOrientation(1);
        jTaskPaneGroup2.getContentPane().setLayout(percentLayout6);

        jTaskPaneGroup2.setBackground(new java.awt.Color(43, 160, 255));
        jTaskPaneGroup2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\propertysheet32x32.png"));
        jTaskPaneGroup2.setTitle("Herramientas");
        jLinkButton7.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton7.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__add.png"));
        jLinkButton7.setText("Calculadora");
        jLinkButton7.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton7ActionPerformed(evt);
            }
        });

        jTaskPaneGroup2.getContentPane().add(jLinkButton7);

        jLinkButton8.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton8.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\past.png"));
        jLinkButton8.setText("Calendario");
        jLinkButton8.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton8ActionPerformed(evt);
            }
        });

        jTaskPaneGroup2.getContentPane().add(jLinkButton8);

        jLinkButton9.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton9.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\page_white_edit.png"));
        jLinkButton9.setText("Editor de Texto");
        jLinkButton9.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton9ActionPerformed(evt);
            }
        });

        jTaskPaneGroup2.getContentPane().add(jLinkButton9);

        jLinkButton10.setForeground(new java.awt.Color(0, 0, 204));
        jLinkButton10.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\word.png"));
        jLinkButton10.setText("Word versi\u00f3n en Java");
        jLinkButton10.setFont(new java.awt.Font("Verdana", 1, 12));
        jLinkButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLinkButton10ActionPerformed(evt);
            }
        });

        jTaskPaneGroup2.getContentPane().add(jLinkButton10);

        jTaskPane1.add(jTaskPaneGroup2);

        com.l2fprod.common.swing.PercentLayout percentLayout7 = new com.l2fprod.common.swing.PercentLayout();
        percentLayout7.setOrientation(1);
        jTaskPaneGroup3.getContentPane().setLayout(percentLayout7);

        jTaskPaneGroup3.setBackground(new java.awt.Color(43, 160, 255));
        jTaskPaneGroup3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\tasks-question.png"));
        jTaskPaneGroup3.setTitle("Detalles ...");
        labelhora.setFont(new java.awt.Font("Verdana", 1, 12));
        labelhora.setForeground(new java.awt.Color(0, 0, 204));
        labelhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTaskPaneGroup3.getContentPane().add(labelhora);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VNumerical Soft");
        jTaskPaneGroup3.getContentPane().add(jLabel5);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Versi\u00f3n 1.0.0");
        jTaskPaneGroup3.getContentPane().add(jLabel4);

        jTaskPane1.add(jTaskPaneGroup3);

        jPanel2.add(jTaskPane1);

        jSplitPane2.setLeftComponent(jPanel2);

        jPanel3.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\dragones_cromados.jpg"));
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 230, 180);

        jSplitPane2.setRightComponent(jPanel3);

        jSplitPane1.setLeftComponent(jSplitPane2);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        LabelFondo.setBackground(new java.awt.Color(0, 0, 0));
        LabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D403.jpg"));
        LabelFondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LabelFondo.setFocusable(false);
        LabelFondo.setMaximumSize(new java.awt.Dimension(1200, 775));
        LabelFondo.setMinimumSize(new java.awt.Dimension(1200, 775));
        LabelFondo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(LabelFondo);

        jSplitPane1.setRightComponent(jPanel4);

        jSplitPane1.setBounds(0, 39, 1336, 820);
        jDesktopPane1.add(jSplitPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel1.add(jDesktopPane1);

        getContentPane().add(jPanel1);

        jMenuBar1.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jMenuItem1.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\stop.png"));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Entretenimiento");
        jMenu2.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jMenuItem2.setFont(new java.awt.Font("BankGothic Md BT", 1, 11));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\joypad.png"));
        jMenuItem2.setText("Parejas Simpson");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });

        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1020)/2, (screenSize.height-780)/2, 1020, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void jLinkButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton4ActionPerformed

        MetodosInterpoladores j = new MetodosInterpoladores();
               jDesktopPane1.add(j);
               j.setVisible(true);
               j.toFront();  
    }//GEN-LAST:event_jLinkButton4ActionPerformed

    private void jLinkButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton10ActionPerformed
          Ekit ekit = new Ekit();
    }//GEN-LAST:event_jLinkButton10ActionPerformed
  
    private void jLinkButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton3ActionPerformed
    SistemaEcuaciones j = new SistemaEcuaciones();
               jDesktopPane1.add(j);
               j.setVisible(true);
               j.toFront();  
    }//GEN-LAST:event_jLinkButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
     Parejas j = new Parejas();
               jDesktopPane1.add(j);
               j.setClosable(true);
               j.setVisible(true);
               j.toFront();      
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("notepad.exe");
			p.waitFor();

		}
		catch (IOException ioe )
		{
			ioe.printStackTrace();
		} 
		catch ( InterruptedException ie )
		{
		    ie.printStackTrace();
		}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("mspaint.exe");
			p.waitFor();

		}
		catch (IOException ioe )
		{
			ioe.printStackTrace();
		} 
		catch ( InterruptedException ie )
		{
		    ie.printStackTrace();
		}
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("C:\\Archivos de programa\\Microsoft Office\\OFFICE11\\msaccess.exe");
			p.waitFor();

		}
		catch (IOException ioe )
		{
			ioe.printStackTrace();
		} 
		catch ( InterruptedException ie )
		{
		    ie.printStackTrace();
		}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("C:\\Archivos de programa\\Microsoft Office\\OFFICE11\\powerpnt.exe");
			p.waitFor();

		}
		catch (IOException ioe )
		{
			ioe.printStackTrace();
		} 
		catch ( InterruptedException ie )
		{
		    ie.printStackTrace();
		}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("C:\\Archivos de programa\\Microsoft Office\\OFFICE11\\excel.exe");
			p.waitFor();

		}
		catch (IOException ioe )
		{
			ioe.printStackTrace();
		} 
		catch ( InterruptedException ie )
		{
		    ie.printStackTrace();
		}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("C:\\Archivos de programa\\Microsoft Office\\OFFICE11\\winword.exe");
			p.waitFor();

		}
		catch (IOException ioe )
		{
			ioe.printStackTrace();
		} 
		catch ( InterruptedException ie )
		{
		    ie.printStackTrace();
		}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLinkButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton9ActionPerformed
    Editor j = new Editor();
               jDesktopPane1.add(j);
               j.setClosable(true);
               j.setVisible(true);
               j.toFront();
    }//GEN-LAST:event_jLinkButton9ActionPerformed

    private void jLinkButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton8ActionPerformed
     Calendario j = new Calendario();
                jDesktopPane1.add(j);
                j.setClosable(true);
                j.setVisible(true);
                j.toFront();
    }//GEN-LAST:event_jLinkButton8ActionPerformed

    private void jLinkButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton7ActionPerformed
      try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("calc.exe");
			p.waitFor();

		}
		catch (IOException ioe )
		{
			ioe.printStackTrace();
		} 
		catch ( InterruptedException ie )
		{
		    ie.printStackTrace();
		}
    }//GEN-LAST:event_jLinkButton7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLinkButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinkButton2MousePressed

        MetodosNumericos j= new MetodosNumericos();
                jDesktopPane1.add(j);
                j.setVisible(true);
                j.toFront();
    }//GEN-LAST:event_jLinkButton2MousePressed

    private void jLinkButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLinkButton1MousePressed
 
    }//GEN-LAST:event_jLinkButton1MousePressed

    private void jLinkButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLinkButton1ActionPerformed
       SistemasNumericos sm= new SistemasNumericos();
                jDesktopPane1.add(sm);
                sm.setVisible(true);
                sm.toFront();   
        
    }//GEN-LAST:event_jLinkButton1ActionPerformed
  
    private void jLinkButton2ActionPerformed(java.awt.event.ActionEvent evt) {
               MetodosNumericos j= new MetodosNumericos();
                jDesktopPane1.add(j);
                j.setVisible(true);
                j.toFront();   
    }    
   public static void main(String args[]) {
       try{//com.jtattoo.plaf.acryl.AcrylLookAndFeel
        Class.forName("com.jtattoo.plaf.acryl.AcrylLookAndFeel");   
      	UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        LookAndFeelAddons.setAddon(LookAndFeelAddons.getBestMatchAddonClassName()); 
        UIManager.put("win.xpstyle.name", "luna");
        LookAndFeelAddons.setAddon(WindowsLookAndFeelAddons.class);    
      	}
       catch(Exception e)
        {
          e.printStackTrace();
        }
       
        Splash_1 s = new Splash_1();
	s.showSplash(6000);
	s.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.l2fprod.common.swing.JLinkButton jLinkButton1;
    private com.l2fprod.common.swing.JLinkButton jLinkButton10;
    private com.l2fprod.common.swing.JLinkButton jLinkButton2;
    private com.l2fprod.common.swing.JLinkButton jLinkButton3;
    private com.l2fprod.common.swing.JLinkButton jLinkButton4;
    private com.l2fprod.common.swing.JLinkButton jLinkButton7;
    private com.l2fprod.common.swing.JLinkButton jLinkButton8;
    private com.l2fprod.common.swing.JLinkButton jLinkButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private com.l2fprod.common.swing.JTaskPane jTaskPane1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelhora;
    // End of variables declaration//GEN-END:variables
    
}
