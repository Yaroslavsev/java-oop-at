package ru.geekbrains.example.hamcrest;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import static org.hamcrest.CoreMatchers.not;

import static org.hamcrest.Matchers.*;

public class MultiMatchersExamples {
    @Test
    void allOfTest(){
        int number = 100;
        MatcherAssert.assertThat(number, allOf(
                greaterThan(99),
                lessThan(101),
                equalTo(50*2)
        ));
    }

    @Test
    void anyOfTest(){
        int number = 100;
        MatcherAssert.assertThat(number, anyOf(
                greaterThan(1000),
                lessThan(1),
                equalTo(50*2)
        ));
    }

    @Test
    void notTest(){
        int number = 100;
        MatcherAssert.assertThat(number, not(greaterThan(1000)));
        MatcherAssert.assertThat(number, not(lessThan(1)));
        MatcherAssert.assertThat(number, not(equalTo(55*2)));
    }
}
