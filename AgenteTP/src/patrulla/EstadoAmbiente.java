package patrulla;

import pruebaMatriz.leerDestinos;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoAmbiente extends EnvironmentState {
	
	//TODO: Setup Variables
    //private Other EsquinaIntersecciones;
    //private Other PosIncidente;
    //private Other PosPatrullero;
    //private Other CortesParciales;
    
    private int PosPatrullero;
    private int PosObjetivo;
    private String [][] matriz;
	
   

	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}

	public EstadoAmbiente() {
        
        //TODO: Complete Method
    	/*
			// EsquinaIntersecciones = initData0;
			// PosIncidente = initData1;
			// PosPatrullero = initData2;
			// CortesParciales = initData3;
			// DestPosibles = initData4;
        */
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override
    public void initState() {

    	 //Matriz destinos
        matriz= new String[173][173];	
        matriz = leerDestinos.getMatriz("C:/Users/RHDP/Desktop/matriz_pablo/matrizDestinosAmbiente.txt");
        
        //Pos Objetivo esquina 173
        PosObjetivo = 173;
        
        //Esquina Intersecciones ACA
        	
    	//TODO: Complete Method
        //Pos inicial del patrullero
        PosPatrullero= 1;

        
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "El patrullero está en la posición: " + this.getPosPatrullero();
        
        return str;
    }
    
    public int getPosPatrullero() {
		return PosPatrullero;
	}

	public void setPosPatrullero(int posPatrullero) {
		PosPatrullero = posPatrullero;
	}

	public int getPosObjetivo() {
		return PosObjetivo;
	}

	public void setPosObjetivo(int posObjetivo) {
		PosObjetivo = posObjetivo;
	}

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
	
//     public Other getEsquinaIntersecciones(){
//        return EsquinaIntersecciones;
//     }
//     public void setEsquinaIntersecciones(Other arg){
//        EsquinaIntersecciones = arg;
//     }
//     public Other getPosIncidente(){
//        return PosIncidente;
//     }
//     public void setPosIncidente(Other arg){
//        PosIncidente = arg;
//     }
//     public Other getPosPatrullero(){
//        return PosPatrullero;
//     }
//     public void setPosPatrullero(Other arg){
//        PosPatrullero = arg;
//     }
//     public Other getCortesParciales(){
//        return CortesParciales;
//     }
//     public void setCortesParciales(Other arg){
//        CortesParciales = arg;
//     }
 
}

