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
        
        boolean isContinue = true;
        StartFirstPhase first = new StartFirstPhase();
        System.out.println("Write : \n 1 for asign point to first player; \n 2 for second player; "
                + "0 exit game");
        while(isContinue) {
            
            char inputmanager = (char) System.in.read()  ;
            
            int inputSelected = 0;
            if(inputmanager == '1') {
                // player one selected
                inputSelected = 1;
            } else if(inputmanager == '2') {
                // player two selected
                inputSelected = 2;
            } else if(inputmanager == '0'){
                // exit
                break;
            } else {
                continue;
            }
            
            isContinue = !first.match(inputSelected);
        }
        
    }
    
    public static void startGame(int pointsForPlayer1, int pointsForPlayer2) throws IOException {
        StartFirstPhase first = new StartFirstPhase();
        
       
    }
    
}
