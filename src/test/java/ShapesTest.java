import junit.framework.TestCase;

public class ShapesTest extends TestCase {

    public void testAreaOfSquare() {
        assertEquals(16,Shapes.areaOfSquare(4),0);
        assertEquals(0,Shapes.areaOfSquare(-2),0);
    }

    public void testPerimeterOfSquare() {
        assertEquals(16,Shapes.perimeterOfSquare(4),0);
        assertEquals(0,Shapes.perimeterOfSquare(-34),0);
    }

    public void testAreaOfCircle() {
        assertEquals(7.06,Shapes.areaOfCircle(1.5),0.1);
        assertEquals(0,Shapes.areaOfCircle(-11.5),0.1);
    }

    public void testPerimeterOfCircle() {
        assertEquals(9.42,Shapes.perimeterOfCircle(1.5),0.1);
        assertEquals(0,Shapes.perimeterOfCircle(-2.5),0.1);
    }

    public void testAreaOfRectangle() {
        assertEquals(6,Shapes.areaOfRectangle(3,2),0);
        assertEquals(0,Shapes.areaOfRectangle(-13,2),0);
        assertEquals(0,Shapes.areaOfRectangle(3,-12),0);
    }

    public void testPerimeterOfRectangle() {
        assertEquals(10,Shapes.perimeterOfRectangle(3,2),0);
        assertEquals(4,Shapes.perimeterOfRectangle(-33,2),0);
        assertEquals(6,Shapes.perimeterOfRectangle(3,-22),0);
    }
}