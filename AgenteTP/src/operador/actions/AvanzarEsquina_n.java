package operador.actions;
import java.io.*;


import patrulla.EstadoAgente;
import patrulla.EstadoAmbiente;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

//la clase recibe como parametro de la esquina a la cual se pretende avanzar

public class AvanzarEsquina_n extends SearchAction {
	private int numeroEsquina;
    public AvanzarEsquina_n(int i) {
		numeroEsquina = i;
	}

	/**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    //@Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
        EstadoAgente agState = (EstadoAgente) s;
        
        // TODO: Use this conditions
        // PreConditions: null
        // PostConditions: null
               
        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    //@Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoAmbiente environmentState = (EstadoAmbiente) est;
        EstadoAgente agState = ((EstadoAgente) ast);

        // TODO: Use this conditions
        // PreConditions: null
        // PostConditions: null
        
        if (true) {
            // Update the real world
            
            // Update the agent state
            
            return environmentState;
        }

        return null;
    }

    /**
     * This method returns the action cost.
     */
    //@Override
    public Double getCost() {
        return new Double(0);
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    //@Override
    public String toString() {
        return "AvanzarEsquina_n";
    }
}