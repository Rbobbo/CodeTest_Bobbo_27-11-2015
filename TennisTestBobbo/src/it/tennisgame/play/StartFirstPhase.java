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
    
    private PlayerDAO checkIsAnyoneWonEasy(PlayerDAO... players) {
        
        PlayerDAO result = null;
        
        for (PlayerDAO playerTmp : players) {
            if(playerTmp.getPlayerPoints() == 4) {
                result = playerTmp;
            }
        }
        
        return result;
    }
    
    /**
     * 
     * @param player
     * @return true if the game finish
     */
    public boolean match(int player) {
        
        boolean isFinished = false;
        if(player == 1) {
            uty.addSinglePoint(playerOne);
        }
        else {
            uty.addSinglePoint(playerTwo);
        }
        
        PlayerDAO playerVictorius = checkIsAnyoneWonEasy(playerOne,playerTwo);
        if(playerVictorius != null) {
             System.out.println(playerVictorius + " won");
             isFinished = true;
        }
        else {

            uty.decodePoints(playerOne,playerTwo);

            System.out.println(playerOne+" have : "+playerOne.getPlayerPoints()+" points"+
                    " then : "+playerOne.getPointDescription());
            System.out.println(playerTwo+" have : "+playerTwo.getPlayerPoints()+" points"+
                    " then : "+playerTwo.getPointDescription());
        }
        
        return isFinished;
    }
    
    
    
}
