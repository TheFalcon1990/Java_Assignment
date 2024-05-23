package assignment;

public class QC extends Employee{


    public QC(String name,int cupcakes,int wrongCakes) throws Exception {
        super(name,cupcakes,wrongCakes);
    }

    public QC(String name,int cupcakes) throws Exception {
        super(name,cupcakes);
    }


    @Override
    public double CalculateWage() {
        double wage = super.CalculateWage() * 1.12;
        return Math.floor(wage * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-30s %-30s %-25s %-20s\n",getName()
                ,getCakesMade()
                ,getUnsuitableCupCakes(), "QC Employees "
                ,printCurrency(CalculateWage()));
    }
}
