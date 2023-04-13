package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


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

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/ru.netology.services/ChoiceService.csv")
    public void parametersTest(int expected, int income, int expenses, int thresold) {
        ChoiceServices services = new ChoiceServices();

        int actual = services.calculate(income, expenses, thresold);

        Assertions.assertEquals(expected, actual);

    }
    

}
