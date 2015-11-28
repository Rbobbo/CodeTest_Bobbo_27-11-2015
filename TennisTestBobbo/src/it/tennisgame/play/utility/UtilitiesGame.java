package it.tennisgame.play.utility;

import it.tennisgame.play.dto.PlayerDAO;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Riccardo Bobbo
 */
public class UtilitiesGame {
    
    private static final String zeroPoints  = "love";
    private static final String onePoints  = "fifteen";
    private static final String twoPoints  = "thirty";
    private static final String threePoints  = "forty";
    private static final String equalsAfterThreePoints  = "deuce";
    private static final String advantage  = "advantage";
    
    
    private static final Map<String, String> decodePointsDescr = new HashMap<String, String>();
    
    public UtilitiesGame()
    {
        decodePointsDescr.put("0", zeroPoints);
        decodePointsDescr.put("1", onePoints);
        decodePointsDescr.put("2", twoPoints);
        decodePointsDescr.put("3", threePoints);
        decodePointsDescr.put("+0", equalsAfterThreePoints);
        decodePointsDescr.put("+1", advantage);

    }
    
    /**
     * add points to the player
     * when advantage, add pointAdvantage
     * @param player
     * @param isForAdvantage 
     */
    public  void addSinglePoint(PlayerDAO player, boolean isForAdvantage){
        
        if(isForAdvantage) {
            player.setPlayerAdvantage(player.getPlayerAdvantage() +1);
            
        }
        else {
            player.setPlayerPoints( player.getPlayerPoints() + 1 );
            
        }
    }
 
    /**
     * this class decode the point that the player have
     * from 0 to 3 points
     * @param players
     * @return 
     */
    public void decodePoints(boolean activateAdvantage, PlayerDAO playerOne, PlayerDAO playerTwo)
    {
        String searchDecodePlayerOne = activateAdvantage ? "+"+playerOne.getPlayerAdvantage() : ""+playerOne.getPlayerPoints();
        String searchDecodePlayerTwo = activateAdvantage ? "+"+playerTwo.getPlayerAdvantage() : ""+playerTwo.getPlayerPoints();
        String decodeString = this.decodePointsDescr.get(searchDecodePlayerOne) ;
        playerOne.setPointDescription(decodeString);
        decodeString = this.decodePointsDescr.get(searchDecodePlayerTwo) ;
        playerTwo.setPointDescription(decodeString);
    }

    /**
     * check if the players have the same points and if 
     * the points are 3 return true, otherwise false
     * @param playerOne
     * @param playerTwo
     * @return 
     */
    public boolean checkIsAllPlayersEqualPoints(PlayerDAO playerOne, PlayerDAO playerTwo)
    {
        boolean isSamePoints = false;
        
        if(playerOne.getPlayerPoints() != playerTwo.getPlayerPoints()) {
            isSamePoints = false;
        } else if( playerOne.getPlayerPoints() == 3 &&
                playerOne.getPlayerPoints() == playerTwo.getPlayerPoints() ) {
            isSamePoints = true;
        }
        return isSamePoints;
    }


    
}
