package ru.geekbrains.java.oop.at;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.TestBase;

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

    @DisplayName("Тестирование поиска")
    @Test
    public void checkSearch() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        chromeDriver.findElement(By.cssSelector("input[class=\"search-panel__search-field\"]")).sendKeys("java");

        /*-----Профессии. Hamcrest-----*/
        int profNumDigit = Integer.parseInt(chromeDriver.findElement(By.cssSelector("#professions > div.stickyTitleWrap > header > ul > li > a > span")).getText());
        MatcherAssert.assertThat(profNumDigit, greaterThanOrEqualTo(profNumGoal));

        /*-----Курсы. Hamcrest-----*/
        int coursesNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[2]/div[1]/header/ul/li/a/span")).getText());
        MatcherAssert.assertThat(coursesNumDigit, greaterThan(coursesNumGoal));

        /*-----Вебинары. Количество. Hamcrest-----*/
        int eventsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[3]/div[1]/header/ul/li/a/span")).getText());
        MatcherAssert.assertThat(eventsNumDigit, allOf(
                greaterThan(eventsMinNum),
                lessThan(eventsMaxNum)
        ));

        /*-----Вебинары. Результат поиска. Hamcrest-----*/
        MatcherAssert.assertThat(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/a")).getText(), equalTo(firstEvent));

        /*-----Блоги. Hamcrest-----*/
        int postsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[4]/div[1]/header/ul/li/a/span")).getText());
        MatcherAssert.assertThat(postsNumDigit, greaterThan(postsNumGoal));

        /*-----Форумы. Hamcrest-----*/
        int topicsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[5]/div[1]/header/ul/li/a/span")).getText());
        MatcherAssert.assertThat(topicsNumDigit, is(not(topicsNumNotGoal)));

        /*-----Тесты. Hamcrest-----*/
        int testsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[6]/div[1]/header/ul/li/a/span")).getText());
        MatcherAssert.assertThat(testsNumDigit, is(not(testsNumNotGoal)));

        /*-----Проекты и компании. Результат поиска. Hamcrest-----*/
        MatcherAssert.assertThat(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[7]/div[2]/div/div[2]/div/section/div[2]/h3/a")).getText(), equalTo(companyName));
    }
}





