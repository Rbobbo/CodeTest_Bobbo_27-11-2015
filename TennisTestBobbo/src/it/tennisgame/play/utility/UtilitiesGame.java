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
     * (This version of method input is usefull only for a scalable 
     * version of the application, and for exercise)
     * @param players
     * @return 
     */
    public void decodePoints(PlayerDAO... players) {
        
        
        //Map<Integer, PlayerDAO> result = new HashMap<Integer, PlayerDAO>();
        
            for(int i =0; i < players.length ; i++)
            {
                String decodeString = this.decodePointsDescr.get(players[i].getPlayerPoints()) ;
                players[i].setPointDescription(decodeString);
                
            }

                
        
    }
    
}
