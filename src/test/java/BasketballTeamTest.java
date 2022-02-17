import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketballTeamTest {
    private BasketballTeam basket;

    @Before
    public void setUp(){
        basket=new BasketballTeam(7,"Mumbai Indians");

    }
    @Test
    public void getTeamName() {
        assertEquals("Mumbai Indians",basket.getTeamName());
    }

    @Test
    public void getPoints() {
        assertEquals(7,basket.getPoints());
    }

    @Test
    public void updatePoints() {
        assertEquals(2,basket.updatePoints("Win"));
        assertEquals(0,basket.updatePoints("Lose"));

    }
}