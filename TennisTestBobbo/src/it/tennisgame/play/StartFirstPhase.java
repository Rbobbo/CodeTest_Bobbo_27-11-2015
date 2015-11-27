package it.tennisgame.play;

import it.tennisgame.play.dto.PlayerDAO;
import it.tennisgame.play.utility.UtilitiesGame;
import java.util.Map;

/**
 *
 * @author Riccardo Bobbo
 */
public class StartFirstPhase {
    
    private PlayerDAO playerOne ;
    private PlayerDAO playerTwo;
    UtilitiesGame uty ;
    
    public StartFirstPhase() {
        
        this.playerOne = new PlayerDAO("First Player");
        this.playerTwo = new PlayerDAO("Second Player");
        uty = new UtilitiesGame();
        
        
    }
    
    public void match(int player) {
        
        if(player == 1) {
            uty.addSinglePoint(playerOne);
        }
        else {
            uty.addSinglePoint(playerOne);
        }
        
        uty.decodePoints(playerOne,playerTwo);
        
        
        
        
        System.out.println(playerOne+" have : "+playerOne.getPlayerPoints()+" points"+
                " then : "+playerOne.getPointDescription());
        System.out.println(playerTwo+" have : "+playerTwo.getPlayerPoints()+" points"+
                " then : "+playerTwo.getPointDescription());
        
    }
    
    
    
}
