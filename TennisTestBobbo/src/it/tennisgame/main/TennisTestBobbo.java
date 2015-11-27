package it.tennisgame.main;

import it.tennisgame.play.StartFirstPhase;
import java.io.IOException;

/**
 *
 * @author Riccardo Bobbo
 */

public class TennisTestBobbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        char inputmanager = (char) System.in.read()  ;
        
        StartFirstPhase first = new StartFirstPhase();
        while(first.match(inputmanager));
        
    }
    
    public static void startGame(int pointsForPlayer1, int pointsForPlayer2) throws IOException {
        StartFirstPhase first = new StartFirstPhase();
        
       
    }
    
}
