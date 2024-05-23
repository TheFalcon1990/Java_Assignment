package assignment;

import org.testng.annotations.Test;

import static org.junit.Assert.*;


public class EmployeeTest {

    Employee emp;

    @Test
    void CalculateWage()throws Exception{
        emp = new Employee("Shery",50);
        assertEquals(5.0,emp.CalculateWage(),0.1);
        emp.addUnsuitableCakes(10);
        emp.increaseCakes(10);
        assertEquals(40,emp.getCakesMade(),0.1);


        emp = new Employee("Hammad",30);
        emp.addUnsuitableCakes(10);
        assertEquals(1.0,emp.CalculateWage(),0.1);

    }


    @Test
    void IncreaseCakes() throws Exception {
        emp = new Employee("Hammad",30);
        assertEquals(3.0,emp.CalculateWage(),0.5);
        emp.increaseCakes(10);
        assertEquals(40,emp.getCakesMade());
        assertThrows(Exception.class, () -> {emp.increaseCakes(-100);});
    }

    @Test
    void addUnsuitableCakes() throws Exception {
        emp = new Employee("Hammad",30);
        emp.addUnsuitableCakes(10);
        assertEquals(10,emp.getCakesMade());
        assertThrows(Exception.class, () -> {emp.addUnsuitableCakes(-100);});
    }


    @Test
    void getName() throws Exception {
        emp = new Employee("Hammad",30);
        emp.addUnsuitableCakes(10);
        assertEquals("Hammad",emp.getName());
    }


}
