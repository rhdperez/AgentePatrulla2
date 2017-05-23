package pruebaMatriz;
import java.io.*;

//*****************************para leer el archivo
public class Leertxt {
	
	public void leertxt (String nombreArchivo)
	{
		try 
		{
			File archivo = new File(nombreArchivo);
		    FileReader fr  = new FileReader (archivo);
		    BufferedReader br = new BufferedReader (fr);
		    
	        if(!archivo.exists()){
	           System.out.println("No existe el archivo");
	        }
	        else
	        {
	        	
	            String linea =  br.readLine();
	            
	            int matriz [][] = new int[10][10];
	            int i=0;
	            while(linea != null){
	                
	            	for (int x=0; x < matriz.length; x++)
	            	{
	    			  for (int y=0; y < linea.length(); y++){
	    				  	matriz[x][y] = linea.charAt(i++);
	    				  	}
	    			  linea = br.readLine();
	                }
	            }
	            if (linea == null)
	            {
	            	System.out.println("cierra el archivo 1");
	            	fr.close();
	            }
	            	else
	            	{
	            		System.out.println("cierra el archivo 2");
	            		fr.close();
	            	}
	         }
	    } 
		catch (Exception e) 
	    {
	        e.printStackTrace();
	    }
	}
}



	
