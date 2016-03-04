/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suicidesim;

import environment.ApplicationStarter;
import java.awt.Dimension;


/**
 *
 * @author NathanielWard
 */
public class SuicideSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        ApplicationStarter.run(new String[0], "Stop", new Dimension(788,800), new City());
    }
    
}
