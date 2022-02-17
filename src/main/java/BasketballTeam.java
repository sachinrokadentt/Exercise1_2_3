import java.util.ArrayList;
import java.util.Comparator;
public class BasketballTeam implements Team, Comparator<BasketballTeam>{
    String basketballTeamName;
    String basketballSponsor;
    int basketballPoints;
    ArrayList<BasketballTeam> basketObj=new ArrayList<>();

    public BasketballTeam() {}       //Default(Empty Constructor)

    //ParameterizeConstructor for initializing members
    public BasketballTeam( int basketballPoints,String basketballTeamName) {
        this.basketballTeamName = basketballTeamName;
        this.basketballPoints = basketballPoints;
    }

//getter methods for variable
    @Override
    public String getTeamName() {
        return basketballTeamName;
    }

    @Override
    public int getPoints() {
        return basketballPoints;
    }

    //Return points as per Basketball condition
    @Override
    public int updatePoints(String result) {
        if(result.equalsIgnoreCase("Win"))
            return 2;
        else
            return 0;

    }

//Compare Basketball object by overriding compare method in Comparator<BasketballTeam> interface.
    @Override
    public int compare(BasketballTeam obj1, BasketballTeam obj2) {
        if(obj1.basketballPoints==obj2.basketballPoints)
        {
            return 0;
        }
        else if(obj1.basketballPoints< obj2.basketballPoints){
            return 1;
        }
        else {
            return -1;
        }
    }
}
