package ShapesTest;

import Shapes.*;
import junit.framework.TestCase;
import org.junit.Before;

public class ShapesTest extends TestCase {
    private Shape sCircle;
    private Shape sSquare;
    private Shape sRectangle;

    @Before
    public void setUp(){
        sCircle=new Circle();
        sSquare=new Square();
        sRectangle=new Rectangle();
    }

    public void testAreaOfSquare() {
        assertEquals(16,sSquare.area(4),0);
        assertEquals(0,sSquare.area(-2),0);
    }

    public void testPerimeterOfSquare() {
        assertEquals(16,sSquare.perimeter(4),0);
        assertEquals(0, sSquare.perimeter(-34),0);
    }

    public void testAreaOfCircle() {
        assertEquals(7.06,sCircle.area(1.5),0.1);
        assertEquals(0,sCircle.area(-11.5),0.1);
    }

    public void testPerimeterOfCircle() {
        assertEquals(9.42,sCircle.perimeter(1.5),0.1);
        assertEquals(0,sCircle.perimeter(-2.5),0.1);
    }

    public void testAreaOfRectangle() {
        assertEquals(6,sRectangle.area(3,2),0);
        assertEquals(0,sRectangle.area(-13,2),0);
        assertEquals(0,sRectangle.area(3,-12),0);
    }

    public void testPerimeterOfRectangle() {
        assertEquals(10,sRectangle.perimeter(3,2),0);
        assertEquals(4,sRectangle.perimeter(-33,2),0);
        assertEquals(6,sRectangle.perimeter(3,-22),0);
    }
}