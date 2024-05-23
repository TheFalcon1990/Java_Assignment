package assignment;


import java.text.NumberFormat;

public class Employee implements Comparable<Employee>{

    private String name;

    private int cakesMade;

    private  int unsuitableCupCakes;


    // Constructors for Name normal and normal Cakes

    public Employee(String name ,int cakesMade)throws Exception{

        this.name = name;
        if(cakesMade < 0){
            throw new Exception("Invalid number of Cupcakes");
        }
        this.cakesMade = cakesMade;
        this.unsuitableCupCakes = 0;

    }

    // Constructor for unsuitable Cakes when user want to add unsuitable cakes

    public  Employee(String name, int cakesMade , int unsuitableCupCakes)throws Exception{
        this.name = name;
        if(cakesMade <0 || unsuitableCupCakes < 0 ){
            throw new Exception("Incorrect data entered");
        }
        this.cakesMade = cakesMade;
        addUnsuitableCakes(unsuitableCupCakes);
    }



    // Increased cupcakes method

    public void increaseCakes(int value) throws Exception{
        if(value < 0){
            throw new Exception("Wrong Values inserted");
        }
        this.cakesMade += value;
    }

    // add Unsuitable cupcakes' method.

    public void addUnsuitableCakes(int value) throws Exception{
        if(value < 0){
            throw new Exception("Wrong Value inserted");
        }
        this.cakesMade = Math.max(0,cakesMade - (2 * value));
        this.unsuitableCupCakes += value;

    }


    // Methods


    public double CalculateWage(){
        double wage = (this.cakesMade > 50) ? 5 + (this.cakesMade - 50) * 0.15 : 0.10 * this.cakesMade;
        return Math.max(wage, 0);
    }


    // Getters


    public String getName() {
        return name;
    }

    public int getCakesMade(){
        return cakesMade;
    }

    public int getUnsuitableCupCakes() {
        return unsuitableCupCakes;
    }


    //setters


    public void setUnsuitableCupCakes(int unsuitableCupCakes) {
        this.unsuitableCupCakes = unsuitableCupCakes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCakesMade(int cakesMade) {
        this.cakesMade = cakesMade;
    }

    public static String printCurrency(double value){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        return format.format(value);
    }
    @Override
    public String toString() {
        return String.format("%-20s %-30s %-30s %-25s %-20s\n",
                getName(),
                getCakesMade(),
                getUnsuitableCupCakes(),
                "Average Employee",
                printCurrency(CalculateWage()));
    }

    @Override
    public int compareTo(Employee employee) {
        if (employee == null) {
            return 1; // This object is greater than the null object
        }
        int total_cakes = Integer.compare(employee.getCakesMade(), this.cakesMade);
        if (total_cakes == 0) {
            return this.name.compareToIgnoreCase(employee.getName());
        }
        return total_cakes;
    }

}