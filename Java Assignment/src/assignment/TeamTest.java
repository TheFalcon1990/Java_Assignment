package assignment;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class TeamTest {

    @Test
    void addEmployee() throws Exception {
        Team team = new Team();
        Employee Ali = new Employee("Ali",10);
        team.addEmployee(Ali);
        assertEquals(Ali,team.getTeam().get(0));


    }


    @Test
    void getTotalCakes() throws Exception{
        Team team = new Team();
        Employee Ali = new Employee("Ali",10);
        team.addEmployee(Ali);
        assertEquals(10,team.getTotalCakes());

    }

    @Test
    void getTotalWage() throws Exception {
        Team team = new Team();
        Employee Ali = new Employee("Ali",50);
        Employee Hammad = new Employee("Hammad",50);

        team.addEmployee(Ali,Hammad);
        List<Employee> myList = List.of(Ali,Hammad);

        assertEquals(10.0,team.getTotalWage(),0.1);
        assertArrayEquals(myList.toArray(),team.getTeam().toArray());

    }

}