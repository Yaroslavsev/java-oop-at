package ru.geekbrains.example.junit.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsExamples {
    @Test
    void assertEqualsTestV1() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    void assertEqualsTestV2() {
        Assertions.assertEquals("Кошка", "Кошка");
    }

    @Test
    void assertArrayEqualsTest() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        Assertions.assertArrayEquals(a, b);
    }

    @Test
    void assertTrueTest() {
        Assertions.assertTrue(true, "ВСЕГДА пиши сообщение к assertTrue");
    }

    @Test
    void assertNullTest() {
        String dogName = null;
        Assertions.assertNull(dogName, "Проверка на NULL");
    }

    @Test
    void assertNotNullTest() {
        String dogName = "Шарик";
        Assertions.assertNotNull(dogName, "Проверка на НЕ NULL");
    }

    @Test
    void assertThrowsTest() {
        File file = new File("src\\test\\java\\ru\\geekbrains\\example\\junit\\assertions\\txt.txt");
        Assertions.assertThrows(FileNotFoundException.class, () -> new Scanner(file),
                "Проверка на то, выдает ли данный тест конкретную ошибку, в данном случае FileNotFoundException");
    }

    @Test
    void assertFailTest() {
        Assertions.fail("Текст сообщения, которое будет выводится при ошибке");
        //Тест всегда падает. Ничего не проверяет, нужен для того, что выводить ошибки, например, после цикла IF
    }

    @Test
    void assertAllTest() {
        Assertions.assertAll("Обязательный заголовок",
                () -> assertEquals(1, 2),
                () -> assertEquals(1, 1)
        );
        //Проверит все Assertions, даже если одна упадёт, выведет ошибки для каждой упавшей Assertion
    }
}
