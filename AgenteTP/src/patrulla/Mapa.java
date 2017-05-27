package patrulla;

import java.util.Vector;

import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.environment.Environment;



public class Mapa extends Environment {

	
    public Mapa() {
        // Create the environment state
        this.environmentState = new EstadoAmbiente();
    }

    @Override
	public EstadoAmbiente getEnvironmentState() {
        return (EstadoAmbiente) super.getEnvironmentState();
    }

    /**
     * This method is called by the simulator. Given the Agent, it creates
     * a new perception reading, for example, the agent position.
     * @param agent
     * @return A perception that will be given to the agent by the simulator.
     */
    @Override
    
    //CAMBIAR......
    public  PatrulleroPerception getPercept() {
    	// Create a new perception to return
    	//seria igual a initPerception() de PatrulleroPerception?
//---------------ver-------------------------------------    	
//    	Patrullero agente = (Patrullero) agentIn;
//        Mapa mapa = (Mapa) environmentIn;
//        EstadoAmbiente estAmbiente  = mapa.getEnvironmentState();
//       
//        int posPat = estAmbiente.getPosPatrullero();
    	
    	PatrulleroPerception perception = new PatrulleroPerception();
		int PosPatrullero =	this.getEnvironmentState().getPosPatrullero();
		
		String [][] matriz = this.getEnvironmentState().getMatriz(); 
	    
		Vector <String> vector = new Vector();
		
		int j = 0;
		Integer pos;
		
		while(j < matriz.length)
		{
			if(matriz[PosPatrullero - 1][j].compareTo("0") != 0)
			{	
				pos = new Integer (j +1 );
				vector.add(pos.toString());
				vector.add(matriz[PosPatrullero - 1][j]);
			}
			j++;
		}
		
		perception.setQueHay(vector);
        // Return the perception
        return perception;
    }

    




    @Override
	public String toString() {
        return environmentState.toString();
    }

    
    @Override
	public boolean agentFailed(Action actionReturned) {

        EstadoAmbiente envState = this.getEnvironmentState();
        // SERIA COMO QUE POR ALGUNA RAZON NUESTRO PATRULLERO NO LLEGUE?
        // MEPA QUE QUEDA VACIO ESTE METODO.
                

        return false;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
    
    
}
