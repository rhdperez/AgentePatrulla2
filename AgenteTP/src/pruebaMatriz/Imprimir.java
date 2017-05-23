package pruebaMatriz;

public class Imprimir {

	public void imprimir (int matriz[][]){
		
		for (int x=0; x < matriz.length; x++)
		{
			for (int y=0; y < matriz[x].length; y++)
			{
			System.out.println (matriz[x][y]);
			  }
		}
	}
	
		
}
