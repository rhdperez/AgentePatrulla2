package patrulla;

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
    public  PatrulleroPerception getPercept() {
        // Create a new perception to return
         PatrulleroPerception perception = new PatrulleroPerception();
		int PosPatrullero =	this.getEnvironmentState().getPosPatrullero();
        // Return the perception
        return perception;
    }

    
    @Override
	public String toString() {
        return environmentState.toString();
    }

    
    @Override
	public boolean agentFailed(Action actionReturned) {

        EstadoAmbiente envState =
                this.getEnvironmentState();

        // TODO: Complete Method        

        return false;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
    
    
}
