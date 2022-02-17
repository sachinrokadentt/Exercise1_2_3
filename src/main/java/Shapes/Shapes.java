package Shapes;//importing Scanner I/O Class from util package for accepting user input.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length;
        double breadth;
        double height;
        double radius;
//Accepting input from user
        try {
            System.out.println("Enter input for length: ");
                length = sc.nextDouble();


            System.out.println("Enter input for breadth: ");
            breadth = sc.nextDouble();
            System.out.println("Enter input for height: ");
            height = sc.nextDouble();
            System.out.println("Enter input for radius: ");
            radius = sc.nextDouble();

//Calling the function and printing the result for (Perimeter and Area) of Square.
        System.out.println("Area of Square: "+areaOfSquare(length));
        System.out.println("Perimeter of Square: "+perimeterOfSquare(length));

//Calling the function and printing the result for (Perimeter and Area) of Circle.
        System.out.println("Area of Circle: "+areaOfCircle(radius));
        System.out.println("Perimeter of Circle: "+perimeterOfCircle(radius));

//Calling the function and printing the result for (Perimeter and Area) of Rectangle.
        System.out.println("Area of Rectangle: "+areaOfRectangle(height,breadth));
        System.out.println("Perimeter of Rectangle: "+perimeterOfRectangle(height,breadth));
        }
        catch(InputMismatchException i)
        {
            System.out.println("Exception Occur, Please enter input of type double.");
        }

    }//Main method bracket ends


/*Method definitions
Define logic for areaOfSquare and Check the value of parameters, if less than zero initialize 0 value.*/
    public static double areaOfSquare(double length){
        if(length<0){
            length=0;
        }
        return length*length;

    }
//Define logic for perimeterOfSquare and Check the value of parameters, if less than zero initialize 0 value.
    public static double perimeterOfSquare(double length){
        if(length<0){
            length=0;
        }
        return 4*length;

    }

//Define logic for areaOfCircle and Check the value of parameters, if less than zero initialize 0 value.
    public static double areaOfCircle(double radius){
        if(radius<0){
            radius=0;
        }
        return radius*radius*Math.PI;

    }
//Define logic for perimeterOfCircle and Check the value of parameters, if less than zero initialize 0 value.
    public static double perimeterOfCircle(double radius){
        if(radius<0){
            radius=0;
        }
        return 2*Math.PI*radius;

    }

//Define logic for reaOfRectangle and Check the value of parameters, if less than zero initialize 0 value.
    public static double areaOfRectangle(double height,double breadth){
        if(breadth<0){
            breadth=0;
        }
        if(height<0){
            height=0;
        }
        return height*breadth;

    }
//Define logic for perimeterOfRectangle and Check the value of parameters, if less than zero initialize 0 value.
    public static double perimeterOfRectangle(double height,double breadth){
        if(breadth<0){
            breadth=0;
        }
        if(height<0){
            height=0;
        }
        return 2*(height+breadth);

    }

}//class bracket ends.
