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
    
    @Test
    public void testFrameTwoBallOne() {
        ScoreSheet scoreSheet = new ScoreSheet();
        List<FrameScore> fsList = new ArrayList<>();
        
        FrameScore fs1 = new FrameScore();
        fs1.setFirstBall(3);
        fs1.setSecondBall(5);
        fsList.add(fs1);
        
        FrameScore fs2 = new FrameScore();
        fs2.setFirstBall(3);
        fsList.add(fs2);
        
        scoreSheet.setFrameScores(fsList);
        
        assertEquals(11, BowlingScore.calculuateGameScore(scoreSheet));
    }
    
}
