package patrulla;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;

public class PatrulleroMain {

    public static void main(String[] args) throws PrologConnectorException {
        Patrullero agent = new Patrullero();

        Mapa environment = new Mapa();
        
        //aca van cambios nuevos
        System.out.println ("El precio es de ");
        System.out.println ("El precio es de patacones");
        System.out.println ("comit 15:52hs");

        SearchBasedAgentSimulator simulator =
                new SearchBasedAgentSimulator(environment, agent);
        
        simulator.start();
    }

}
