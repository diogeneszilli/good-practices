import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    @Test
    public void isSpare() {
        Bowling bowling = new Bowling();
        assertEquals("Is Spare", true, bowling.isSpare(4, 6));
    }

    @Test
    public void isNotSpare() {
        Bowling bowling = new Bowling();
        assertEquals("Is not Spare", false, bowling.isSpare(4, 4));
    }

    @Test
    public void isStrike() {
        Bowling bowling = new Bowling();
        assertEquals("Is Strike", true, bowling.isStrike(10));
    }

    @Test
    public void isNotStrike() {
        Bowling bowling = new Bowling();
        assertEquals("Is not Strike", false, bowling.isStrike(9));
    }

    @Test
    public void hasNextRound() {
        Bowling bowling = new Bowling();
        assertEquals("Is not the end of the game", true, bowling.hasNextRound(8, 10));
    }

    @Test
    public void isLastRound() {
        Bowling bowling = new Bowling();
        assertEquals("Is the end of the game", false, bowling.hasNextRound(9, 10));
    }

    @Test
    public void validGame90Points() {
        Bowling bowling = new Bowling();
        int[] game = {9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,0};
        assertEquals("Total points", 90, bowling.runGame(game));
    }

    @Test
    public void validGame150Points() {
        Bowling bowling = new Bowling();
        int[] game = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        assertEquals("Total points", 150, bowling.runGame(game));
    }

    @Test
    public void validGame155Points() {
        Bowling bowling = new Bowling();
        int[] game = {10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        assertEquals("Total points", 155, bowling.runGame(game));
    }


    @Test
    public void validPerfectGame() {
        Bowling bowling = new Bowling();
        int[] game = {10,10,10,10,10,10,10,10,10,10,10,10};
        assertEquals("Total points", 300, bowling.runGame(game));
    }
}
