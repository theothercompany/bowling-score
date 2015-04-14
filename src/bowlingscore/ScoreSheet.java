/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingscore;

import java.util.List;

/**
 *
 * @author asik
 */
public class ScoreSheet {
  private List<FrameScore> frameScores;

    public List<FrameScore> getFrameScores() {
        return frameScores;
    }

    public void setFrameScores(List<FrameScore> frameScores) {
        this.frameScores = frameScores;
    }
  
}
