package it.tennisgame.play.dto;

/**
 *
 * @author Riccardo Bobbo
 * Data transfer object.
 * Describe the player
 */
public class PlayerDAO {
    
    private int playerId;

    private String playerName = "";
    private int playerPoints  = 0;
    private String pointDescription = "love";

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

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
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
