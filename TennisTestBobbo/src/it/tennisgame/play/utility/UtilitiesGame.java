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
    
    private static final Map<String, String> decodePointsDescr = new HashMap<String, String>();
    
    public  void addSinglePoint(PlayerDAO player){
        
        player.setPlayerPoints( player.getPlayerPoints() + 1 );
    }
 
    public UtilitiesGame() {
        
        decodePointsDescr.put("0", zeroPoints);
        decodePointsDescr.put("1", onePoints);
        decodePointsDescr.put("2", onePoints);
        decodePointsDescr.put("3", twoPoints);
        decodePointsDescr.put("4", threePoints);

        
    }
    
    
    /**
     * this class decode the point that the player have
     * from 0 to 3 points
     * @param players
     * @return 
     */
    public void decodePoints(PlayerDAO playerOne, PlayerDAO playerTwo) {
        
        boolean isPointsEquals = checkIsAllPlayersEqualPoints(playerOne,playerTwo);
        
        if(isPointsEquals) {
            
        }
        else {
            
        }
        String decodeString = this.decodePointsDescr.get(playerOne.getPlayerPoints()+"") ;
        playerOne.setPointDescription(decodeString);
        decodeString = this.decodePointsDescr.get(playerTwo.getPlayerPoints()+"") ;
        playerTwo.setPointDescription(decodeString);


                
        
    }

    /**
     * check if the two players have the same points and if 
     * the points are 3
     * @param playerOne
     * @param playerTwo
     * @return 
     */
    private boolean checkIsAllPlayersEqualPoints(PlayerDAO playerOne, PlayerDAO playerTwo) {
        
        boolean isSamePoints = true;
        
        if(playerOne.getPlayerPoints() != playerTwo.getPlayerPoints()) {
            isSamePoints = false;
        }
        // TODO controlla numero punti e se sono 3 pari
        return isSamePoints;
    }


    
}
