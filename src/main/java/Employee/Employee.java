package Employee;//importing Scanner I/O Class from util package for accepting user input.
import java.util.Scanner;

public class Employee {
    private int hourlySalaryPerHours;
    private int numberOfHoursPerDay;
    private double baseSalary;


    public Employee()
    {}
    public Employee(int hourPerDay,int salaryPerHour) {
        if(hourPerDay<0)
        {
            this.numberOfHoursPerDay = 0;
        }
        else {
            this.numberOfHoursPerDay = hourPerDay;
        }
        if (salaryPerHour<0)
        {
            this.hourlySalaryPerHours = 0;
        }
        else {
            this.hourlySalaryPerHours = salaryPerHour;
        }


    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        Scanner scanner=new Scanner(System.in);
        int salaryPerHour=0;
        int hourPerDay=0;
        String name = null;


//Accepting input from user for each employee details
        System.out.println("Enter the input for number of Employee.Employee (ex. 3 for 3 peoples):");
        int numberOfEmployee=scanner.nextInt();

//Loop for number of employee, Accepting user-input for declared variables
        for (int i=0;i<numberOfEmployee;i++) {
            System.out.println("Enter the Hour Per Day for "+(i+1)+" Employee");
            hourPerDay=scanner.nextInt();
            System.out.println("Enter the Salary per Hour for "+(i+1)+" Employee");
            salaryPerHour=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter name for "+(i+1)+" Employee");
            name=scanner.nextLine();

//Calling the function and printing the final salary for each employee
            emp.getInfo(salaryPerHour,hourPerDay);
            emp.computeBaseSalary();
            emp.addSal();
            emp.addWork();
            System.out.println("The computed Final Salary of Employee.Employee named:-"+name+" is "+emp.baseSalary+"$");

        }
    }//Main method bracket ends

//Method definitions
//Initialize the declared variable by function parameters which is user-input

    public double getBaseSalary() {
        return baseSalary;
    }

    public void getInfo(int hourlySalary, int numberOfHoursPerDay)
    {
        this.hourlySalaryPerHours=hourlySalary;
        this.numberOfHoursPerDay=numberOfHoursPerDay;
    }

//Define logic for calculating baseSalary of employee for 20 days.
    public double computeBaseSalary()
    {
        this.baseSalary=this.hourlySalaryPerHours*this.numberOfHoursPerDay*20;
        return baseSalary;
    }

//Add fixed amount salary for employee, under (BaseSalary less than 500$) conditions.
    public void addSal(){
        if(computeBaseSalary()<500)
        {
            this.baseSalary+=10;
        }
    }

//Add fixed-amount salary Daily for employee, under (numberOfHoursPerDay greater than 6) conditions.
    public void addWork(){
        if(numberOfHoursPerDay>6)
        {
            this.baseSalary+=(20*5);
        }
        else
        {
            this.baseSalary=baseSalary;
        }

    }

}//class bracket ends.
