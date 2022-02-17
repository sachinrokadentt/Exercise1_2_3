import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasketballTeamTest {
    private BasketballTeam basket;

    @Before
    public void setUp(){
        basket=new BasketballTeam(7,"Mumbai Indians");

    }
    @Test
    public void getTeamName() {
        Assert.assertEquals("Mumbai Indians",basket.getTeamName());
    }

    @Test
    public void getPoints() {
        Assert.assertEquals(7,basket.getPoints());
    }

    @Test
    public void updatePoints() {
        Assert.assertEquals(2,basket.updatePoints("Win"));
        Assert.assertEquals(0,basket.updatePoints("Lose"));

    }
}