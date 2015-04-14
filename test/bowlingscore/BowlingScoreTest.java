/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingscore;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asik
 */
public class BowlingScoreTest {
    
    public BowlingScoreTest() {
    }

    /**
     * Test of main method, of class BowlingScore.
     */
    @Test
    public void testFrameOneBallOne() {
        
        ScoreSheet scoreSheet = new ScoreSheet();
        FrameScore fs = new FrameScore();
        List<FrameScore> fsList = new ArrayList<>();
        
        fs.setFirstBall(3);
        fsList.add(fs);
        scoreSheet.setFrameScores(fsList);
        
        assertEquals(3, BowlingScore.calculuateGameScore(scoreSheet));
        
    }
    
    @Test
    public void testFrameOneBallTwo() {
        ScoreSheet scoreSheet = new ScoreSheet();
        FrameScore fs = new FrameScore();
        List<FrameScore> fsList = new ArrayList<>();
        
        fs.setFirstBall(3);
        fs.setSecondBall(5);
        fsList.add(fs);
        scoreSheet.setFrameScores(fsList);
        
        assertEquals(8, BowlingScore.calculuateGameScore(scoreSheet));
    }
    
}
