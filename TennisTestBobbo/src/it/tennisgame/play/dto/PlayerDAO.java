package it.tennisgame.play.dto;

/**
 *
 * @author Riccardo Bobbo
 * Data transfer object.
 * Describe the player
 */
public class PlayerDAO {
    
    private boolean samePoints = false;
    private String playerName = "";
    private int playerPoints  = 0;
    private String pointDescription = "love";

    public boolean isSamePoints() {
        return samePoints;
    }

    public void setSamePoints(boolean samePoints) {
        this.samePoints = samePoints;
    }

    public String getPointDescription() {
        return pointDescription;
    }

    public void setPointDescription(String pointDescription) {
        this.pointDescription = pointDescription;
    }

    public PlayerDAO(String name) {
        this.playerName = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }
    
    @Override
    public String toString() {
        return this.playerName;
    }
    
}
