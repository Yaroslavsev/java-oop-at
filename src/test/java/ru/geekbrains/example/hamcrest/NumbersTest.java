package ru.geekbrains.example.hamcrest;
import static org.hamcrest.Matchers.*;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

public class NumbersTest {
    @Test
    void greaterThanTest() {
        double numberActual = 100.00;
        double numberExpected = 90.00;

        MatcherAssert.assertThat(numberActual, greaterThan(numberExpected));
    }

    @Test
    void lessThanOrEqualToTest() {
        double numberActual = 50.00;
        double numberExpected = 100.00;

        MatcherAssert.assertThat(numberActual, lessThanOrEqualTo(numberExpected));
    }

    @Test
    void closeToTest() {
        double numberActual = 100.00;
        double numberExpected = 98.00;

        MatcherAssert.assertThat(numberActual, closeTo(numberExpected, 2));
    }
}
