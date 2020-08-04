package ru.geekbrains.java.oop.at.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.java.oop.at.base.WebTestBase;
import ru.geekbrains.java.oop.at.page.PageBase;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("Навигация")
public class NavigationWebTest extends WebTestBase {

    @ParameterizedTest
    @MethodSource("listOfNavChecks")
    void navChecks(String pageName) {

        PageBase pageBase = new PageBase(driver);

        pageBase.getNavigation().getButton(pageName).click();
        pageBase.checkPageName(pageName);

        pageBase.getHeader().isDisplayed();
        pageBase.getFooter().isDisplayed();

    }

    public static Stream<Arguments> listOfNavChecks() {
        return Stream.of(
                Arguments.of("Форум"),
                Arguments.of("Вебинары"),
                Arguments.of("Блог"),
                Arguments.of("Тесты"),
                Arguments.of("Карьера"),
                Arguments.of("Курсы")
        );
    }
}


