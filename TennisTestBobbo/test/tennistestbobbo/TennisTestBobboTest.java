package tennistestbobbo;

import it.tennisgame.main.TennisTestBobbo;
import it.tennisgame.play.StartFirstPhase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    public void testMain() throws IOException
    {
        System.out.println("main");
        
        List<Integer[]> casesList = getCasesList();
        TennisTestBobbo game1 = new TennisTestBobbo();
        for (Integer[] caseTmp : casesList)
        {
            StartFirstPhase first = new StartFirstPhase();
            for (Integer playersWonCaseTmp : caseTmp) {
                game1.startGame(first, playersWonCaseTmp);
                
            }
            
        }
        
        // fail("The test case is a prototype.");
    }

    private List<Integer[]> getCasesList() {
        List<Integer[]> result = new ArrayList<Integer[]>();
        Integer[] playersWonCases = new Integer[]{1,1,1,1};
        result.add(playersWonCases);
        playersWonCases = new Integer[]{2,2,2,2};
        result.add(playersWonCases);
        playersWonCases = new Integer[]{1,1,1,2,2,2,2,2};
        result.add(playersWonCases);
        playersWonCases = new Integer[]{1,1,1,2,2,2,1,1};
        result.add(playersWonCases);
        
        return result;
    }
    
}
