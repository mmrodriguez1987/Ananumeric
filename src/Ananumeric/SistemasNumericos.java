/*
 * SistemasNumericos.java
 *
 * Created on 23 de abril de 2007, 07:33 PM
 */

package Ananumeric;

import javax.swing.JOptionPane;
import java.lang.*;
import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.util.*;
import javax.swing.table.*;
import javax.swing.border.*;
import javax.swing.text.*;
import javax.swing.JTable.*;
/**
 *
 * @author  Elvin
 */
public class SistemasNumericos extends javax.swing.JInternalFrame {
     
  String cant = null, resp = null, conv = null;
   
   int base_orig = 0,base_des = 0;
   
    public SistemasNumericos() {
        initComponents();
        rb_sd1.addActionListener(new decimal_orig());
        rb_sb1.addActionListener(new binario_orig());
        rb_so1.addActionListener(new octal_orig());
        rb_sh1.addActionListener(new hexa_orig());
        
        rb_sd2.addActionListener(new decimal_dest());
        rb_sb2.addActionListener(new binario_dest());
        rb_so2.addActionListener(new octal_dest());
        rb_sh2.addActionListener(new hexa_dest());
        EstadoRadio(false);
        
        rb_fd.addActionListener(new FDecimal());
        rb_fo.addActionListener(new FOctal());
        rb_fh.addActionListener(new FHexadecimal());
        l_calcular.setVisible(false); l_resp.setVisible(false);
        
    }
    
    public  void EstadoRadio(boolean se)
    {  
     rb_sd2.setEnabled(se);
     rb_sb2.setEnabled(se);
     rb_so2.setEnabled(se);
     rb_sh2.setEnabled(se);
    }
 public static Double Round(double num)
{
 double cantidad_redondeada=num;
 
  cantidad_redondeada = cantidad_redondeada*100; 
  cantidad_redondeada = Math.floor(cantidad_redondeada);
  
  if(cantidad_redondeada%10 == 9)
  {
  	cantidad_redondeada += 1;
  }
  cantidad_redondeada = cantidad_redondeada/100;
 
  return cantidad_redondeada;
  
}

  public static String DecimalBinario(double num)
  {
  	String cadena = null, cadena_t = null, entero = null; 
  	double entero_m = 0, decimal_m = 0, producto = 0, base = 2;
  	boolean igual = false;
  	int i = 1;
  	
  	decimal_m = num;
  	
  	do
  	{
  	 decimal_m = Round(decimal_m);	
  	 producto = (decimal_m)*(base);
  	 producto = Round(producto);
  	 
	  	 if(producto < 1)
	  	 { 
	  	   entero = "0";
	  	   decimal_m = producto;
	  	   decimal_m = Round(decimal_m);
	  	 } 
	  	 else
	  	 {
	  	   entero = "1";
	  	   entero_m = 1;
	  	   decimal_m = producto - entero_m;
	  	   decimal_m = Round(decimal_m);
	  	 } 				
  	   
  	    if(decimal_m == num  || decimal_m == 0)
  	    {
  	 	 igual = true;
  	    }
  	    else
  	    {
  	     igual = false;
  	    }
  	 
  	 if(i == 1)
  	 {
  	  cadena_t = ".".concat(entero);
  	 }
  	 else
  	 {
  	  cadena_t = cadena_t.concat(entero);
  	 }
  	
  	 i += 1;	
  	}while(igual == false && i <= 16);
  	
  	return cadena_t; 
  }	
    public static String ConvertirNumero(int baseOrigen, String numeroOrigen, int baseDestino){

long entero = Long.parseLong(numeroOrigen, baseOrigen);

String respuesta="";

switch(baseDestino){
case 2: respuesta = Long.toBinaryString(entero); 
break; 
case 8: respuesta = Long.toOctalString(entero); 
break;
case 10: respuesta = String.valueOf(entero); 
break;
case 16: respuesta = Long.toHexString(entero); 
break; 
}
return respuesta; 
} 
  class binario_orig implements ActionListener{      
    public void actionPerformed(ActionEvent evt){
       int confir = 0; // Para confirmar la sintaxis Decimal
       try
       {
         int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Binaria?","Selección de Base Origen",JOptionPane.YES_NO_OPTION);
		      if(result == JOptionPane.YES_OPTION)
		      {
                      do{
                          try {
                              confir = 0;
                              cant = null;
                              do
                              {
                                  cant = JOptionPane.showInputDialog(null,"Digite la cantidad que desea convertir : "," Requerimientos de Datos",JOptionPane.QUESTION_MESSAGE);
                              }while(cant.length() == 0);
                              
                          }catch(Exception p){}
                          
                          char[] cadena = cant.toCharArray();
                          
                          for(int i = 0;i <= (cant.length() - 1);i++) {
                              if((cadena[i] == '0' || cadena[i] == '1' )) {
                                  confir = confir + 1;
                              }
                              System.out.println("Caracter[ "+i+" ]="+cadena[i]);
                          }
                      }while(confir != cant.length());
                   
                  base_orig = 2;
                  System.out.println("Cantidad : "+cant+" Base: "+base_orig);
                  confir = 0; 
                  
	          Utilidades.BoxDialog("Cadena Válida","Confirmación de Datos.","speed.png");
                      EstadoRadio(true);
                      rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
                      rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
                      rb_sb2.setEnabled(false); 
                      }else
                      {
                      confir = 0; 
                      rb_sd1.setEnabled(true);  rb_sb1.setEnabled(true);
                      rb_so1.setEnabled(true);  rb_sh1.setEnabled(true);
                      EstadoRadio(false);
                      } 
       }catch(Exception ty){}
    }
  }  
 
  class hexa_orig implements ActionListener{      
    public void actionPerformed(ActionEvent evt){
        try
        {
        int confir = 0; // Para confirmar la sintaxis Decimal
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Hexadecimal?","Selección de Base Origen",JOptionPane.YES_NO_OPTION);
		      if(result == JOptionPane.YES_OPTION)
		      {
                   do{
                       try {
                           confir = 0;
                           cant = null;
                           do
                           {
                               cant = JOptionPane.showInputDialog(null,"Digite la cantidad que desea convertir : "," Requerimientos de Datos",JOptionPane.QUESTION_MESSAGE);
                           }while(cant.length() == 0);
                       }catch(Exception p){}
                       
                       
                       cant = cant.toUpperCase();
                       
                       char[] cadena = cant.toCharArray();
                       
                       for(int i = 0;i <= (cant.length() - 1);i++) {
                           if((cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9' || cadena[i] == 'A' || cadena[i] == 'B' || cadena[i] == 'C' || cadena[i] == 'D' || cadena[i] == 'E' || cadena[i] == 'F')) {
                               confir = confir + 1;
                           }
                           System.out.println("Caracter[ "+i+" ]="+cadena[i]);
                       }
                   }while(confir != cant.length());
                   
                  base_orig = 16;
                  confir = 0;
                  System.out.println("Cantidad : "+cant+" Base: "+base_orig);	
	          Utilidades.BoxDialog("Cadena Válida","Confirmación de Datos.","speed.png");
                  
                      EstadoRadio(true);
                      rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
                      rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
                      rb_sh2.setEnabled(false);  
                      
                      }else
                      {
                      confir = 0;
                      rb_sd1.setEnabled(true);  rb_sb1.setEnabled(true);
                      rb_so1.setEnabled(true);  rb_sh1.setEnabled(true);
                      EstadoRadio(false);
                      }
       }catch(Exception ro){}
    }
  }  
  class octal_orig implements ActionListener{      
    public void actionPerformed(ActionEvent evt){
        int confir = 0; // Para confirmar la sintaxis Decimal
        try
        {       
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Octal?","Selección de Base Origen",JOptionPane.YES_NO_OPTION);
		      if(result == JOptionPane.YES_OPTION)
		      {
                        do{
                            try {
                                confir = 0;
                                cant = null;
                                do
                                {
                                    cant = JOptionPane.showInputDialog(null,"Digite la cantidad que desea convertir : "," Requerimientos de Datos",JOptionPane.QUESTION_MESSAGE);
                                }while(cant.length() == 0);
                            }catch(Exception p){}
                            
                            char[] cadena = cant.toCharArray();
                            
                            for(int i = 0;i <= (cant.length() - 1);i++) {
                                if(cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' ) {
                                    confir = confir + 1;
                                }
                                
                                System.out.println("Caracter[ "+i+" ]="+cadena[i]);
                            }
                        }while(confir != cant.length());
                   
                       
                  base_orig = 8;
                  confir = 0;
                  System.out.println("Cantidad : "+cant+" Base: "+base_orig);	
	          Utilidades.BoxDialog("Cadena Válida","Confirmación de Datos.","speed.png");
                  
                      EstadoRadio(true);
                      rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
                      rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
                      rb_so2.setEnabled(false);  
                      }else
                      {
                      confir = 0;
                      rb_sd1.setEnabled(true);  rb_sb1.setEnabled(true);
                      rb_so1.setEnabled(true);  rb_sh1.setEnabled(true);
                     EstadoRadio(false);
                      }
        }catch( Exception jk){}
    }
  }
  class decimal_orig implements ActionListener{      
    public void actionPerformed(ActionEvent evt){
        
        int confir = 0; // Para confirmar la sintaxis Decimal
        cant = null;
        try
        {
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Decimal?","Selección de Base Origen",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
		  {
            
                  do{
                      try {
                          
                          cant = null;
                          confir = 0;
                          do{
                              cant = JOptionPane.showInputDialog(null,"Digite la cantidad que desea convertir : "," Requerimientos de Datos",JOptionPane.QUESTION_MESSAGE);
                          }while(cant.length() == 0);
                      }catch(Exception p){}
                      
                      char[] cadena = cant.toCharArray();
                      
                      for(int i=0;i<=(cant.length() - 1);i++) {
                          if((cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9')) {
                              confir = confir + 1;
                          }
                          
                          System.out.println("Caracter[ "+i+" ]="+cadena[i]);
                      }
                  }while(confir != cant.length());

                  base_orig = 10;
                  System.out.println("Cantidad : "+cant+" Base: "+base_orig);
                  confir = 0;
                  Utilidades.BoxDialog("Cadena Válida","Confirmación de Datos.","speed.png");
                  
                      EstadoRadio(true);
                      rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
                      rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
                      rb_sd2.setEnabled(false);  
                      
               }
            else
             {
             confir = 0;
             rb_sd1.setEnabled(true);  rb_sb1.setEnabled(true);
             rb_so1.setEnabled(true);  rb_sh1.setEnabled(true);
             EstadoRadio(false);
             }
        }catch(Exception ter){}
    }
  }

  class decimal_dest implements ActionListener{      
    public void actionPerformed(ActionEvent evt)
    {
         try
        {
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Decimal?","Selección de Base Destino",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
            {
            base_des = 10; 
            System.out.println("Base de Destino: "+base_des);
            rb_sd2.setEnabled(false);  rb_sb2.setEnabled(false);
            rb_so2.setEnabled(false);  rb_sh2.setEnabled(false);
            l_calcular.setVisible(true); 
            Utilidades.BoxDialog("Ahora 'Calcular' para realizar su conversión","Información del Sistema","speed.png");
            
            }  
           else
             {
            rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
            rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
            
             }
         }catch(Exception tr){}       
    }
  }    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        PanelFondo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Tab1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rb_sd1 = new javax.swing.JRadioButton();
        rb_so1 = new javax.swing.JRadioButton();
        rb_sh1 = new javax.swing.JRadioButton();
        rb_sb1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rb_sd2 = new javax.swing.JRadioButton();
        rb_sb2 = new javax.swing.JRadioButton();
        rb_so2 = new javax.swing.JRadioButton();
        rb_sh2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        l_calcular = new javax.swing.JLabel();
        l_resp = new javax.swing.JLabel();
        l_rest = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Tab2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        t_convertir = new javax.swing.JTextField();
        l_convertir = new javax.swing.JLabel();
        l_restab = new javax.swing.JLabel();
        l_respuesta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t_apro = new javax.swing.JTextField();
        t_real = new javax.swing.JTextField();
        l_absoluto = new javax.swing.JLabel();
        l_calculaerror = new javax.swing.JLabel();
        l_resterror = new javax.swing.JLabel();
        l_relativo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tab3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rb_fd = new javax.swing.JRadioButton();
        rb_fo = new javax.swing.JRadioButton();
        rb_fh = new javax.swing.JRadioButton();
        l_flecha = new javax.swing.JLabel();
        l_f_resp = new javax.swing.JLabel();
        l_restab1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        PanelFondo.setLayout(null);

        PanelFondo.setBackground(new java.awt.Color(70, 136, 250));
        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 1, 12));
        Tab1.setLayout(null);

        jPanel4.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Base de Origen", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("BankGothic Md BT", 1, 14), new java.awt.Color(0, 0, 204)));
        jPanel4.setForeground(new java.awt.Color(0, 51, 204));
        jPanel4.setToolTipText("!Escoja la Base de Origen y digite su Cantidad\u00a1");
        jPanel4.setFont(new java.awt.Font("BankGothic Md BT", 1, 14));
        jPanel4.setOpaque(false);
        rb_sd1.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_sd1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_sd1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\directory.gif"));
        rb_sd1.setLabel("Sistema Decimal");
        rb_sd1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_sd1.setOpaque(false);
        rb_sd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_sd1ActionPerformed(evt);
            }
        });
        rb_sd1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_sd1MousePressed(evt);
            }
        });

        jPanel4.add(rb_sd1);
        rb_sd1.setBounds(80, 20, 149, 30);

        rb_so1.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_so1.setText("Sistema Octal");
        rb_so1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_so1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\directory.gif"));
        rb_so1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_so1.setOpaque(false);
        rb_so1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_so1MousePressed(evt);
            }
        });

        jPanel4.add(rb_so1);
        rb_so1.setBounds(80, 90, 131, 20);

        rb_sh1.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_sh1.setText("Sistema Hexadecimal");
        rb_sh1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_sh1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\directory.gif"));
        rb_sh1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_sh1.setOpaque(false);
        rb_sh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_sh1MousePressed(evt);
            }
        });

        jPanel4.add(rb_sh1);
        rb_sh1.setBounds(80, 120, 181, 20);

        rb_sb1.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_sb1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_sb1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\directory.gif"));
        rb_sb1.setLabel("Sistema Binario");
        rb_sb1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_sb1.setOpaque(false);
        rb_sb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_sb1MousePressed(evt);
            }
        });

        jPanel4.add(rb_sb1);
        rb_sb1.setBounds(80, 60, 143, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lineasdsf.gif"));
        jPanel4.add(jLabel2);
        jLabel2.setBounds(-20, 10, 330, 180);

        Tab1.add(jPanel4);
        jPanel4.setBounds(30, 40, 320, 200);

        jPanel1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base de Destino", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("BankGothic Md BT", 1, 14), new java.awt.Color(0, 0, 204)));
        jPanel1.setToolTipText("!Escoja la base a que desea convertir su cantidad!");
        jPanel1.setOpaque(false);
        rb_sd2.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_sd2.setText("Sistema Decimal");
        rb_sd2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_sd2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\acgt2.gif"));
        rb_sd2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_sd2.setOpaque(false);
        rb_sd2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_sd2MousePressed(evt);
            }
        });

        jPanel1.add(rb_sd2);
        rb_sd2.setBounds(90, 30, 130, 17);

        rb_sb2.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_sb2.setText("Sistema Binario");
        rb_sb2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_sb2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\acgt2.gif"));
        rb_sb2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_sb2.setOpaque(false);
        rb_sb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_sb2MousePressed(evt);
            }
        });

        jPanel1.add(rb_sb2);
        rb_sb2.setBounds(90, 60, 125, 20);

        rb_so2.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_so2.setText("Sistema Octal");
        rb_so2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_so2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\acgt2.gif"));
        rb_so2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_so2.setOpaque(false);
        rb_so2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_so2MousePressed(evt);
            }
        });

        jPanel1.add(rb_so2);
        rb_so2.setBounds(90, 90, 113, 17);

        rb_sh2.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_sh2.setText("Sistema Hexadecimal");
        rb_sh2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_sh2.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\acgt2.gif"));
        rb_sh2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_sh2.setOpaque(false);
        rb_sh2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_sh2MousePressed(evt);
            }
        });

        jPanel1.add(rb_sh2);
        rb_sh2.setBounds(90, 120, 163, 17);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lineasdsf.gif"));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-20, 10, 330, 180);

        Tab1.add(jPanel1);
        jPanel1.setBounds(380, 40, 320, 200);

        l_calcular.setFont(new java.awt.Font("Verdana", 1, 14));
        l_calcular.setForeground(new java.awt.Color(0, 102, 102));
        l_calcular.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\Mundo011.gif"));
        l_calcular.setText("Calcular");
        l_calcular.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));
        l_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_calcularMousePressed(evt);
            }
        });

        Tab1.add(l_calcular);
        l_calcular.setBounds(30, 310, 150, 40);

        l_resp.setBackground(new java.awt.Color(102, 0, 51));
        l_resp.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14));
        l_resp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tab1.add(l_resp);
        l_resp.setBounds(190, 284, 560, 30);

        l_rest.setBackground(new java.awt.Color(0, 102, 102));
        l_rest.setFont(new java.awt.Font("Verdana", 1, 14));
        l_rest.setForeground(new java.awt.Color(0, 102, 102));
        l_rest.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\desktop.gif"));
        l_rest.setText("Reestablecer");
        l_rest.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));
        l_rest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_restMousePressed(evt);
            }
        });

        Tab1.add(l_rest);
        l_rest.setBounds(30, 254, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D422.jpg"));
        jLabel1.setText("jLabel1");
        Tab1.add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 380);

        jTabbedPane1.addTab("Sistemas Num\u00e9ricos", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\platform_35.gif"), Tab1);

        Tab2.setLayout(null);

        Tab2.setOpaque(false);
        jPanel5.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Decimal fraccionario a Binario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("BankGothic Md BT", 1, 14), new java.awt.Color(0, 0, 204)));
        jPanel6.setOpaque(false);
        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel6.setText("Digite su cantidad:");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(20, 90, 150, 30);

        t_convertir.setFont(new java.awt.Font("Verdana", 1, 12));
        t_convertir.setForeground(new java.awt.Color(0, 153, 51));
        t_convertir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_convertir.setToolTipText("Como M\u00e1ximo se permiten 2 decimales despu\u00e9s del punto");
        t_convertir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_convertirKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_convertirKeyTyped(evt);
            }
        });

        jPanel6.add(t_convertir);
        t_convertir.setBounds(170, 90, 150, 30);

        l_convertir.setBackground(new java.awt.Color(255, 255, 255));
        l_convertir.setFont(new java.awt.Font("Verdana", 1, 12));
        l_convertir.setForeground(new java.awt.Color(102, 0, 0));
        l_convertir.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\calc_v.JPG"));
        l_convertir.setText("Convertir");
        l_convertir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        l_convertir.setOpaque(true);
        l_convertir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_convertirMousePressed(evt);
            }
        });

        jPanel6.add(l_convertir);
        l_convertir.setBounds(20, 200, 140, 50);

        l_restab.setBackground(new java.awt.Color(255, 255, 255));
        l_restab.setFont(new java.awt.Font("Verdana", 1, 12));
        l_restab.setForeground(new java.awt.Color(102, 0, 0));
        l_restab.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\reestablecer_v.JPG"));
        l_restab.setText("Reestablecer");
        l_restab.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        l_restab.setOpaque(true);
        l_restab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_restabMousePressed(evt);
            }
        });

        jPanel6.add(l_restab);
        l_restab.setBounds(170, 200, 150, 50);

        l_respuesta.setFont(new java.awt.Font("Verdana", 1, 12));
        l_respuesta.setForeground(new java.awt.Color(102, 102, 0));
        l_respuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_respuesta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 255)));
        jPanel6.add(l_respuesta);
        l_respuesta.setBounds(20, 134, 290, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\Picture.JPG"));
        jLabel5.setVerifyInputWhenFocusTarget(false);
        jPanel6.add(jLabel5);
        jLabel5.setBounds(10, 20, 320, 270);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(40, 10, 340, 300);

        jPanel7.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("BankGothic Md BT", 1, 14), new java.awt.Color(0, 255, 0)));
        jPanel7.setOpaque(false);
        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel8.setText("Valor Real");
        jPanel7.add(jLabel8);
        jLabel8.setBounds(30, 46, 100, 20);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12));
        jLabel9.setText("Valor Aproximado");
        jPanel7.add(jLabel9);
        jLabel9.setBounds(34, 90, 118, 20);

        t_apro.setFont(new java.awt.Font("Verdana", 1, 12));
        t_apro.setForeground(new java.awt.Color(0, 51, 204));
        t_apro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_apro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_aproKeyTyped(evt);
            }
        });

        jPanel7.add(t_apro);
        t_apro.setBounds(160, 80, 130, 30);

        t_real.setFont(new java.awt.Font("Verdana", 1, 12));
        t_real.setForeground(new java.awt.Color(0, 51, 204));
        t_real.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t_real.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_realKeyTyped(evt);
            }
        });

        jPanel7.add(t_real);
        t_real.setBounds(160, 40, 130, 30);

        l_absoluto.setFont(new java.awt.Font("Verdana", 1, 12));
        l_absoluto.setForeground(new java.awt.Color(0, 0, 204));
        l_absoluto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_absoluto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        jPanel7.add(l_absoluto);
        l_absoluto.setBounds(30, 134, 280, 20);

        l_calculaerror.setBackground(new java.awt.Color(255, 255, 255));
        l_calculaerror.setFont(new java.awt.Font("Verdana", 1, 12));
        l_calculaerror.setForeground(new java.awt.Color(102, 0, 0));
        l_calculaerror.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\hojas_v.JPG"));
        l_calculaerror.setText("Calcular");
        l_calculaerror.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        l_calculaerror.setOpaque(true);
        l_calculaerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_calculaerrorMousePressed(evt);
            }
        });

        jPanel7.add(l_calculaerror);
        l_calculaerror.setBounds(30, 204, 120, 50);

        l_resterror.setBackground(new java.awt.Color(255, 255, 255));
        l_resterror.setFont(new java.awt.Font("Verdana", 1, 12));
        l_resterror.setForeground(new java.awt.Color(102, 0, 51));
        l_resterror.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\reestablecer_v.JPG"));
        l_resterror.setText("Reestablecer");
        l_resterror.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 204)));
        l_resterror.setOpaque(true);
        l_resterror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_resterrorMousePressed(evt);
            }
        });

        jPanel7.add(l_resterror);
        l_resterror.setBounds(169, 204, 150, 50);

        l_relativo.setFont(new java.awt.Font("Verdana", 1, 12));
        l_relativo.setForeground(new java.awt.Color(0, 0, 204));
        l_relativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_relativo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 51, 153)));
        jPanel7.add(l_relativo);
        l_relativo.setBounds(30, 170, 280, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\Picture.JPG"));
        jPanel7.add(jLabel7);
        jLabel7.setBounds(13, 17, 320, 270);

        jLabel10.setText("jLabel10");
        jPanel7.add(jLabel10);
        jLabel10.setBounds(40, 180, 260, 30);

        jPanel5.add(jPanel7);
        jPanel7.setBounds(400, 10, 340, 300);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D422.jpg"));
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 0, 760, 380);

        Tab2.add(jPanel5);
        jPanel5.setBounds(0, 0, 770, 380);

        jTabbedPane1.addTab("Errores", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\mobility_35.gif"), Tab2);

        Tab3.setLayout(null);

        jPanel2.setLayout(null);

        jPanel3.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elija el Sistema Num\u00e9rico de su cantidad fraccionaria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("BankGothic Md BT", 1, 14), new java.awt.Color(0, 0, 204)));
        jPanel3.setOpaque(false);
        rb_fd.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_fd.setText("Sistema Decimal");
        rb_fd.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_fd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rb_fd.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\webb.png"));
        rb_fd.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_fd.setOpaque(false);
        rb_fd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_fdMousePressed(evt);
            }
        });

        jPanel3.add(rb_fd);
        rb_fd.setBounds(240, 30, 170, 50);

        rb_fo.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_fo.setText("Sistema Octal");
        rb_fo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_fo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rb_fo.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\webb.png"));
        rb_fo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_fo.setOpaque(false);
        rb_fo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_foMousePressed(evt);
            }
        });

        jPanel3.add(rb_fo);
        rb_fo.setBounds(240, 70, 170, 60);

        rb_fh.setFont(new java.awt.Font("Verdana", 1, 12));
        rb_fh.setText("Sistema Hexadeciamal");
        rb_fh.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        rb_fh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rb_fh.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\webb.png"));
        rb_fh.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rb_fh.setOpaque(false);
        rb_fh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rb_fhMousePressed(evt);
            }
        });

        jPanel3.add(rb_fh);
        rb_fh.setBounds(240, 130, 190, 40);

        l_flecha.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\lineasdsf.gif"));
        jPanel3.add(l_flecha);
        l_flecha.setBounds(0, 10, 580, 180);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 20, 570, 200);

        l_f_resp.setFont(new java.awt.Font("Verdana", 1, 12));
        l_f_resp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(l_f_resp);
        l_f_resp.setBounds(30, 300, 710, 40);

        l_restab1.setBackground(new java.awt.Color(255, 255, 255));
        l_restab1.setFont(new java.awt.Font("Verdana", 1, 12));
        l_restab1.setForeground(new java.awt.Color(102, 0, 0));
        l_restab1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\reestablecer_v.JPG"));
        l_restab1.setText("Reestablecer");
        l_restab1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 204)));
        l_restab1.setOpaque(true);
        l_restab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                l_restab1MousePressed(evt);
            }
        });

        jPanel2.add(l_restab1);
        l_restab1.setBounds(600, 90, 150, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D422.jpg"));
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 770, 380);

        Tab3.add(jPanel2);
        jPanel2.setBounds(0, 0, 770, 380);

        jTabbedPane1.addTab("Fraccionario de Base 'N' ", new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\_active__zoom_in.png"), Tab3);

        PanelFondo.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 20, 770, 430);

        jMenu2.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
        jMenu2.setLabel("Propiedades");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("BankGothic Md BT", 3, 12));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\stop.png"));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });

        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanelFondo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanelFondo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        setBounds(150, 100, 816, 527);
    }// </editor-fold>//GEN-END:initComponents

    private void l_restab1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_restab1MousePressed
    rb_fd.setEnabled(true);  rb_fo.setEnabled(true); rb_fh.setEnabled(true); l_f_resp.setText(""); 
    }//GEN-LAST:event_l_restab1MousePressed

    private void rb_fhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fhMousePressed
        rb_fh.setSelected(true); rb_fo.setSelected(false); rb_fd.setSelected(false);
        
        rb_fh.setForeground(new java.awt.Color(102,153,0));
        rb_fo.setForeground(new java.awt.Color(0,0,0));
        rb_fd.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_fhMousePressed

    private void rb_foMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_foMousePressed
        rb_fo.setSelected(true); rb_fd.setSelected(false); rb_fh.setSelected(false);
        
        rb_fo.setForeground(new java.awt.Color(102,153,0));
        rb_fd.setForeground(new java.awt.Color(0,0,0));
        rb_fh.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_foMousePressed

    private void rb_fdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fdMousePressed
        rb_fd.setSelected(true); rb_fo.setSelected(false); rb_fh.setSelected(false);
                
        rb_fd.setForeground(new java.awt.Color(102,153,0));
        rb_fo.setForeground(new java.awt.Color(0,0,0));
        rb_fh.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_fdMousePressed

    private void t_realKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_realKeyTyped
        char c = evt.getKeyChar();      
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.')))
            evt.consume(); 
    }//GEN-LAST:event_t_realKeyTyped

    private void t_aproKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_aproKeyTyped
        char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.')))
            evt.consume();
    }//GEN-LAST:event_t_aproKeyTyped

    private void rb_sd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_sd1ActionPerformed

    }//GEN-LAST:event_rb_sd1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        hide();
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
class binario_dest implements ActionListener{
    public void actionPerformed(ActionEvent evt)
    {
         try
        {
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Binario?","Selección de Base Destino",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
            {
            base_des = 2; 
            System.out.println("Base de Destino: "+base_des);
            rb_sd2.setEnabled(false);  rb_sb2.setEnabled(false);
            rb_so2.setEnabled(false);  rb_sh2.setEnabled(false);
            l_calcular.setVisible(true); 
            Utilidades.BoxDialog("Ahora 'Calcular' para realizar su conversión","Información del Sistema","speed.png");
            
            }  
           else
             {
               rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
               rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
              }
         }catch(Exception tr){} 
    }
    
}   
class octal_dest implements ActionListener{
 public void actionPerformed(ActionEvent evt)
    {
         try
        {
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Octal?","Selección de Base Destino",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
            {
            base_des = 8; 
            System.out.println("Base de Destino: "+base_des);
            rb_sd2.setEnabled(false);  rb_sb2.setEnabled(false);
            rb_so2.setEnabled(false);  rb_sh2.setEnabled(false);
            l_calcular.setVisible(true); 
            Utilidades.BoxDialog("Ahora 'Calcular' para realizar su conversión","Información del Sistema","speed.png");
            
            }  
           else
             {
            rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
            rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
             
             }
         }catch(Exception tr){} 
    }

}
class hexa_dest implements ActionListener{
    public void actionPerformed(ActionEvent evt)
    {
      try
        {
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar la Base Hexadecimal?","Selección de Base Destino",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
            {
            base_des = 16; 
            System.out.println("Base de Destino: "+base_des);
            rb_sd2.setEnabled(false);  rb_sb2.setEnabled(false);
            rb_so2.setEnabled(false);  rb_sh2.setEnabled(false);
            l_calcular.setVisible(true);
            Utilidades.BoxDialog("Ahora 'Calcular' para realizar su conversión","Información del Sistema","speed.png");
            
            }  
           else
             {
            rb_sd1.setEnabled(false);  rb_sb1.setEnabled(false);
            rb_so1.setEnabled(false);  rb_sh1.setEnabled(false);
            
             }
         }catch(Exception tr){} 
    }
}
    private void l_resterrorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_resterrorMousePressed
        t_real.setText("");  l_relativo.setText("");
        t_apro.setText("");  l_absoluto.setText("");
    }//GEN-LAST:event_l_resterrorMousePressed

    private void l_calculaerrorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_calculaerrorMousePressed
        double v_real = 0, v_apro = 0, r_abs = 0, r_rel = 0;
        try {
            v_real = Double.parseDouble(t_real.getText());
            v_apro = Double.parseDouble(t_apro.getText());
            
            if(v_apro <= v_real) {
                r_abs = v_real - v_apro; r_abs *=100; r_abs = Math.floor(r_abs); r_abs /= 100;
                r_rel = (r_abs / v_real) * 100;  r_rel *=100; r_rel = Math.floor(r_rel); r_rel /= 100;
                
                l_absoluto.setText("Error Absoluto : "+r_abs);
                l_relativo.setText("Error Relativo : "+r_rel+"%");
                
                v_real = 0;  v_apro = 0;  r_abs = 0;  r_rel = 0;
            }
            
            else {
              Utilidades.BoxDialog("El valor de error aproximado no puede ser mayor que el valor real","Confirmación de Datos.","speed.png");
            }
        } catch(Exception oo) {
            t_real.setText("");  l_relativo.setText("");
            t_apro.setText("");  l_absoluto.setText("");
            Utilidades.DialogBurla("Error de Lectura de Datos.","Confirmación de Datos.","help.gif","close.wav");
                  
        }
    }//GEN-LAST:event_l_calculaerrorMousePressed

    private void l_restabMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_restabMousePressed
        t_convertir.setText("");
        l_respuesta.setText("");
        conv = null;
    }//GEN-LAST:event_l_restabMousePressed

    private void l_convertirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_convertirMousePressed
        double g = 0, entero = 0, decimal =0;
        String conv_e = null, conv_e1 = null, cadena = null, entero_s = null, s = null, decimal_s = null;
        
        try{
            g = Double.parseDouble(t_convertir.getText());
            cadena = t_convertir.getText();
            char[] caracter = cadena.toCharArray();
            
            for(int y = 0; y <= (cadena.length() - 1);y++) {
                if(caracter[y] == '.') {
                    entero_s = cadena.substring(0,y);
                    decimal_s = cadena.substring((y + 1),cadena.length());
                    
                    System.out.println("Entero_s ["+y+"] = "+entero_s);
                    System.out.println("Decimal_s ["+y+"] = "+decimal_s);
                }
                
                else {
                    System.out.println("Que la onda ....");
                }
                
            }
            g = g*100;
            g = Math.floor(g);
            g  = g/100;
            System.out.println("CANTIDAD REDONDEADA: "+g);
            
            entero = Math.floor(g);
            conv_e1 = String.valueOf(entero);
            System.out.println("ENTERO :"+entero);
            
            decimal = Double.parseDouble(decimal_s);
            decimal /= 100;
            System.out.println("DECIMAL :"+decimal);
            
            conv = DecimalBinario(decimal);
            System.out.println("DecimalBinario :"+conv);
            conv_e = ConvertirNumero(10,entero_s,2);
            
            System.out.println("ConvertirNumero :"+conv_e);
            System.out.println("El equivalente decimal es: "+conv_e+""+conv);
            
            l_respuesta.setText("Nº Binario: "+conv_e+conv);
            
        } catch(Exception eee) {
            Utilidades.DialogBurla("Error de Lectura de Datos.","Confirmación de Datos.","help.gif","close.wav");
            t_convertir.setText("");
            conv_e = null; conv_e1 = null; cadena = null; entero_s = null ; s = null; decimal_s = null;
            g = 0; entero = 0; decimal =0;
        }
    }//GEN-LAST:event_l_convertirMousePressed

    private void t_convertirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_convertirKeyTyped

        char c = evt.getKeyChar();
        
        if (!((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == '.')))
            evt.consume();
    }//GEN-LAST:event_t_convertirKeyTyped

    private void t_convertirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_convertirKeyPressed
// TODO add your handling code here:
    }//GEN-LAST:event_t_convertirKeyPressed

    private void l_restMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_restMousePressed
        rb_sd1.setEnabled(true);  rb_sb1.setEnabled(true);
        rb_so1.setEnabled(true);  rb_sh1.setEnabled(true);
        
        rb_sd2.setEnabled(true);  rb_sb2.setEnabled(true);
        rb_so2.setEnabled(true);  rb_sh2.setEnabled(true);
        
        rb_sh1.setForeground(new java.awt.Color(0,0,0));
        rb_sd1.setForeground(new java.awt.Color(0,0,0));
        rb_so1.setForeground(new java.awt.Color(0,0,0));
        rb_sb1.setForeground(new java.awt.Color(0,0,0));
        
        rb_sh2.setForeground(new java.awt.Color(0,0,0));
        rb_sd2.setForeground(new java.awt.Color(0,0,0));
        rb_so2.setForeground(new java.awt.Color(0,0,0));
        rb_sb2.setForeground(new java.awt.Color(0,0,0));
        EstadoRadio(false);
        
        l_calcular.setVisible(false);
        l_resp.setText("");
        
        cant = null; resp = null; base_orig = 0; base_des = 0;
    }//GEN-LAST:event_l_restMousePressed

    private void l_calcularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_calcularMousePressed
        try {
            resp = ConvertirNumero(base_orig,cant,base_des);
            resp = resp.toUpperCase();
            System.out.println(resp);
            l_resp.setVisible(true);
            l_resp.setText("La Cantidad de "+cant+" (Base "+base_orig+" )"+", equivale a "+resp+" (Base "+base_des+" )");
        }catch(Exception iou) {
            Utilidades.BoxDialog("Desbordamiento de Datos","Información del Asistente","visualweb_35.gif");
            rb_sd1.setEnabled(true);  rb_sb1.setEnabled(true);
            rb_so1.setEnabled(true);  rb_sh1.setEnabled(true);
            
            rb_sd2.setEnabled(true);  rb_sb2.setEnabled(true);
            rb_so2.setEnabled(true);  rb_sh2.setEnabled(true);
            
            rb_sh1.setForeground(new java.awt.Color(0,0,0));
            rb_sd1.setForeground(new java.awt.Color(0,0,0));
            rb_so1.setForeground(new java.awt.Color(0,0,0));
            rb_sb1.setForeground(new java.awt.Color(0,0,0));
            
            rb_sh2.setForeground(new java.awt.Color(0,0,0));
            rb_sd2.setForeground(new java.awt.Color(0,0,0));
            rb_so2.setForeground(new java.awt.Color(0,0,0));
            rb_sb2.setForeground(new java.awt.Color(0,0,0));
            
            l_calcular.setVisible(false);
            l_resp.setText("");
            EstadoRadio(false);
            cant = null; resp = null; base_orig = 0; base_des = 0;
        }
    }//GEN-LAST:event_l_calcularMousePressed

class FDecimal implements ActionListener{
    public void actionPerformed(ActionEvent evt)
    {
      int confir = 0, confir1 = 0; 
      String cantidad = null;  
      double g = 0, entero = 0, decimal =0;
      String conv_e = null, conv_e1 = null, cadena1 = null, entero_s = null, s = null, decimal_s = null;
 
      try
      {       
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar el Sistema Decimal?","Confirmación",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
            {
            
                
             do{
                      try {
                          
                          cantidad = null;
                          confir = 0; confir1 = 0;
                          do{
                              cantidad = JOptionPane.showInputDialog(null,"Digite la cantidad que desea convertir : "," Requerimientos de Datos",JOptionPane.QUESTION_MESSAGE);
                          }while(cantidad.length() == 0);
                      }catch(Exception p){}
                      
                      char[] cadena = cantidad.toCharArray();
                      
                      for( int i=0; i <= (cantidad.length() - 1); i++ ) {
                          if((cadena[i] == '.' ||cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9')) {
                              confir = confir + 1;
                          }
                          
                          System.out.println("Caracter[ "+i+" ]="+cadena[i]);
                      }
                      
                      for( int i=0; i <= (cantidad.length() - 1); i++ ) 
                      {
                          if(cadena[i] == '.')
                          confir1 += 1;    
                      }
                      
                      
                  }while(confir != cantidad.length() || confir1 != 1 || cantidad == "");         
                      
                 char[] character = cantidad.toCharArray();
                  if(character[cantidad.length() - 1] == '.')
                          cantidad = cantidad.concat("00");
                          System.out.println("Cantidad atras"+cantidad);
                  if(character[0] == '.') 
                          cantidad = "0".concat(cantidad);
                          System.out.println("Cantidad adelante"+cantidad);
                          
                          
                 cadena1 = cantidad;
                 g = Double.parseDouble(cantidad);
                 char[] caracter = cadena1.toCharArray();
                 
                 for(int y = 0; y <= (cadena1.length() - 1);y++) {
                     if(caracter[y] == '.') {
                         entero_s = cadena1.substring(0,y);
                         decimal_s = cadena1.substring((y + 1),cadena1.length());
                     }
                     
                     else {
                         System.out.println("Que la onda ....");
                     }
                     
                 }
                 g = g*100;  g = Math.floor(g); g  = g/100;
                            
                 entero = Math.floor(g);
                 conv_e1 = String.valueOf(entero);
                 
                 decimal = Double.parseDouble(decimal_s);
                 decimal /= 100;
                
                 conv = DecimalBinario(decimal);
                 conv_e = ConvertirNumero(10,entero_s,2);
                 
                 l_f_resp.setText("Fraccionario Binario: "+conv_e+conv);
                           
                // Utilidades.DialogBurla("Error de Lectura de Datos.","Confirmación de Datos.","help.gif","close.wav");                       
            rb_fd.setEnabled(false);  rb_fo.setEnabled(false); rb_fh.setEnabled(false);
            }  
           else
             {
               rb_fd.setEnabled(true);  rb_fo.setEnabled(true); rb_fh.setEnabled(true);
             }
     }catch(Exception pp){rb_fd.setEnabled(true);  rb_fo.setEnabled(true); rb_fh.setEnabled(true);}    
    }
    
}      


class FOctal implements ActionListener{
    public void actionPerformed(ActionEvent evt)
    {
      int confir = 0, confir1 = 0; 
      String cantidad = null;  
      double g = 0, entero = 0, decimal =0;
      String conv_e = null, conv_e1 = null, cadena1 = null, entero_s = null, s = null, decimal_s = null;
 
      try
      {       
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar el Sistema Octal?","Confirmación",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
            {
            
                
             do{
                      try {
                          
                          cantidad = null;
                          confir = 0; confir1 = 0;
                          do{
                              cantidad = JOptionPane.showInputDialog(null,"Digite la cantidad que desea convertir : "," Requerimientos de Datos",JOptionPane.QUESTION_MESSAGE);
                          }while(cantidad.length() == 0);
                      }catch(Exception p){}
                      
                      char[] cadena = cantidad.toCharArray();
                      
                      for( int i=0; i <= (cantidad.length() - 1); i++ ) {
                          if(cadena[i] == '.' ||cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' ) {
                                    confir = confir + 1;
                                }
                          
                          System.out.println("Caracter[ "+i+" ]="+cadena[i]);
                      }
                      
                      for( int i=0; i <= (cantidad.length() - 1); i++ ) 
                      {
                          if(cadena[i] == '.')
                          confir1 += 1;    
                      }
                      
                      
                  }while(confir != cantidad.length() || confir1 != 1 || cantidad == "");         
                      
                 char[] character = cantidad.toCharArray();
                  if(character[cantidad.length() - 1] == '.')
                          cantidad = cantidad.concat("00");
                          System.out.println("Cantidad atras"+cantidad);
                  if(character[0] == '.') 
                          cantidad = "0".concat(cantidad);
                          System.out.println("Cantidad adelante"+cantidad);
                          
                          
                 cadena1 = cantidad;
                 g = Double.parseDouble(cantidad);
                 char[] caracter = cadena1.toCharArray();
                 
                 for(int y = 0; y <= (cadena1.length() - 1);y++) {
                     if(caracter[y] == '.') {
                         entero_s = cadena1.substring(0,y);
                         decimal_s = cadena1.substring((y + 1),cadena1.length());
                     }
                     
                     else {
                         System.out.println("Que la onda ....");
                     }
                     
                 }
                 
                 entero_s = ConvertirNumero(8,entero_s,10);
                 decimal_s = ConvertirNumero(8,decimal_s,10);
                 
                 g = g*100;  g = Math.floor(g); g  = g/100;
                            
                 entero = Math.floor(g);
                 conv_e1 = String.valueOf(entero);
                 
                 decimal = Double.parseDouble(decimal_s);
                 decimal /= 100;
                
                 conv = DecimalBinario(decimal);
                 conv_e = ConvertirNumero(10,entero_s,2);
                 
                 l_f_resp.setText("Fraccionario Binario: "+conv_e+conv);
                           
                // Utilidades.DialogBurla("Error de Lectura de Datos.","Confirmación de Datos.","help.gif","close.wav");                       
            rb_fd.setEnabled(false);  rb_fo.setEnabled(false); rb_fh.setEnabled(false);
            }  
           else
             {
               rb_fd.setEnabled(true);  rb_fo.setEnabled(true); rb_fh.setEnabled(true);
             }
     }catch(Exception pp){rb_fd.setEnabled(true);  rb_fo.setEnabled(true); rb_fh.setEnabled(true);}    
    }
    
} 

class FHexadecimal implements ActionListener{
    public void actionPerformed(ActionEvent evt)
    {
      int confir = 0, confir1 = 0; 
      String cantidad = null;  
      double g = 0, entero = 0, decimal =0;
      String conv_e = null, conv_e1 = null, cadena1 = null, entero_s = null, s = null, decimal_s = null;
 
      try
      {       
        int result = JOptionPane.showConfirmDialog((Component) null, "¿Está seguro de seleccionar el Sistema Hexadecimal?","Confirmación",JOptionPane.YES_NO_OPTION);
	    if(result == JOptionPane.YES_OPTION)
            {
            
                
             do{
                      try {
                          
                          cantidad = null;
                          confir = 0; confir1 = 0;
                          do{
                              cantidad = JOptionPane.showInputDialog(null,"Digite la cantidad que desea convertir : "," Requerimientos de Datos",JOptionPane.QUESTION_MESSAGE);
                          }while(cantidad.length() == 0);
                      }catch(Exception p){}
                      
                      char[] cadena = cantidad.toCharArray();
                      
                      for( int i=0; i <= (cantidad.length() - 1); i++ ) {
                          if((cadena[i] == '.' ||cadena[i] == '0' || cadena[i] == '1' || cadena[i] == '2' || cadena[i] == '3' || cadena[i] == '4' || cadena[i] == '5' || cadena[i] == '6' || cadena[i] == '7' || cadena[i] == '8' || cadena[i] == '9' || cadena[i] == 'A' || cadena[i] == 'B' || cadena[i] == 'C' || cadena[i] == 'D' || cadena[i] == 'E' || cadena[i] == 'F'|| cadena[i] == 'a' || cadena[i] == 'b' || cadena[i] == 'c' || cadena[i] == 'd' || cadena[i] == 'e' || cadena[i] == 'f')) 
                               confir = confir + 1;
                          
                          System.out.println("Caracter[ "+i+" ]="+cadena[i]);
                      }
                      
                      for( int i=0; i <= (cantidad.length() - 1); i++ ) 
                      {
                          if(cadena[i] == '.')
                          confir1 += 1;    
                      }
                      
                      
                  }while(confir != cantidad.length() || confir1 != 1 || cantidad == "");         
                      
                 char[] character = cantidad.toCharArray();
                  if(character[cantidad.length() - 1] == '.')
                          cantidad = cantidad.concat("00");
                          System.out.println("Cantidad atras"+cantidad);
                  if(character[0] == '.') 
                          cantidad = "0".concat(cantidad);
                          System.out.println("Cantidad adelante"+cantidad);
                          
                          
                 cadena1 = cantidad;
                 //g = Double.parseDouble(cantidad);
                 char[] caracter = cadena1.toCharArray();
                 
                 for(int y = 0; y <= (cadena1.length() - 1);y++) {
                     if(caracter[y] == '.') {
                         entero_s = cadena1.substring(0,y);
                         decimal_s = cadena1.substring((y + 1),cadena1.length());
                     }
                     
                     else {
                         System.out.println("Que la onda ....");
                     }
                     
                 }
                 
                 entero_s = ConvertirNumero(16,entero_s,10);
                 decimal_s = ConvertirNumero(16,decimal_s,10);
                 
                 //g = g*100;  g = Math.floor(g); g  = g/100;
                            
                 entero = Double.parseDouble(entero_s);
                 conv_e1 = String.valueOf(entero);
                 
                 decimal = Double.parseDouble(decimal_s);
                 decimal /= 100;
                
                 conv = DecimalBinario(decimal);
                 conv_e = ConvertirNumero(10,entero_s,2);
                 
                 l_f_resp.setText("Fraccionario Binario: "+conv_e+conv);
                           
                // Utilidades.DialogBurla("Error de Lectura de Datos.","Confirmación de Datos.","help.gif","close.wav");                       
            rb_fd.setEnabled(false);  rb_fo.setEnabled(false); rb_fh.setEnabled(false);
            }  
           else
             {
               rb_fd.setEnabled(true);  rb_fo.setEnabled(true); rb_fh.setEnabled(true);
             }
     }catch(Exception pp){rb_fd.setEnabled(true);  rb_fo.setEnabled(true); rb_fh.setEnabled(true);}    
    }
    
} 
    private void rb_sh2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_sh2MousePressed
        rb_sh2.setSelected(true); rb_sd2.setSelected(false);
        rb_so2.setSelected(false); rb_sb2.setSelected(false);
        rb_sh2.setForeground(new java.awt.Color(102,153,0));
        
        rb_sd2.setForeground(new java.awt.Color(0,0,0));
        rb_so2.setForeground(new java.awt.Color(0,0,0));
        rb_sb2.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_sh2MousePressed

    private void rb_so2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_so2MousePressed
        rb_so2.setSelected(true); rb_sd2.setSelected(false);
        rb_sb2.setSelected(false); rb_sh2.setSelected(false);
        rb_so2.setForeground(new java.awt.Color(102,153,0));
        
        rb_sd2.setForeground(new java.awt.Color(0,0,0));
        rb_sh2.setForeground(new java.awt.Color(0,0,0));
        rb_sb2.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_so2MousePressed

    private void rb_sb2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_sb2MousePressed
        rb_sb2.setSelected(true); rb_sd2.setSelected(false);
        rb_so2.setSelected(false); rb_sh2.setSelected(false);
        rb_sb2.setForeground(new java.awt.Color(102,153,0));
        
        rb_sd2.setForeground(new java.awt.Color(0,0,0));
        rb_so2.setForeground(new java.awt.Color(0,0,0));
        rb_sh2.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_sb2MousePressed

    private void rb_sd2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_sd2MousePressed
        rb_sd2.setSelected(true); rb_sb2.setSelected(false);
        rb_so2.setSelected(false); rb_sh2.setSelected(false);
        rb_sd2.setForeground(new java.awt.Color(102,153,0));
        
        rb_sh2.setForeground(new java.awt.Color(0,0,0));
        rb_so2.setForeground(new java.awt.Color(0,0,0));
        rb_sb2.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_sd2MousePressed

    private void rb_sb1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_sb1MousePressed

        rb_sb1.setSelected(true); rb_sd1.setSelected(false);
        rb_so1.setSelected(false); rb_sh1.setSelected(false);
        rb_sb1.setForeground(new java.awt.Color(102,153,0));
        
        rb_sd1.setForeground(new java.awt.Color(0,0,0));
        rb_so1.setForeground(new java.awt.Color(0,0,0));
        rb_sh1.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_sb1MousePressed

    private void rb_sh1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_sh1MousePressed
        rb_sh1.setSelected(true); rb_sd1.setSelected(false);
        rb_so1.setSelected(false); rb_sb1.setSelected(false);
        rb_sh1.setForeground(new java.awt.Color(102,153,0));
        
        rb_sd1.setForeground(new java.awt.Color(0,0,0));
        rb_so1.setForeground(new java.awt.Color(0,0,0));
        rb_sb1.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_sh1MousePressed

    private void rb_so1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_so1MousePressed
        rb_so1.setSelected(true); rb_sd1.setSelected(false);
        rb_sb1.setSelected(false); rb_sh1.setSelected(false);
        rb_so1.setForeground(new java.awt.Color(102,153,0));
        
        rb_sd1.setForeground(new java.awt.Color(0,0,0));
        rb_sh1.setForeground(new java.awt.Color(0,0,0));
        rb_sb1.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_so1MousePressed

    private void rb_sd1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_sd1MousePressed
// TODO add your handling code here:
        
        rb_sd1.setSelected(true); rb_sb1.setSelected(false);
        rb_so1.setSelected(false); rb_sh1.setSelected(false);
        rb_sd1.setForeground(new java.awt.Color(102,153,0));
        
        rb_sh1.setForeground(new java.awt.Color(0,0,0));
        rb_so1.setForeground(new java.awt.Color(0,0,0));
        rb_sb1.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_rb_sd1MousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel Tab1;
    private javax.swing.JPanel Tab2;
    private javax.swing.JPanel Tab3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel l_absoluto;
    private javax.swing.JLabel l_calculaerror;
    private javax.swing.JLabel l_calcular;
    private javax.swing.JLabel l_convertir;
    private javax.swing.JLabel l_f_resp;
    private javax.swing.JLabel l_flecha;
    private javax.swing.JLabel l_relativo;
    private javax.swing.JLabel l_resp;
    private javax.swing.JLabel l_respuesta;
    private javax.swing.JLabel l_rest;
    private javax.swing.JLabel l_restab;
    private javax.swing.JLabel l_restab1;
    private javax.swing.JLabel l_resterror;
    private javax.swing.JRadioButton rb_fd;
    private javax.swing.JRadioButton rb_fh;
    private javax.swing.JRadioButton rb_fo;
    private javax.swing.JRadioButton rb_sb1;
    private javax.swing.JRadioButton rb_sb2;
    private javax.swing.JRadioButton rb_sd1;
    private javax.swing.JRadioButton rb_sd2;
    private javax.swing.JRadioButton rb_sh1;
    private javax.swing.JRadioButton rb_sh2;
    private javax.swing.JRadioButton rb_so1;
    private javax.swing.JRadioButton rb_so2;
    private javax.swing.JTextField t_apro;
    private javax.swing.JTextField t_convertir;
    private javax.swing.JTextField t_real;
    // End of variables declaration//GEN-END:variables
    
}
