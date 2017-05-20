package patrulla;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoAgente extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    //private Other PosPatrullero;
    //private Other EsquinaIntersecciones;
    //private Other GrafoCamino;
    //private Other DestPosibles;
    //private Other CortesParciales;
    private int EsquinasRecorridas;
	

    public EstadoAgente() {
    
    	//TODO: Complete Method
    	/*
			// PosPatrullero = initData0;
			// EsquinaIntersecciones = initData1;
			// GrafoCamino = initData2;
			// DestPosibles = initData3;
			// CortesParciales = initData4;
			// EsquinasRecorridas = initData5;
        */
        this.initState();
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
        
		//TODO: Complete Method
		
        return null;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        
        //TODO: Complete Method
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
        
	//TODO: Complete Method

    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    @Override
    public boolean equals(Object obj) {
       
       //TODO: Complete Method
        
        return true;
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
//     public Other getPosPatrullero(){
//        return PosPatrullero;
//     }
//     public void setPosPatrullero(Other arg){
//        PosPatrullero = arg;
//     }
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

