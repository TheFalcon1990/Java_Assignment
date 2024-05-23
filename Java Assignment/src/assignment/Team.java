package assignment;


import java.util.ArrayList;
import java.util.Collections;

public class Team {


    public static final String ANSI_Yellow = "\u001b[33;1m";
    public static final String ANSI_RESET = "\u001B[01m";
    public static final String Ansi_Blue = "\u001B[34m";


    private ArrayList<Employee> team = new ArrayList<Employee>();


    private Currency utils = new Currency();

    // constructor
    public Team(){

    }

    public Team(ArrayList<Employee> team){
        this.team.addAll(team);
    }

    // Method

    public void addEmployee(Employee... worker){
        Collections.addAll(this.team, worker);
    }
    public String getSummary(){

        return "Total Cakes: "
                + getTotalCakes()
                + "\n" + "Total Wage:"
                + utils.printCurrency(getTotalWage());
    }


//    Method to get TotalCakes
    public int getTotalCakes(){
        int TotalCakes = 0;
        for(Employee worker : this.team){TotalCakes += worker.getCakesMade();}
        return TotalCakes;
    }

//    Calculating wage in getter.

    public double getTotalWage(){

        double TotalWage = 0;

        for (Employee worker : this.team){TotalWage += worker.CalculateWage();}

        return TotalWage;
    }

    // Sorting using built-in function collection.sort
    public void sort(){
        Collections.sort(team);
    }



// toString table which is overriding Employee table

    @Override
    public String toString() {
        String table = String.format("\n" + ANSI_Yellow+"%-20s%-30s %-30s  %-25s%-20s"
                + "\n", "Employee Name","Suitable Cakes", "Unsuitable Cakes","Employee Type"," Total Wage\n");
        for (Employee employee : team) table += Ansi_Blue + employee.toString();
        return table;
    }

    // Getters And Setters

    public ArrayList<Employee> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Employee> team) {
        this.team = team;
    }


}
