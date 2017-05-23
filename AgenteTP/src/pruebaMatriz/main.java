package pruebaMatriz;


public class  main {
	
	public main (String[] args)
	
	{
		
		Leertxt lector = new Leertxt();
		Imprimir impresora = new Imprimir();
		int mat [][]= new int [10][10];
		
		lector.leertxt("datos.txt");
		
		System.out.println("IMPRIMIEDO MATRIZ");
		
		impresora.imprimir(mat);
		
		
	}

}
