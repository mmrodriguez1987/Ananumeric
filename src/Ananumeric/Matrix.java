
package Ananumeric;
public class Matrix {
    
  private double[][] data;	    // Referencia a la matriz
    
    
    public Matrix(int m, int n) // Constructor para la matriz
    {
        data = new double[m][n];
    }
    
    public Matrix() // Constructor predeterminado
    {		    
        data = new double[1][1];
    }
    
    
    public void setIdentity() // Método para definir la identidad de Matrix
    {
        int i,j;
        int nrows = data.length;
        int ncols = data[0].length;
        for(i=0; i<nrows; i++)
            for(j=0; j<ncols; j++)
                if(i == j)
                    data[i][j]= 1.0;
                else
                    data[i][j]= 0.0;
    }
    
    public int getNumRows() // Devuelve el número de filas de Matrix
    {  
        return data.length;
    }
    
    public int getNumCols() // Devuelve el número de columnas de Matrix
    {  
        return data[0].length; 
    }
     
    public double getElement(int i, int j)  //Obtiene el elemento i,j
     {
            return data[i][j];
     }
     
    public void setElement(int i, int j, double val)
     {
            data[i][j] = val;
     }
        
     public Matrix addMatrices(Matrix b) 
     {
            Matrix result = null;
            int nrows = data.length;
            int ncols = data[0].length;
            int i,j;
            if (nrows==b.data.length && ncols==b.data[0].length) {
                result = new Matrix(nrows, ncols);
                for(i=0; i<nrows; i++)
                    for(j=0; j<ncols; j++)
                        result.data[i][j]= data[i][j]+ b.data[i][j];
            }
            return result;
     }
        
     public Matrix multMatrices(Matrix b) 
     {
            Matrix result = null;
            int nrows = data.length;
            int p = data[0].length;
            int i,j,k;
            if(p == b.data.length) {
                result = new Matrix(nrows, b.data[0].length);
                for(i=0; i<nrows; i++)
                    for(j=0; j<result.data[0].length; j++) {
                        double t = 0.0;
                        for(k=0; k<p; k++) {
                            t += data[i][k] * b.data[k][j];   }
                        result.data[i][j]= t;
                    }
            }
            return result;
     }
        
     public void print() 
     {
            for(int i=0; i< data.length; i++) {
                for(int j=0; j< data[0].length; j++)
                    System.out.print(data[i][j] + " ");
                System.out.println();
            }
            System.out.println();
     }  
     
     public boolean ValidarMatrix()
     {
      int f = this.getNumRows();
      int c = this.getNumCols();
      boolean conf = false;
      int count = 0;
      
       for( int i = 0 ; i < f ; i++ ) 
 	{
         for( int j = 0 ; j < c; j++)
          {
            if(this.getElement(i,j) == 0)
             count += 1;
          }  
       }
        if(count == f*c)
            conf = true;
     return conf;               
     }
     
}    
