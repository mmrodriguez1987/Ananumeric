

package Ananumeric;
import edu.hws.jcm.data.*;
import edu.hws.jcm.awt.*;
import edu.hws.jcm.functions.*;
import java.io.File;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Utilidades
{
  public static String f = null, d = null, xx = null;
  public static double yy = 0, yd = 0;
  public static Expression de;
  
	 public static Expression Derivar(String FuncionString)
  {
  	Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression Derivada;
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
    Derivada = FunctionInput.getExpression().derivative(xVar);
    
    return Derivada;
  }
  
  public static double EvaluarFuncion(String FuncionString, String x)
  {
  	double y = 0;
  	
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
    
    Double d = new Double(x);
    xInput.setVal( d.doubleValue() );
 
    Function f = new SimpleFunction( F , xVar );
    Value yValue = new ValueMath(f,xInput);  
    y = yValue.getVal();
    return y;
  }
  public static double EvaluarDerivada(String FuncionString, String x)
  {
  	double y = 0;
  	
  	VariableInput xInput;
  	xInput = new VariableInput();
    Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression D;
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
    D = FunctionInput.getExpression().derivative(xVar);
    
    Double d = new Double(x);
    xInput.setVal( d.doubleValue() );
 
    Function f = new SimpleFunction( D , xVar );
    Value yValue = new ValueMath(f,xInput);  
    y = yValue.getVal();
    return y;
  }
  
  public static double EvaluarSegundaDerivada(String FuncionString, String x)
  {
  	double y = 0;
  	
  	VariableInput xInput;
  	xInput = new VariableInput();
        Parser parser;
  	Variable xVar;
  	ExpressionInput FunctionInput;
  	Expression D;
  	Expression D2;
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
    D = FunctionInput.getExpression().derivative(xVar);
    D2 = D.derivative(xVar);
    
    Double d = new Double(x);
    xInput.setVal( d.doubleValue() );
 
    Function f = new SimpleFunction( D2 , xVar );
    Value yValue = new ValueMath(f,xInput);  
    y = yValue.getVal();
    return y;
  }
  
  public static double MSecante(String F,String x2,String x1)
  {
  	double xd = 0, xl = 0, yd = 0, yl = 0, resp = 0;
  	
  	xd = Double.parseDouble(x2);
  	xl = Double.parseDouble(x1);
  	
  	yd = EvaluarFuncion(F,x2);
  	yl = EvaluarFuncion(F,x1);
  	
  	resp = xd - (((xd - xl)*(yd))/(yd -yl));
  	return resp;
  }
   
  public static double NewtonRaphsonM(String F,String m)
  {
  	double r = 0, x = 0, y = 0, yy = 0, yyy = 0;
  	
  	x = Double.parseDouble(m);
  	y = EvaluarFuncion(F,m);
    yy = EvaluarDerivada(F,m);
    yyy = EvaluarSegundaDerivada(F,m);
    
    r = x - (((y)*(yy))/(Math.pow(yy,2) - y*yyy));
    
    return r;
  }
  
  public static double NewtonRaphson(String F,String m)
  {
  	double r = 0, x = 0, y = 0, yy = 0;  
  	String f = null;
  	
  	x = Double.parseDouble(m);
  	y = EvaluarFuncion(F,m);
    yy = EvaluarDerivada(F,m);
    
    r = x - (y/yy);
    
    return r;
  }
  public static double Error(double actual,double posterior)
  {
  	double error = 0;
  	error = Math.abs((((actual - posterior)/actual))*(100));
  	return error;
  }
  
  public static double PuntoMedio(double x,double y)
  {
  	double Xm = 0;
  	Xm = ((x + y)/2);
  	return Xm;
  }
  

  public static boolean ConfIntervalo(String F,String izq,String der)
  {
  	double cota_izq = 0, cota_der = 0;
  	boolean c = false;
  	cota_izq = EvaluarFuncion(F,izq);
  	cota_der = EvaluarFuncion(F,der);
  	
  	if( (cota_izq < 0 && cota_der < 0) || (cota_izq > 0 && cota_der > 0) || (izq == der) )
  	{
  		c = false;
  	}
  	else
  	{
  	    c = true;  	
  	}
  
  	return c;
  }
  
  public static double RuleFalse(String F,String x0,String x1)
  {
  	double xd = 0, xl = 0, yd = 0, yl = 0, resp = 0;
  	
  	xd = Double.parseDouble(x0);
  	xl = Double.parseDouble(x1);
  	
  	yd = EvaluarFuncion(F,x0);
  	yl = EvaluarFuncion(F,x1);
  	
  	resp = xd - (((xd - xl)*(yd))/(yd -yl));
  	return resp;
  }
  
  public static void DialogBurla(String texto,String titulo,String imagen,String sonido)
  {
   
   File sf = new File("C:\\Ananumeric_1\\src\\Ananumeric\\Sonidos\\"+sonido);
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
   JOptionPane.showMessageDialog(null,texto,titulo, JOptionPane.INFORMATION_MESSAGE,new ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\"+imagen));	
   
  }
  
  public static void BoxDialog(String texto,String titulo,String imagen)
  {
    PlaySoundMessage();	
    JOptionPane.showMessageDialog(null,texto,titulo, JOptionPane.INFORMATION_MESSAGE,new ImageIcon("C:\\Ananumeric_1\\src\\Ananumeric\\Imágenes\\"+imagen));	
                      
  }
  
   public static void PlaySoundMessage()
    {
        File sf = new File("C:\\Ananumeric_1\\src\\Ananumeric\\Sonidos\\Intel_Inside.wav");
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
   
  public static void main(String []args)
  {
  	
  	System.out.print("F(x) = ");
  	f = Leer.dato();
    de = Derivar(f); 
    System.out.println(de.toString());
    
    System.out.print("X = ");
    xx = Leer.dato(); 
        
    System.out.println("Y(X) = "+yy);
    System.out.println("Y'(X) = "+yd);	
  }
}
