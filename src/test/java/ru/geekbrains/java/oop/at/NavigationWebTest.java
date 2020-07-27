package ru.geekbrains.java.oop.at;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.java.oop.at.base.WebTestBase;
import ru.geekbrains.java.oop.at.page.PageBase;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

@DisplayName("Тестирование навигации с PageObject")
public class NavigationWebTest extends WebTestBase {

    @DisplayName("Параметризованное тестирование")
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


