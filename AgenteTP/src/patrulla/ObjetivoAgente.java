package patrulla;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    
    public boolean isGoalState (AgentState agentState) {
    
    	int posPatrullero = ((EstadoAgente) agentState).getPosPatrullero();
    	int posObjetivo = ((EstadoAgente) agentState).getPosObjetivo();
        if  (posPatrullero == posObjetivo)
        	return true;
    	
    return false;
    }
}
