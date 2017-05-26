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
	
	
	//TODO: Setup Sensors
	private int accidente;
	private int cortedecalle;
	private int congestion;
	private int eventosocial;
	private int plandebacheo;
	
	
	
	
 

    
	
	
	
	public  PatrulleroPerception() {
    	accidente = 2;
    	cortedecalle = 3;
    	congestion = 4;
    	eventosocial = 5;
    	plandebacheo = 6;
    	
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
        
        Patrullero agente = (Patrullero) agentIn;
        Mapa mapa = (Mapa) environmentIn;
        EstadoAmbiente estAmbiente  = mapa.getEnvironmentState();
       
        
        int posPat = estAmbiente.getPosPatrullero();
    }
    
    
    public int getAccidente() {
		return accidente;
	}

	public void setAccidente(int accidente) {
		this.accidente = accidente;
	}

	public int getCortedecalle() {
		return cortedecalle;
	}

	public void setCortedecalle(int cortedecalle) {
		this.cortedecalle = cortedecalle;
	}

	public int getCongestion() {
		return congestion;
	}

	public void setCongestion(int congestion) {
		this.congestion = congestion;
	}

	public int getEventosocial() {
		return eventosocial;
	}

	public void setEventosocial(int eventosocial) {
		this.eventosocial = eventosocial;
	}

	public int getPlandebacheo() {
		return plandebacheo;
	}

	public void setPlandebacheo(int plandebacheo) {
		this.plandebacheo = plandebacheo;
	}

	@Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        
        str.append("Accidente: " + this.accidente);
        str.append("Corte de Calle: " + this.cortedecalle);
        str.append("Conjestión: " + this.congestion);
        str.append("Evento Social: " + this.eventosocial);
        str.append("Plan de bacheo: " + this.plandebacheo);

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
     
     public Vector getQueHay() {
 		return queHay;
 	}

 	public void setQueHay(Vector queHay) {
 		this.queHay = queHay;
 	}
	
   
}
