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
        System.out.println("Write : \n"
                + "1 assign point to \""+first.getPlayerOne()+"\" ; \n"
                + "2 assign point to \""+first.getPlayerTwo()+"\" ; \n"
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
            
            isContinue = startGame(first,inputSelected);
        }
        
    }
    
    public static boolean startGame(StartFirstPhase gamesPhase, int inputSelected) throws IOException
    {
       boolean isContinue = !gamesPhase.match(inputSelected);
       
       return isContinue;
        
    }
    
}
