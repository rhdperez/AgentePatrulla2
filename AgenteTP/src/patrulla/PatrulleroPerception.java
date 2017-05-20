package patrulla;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class PatrulleroPerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	
	//TODO: Setup Sensors
	private int accidente;
	private int cortedecalle;
	private int congestion;
	private int eventosocial;
	private int plandebacheo;
	
 

    public  PatrulleroPerception() {
    	//TODO: Complete Method
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
        
        //Patrullero agent = (Patrullero) agentIn;
        //Mapa environment = (Mapa) environmentIn;
        //EstadoAmbiente environmentState =
        //        environment.getEnvironmentState();
       
        
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return str.toString();
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
     public int getaccidente(){
        return accidente;
     }
     public void setaccidente(int arg){
        this.accidente = arg;
     }
     public int getcortedecalle(){
        return cortedecalle;
     }
     public void setcortedecalle(int arg){
        this.cortedecalle = arg;
     }
     public int getcongestion(){
        return congestion;
     }
     public void setcongestion(int arg){
        this.congestion = arg;
     }
     public int geteventosocial(){
        return eventosocial;
     }
     public void seteventosocial(int arg){
        this.eventosocial = arg;
     }
     public int getplandebacheo(){
        return plandebacheo;
     }
     public void setplandebacheo(int arg){
        this.plandebacheo = arg;
     }
	
   
}
