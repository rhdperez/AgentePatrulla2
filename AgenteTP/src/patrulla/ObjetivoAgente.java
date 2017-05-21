package patrulla;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoAgente extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    
        if  (((EstadoAgente) agentState).getPosPatrullero().equals(RobotAgentState."ACA DEBE IR EL ESTADO FINAL DEL AGENTE PARA PODER COMPARAR")) //(PosPatrullero=PosIncidente)
    	{
        return true;
    	}
    return false;
}
}