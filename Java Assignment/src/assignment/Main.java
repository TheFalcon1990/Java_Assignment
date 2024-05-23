package assignment;



public class Main {

    public static final String ANSI_Green = "\u001B[32m";  // This is for font colour

    public static final String ANSI_RESET = "\u001B[01m";


    public static void main(String[] args) {
        try {
            Employee Andrew = new Employee("Andrew",162); // added cupcakes where user get 10p per cake
            Andrew.increaseCakes(32); // Increased cupcakes will pay employee 15p per cake.
            Andrew.addUnsuitableCakes(16); // Unsuitable cupcakes will deduct value of 2 cakes from employees wage if he makes one unsellable cake.
            Andrew.toString();  // This object is to see if program get the result for any single employee if user want to


            Employee Hafsa = new Employee("Hafsa",51);
            Hafsa.increaseCakes(44);
            Hafsa.addUnsuitableCakes(21);

            Employee Ayub = new Employee("Ayub",193);
            Ayub.increaseCakes(102);
            Ayub.addUnsuitableCakes(12);

            Employee Amaan = new Employee("Amaan",309);
            Amaan.increaseCakes(56);
            Amaan.addUnsuitableCakes(1);

            Employee Gary = new Employee("Gary",49);
            Gary.increaseCakes(62);
            Gary.addUnsuitableCakes(11);

            Employee Diane = new Employee("Diane",217); // added to check the sorting for average employee
            Diane.increaseCakes(10);
            Diane.addUnsuitableCakes(2);

            Employee Diana = new Employee("Diana", 217);
            Diana.increaseCakes(10);
            Diana.addUnsuitableCakes(2);

            QC Sam = new QC("Sam",10);   // This object and the one below is added to check the sorting in QC class

            QC Same = new QC("Same",10);



            Team team = new Team();

            team.addEmployee(Andrew,Hafsa,Ayub,Gary,Diane,Sam,Diana,Amaan,Same);

            team.sort();


            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println("                                                 The Crafty Cakes                                                       ");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            System.out.println(team +"\n" + ANSI_Green + team.getSummary() + ANSI_RESET);
            System.out.println("\n"+ Andrew);


        }

        catch (Exception e){

            System.out.println(e.getMessage());

        }

        finally {
            System.out.println("Program execution completed");
        }
    }

}

