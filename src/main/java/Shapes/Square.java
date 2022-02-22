package Shapes;

public class Square implements Shape {

    /*Square method definitions
Define logic for areaOfSquare and Check the value of parameters, if less than zero initialize 0 value.*/
    @Override
    public double area(double length){
        if(length<0){
            length=0;
        }
        return length*length;

    }

    //Define logic for perimeterOfSquare and Check the value of parameters, if less than zero initialize 0 value.
    @Override
    public double perimeter(double length){
        if(length<0){
            length=0;
        }
        return 4*length;

    }

    @Override
    public double area(double x, double y) {
        return 0;
    }

    @Override
    public double perimeter(double x, double y) {
        return 0;
    }
}
