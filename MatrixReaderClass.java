import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixReaderClass 
{
 
 private String rcrc;
 

 public MatrixReaderClass()
 {
   
 }

 
 public String getBufferedString(StringBuffer pBuffer)
 {
  StringBuffer sb = pBuffer;
  String s = sb.toString();
  
  return s;  
 }
//*****************************************************************************************************// 
 /* This class must return a string that the next class can use a tokenizer on
  * so this method could actuall be a part of the next class that 
  * processes the matrix multiplication*/
 
 public void useTolkenizer(String pString)
 {  
  try
  {
   StringTokenizer st = new StringTokenizer(pString, ",");
   
  while (st.hasMoreElements()) {
   if(st != null )
   {
   Double d = Double.parseDouble(st.nextElement().toString());    
 
   System.out.println(d);
   }
   //parses all the elements into doubles
  }
  
  }
  catch (Exception NumberFormatException)
  {
   
   //System.out.println("format exception");
  }
 }/////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
 //returns the matrix in a string
 @SuppressWarnings("finally")
 public StringBuffer getMatrix()
 {        
        FileInputStream fis = null;
        BufferedReader reader = null;
        StringBuffer sBuffer = new StringBuffer();
             
        try {
            fis = new FileInputStream("C:/Users/matrices.txt");
            reader = new BufferedReader(new InputStreamReader(fis));
            String line = reader.readLine();
            rcrc = line;
            //peels off the first line that is the row column triplet
            
            while(line != null)
            {
               line = reader.readLine();
               sBuffer.append(line);
               sBuffer.append(",");
               //puts a comma at end of row to standardize for the tokenizer            
            }           
          
         }
        catch (FileNotFoundException ex)
         {
            System.out.println("This File was not found");
         }
        catch(IOException ex)
         {
            System.out.println("You encountered an IO issue !!!");
         } 
        finally
         {
            try
             {
                 reader.close();
                 fis.close();
                 
             }
            catch (IOException ex) 
             {
                    System.out.println("You encountered an IO issue on exit !!!");
             }
            
         }
        return sBuffer;
 }
 
/* 
   public static void main(String[] args)
    {
        MatrixReaderClass n1 = new MatrixReaderClass();
        //n1.getString();
        n1.useTolkenizer(n1.getBufferedString(n1.getMatrix()));
       
    }//main
*/
}//class