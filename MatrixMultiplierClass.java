import java.util.StringTokenizer;

public class MatrixMultiplierClass 
{
        int x =8;
        int y =9;
        int z = 10;
        double d = 8, n = 9;
        double a[][]  = new double[x][y];
        double b[][] = new double[y][z];
        double c[][]  = new double[z][z];
        
 public MatrixMultiplierClass()
 {
    MatrixReaderClass mrc = new MatrixReaderClass();
    String buff = mrc.getBufferedString(mrc.getMatrix());
    loadAndMultiply(buff);
 }
 
 
 public void loadAndMultiply(String pString)
 {  
  try
  {
   StringTokenizer st = new StringTokenizer(pString, ",");
   if(st != null )
   {
     /*  Load the first matrix */             
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
               d =Double.parseDouble(st.nextElement().toString());
               a[i][j] = d;
            }//for2
        }//for1

        /* Load the second matrix */
        for ( int i = 0; i < y; i++)
        {
            for (int j = 0; j < z; j++)
            {
              d = Double.parseDouble(st.nextElement().toString());
              b[i][j] =  d;                 
            }//for2
        }//for1

        /* Multiply the matrices */
        for (int i = 0; i < y; i++)
        {
            for ( int j = 0; j < y; j++)
            {
                for (int k = 0; k < y; k++)
                {
                   c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }//inner for
                System.out.print(c[i][j] + " ");                  
            }//middle for
            System.out.println(" ");                              
        }//outer for     

  }//if
  
  }//try
  catch (Exception NumberFormatException)
  {
   // System.out.println("null podoubleer");
  }//catch
 }// ends method/////////////////////////////

 public static void main(String[] args)
 {
  
 MatrixMultiplierClass mmc = new MatrixMultiplierClass();
 
}//main
 
}//class

