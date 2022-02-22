package Shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
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

            //interface reference to class object, which used to implement runtime polymorphism.
            Shape sCircle=new Circle();
            Shape sSquare=new Square();
            Shape sRectangle=new Rectangle();

//Calling the function and printing the result for (Perimeter and Area) of Square.
            System.out.println("Area of Square: "+sSquare.area(length));
            System.out.println("Perimeter of Square: "+sSquare.perimeter(length));

//Calling the function and printing the result for (Perimeter and Area) of Circle.
            System.out.println("Area of Circle: "+sCircle.area(radius));
            System.out.println("Perimeter of Circle: "+sCircle.perimeter(radius));

//Calling the function and printing the result for (Perimeter and Area) of Rectangle.
            System.out.println("Area of Rectangle: "+sRectangle.area(height,breadth));
            System.out.println("Perimeter of Rectangle: "+sRectangle.perimeter(height,breadth));
        }
        catch(InputMismatchException i)
        {
            System.out.println("Exception Occur, Please enter input of type double.");
        }

    }//Main method bracket ends
}
