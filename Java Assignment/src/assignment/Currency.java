package assignment;

import java.text.NumberFormat;

public class Currency {

    public String printCurrency(double value){
        NumberFormat format = NumberFormat.getCurrencyInstance();
        return format.format(value);
    }
}
