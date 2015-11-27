package tennistestbobbo;

import it.tennisgame.main.TennisTestBobbo;
import java.io.IOException;
import org.junit.Test;

/**
 *
 * @author Riccardo Bobbo
 */

public class TennisTestBobboTest {
    
    private int pointsPlayer1 = 0;
    private int pointsPlayer2 = 0;
    
   
 public TennisTestBobboTest() {
     
 }
    
    /**
     * Test of main method, of class TennisTestBobbo.
     */
    @Test
    public void testMain() throws IOException {
        System.out.println("main");
        
        TennisTestBobbo game1 = new TennisTestBobbo();
        
        game1.startGame(pointsPlayer1, pointsPlayer2);
        
        // fail("The test case is a prototype.");
    }
    
    public void testPlayers() throws IOException {
        String read = ""+System.in.read();
        System.out.println("Test di scrittura :"+read );
    }
    
}
