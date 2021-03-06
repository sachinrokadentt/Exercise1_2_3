package ShapesTest;
import Shapes.*;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ShapesTestParameterize extends TestCase {
    private double length = 0;
    private double breadth = 0;
    private double height = 0;
    private double radius = 0;
    private double circleArea=0;
    private double circlePerimeter=0;
    private double squareArea=0;
    private double squarePerimeter=0;
    private double rectangleArea=0;
    private double rectanglePerimeter=0;


    private Shape sCircle=new Circle();
    private Shape sSquare=new Square();
    private Shape sRectangle=new Rectangle();

    public ShapesTestParameterize(double length, double breadth, double height, double radius, double circleArea, double circlePerimeter, double squareArea, double squarePerimeter, double rectangleArea, double rectanglePerimeter) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.radius = radius;
        this.circleArea = circleArea;
        this.circlePerimeter = circlePerimeter;
        this.squareArea = squareArea;
        this.squarePerimeter = squarePerimeter;
        this.rectangleArea = rectangleArea;
        this.rectanglePerimeter = rectanglePerimeter;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> multipleTest() {
        return Arrays.asList(new Object[][]{
                {4, 2, 3, 1.5, 7.068, 9.42, 16.0, 16.0, 6.0, 10.0},
                {-4,-5,-2.0,-2,0,0,0,0,0,0}


        });
    }

    @org.junit.Test
    public void testAreaOfSquare() {
        assertEquals(squareArea, sSquare.area(length), 0);

    }
    @org.junit.Test
    public void testPerimeterOfSquare() {
        assertEquals(squareArea, sSquare.perimeter(length), 0);

    }
    @org.junit.Test
    public void testAreaOfCircle() {
        assertEquals(circleArea,sCircle.area(radius),0.1);

    }
    @org.junit.Test
    public void testPerimeterOfCircle() {
        assertEquals(circlePerimeter, sCircle.perimeter(radius),0.1);

    }
    @org.junit.Test
    public void testAreaOfRectangle() {
        assertEquals(rectangleArea,sRectangle.area(height,breadth),0);

    }
    @org.junit.Test
    public void testPerimeterOfRectangle() {
        assertEquals(rectanglePerimeter,sRectangle.perimeter(height,breadth),0);

    }


}

