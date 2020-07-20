package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.geekbrains.java.oop.at.base.TestBase;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

@DisplayName("Тестирование навигации")
public class NavigationTest extends TestBase {

    @DisplayName("Параметризованное тестирование")
    @ParameterizedTest
    @MethodSource("listOfNavChecks")
    void navChecks(String locatorToClick, String expectedText, String locatorToGetText) {
        chromeDriver.findElement(By.cssSelector(locatorToClick)).click();
        Assertions.assertEquals(
                expectedText,
                chromeDriver.findElement(By.cssSelector(locatorToGetText)).getText()
        );
        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer\"]")).isDisplayed();
    }

    public static Stream<Arguments> listOfNavChecks(){
        return Stream.of(
                Arguments.of("[id=\"nav\"] [href=\"/topics\"]", "Форум", "[id=\"top-menu\"] h2"),
                Arguments.of("[id=\"nav\"] [href=\"/events\"]", "Вебинары", "[id=\"top-menu\"] h2"),
                Arguments.of("[id=\"nav\"] [href=\"/posts\"]", "Блог", "[id=\"top-menu\"] h2"),
                Arguments.of("[id=\"nav\"] [href=\"/tests\"]", "Тесты", "[id=\"top-menu\"] h2"),
                Arguments.of("[id=\"nav\"] [href=\"/career\"]", "Карьера", "[id=\"top-menu\"] h2"),
                Arguments.of("[id=\"nav\"] [href=\"/courses\"]", "Курсы", "[id=\"top-menu\"] h2")
        );
    }
}


