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
    
    /**
     * add points to the player
     * if it is an advantage, add pointAdvantage
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
 
    public UtilitiesGame() {
        decodePointsDescr.put("0", zeroPoints);
        decodePointsDescr.put("1", onePoints);
        decodePointsDescr.put("2", twoPoints);
        decodePointsDescr.put("3", threePoints);
        decodePointsDescr.put("+1", equalsAfterThreePoints);
        decodePointsDescr.put("+2", advantage);

    }
    
    /**
     * this class decode the point that the player have
     * from 0 to 3 points
     * @param players
     * @return 
     */
    public void decodePoints(boolean activateAdvantage, PlayerDAO playerOne, PlayerDAO playerTwo) {
        
        String searchDecode = activateAdvantage ? "+"+playerOne.getPlayerAdvantage() : ""+playerOne.getPlayerPoints();
        String decodeString = this.decodePointsDescr.get(searchDecode) ;
        playerOne.setPointDescription(decodeString);
        decodeString = this.decodePointsDescr.get(searchDecode) ;
        playerTwo.setPointDescription(decodeString);
    }

    /**
     * check if the players have the same points and if 
     * the points are 3 return true, otherwise false
     * @param playerOne
     * @param playerTwo
     * @return 
     */
    public boolean checkIsAllPlayersEqualPoints(PlayerDAO playerOne, PlayerDAO playerTwo) {
        
        boolean isSamePoints = false;
        
        if(playerOne.getPlayerPoints() != playerTwo.getPlayerPoints()) {
            isSamePoints = false;
        } else if( playerOne.getPlayerPoints() == 3 &&
                playerOne.getPlayerPoints() == playerTwo.getPlayerPoints() ) {
            isSamePoints = true;
        }
        // TODO controlla numero punti e se sono 3 pari
        return isSamePoints;
    }


    
}
