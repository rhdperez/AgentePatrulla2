package pruebaMatriz;

import java.io.*;

public class leerDestinos {
	
	public static String [][]getMatriz(String ruta){
	
//	public static void main(String[] args) {
			File archivo=null;
			FileReader fr=null;
			BufferedReader br=null;
			String matriz[][]= new String[173][173];
	try {
		archivo = new File (ruta);
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);
	
		String linea;
		String delimiter = "," ;
		
		
			int h=0;
			String a[]=new String[6];
			while(((linea=br.readLine())!=null)&& (h<173)) {
			a=linea.split(delimiter);
			for(int j=0;j<a.length;j++)
			{
			matriz[h][j]=a[j];
				}
			h++;
			}
			fr.close();
			
			//System.out.print ("MATRIZ\n\n");
			for (int j= 0; j <matriz.length; j++) {
				for(int o= 0; o <matriz[j].length; o++) {
					if(o == (matriz[j].length -1))
						System.out.print(matriz[j][o]);
					else
						System.out.print(matriz[j][o] + " ");
					
				}
				//System.out.print(matriz[j][matriz[j].length]);
				//sacar el ultimo espacio---if(matriz[j].length)
				System.out.println();
			}
			}
			catch(IOException e){
			System.out.println(e);
			}
			return matriz;
		}
		}