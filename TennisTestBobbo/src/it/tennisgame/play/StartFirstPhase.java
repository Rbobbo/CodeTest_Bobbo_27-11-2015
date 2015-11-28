package it.tennisgame.play;

import it.tennisgame.play.dto.PlayerDAO;
import it.tennisgame.play.utility.UtilitiesGame;

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
    
    /**
     * 
     * @param players
     * @return player that have done 4 points 
     */
    private PlayerDAO checkIsAnyoneWon(PlayerDAO... players) {
        PlayerDAO result = null;
        
        for (PlayerDAO playerTmp : players)
        {
            if(playerTmp.getPlayerPoints() == 4 || playerTmp.getPlayerAdvantage() == 2)
            {
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
        boolean isPointsEquals = uty.checkIsAllPlayersEqualPoints(playerOne,playerTwo);
        
        if(player == 1)
        {
            uty.addSinglePoint(playerOne, isPointsEquals);
        }
        else
        {
            uty.addSinglePoint(playerTwo, isPointsEquals);
        }
        
        // check anyone win 
        PlayerDAO playerVictorius = checkIsAnyoneWon(playerOne,playerTwo);
        if(isPointsEquals)
        {
            cleanAdvantage(playerOne,playerTwo);
        }
        if(playerVictorius != null) {
             System.out.println(playerVictorius + " won");
             isFinished = true;
        }
        else
        {
            uty.decodePoints(isPointsEquals, playerOne,playerTwo);

            System.out.println(playerOne+" have : "+playerOne.getPlayerPoints()+" points"+
                    " then : "+playerOne.getPointDescription());
            System.out.println(playerTwo+" have : "+playerTwo.getPlayerPoints()+" points"+
                    " then : "+playerTwo.getPointDescription());
        }
        
        return isFinished;
    }

    /**
     * the method set to 0 the advantage when both are equals 2
     * @param playerOne
     * @param playerTwo 
     */
    private void cleanAdvantage(PlayerDAO playerOne, PlayerDAO playerTwo) {
        if(playerOne.getPlayerAdvantage() == 1 && playerTwo.getPlayerAdvantage() == 1 ) 
        {
            playerOne.setPlayerAdvantage(0);
            playerTwo.setPlayerAdvantage(0);
        }
    }
    
    
    
}
