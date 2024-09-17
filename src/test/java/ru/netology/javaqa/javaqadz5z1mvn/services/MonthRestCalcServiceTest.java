package ru.netology.javaqa.javaqadz5z1mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class MonthRestCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/params.csv")
    public void calcRestMonthQuality(int income, int expenses, int threshold, int expected) {
        MonthRestService service = new MonthRestService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
