package patrulla;

import pruebaMatriz.leerDestinos;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
	public int getPosObjetivo() {
		return PosObjetivo;
	}



	public void setPosObjetivo(int posObjetivo) {
		PosObjetivo = posObjetivo;
	}
	//TODO: Setup Variables
    //private Other PosPatrullero;
    //private Other EsquinaIntersecciones;
    //private Other GrafoCamino;
    //private Other DestPosibles;
    //private Other CortesParciales;
    private int EsquinasRecorridas;
    private int PosPatrullero;
    private int PosObjetivo;
    private String [][] matriz;
	

    public EstadoAgente() {
    
    	//TODO: Complete Method
    	
			 //PosPatrullero = initData0;
			// EsquinaIntersecciones = initData1;
			// GrafoCamino = initData2;
			// DestPosibles = initData3;
			// CortesParciales = initData4;
			// EsquinasRecorridas = initData5;
			 
        
        this.initState();
    }

    

	/**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    //@Override
    public SearchBasedAgentState clone() {
        
		//TODO: Complete Method
		
        return null;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    //@Override
    public void updateState(Perception p) {
        
        //TODO: Complete Method
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    //@Override
    public void initState() {
    
    //Matriz destinos
    matriz= new String[173][173];	
    matriz = leerDestinos.getMatriz("C:/Users/RHDP/Desktop/matriz_pablo/matrizDestinosAgente.txt");
    
    //Pos Objetivo esquina 173
    PosObjetivo = 173;
    
    //Esquina Intersecciones ACA
    	
	//TODO: Complete Method
    //Pos inicial del patrullero
    PosPatrullero= 1;

    }

    public String[][] getMatriz() {
		return matriz;
	}



	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}



	/**
     * This method returns the String representation of the agent state.
     */
    //@Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    //@Override
    public boolean equals(Object obj) {
       
       //TODO: Complete Method
        
    	if (!(obj instanceof EstadoAgente)) {
            return false;
        }
    	return true;
       //return posPatrullero.equals(((EstadoAgente) obj).getPosPatrullero());
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
     public int getPosPatrullero(){
        return PosPatrullero;
     }
    public void setPosPatrullero(int arg){
        PosPatrullero = arg;
     }
//     public Other getEsquinaIntersecciones(){
//        return EsquinaIntersecciones;
//     }
//     public void setEsquinaIntersecciones(Other arg){
//        EsquinaIntersecciones = arg;
//     }
//     public Other getGrafoCamino(){
//        return GrafoCamino;
//     }
//     public void setGrafoCamino(Other arg){
//        GrafoCamino = arg;
//     }
//     public Other getDestPosibles(){
//        return DestPosibles;
//     }
//     public void setDestPosibles(Other arg){
//        DestPosibles = arg;
//     }
//     public Other getCortesParciales(){
//        return CortesParciales;
//     }
//     public void setCortesParciales(Other arg){
//        CortesParciales = arg;
//     }
     public int getEsquinasRecorridas(){
        return EsquinasRecorridas;
     }
     public void setEsquinasRecorridas(int arg){
        EsquinasRecorridas = arg;
     }
	
}

