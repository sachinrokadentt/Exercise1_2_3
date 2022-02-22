import java.io.*;
import java.util.*;

public class Matches { // Separate class for (main method and logic) which access FootballTeam and BasketballTeam Class
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            BasketballTeam basketClassObj = new BasketballTeam();
            FootballTeam footballClassObj = new FootballTeam();
            String teamName;
            int points;
            String resultTeamName;             //ResultCSV TeamName
            String matchResult;                //Result like win,drawn,lose from result csv
            String linesInTeamFile;       //Variable to store single line read from csv
            String sport;                       //Variable store Matches.Team Category
            String[] teams;                    //Array store linesInTeamFile content like which sport,teamName,points


            //arraylist of type class, which separately store teams.csv file content
            ArrayList<BasketballTeam> basketObj = new ArrayList<>();
            ArrayList<FootballTeam> footballObj = new ArrayList<>();

            //arraylist of String array, which separately store result.csv file content
            ArrayList<String[]> FT_resultList = new ArrayList<>();
            ArrayList<String[]> BT_resultList = new ArrayList<>();
            int num;
            int finalPoints;
            int additionalPoint;
            do {
                System.out.println("Enter choice:-\n"
                        + "1. Load teams parameters from teams.csv file; for each line define the instance for a team\n"
                        + "2. Print standing of Football teams (ordering by points)\n"
                        + "3. Print standing of Basketball teams (ordering by points)\n"
                        + "4. Load results of the last matches from results.csv file and update teams points based on loaded results\n"
                        + "5. Print new standing of Football teams (ordering by points)\n"
                        + "6. Print new standing of Basketball teams (ordering by points)");
                int choice = sc.nextInt();
                sc.nextLine();

                //As per choice selected, call the feature implemented method.
                switch (choice) {
                    case 1:
                        //parsing a Teams CSV file into BufferedReader class constructor
                        BufferedReader teamsFile = new BufferedReader(new FileReader("src\\main\\resources\\teams.csv"));
                        System.out.println("TeamCSV file data:");
                        while ((linesInTeamFile = teamsFile.readLine()) != null)   //returns a Boolean value
                        {
                            teams = linesInTeamFile.split(",");    // use comma as separator
                            sport = teams[0];
                            teamName = teams[1];
                            points = Integer.parseInt(teams[2]);

                            //if sport is basketball, create object of basketballTeam and add it in basketball_ArrayList.
                            if (sport.equalsIgnoreCase("Basketball")) {
                                basketObj.add(new BasketballTeam(points, teamName));
                            } else if (sport.equalsIgnoreCase("Football"))//if sport is football, create object of footballTeam and add it in football_ArrayList.
                            {
                                footballObj.add(new FootballTeam(points, teamName));
                            }
                            //Printing Teams.csv files content.
                            System.out.println("[Sport Name=" + sport + ", Matches.Team Name=" + teamName + ", Point=" + points + "]");

                        }//while loop for teams.csv ends


                        break;
                    case 2:
                        //Ordering the arrayList of type-class by points. Using comparator interface implemented by FootballTeam which has compare method.
                        System.out.println("\n");
                        Collections.sort(footballObj, new FootballTeam());
                        System.out.println("Football sport details(After Ordering):");
                        for (int i = 0; i < footballObj.size(); i++) {
                            System.out.println("[Matches.Team Name=" + footballObj.get(i).getTeamName() + ", Point=" + footballObj.get(i).getPoints() + "]");
                        }

                        break;
                    case 3:
                        //Ordering the arrayList of type-class by points. Using comparator interface implemented by BasketballTeam which has compare method.
                        System.out.println("\n*********************************************************");
                        Collections.sort(basketObj, new BasketballTeam());
                        System.out.println("Basketball sport details(After Ordering):");
                        for (BasketballTeam basketball : basketObj) {
                            System.out.println("[Matches.Team Name=" + basketball.getTeamName() + ", Point=" + basketball.basketballPoints + "]");
                        }
                        break;
                    case 4:
                        System.out.println("\n******************************Result CSV*******************************");
                        Scanner scanner = new Scanner(new File("src\\main\\resources\\results.csv"));
                        scanner.useDelimiter(",");
                        String lineInResultFile;      //Variable to store single line read from csv

                        System.out.println();
                        System.out.println("ResultCSV file data:");
                        while (scanner.hasNext()) {
                            lineInResultFile = scanner.nextLine();
                            String result[] = lineInResultFile.split(","); //Array store linesInResultFile content like matchResult,ResultTeam
                            resultTeamName = result[0];
                            matchResult = result[1];

                            //if resultTeam is basketball Sport Teams, add result[] array to BT_resultList_ArrayList.
                            if (resultTeamName.equalsIgnoreCase("Boston Celtics") || resultTeamName.equalsIgnoreCase("Los Angeles Lakers") || resultTeamName.equalsIgnoreCase("Cleveland Cavaliers")) {
                                BT_resultList.add(result);
                            } else {      // Else add result[] array to FT_resultList_ArrayList.
                                FT_resultList.add(result);
                            }

                            //Printing result.csv files content.
                            System.out.println("[Matches.Team Name: " + resultTeamName + ", " + "MatchResult: " + matchResult + "]");

                        } //while loop for result.csv ends
                        break;
                    case 5:
                        //Update the Football Arraylist by adding the point returns from updatePoints method of FootballClass.
                        for (int i = 0; i < FT_resultList.size(); i++) {
                            //calling updatePoints method using object of FootballArrayList
                            additionalPoint = footballObj.get(0).updatePoints(FT_resultList.get(i)[1]);
                            boolean flag = false;
                            for (int j = 0; j < footballObj.size(); j++) {
                                //check  teamName and Result Arraylist teamName equal or not
                                if (footballObj.get(j).getTeamName().equals(FT_resultList.get(i)[0])) {
                                    finalPoints = (footballObj.get(j).getPoints()) + additionalPoint;

                                    //call the setter method in FootballTeam class,and set the finalPoints to points.
                                    footballObj.get(j).setFootballPoints(finalPoints);
                                    flag = true;
                                }
                                if (flag) {
                                    break;
                                }
                            }
                        }
                        //Ordering the arrayList of type-class by points. Using comparator interface implemented by FootballTeam which has compare method.
                        Collections.sort(footballObj, new FootballTeam());
                        System.out.println();
                        System.out.println("Football sport details(After adding points):");
                        for (int i = 0; i < footballObj.size(); i++) {
                            System.out.println("[Matches.Team Name=" + footballObj.get(i).getTeamName() + ", Point=" + footballObj.get(i).getPoints() + "]");
                        }
                        break;

                     case 6:
                         //Update the Basketball Arraylist by adding the point returns from updatePoints method of BasketballClass.
                         System.out.println("*************************************************************");
                         for (int i = 0; i < BT_resultList.size(); i++) {

                             //calling updatePoints method using object of BasketballArrayList
                             additionalPoint = basketObj.get(0).updatePoints(BT_resultList.get(i)[1]);
                             for (int j = 0; j < basketObj.size(); j++) {
                                 //check  teamName and Result Arraylist teamName equal or not
                                 if (basketObj.get(j).getTeamName().equals(BT_resultList.get(i)[0])) {
                                     finalPoints = (basketObj.get(j).getPoints()) + additionalPoint;

                                     //using arraylist set method replace object of BasketBallTeam on index j from loop.
                                     basketObj.set(j, new BasketballTeam(finalPoints, basketObj.get(j).getTeamName()));
                                     break;
                                 }
                             }
                         }
                         System.out.println();

                         //Ordering the arrayList of type-class by points. Using comparator interface implemented by BasketballTeam which has compare method.
                         System.out.println();
                         Collections.sort(basketObj, new BasketballTeam());
                         System.out.println("Basketball sport details(After adding Points):");
                         for (BasketballTeam basketball : basketObj) {
                             System.out.println("[Matches.Team Name=" + basketball.getTeamName() + ", Point=" + basketball.basketballPoints + "]");
                         }
                         break;
                    default:
                        //if enter choice other than given.
                        System.out.println("Enter valid choice.");
                        break;
                }

                System.out.println("Do you want to continue. If yes enter 0. If not enter any key.");
                num = sc.nextInt();
            }
            while (num == 0); //Loop ends which displays choices.

        }catch (InputMismatchException i)
        {
            System.out.println("Input mismatched exception occurs enter valid data.");
        }// Input exception get handled.
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Index exception occurs, First load teams.csv. Select choice 1.");
        }// Index exception get handled.


    }//Main method Bracket Ends


}//Class Bracket Ends


