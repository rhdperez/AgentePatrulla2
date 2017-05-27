package operador.actions;

import java.util.Vector;


import patrulla.EstadoAgente;
import patrulla.EstadoAmbiente;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

//la clase recibe como parametro de la esquina a la cual se pretende avanzar

public class AvanzarEsquina_n extends SearchAction {
	
	private static int contador = 0;
	
	private int numeroEsquina;
    public AvanzarEsquina_n(int i) {
		numeroEsquina = i;
	}

	/**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
    	
    	contador++;
    	System.out.println(" **************** " + contador + "vez");
    	String [][] matriz;
    	EstadoAgente agState = (EstadoAgente) s;
    	
    	int PosPatrullero = agState.getPosPatrullero();
    	matriz = agState.getMatriz();
    	
    	
    	
    	Vector <String> vector = new Vector<String>();
    	
		int j = 0;
		
		while(j < matriz.length)
		{
        	System.out.print(j + ":" + matriz[PosPatrullero - 1][j] + "\n");
			if(matriz[PosPatrullero - 1][j].compareTo("0") == 1)
			{	
        		//System.out.println("entra");
        		Integer pos = new Integer (j + 1);
				vector.add(pos.toString());
			}
			j++;
		}
		System.out.println(vector.size());
		
        if(vector.contains(numeroEsquina))
        {
        	agState.setPosPatrullero(numeroEsquina);
        	return agState;
        }
      
               
        return null;
    }

    
    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoAmbiente environmentState = (EstadoAmbiente) est;
        EstadoAgente agState = ((EstadoAgente) ast);

        int PosPatrullero = environmentState.getPosPatrullero();
        
        String [][] matriz = environmentState.getMatriz();
               
        /*if(numeroEsquina == 1)
        {
        	for (int p = 0; p < 173; p++)
           	{
				for(int  q = 0; q < 173; q++)
				{
					System.out.print(matriz[p][q]);
				}
           	}
        }*/
        
        Vector <String> vector = new Vector<String>();
		int j = 0;
		
        while(j < matriz.length)
		{
			if(matriz[PosPatrullero - 1][j].compareTo("1") == 0)
			{	
				Integer pos = new Integer (j +1 );
				vector.add(pos.toString());
			}
			j++;
		}
        
        if (vector.contains(numeroEsquina))
        {
            // Update the real world
            environmentState.setPosPatrullero(numeroEsquina);
            // Update the agent state
            agState.setPosPatrullero(numeroEsquina);
                        
            return environmentState;
        }

        return null;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost() {
        return new Double(0);
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "AvanzarEsquina_n";
    }
}