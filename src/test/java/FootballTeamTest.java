import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FootballTeamTest {
    private FootballTeam football;

    @Before
    public void setUp(){
        football =new FootballTeam(10,"Delhi Matches.Team");
    }
    @Test
    public void getTeamName() {
        Assert.assertEquals("Delhi Matches.Team", football.getTeamName());
    }

    @Test
    public void getPoints() {
        Assert.assertEquals(10, football.getPoints());
    }

    @Test
    public void updatePoints() {
        Assert.assertEquals(3, football.updatePoints("Win"));
        Assert.assertEquals(1, football.updatePoints("Drawn"));
        Assert.assertEquals(0, football.updatePoints("Lose"));

    }
}