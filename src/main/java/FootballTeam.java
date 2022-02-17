import java.util.ArrayList;
import java.util.Comparator;

public class FootballTeam implements Team, Comparator<FootballTeam> {
    String footballTeamName;
    String sponsor;
    int footballPoints;
    public FootballTeam(){}     //Default(Empty Constructor)

    //ParameterizeConstructor for initializing members
    public FootballTeam( int footballPoints,String footballTeamName) {
        this.footballTeamName = footballTeamName;
        this.footballPoints = footballPoints;
    }

    //Return points as per football condition
    @Override
    public int updatePoints(String result) {
        //System.out.println("Result "+result);
        if(result.equalsIgnoreCase("Win"))
            return 3;
        else if(result.equalsIgnoreCase("Drawn"))
            return 1;
        else
            return 0;

    }

    //getter and setter methods for variable
    @Override
    public String getTeamName(){
        return footballTeamName;
    }

    public void setFootballPoints(int footballPoints) {
        this.footballPoints = footballPoints;
    }

    @Override
    public int getPoints() {
        return footballPoints;
    }


    //Compare Football object by overriding compare method in Comparator<FootballTeam> interface.
    @Override
    public int compare(FootballTeam obj1, FootballTeam obj2) {
        if(obj1.footballPoints==obj2.footballPoints)
        {
            return 0;
        }
        else if(obj1.footballPoints< obj2.footballPoints){
            return 1;
        }
        else {
            return -1;
        }
    }
}
