
package Ananumeric;
import java.util.*;
import java.text.*;
public class Matrice {
   double [][] matrice = null; 
    int righe = 0;  
    int colonne = 0; 

   public Matrice(int n) //Constructor de una matriz Cuadrada
    {
	 righe = n; 
	 colonne = n;
	 matrice = new double[n][n];
	 for(int i = 0; i < n; i++)
	 {
	    for(int j = 0; j < n; j++)
        {
		  matrice[i][j] = 0;
	    }
	 }
    }
  	
   public Matrice(int n, int m) //Constructor de una Matriz Rectangular
    {
	   righe = n; 
       colonne = m;
       matrice = new double[n][m];
       
      for(int i = 0; i < n; i++)
       {
	    for(int j = 0; j < m; j++)
    	 {
    	   matrice[i][j] = 0;
    	 }
	   }
    }

    
   public Matrice(double[][] a) //Contructor de una matriz 
    {                           //a partir de un Arreglo Bidimensional
	 righe = a.length;
	 colonne = a[0].length;
	 matrice = a;
    }

   public void Asignar(int i, int j, double v) //Asigna un valor en la posición (i,j)
    {
    	matrice[i][j] = v;
    }

    
   public static Matrice MatrizIdentidad(int n) //Genera la Matriz Identidad
    {
	  Matrice mat = new Matrice(n);
    	for(int i = 0; i < n; i++)
    	{
	      for(int j = 0; j < n; j++)
      	    {
      		mat.Asignar(i, j,(i == j ? 1 : 0));
      	    }
    	}
    	return mat;
    }
  	
 
    public Matrice Suma(Matrice matrice2) //Retorna la suma de matrices
    {
       	int n = this.getFila();
       	int m = this.getCol();
       	Matrice somma = new Matrice(n, m);
       	for(int i = 0; i < n; i++)
       	{
	    for(int j = 0; j < m; j++)
	    {
      		somma.Asignar(i, j, this.getValor(i, j) + matrice2.getValor(i, j));
	    }
	}
	return somma;	
    }
	
   public Matrice Multiplicacion(double alpha) //Multiplica una Matriz por un escalar
    {
       int n = this.getFila();
       int m = this.getCol();
       Matrice molt = new Matrice(n, m);
       
      for(int i = 0; i < n; i++)
	   {
	    for(int j = 0; j < m; j++)
	    {
		  molt.Asignar(i, j, this.getValor(i, j) * alpha);
	    }
	   }
	return molt;	
    }
  	
   public Matrice Producto(Matrice matrice2) //Retorna el producto de Matrices
    {
	    int n = this.getFila();
       	int m = matrice2.getCol();
       	int z = matrice2.getFila();
       	Matrice prodotto = new Matrice(n, m);
      
      for(int i = 0; i < n; i++)
	    {
	     for(int j = 0; j < m; j++)
	     {
		   double p = 0;
		   for(int k = 0; k < z; k++)
		    {
		    p = p + ((this.getValor(i, k)) * (matrice2.getValor(k, j)));
		    }	
		   prodotto.Asignar(i, j, p);
	     }
	  }
	return prodotto;	
    }
	
    public void CambiarFila(int i, int k) //Cambia la fila i por la fila k
    {
	    int m = this.getCol();
       	double[] riga1 = new double[m];
       
       for(int j = 0; j < m; j++)
	   {
	     riga1[j] = matrice[i][j];
	     matrice[i][j] = matrice[k][j];
	     matrice[k][j] = riga1[j];
	   }
    }
	
    
   public Matrice Gauss() //Retorna la Matriz, después de la Eliminación Gaussiana
    {
	    Matrice ma = this.Copia();
       	int n = ma.getFila();
       	int m = ma.getCol();
       	boolean ind = true;
       	int k = 0;
       	
      while(ind && (k < n - 1))
	   {
	     double pivot = ma.getValor(k, k);
	     ind = (pivot != 0);
	    if(ind)
	     {
		   for(int i = k + 1; i < n; i++)
		    {
		       double mp = (ma.getValor(i, k)) / pivot;
		       for(int z = k; z < m; z++)
		        {
			      ma.Asignar(i, z, ma.getValor(i, z) - (mp * ma.getValor(k, z)));
		        }
		    }
	     }
	    k = k + 1;	
	  }
	return ma;
    }
		
   public Matrice GaussPivoteo() //Retorna la matriz triangular con la técnica del
    {                           //del Pivoteo Parcial
       	Matrice ma = this.Copia();
       	int n = ma.getFila();
       	int m = ma.getCol();
       	boolean ind = true;
       	int k = 0;
       	
      while(ind && (k < n - 1))
       	{
	      double pivot = ma.getValor(k, k);
	      
       	  for(int i = k + 1; i < n; i++)
	       {
		    if(Math.abs(ma.getValor(i, k)) > Math.abs(pivot))
		     {
		         pivot = ma.getValor(i, k);
		         ma.CambiarFila(i, k);
	         }
	       }
	         
	    ind = (pivot != 0);
	    
	     if(ind)
	      {
		    for(int i = k + 1; i < n; i++)
		     {
		      double mp = (ma.getValor(i, k)) / pivot;
		    
		       for(int z = k; z < m; z++)
		        {
		      	   ma.Asignar(i, z, ma.getValor(i, z) - (mp * ma.getValor(k, z)));
		        }
		     }
	      }
	    k = k + 1;	
	  }
	 return ma;
    }

public  Matrice SustitucionInversa() 
 {
        int j, k, n;
        double t; 				
        Matrice m = this.Copia();
        n = m.getFila();
        
        for (j = n - 1; j >= 0; j--) 
        {
            t= 0.0;
            for (k = j + 1; k < n; k++)    
                t += m.getValor(j,k)* m.getValor(k,n);
                
            m.Asignar(j, n,(m.getValor(j, n) -t)/m.getValor(j,j));
        }
     return m;   
   }   
    /**Calcola la soluzione della matrice applicata al vettore b utilizzando l'algoritmo di Gauss
       @param pivot se true viene utilizzata la tecnica del pivot col metodo di Gauss
       @param b il vettore contenente i valori di b
       @return il vettore soluzione
    */
   public double[] Solucion(double[] b, boolean pivot)
    {
       	
	  int n = this.getFila();
      int m = this.getCol();
	  Matrice ma = new Matrice(n, m + 1);
	  
	for(int i = 0; i < n; i++)
	  {
	    for(int j = 0; j < m; j++)
	     {
		   ma.Asignar(i, j, this.getValor(i, j));
	     }
	    ma.Asignar(i, m, b[i]);
	  }
     return ma.SolucionCompleta(pivot);
    }

    /**Calcola la soluzione della matrice (si applica su matrice completa)
       utilizzando l'algoritmo di Gauss
       @param pivot se true viene utilizzata la tecnica del pivot col metodo di Gauss
       @return il vettore soluzione
    */
    public double[] SolucionCompleta(boolean pivot)
    {
       	int n = this.getFila();
       	int m = this.getCol();
       	double[] s = new double[n];
       	Matrice ma = (pivot ? this.GaussPivoteo() : this.Gauss());
       	s[n - 1] = ma.getValor(n - 1, m - 1) / ma.getValor(n - 1, m - 2);
       	
      for(int i = n - 2; i >= 0; i--)
       {
	     for(int j = i + 1; j < n; j++)
	      {
		    ma.Asignar(i, m - 1, ma.getValor(i, m - 1) - (ma.getValor(i, j) * s[j]));
	      }
	    s[i] = ma.getValor(i, m - 1) / ma.getValor(i, i);	
	   } 
     return s;
    }

    
   public Matrice Inversa() //Calcula la Inversa de una Matriz
    {
       	int n = this.getFila();
       	Matrice inv = new Matrice(n);
       	Matrice ma = new Matrice(n, 2 * n);
       	
      for(int i = 0; i < n; i++)
	   {
	    for(int j = 0; j < n; j++)
	     {
		   ma.Asignar(i, j, this.getValor(i, j));
	     }
	   }
	   
	  for(int i = 0; i < n; i++)
	   {
	    for(int j = n; j < (2 * n); j++)
	     {
		    ma.Asignar(i, j, (n == (j - i) ? 1 : 0));
	     }
	   }
	   
	 Matrice m1 = ma.Gauss();
	 
	 for(int k = n; k < 2 * n; k++)
	  {
	    Matrice mr = new Matrice(n, n + 1);
	    
	    for(int i = 0; i < n; i++)
	     {
		   for(int j = 0; j < n; j++)
		    {
		       mr.Asignar(i, j, m1.getValor(i, j));
		    }
	       mr.Asignar(i, n, m1.getValor(i, k));
	     }
	     
	    double[] s = mr.SolucionCompleta(false);
	    
	    for(int i = 0; i < n; i++)
	     { 
		    inv.Asignar(i, k - n, s[i]);
	     }

	  }
	 return inv;
    }
	
   
   public double NormaUno() //Retorna el número que representa la Norma Uno de la Matriz
    {                        
	  double uno = 0;
	  int n = this.getFila();
	  int m = this.getCol();
	  
	 for(int j = 0; j < m; j++)
	  {
	    double s = 0;
	    
	    for(int i = 0; i < n; i++)
	     {
		    s = s + Math.abs(this.getValor(i, j));	
	     }
	    uno = (s > uno ? s : uno);
	  }
	 return uno;
    }
	
    	
   public double NormaInfinito() //Retorna el número que representa la Norma Infinito de la Matriz
    {
	    double infinito = 0;
       	int n = this.getFila();
       	int m = this.getCol();
       	
      for(int i = 0; i < n; i++)
	   {
	    double s = 0;
	    
	    for(int j = 0; j < m; j++)
	     {
		   s = s + Math.abs(this.getValor(i, j));	
	     }
	    infinito = (s > infinito ? s : infinito);
	   }
	 return infinito;
    }
	
   public double Condicion() //Retorna el número de condicionamiento
    {								//Norma Infinito
       	double c;
       	double a = this.NormaInfinito();
       	double b = (this.Inversa()).NormaInfinito();
       	c = a * b;
       	return c;
    }
	
   public double Determinante() //Retorna el Determinante de la Matriz
    {
       	int n = this.getFila();
       	Matrice mat1 = this.Gauss();
       	double det = 1;
       	
       for(int i = 0; i < n; i++)
	    {
	      det = det * mat1.getValor(i, i);	
	    }
	  return det;
    }
	
   public Matrice Jacobi()  //Retorna la Matriz, después de las Iteraciones
    {						//hechas a través del Método de Jacobi	
       	int n = this.getFila();
       	Matrice jac = new Matrice(n);
       	Matrice b = new Matrice(n);
       	Matrice c = new Matrice(n);
       	Matrice d = new Matrice(n);
       	
     for(int i = 0; i < n; i++)
	  {
	    for(int j = 0; j < n; j++)
	     {
	       b.Asignar(i, j, (i > j ? ((-1) * this.getValor(i, j)): 0));
	       c.Asignar(i, j, (i < j ? ((-1) * this.getValor(i, j)): 0));
	       d.Asignar(i, j, (i == j ? (this.getValor(i, j)): 0));
	     }
	  }
	 jac = d.Inversa().Producto(b.Suma(c));
	 return jac;
    }
	
   public Matrice GaussSeidel() //Retorna la Matriz, después de las Iteraciones
    {							//hechas a través del Método de Gauss-Seidel
       	int n = this.getFila();
       	Matrice gs = new Matrice(n);
       	Matrice b = new Matrice(n);
       	Matrice c = new Matrice(n);
       	Matrice d = new Matrice(n);
       	
	 for(int i = 0; i < n; i++)
	  {
	    for(int j = 0; j < n; j++)
	     {
		   b.Asignar(i, j, (i > j ? ((-1) * this.getValor(i, j)): 0));
		   c.Asignar(i, j, (i < j ? ((-1) * this.getValor(i, j)): 0));
		   d.Asignar(i, j, (i == j ? (this.getValor(i, j)): 0));
	     }
	  }
	 gs = (d.Suma(b.Multiplicacion(-1)).Inversa()).Producto(c);
	 return gs;
    }

   public double[][] getCopiaMatrice() //Copia a un arreglo los elemntos de una Matriz
    {
	   int n = this.getFila();
	   int m = this.getCol();
	   double[][] cm = new double[n][m];
	   
     for(int i = 0; i < n; i++)
	  {
	    for(int j = 0; j < m; j++)
	     {
		   cm[i][j] = this.getValor(i, j);
	     }
	  }
	 return cm;
    }
		
   public Matrice Copia() //Copia una Matriz a otra Matriz
    {
	  Matrice ma = new Matrice(this.getCopiaMatrice());
	  return ma;
    }	
					
   public double getValor(int i, int j) //Obtiene el valor en la posición (i,j)
    {
       	return this.matrice[i][j];
    }
				
   public int getFila() //Retorna el número de filas de la Matriz
    { 
       	return this.righe;
    }
  	
    	
   public int getCol() //Retorna el número de columnas de la Matriz
    { 
	 return this.colonne;
    }
  	
    /**Stampa della matrice a video formattando i valori a 5 cifre decimali*/
   public void FormatNumber()
    {
       NumberFormat formatter = NumberFormat.getNumberInstance();
	   formatter.setMaximumFractionDigits(5);
  	   formatter.setMinimumFractionDigits(5);
       System.out.println("--------------------------------------------");
       
     for(int i=0;i<righe;i++)
      {
	    for(int j=0;j<colonne;j++)
      	 {
		   System.out.print("[" + formatter.format(matrice[i][j]) + "] ");
	     }
       System.out.println("");
      }
     System.out.println("--------------------------------------------");
    }
  
   public String getValorString(int i, int j) //Retorna un String del elemento
    {											//ubicado en la posición (i,j)
	  NumberFormat formatter = NumberFormat.getNumberInstance();
	  formatter.setMaximumFractionDigits(5);
	  formatter.setMinimumFractionDigits(5);
	 return formatter.format(matrice[i][j]);
    }
    
    public void Print() 
     { int f,c;
       f = this.getFila();
       c = this.getCol();
       
            for(int i = 0; i < f; i++) {
                for(int j=0; j < c; j++)
                System.out.print(this.getValorString(i,j) + " ");
                System.out.println();
            }
            System.out.println();
     }
     
   public void Print(int f) 
     { int c;
       c = this.getCol();
       
            for(int i = 0; i < f; i++) {
                for(int j=0; j < c; j++)
                System.out.print(this.getValorString(i,j) + " ");
                System.out.println();
            }
            System.out.println();
     }
       
   public void AsignarCero()
    {
      int n = this.getCol();
      int beta = 0;
      
    	for(int i = 0; i < n; i++)
    	 {
    	   beta = (i == n-1 ? 1:0);
    	   this.Asignar(0,i,beta);	
    	 }    	 
    }
    
   public  Matrice AlmacenarCoeficientes()
    {
    	double alpha = 0;
    	int col = this.getCol();
    	Matrice Coe = new Matrice(col - 1,col); 
    	
    	for(int k = 0; k < (col - 1); k ++)
    	 {
    	 	for(int i = 0; i < col; i++)
    	     {
    	 	   if(i != k)
    	 	    {
    	 	 	 alpha = (i == (col - 1) ? 1 : (-1));
    	 	 	 Coe.Asignar(k,i,alpha*(this.getValor(k,i)/this.getValor(k,k)));
    	 	    }
    	 	   else
    	 	    {
    	 	  	 Coe.Asignar(k,i,0);
    	 	    }
    	     } 	  
        }
     return Coe;	 
    } 
    
    public static int Potencia(int c, int n)
     {
     	int r = c;
     	
     	for(int i = 1; i < n; i++)
     	 r *= c;
     	 
     	return r; 
     }
     
    public static double Error(double actual,double posterior)
     {
  	  double error = 0;
      error = Math.abs((((actual - posterior)/actual))*(100));
  	  return error;
     } 
     
     public static int ErrorVar(Matrice w, int u)
      {
      	int counter = 0;
      	int col = w.getCol();
      	
      	for(int k = 0; k < col; k++)
      	 {
      	 	if(Error(w.getValor(u,k),w.getValor(u - 1,k)) > 1 )
      	 	 counter += 1;
      	 }
      	return counter;
      }
     
     public static double ValorX(Matrice p ,Matrice x , int f,int fx)
      {
        	int col = p.getCol();
    
        	double prod = 0;
        	
        	for(int j = 0; j < col; j++)
        	 {
        	 	prod += p.getValor(f,j)*x.getValor(fx,j);
        	 }
        return prod;	
      } 
    
     public  double[] Jacobi(double[][] matriz,double[] b, double[] x)
    {
        double[] temp = new double[x.length];
        double normr = 1, error = 1;
        int it=0;
        int dimension = this.getFila();
        
        while((it++ < 5))
        {
            for(int i=0; i<dimension;i++)
            {double c = b[i];
              for(int j =0; j < dimension;j++)
              { c = c - matriz[i][j]*x[j]; }   
               temp[i]= x[i] + c/matriz[i][i]; }
               for(int i=0;i<dimension;i++)
               {x[i] = temp[i];}
         }             
      return x;   
    } 
     
     public double[] GaussSeidel(double[][] matriz, double[] b, double[] x) {
      
        double normr = 1, error = 1;
        int it=0;
        int dimension = this.getFila();
        
        while((it++ < 5))
        {
            for(int i=0; i<dimension;i++)
            {double c = b[i];
              for(int j =0; j < dimension;j++)
              { c = c - matriz[i][j]*x[j];}   
               x[i] = x[i] + c/matriz[i][i];                           
            }
        }
       return x;     
    }
    public static void Imprimir(double[] n, int s)
     {
     	for(int i = 0; i < s;i++)
     	System.out.println("X0 [ "+i+" ] = "+n[i]);
     } 
     
}
