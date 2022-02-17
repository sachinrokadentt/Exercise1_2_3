import junit.framework.TestCase;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


public class EmployeeTest extends TestCase {

    private Employee employee;

    @Before
    public void setUp(){
        employee=new Employee(7,3);

    }




    public void testComputeBaseSalary() {
    assertEquals(420,employee.computeBaseSalary(),0);
    }

    public void testAddSal() {
        employee.addSal();
        assertEquals(430,employee.getBaseSalary(),0);
    }

    public void testAddWork() {
        employee.computeBaseSalary();
        employee.addSal();
        employee.addWork();
        assertEquals(530,employee.getBaseSalary(),0);
    }


}