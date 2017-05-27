package patrulla;
//MODIFICADO 26/05
import java.util.Vector;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class PatrulleroPerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//matriz utilizada para devolver que hay en las esquinas donde puede ir como mucho 3 esquinas
	//private String [][] queHay = new String[2][3];
	private Vector queHay;
	
	public  PatrulleroPerception() {
    	
    }

    public PatrulleroPerception(Agent agent, Environment environment) {
        super(agent, environment);
        
    }

    /**
     * This method is used to setup the perception.
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
    	
    	//TODO: Complete Method
        
        Patrullero agente = (Patrullero) agentIn;
        Mapa mapa = (Mapa) environmentIn;
        EstadoAmbiente estAmbiente  = mapa.getEnvironmentState();
               
        int posPat = estAmbiente.getPosPatrullero();
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        
        for(int i=0; i < getQueHay().size()-1; i= i+2)
           	str.append("Posible esquina: " + getQueHay().get(i) + ".Situación: " + getQueHay().get(i+1));
        	
        return str.toString();
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
    public Vector getQueHay() {
 		return queHay;
 	}

 	public void setQueHay(Vector queHay) {
 		this.queHay = queHay;
 	}
	
   
}
