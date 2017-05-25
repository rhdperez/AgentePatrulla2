package patrulla;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;

public class PatrulleroMain {

    public static void main(String[] args) throws PrologConnectorException {
        Patrullero agent = new Patrullero();

        Mapa environment = new Mapa();
        
       SearchBasedAgentSimulator simulator =
                new SearchBasedAgentSimulator(environment, agent);
        
        simulator.start();
    }

}
