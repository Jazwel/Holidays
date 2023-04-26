package ru.netology.services.vacations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationsOrNotTest {
    @Test
    void shouldRestOrNot1() {
        VacationsOrNot service = new VacationsOrNot();
        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldRestOrNot2() {
        VacationsOrNot service = new VacationsOrNot();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}