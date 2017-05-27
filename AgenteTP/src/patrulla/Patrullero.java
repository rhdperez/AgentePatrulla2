package patrulla;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import operador.actions.AvanzarEsquina_n;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.Problem;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgent;
import frsf.cidisi.faia.solver.search.DepthFirstSearch;
import frsf.cidisi.faia.solver.search.IStepCostFunction;
import frsf.cidisi.faia.solver.search.Search;
import frsf.cidisi.faia.solver.search.UniformCostSearch;

public class Patrullero extends SearchBasedAgent {

    public Patrullero() {

        // The Agent Goal
        ObjetivoAgente agGoal = new ObjetivoAgente();

        // The Agent State....POSICION INICIAL DEL AGENTE EN LA ESQUINA 1
        EstadoAgente agState = new EstadoAgente();
        this.setAgentState(agState);

        // Create the operators
        Vector<SearchAction> operators = new Vector<SearchAction>();
        
        operators = inicializarOperadores();
               
        // Create the Problem which the agent will resolve
        Problem problem = new Problem(agGoal, agState, operators);
        this.setProblem(problem);
    }

    private Vector<SearchAction> inicializarOperadores()
    {
    	Vector<SearchAction> operador = new Vector<SearchAction>();
    	for(int i = 1 ;i <= 173; i++)
    	{
    		operador.addElement(new AvanzarEsquina_n(i));
    	}
    	
    	return operador;
	}

	/**
     * This method is executed by the simulator to ask the agent for an action.
     */
    @Override
    public Action selectAction() {

        // Create the search strategy
    	
    	//Profundidad.........................
        //DepthFirstSearch strategy = new DepthFirstSearch();
        
        //IMPLEMENTANDO CONSTO UNIFORME**********************************
        //Uniform Cost:
        IStepCostFunction costFunction = new CostFunction();
        UniformCostSearch strategy2 = new UniformCostSearch(costFunction);
        
        //********************************************************

        // Create a Search object with the strategy
        Search searchSolver = new Search(strategy2);

        /* Generate an XML file with the search tree. It can also be generated
         * in other formats like PDF with PDF_TREE */
        searchSolver.setVisibleTree(Search.EFAIA_TREE);

        // Set the Search searchSolver.
        this.setSolver(searchSolver);

        // Ask the solver for the best action
        Action selectedAction = null;
        try {
            selectedAction =
                    this.getSolver().solve(new Object[]{this.getProblem()});
        } catch (Exception ex) {
            Logger.getLogger(Patrullero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Return the selected action
        return selectedAction;

    }

    /**
     * This method is executed by the simulator to give the agent a perception.
     * Then it updates its state.
     * @param p
     */
    @Override
    public void see(Perception p) {
        this.getAgentState().updateState(p);
    }
    
}
