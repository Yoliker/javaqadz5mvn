package ru.netology.javaqa.javaqadz5z1mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MonthRestCalcServiceTest {
    @Test
    public void calcMonthRestQuality1() {
        MonthRestService service = new MonthRestService();
        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMonthRestQuality2() {
        MonthRestService service = new MonthRestService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}
