package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class ChoiceServicesTest {

    @Test
    public void threeMonthsOff () {
        ChoiceServices services = new ChoiceServices();

        int expected = 3;
        int actual = services.calculate (10_000, 3_000, 20_000);


       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void twoMonthsOff () {
        ChoiceServices services = new ChoiceServices();

        int expected = 2;
        int actual = services.calculate (100_000, 60_000, 150_000);


        Assertions.assertEquals(expected, actual);
    }
    
}
