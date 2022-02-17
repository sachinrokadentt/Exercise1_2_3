import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FootballTeamTest {
    private FootballTeam football;

    @Before
    public void setUp(){
        football =new FootballTeam(10,"Delhi Team");
    }
    @Test
    public void getTeamName() {
        assertEquals("Delhi Team", football.getTeamName());
    }

    @Test
    public void getPoints() {
        assertEquals(10, football.getPoints());
    }

    @Test
    public void updatePoints() {
        assertEquals(3, football.updatePoints("Win"));
        assertEquals(1, football.updatePoints("Drawn"));
        assertEquals(0, football.updatePoints("Lose"));

    }
}