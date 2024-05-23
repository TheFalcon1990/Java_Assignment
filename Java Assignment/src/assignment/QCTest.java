package assignment;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class QCTest {

    @Test
    void CalculateWage() throws Exception{

        QC QualityController = new QC("Hussain",120);
        assertEquals(17.36,QualityController.CalculateWage(),0.1);

    }
}