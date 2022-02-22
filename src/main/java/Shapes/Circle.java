package Shapes;

public class Circle implements Shape {
    //Define logic for areaOfCircle and Check the value of parameters, if less than zero initialize 0 value.
    @Override
    public double area(double radius){
        if(radius<0){
            radius=0;
        }
        return radius*radius*Math.PI;

    }

    @Override
    //Define logic for perimeterOfCircle and Check the value of parameters, if less than zero initialize 0 value.
    public double perimeter(double radius){
        if(radius<0){
            radius=0;
        }
        return 2*Math.PI*radius;

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
