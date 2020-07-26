package ru.geekbrains.java.oop.at;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.TestBase;
import ru.geekbrains.java.oop.at.block.Search;

import static java.lang.Thread.sleep;
import static org.hamcrest.Matchers.*;

public class SearchTest extends TestBase {

    int profNumGoal = 2;
    int coursesNumGoal = 15;
    int eventsMinNum = 180;
    int eventsMaxNum = 300;
    String firstEvent = "Java Junior. Что нужно знать для успешного собеседования?";
    int postsNumGoal = 300;
    int topicsNumNotGoal = 350;
    int testsNumNotGoal = 0;
    String companyName = "Образовательный портал GeekBrains";

    @DisplayName("Тестирование поиска с PageObject")
    @Test
    void searchChecks() {

        Search search = new Search(driver);

        search.getButton("Иконка поиска").click();
        search.getButton("Поле поиска").sendKeys("java");

        search.greaterThanOrEqualTo("Профессии", profNumGoal);

        search.greaterThan("Курсы", coursesNumGoal);

        search.greaterThan("Вебинары", eventsMinNum);
        search.lessThan("Вебинары", eventsMaxNum);

        search.greaterThan("Блоги", postsNumGoal);

        search.isNot("Форум", topicsNumNotGoal);

        search.isNot("Тесты", testsNumNotGoal);


        search.checkSectionText(firstEvent, "Вебинары");

        search.checkSectionText(companyName, "Проекты и компании");
    }
}