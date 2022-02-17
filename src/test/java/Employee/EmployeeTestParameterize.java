package Employee;

import Employee.Employee;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmployeeTestParameterize extends TestCase {
    private int salaryPerHour=0;
    private int hourPerDay=0;
    private double expected;


    public EmployeeTestParameterize(int hourPerDay,int salaryPerHour,  double expected) {
        if(salaryPerHour<0)
        {
            this.salaryPerHour = 0;
        }
        else
        {
            this.salaryPerHour = salaryPerHour;
        }
        if(hourPerDay<0)
        {
            this.hourPerDay = 0;
        }
        else {
            this.hourPerDay = hourPerDay;
        }

        this.expected = expected;
    }

    private Employee employee;
    @Parameterized.Parameters
    public static Collection<Object[]> multipleTest()
    {
        return Arrays.asList(new Object[][]{
                {5,10,1000.0},
                {4,5,410.0},
                {7,12,1780.0},
                {7,3,530.0},
                {5,-6,10},
                {-33,5,10}

        });
    }

    @org.junit.Test
        public void multipleTestForSalary() {
        employee=new Employee(hourPerDay,salaryPerHour);
        employee.computeBaseSalary();
        employee.addSal();
        employee.addWork();
        assertEquals(expected,employee.getBaseSalary(),0);
    }

}