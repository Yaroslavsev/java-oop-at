package ru.geekbrains.example.hamcrest;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class StringsTest {
    @Test
    void equalToIgnoringCaseTest() {
        String name = "АзБуКа";
        MatcherAssert.assertThat("Азбука", equalToIgnoringCase(name));
    }

    @Test
    void containsStringTest() {
        String name = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate.";
        MatcherAssert.assertThat(name, containsString("tet"));
    }

    @Test
    void endsWithTest() {
        String name = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate.";
        MatcherAssert.assertThat(name, endsWith("tate."));
    }

    @Test
    void equalToCompressingWhiteSpaceTest() {
        String name = "Lorem    ipsum    dolor   sit                 amet.";
        MatcherAssert.assertThat(name, equalToCompressingWhiteSpace("Lorem ipsum dolor sit amet."));
    }
}
