/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowlingscore;

/**
 *
 * @author asik
 */
public class BowlingScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static int calculuateGameScore(ScoreSheet sheet) {
        int value = 0;
        for (int i = 0; i < sheet.getFrameScores().size(); i++) {
            if (10 == sheet.getFrameScores().get(i).getFirstBall()) {
                value += 10 + (sheet.getFrameScores().get(i + 1).getFirstBall() + sheet.getFrameScores().get(i + 1).getSecondBall());
            } else {
                value += sheet.getFrameScores().get(i).getFirstBall() + sheet.getFrameScores().get(i).getSecondBall();
            }

        }

        return value;
    }

}
