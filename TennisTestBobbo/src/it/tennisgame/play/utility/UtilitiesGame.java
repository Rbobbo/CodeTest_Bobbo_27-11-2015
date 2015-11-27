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
    
    public  void addSinglePoint(PlayerDAO player){
        
        player.setPlayerPoints( player.getPlayerPoints() + 1 );
    }
 
    
    
    
    /**
     * this class decode the point that the player have
     * from 0 to 3 points
     * (This version of method input is usefull only for a scalable 
     * version of the application, and for exercise)
     * @param players
     * @return 
     */
    public void decodePoints(PlayerDAO... players) {
        
        
        //Map<Integer, PlayerDAO> result = new HashMap<Integer, PlayerDAO>();
        
            for(int i =0; i < players.length ; i++)
            {
                PlayerDAO playerTmp =  players[i];
                
                String decodeString = "" ;
                switch (playerTmp.getPlayerPoints()) {

                    case 0 : decodeString = zeroPoints;
                    case 1 : decodeString = onePoints;
                    case 2 : decodeString = twoPoints;
                    case 3 : decodeString = threePoints;
                    default: decodeString = "" ;
                }
                playerTmp.setPointDescription(decodeString);
                
                
            }
        
                
        
    }
    
}
