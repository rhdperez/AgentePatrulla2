package patrulla;

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
    private int DestPosibles;
	
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

        //TODO: Complete Method
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
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
     public int getDestPosibles(){
        return DestPosibles;
     }
     public void setDestPosibles(int arg){
        DestPosibles = arg;
     }
	

}

