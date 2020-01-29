package Ananumeric;
/*
 * Splash.java
 *
 * Created on 12 de abril de 2007, 12:49 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import javax.sound.sampled.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Splash_1 extends JWindow {
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int width = 519, height = 328; 
    int x = (screen.width - width) / 2;
    int y = (screen.height - height) / 2;

    JWindow splash = new JWindow();
    JPanel content = (JPanel) splash.getContentPane();
    public static JLabel label2 = new JLabel(new ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\3D616.jpg"));

    public static JProgressBar barra = new JProgressBar();
     
    public static Thread hilo = new Thread();
    public static JPanel panel = new JPanel();
    public static JLabel loading = new JLabel();
    public static JLabel javacup = new JLabel(new ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\tasa.gif"));

   	public void Carga(){
            barra.setVisible(true);
            try {
                int min = 0;
                int max = 100;
                int i = min;
                barra.setValue(min);
                barra.setMinimum(min);
                barra.setMaximum(max);
                
                for( i=min; i <= max; i++ ) {
                    barra.setValue( i );
                    try {
                        hilo.sleep(140);
                        if(i >= 0 && i <= 24) {
                            loading.setText("Loading Datas ... "+i+"%");
                        }
                        if(i >= 25 && i <= 49) {
                            loading.setText("Loading Storages ... "+i+"%");
                            javacup.setBounds(55,60,133,200);
                            javacup.setVisible(true);
                        }
                        if(i >= 50 && i <= 73) {
                            loading.setText("Loading Modules ... "+i+"%");
                        }
                        if(i >= 74 && i <= 99) {
                            loading.setText("Loading Components ... "+i+"%");
                        }
                        if(i == 100) {
                            loading.setText("Loading Information Completed!");
                        }
                    } catch(InterruptedException ie){}
                }     
            } catch(Exception mi){}
      }
    public void PlayIntro()
    {
        File sf = new File("C:\\Ananumeric_1\\src\\Ananumeric\\Sonidos\\Mora Limpia.wav");
        AudioFileFormat aff;
        AudioInputStream ais;
       try
       {
       aff = AudioSystem.getAudioFileFormat(sf);
       ais = AudioSystem.getAudioInputStream(sf);
       AudioFormat af = aff.getFormat();				

        DataLine.Info info = new DataLine.Info(
        Clip.class,
        ais.getFormat(),
        ((int) ais.getFrameLength() *
        af.getFrameSize()));

        Clip ol = (Clip) AudioSystem.getLine(info);
        ol.open(ais); ol.loop(0);  		
        }
        catch(Exception ee){}      
    }
	public void showSplash(int Duration) {

		JWindow splash = new JWindow();
		JPanel content = (JPanel) splash.getContentPane();

		int width = 522;
		int height = 307;

		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		splash.setBounds(x, y, width, height);
	   	panel.setLayout(null);
		label2.setBounds(0,0,519,328);
		loading.setBounds(260,280,310,30);
               // javacup.setBounds(60,40,133,200);
		loading.setFont(new java.awt.Font("BankGothic Md BT", 1, 12));
		loading.setForeground(Color.black);
		barra.setBounds(5,290,249,9);
		panel.add(label2);
		content.add(loading);
                content.add(javacup);
		content.add(barra);
		content.add(panel);
		content.setBorder(BorderFactory.createLineBorder(Color.white, 3));
                splash.setVisible(true);
                PlayIntro();
		try {
			Carga();
			Thread.sleep(Duration);
		} catch (Exception e) {
		}
		splash.setVisible(false);
	}
}
