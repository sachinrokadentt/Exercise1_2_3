package Shapes;

public class Rectangle implements Shape{
    @Override
    public double area(double y) {
        return 0;
    }

    @Override
    public double perimeter(double y) {
        return 0;
    }

    //Define logic for reaOfRectangle and Check the value of parameters, if less than zero initialize 0 value.
    @Override
    public double area(double height,double breadth){
        if(breadth<0){
            breadth=0;
        }
        if(height<0){
            height=0;
        }
        return height*breadth;

    }
    //Define logic for perimeterOfRectangle and Check the value of parameters, if less than zero initialize 0 value.
    @Override
    public double perimeter(double height,double breadth){
        if(breadth<0){
            breadth=0;
        }
        if(height<0){
            height=0;
        }
        return 2*(height+breadth);

    }

}
