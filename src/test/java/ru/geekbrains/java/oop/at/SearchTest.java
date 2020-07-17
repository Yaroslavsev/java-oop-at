package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.TestBase;

import static java.lang.Thread.sleep;

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

    @Test
    public void checkSearch() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();
        chromeDriver.findElement(By.cssSelector("input[class=\"search-panel__search-field\"]")).sendKeys("java");

        /*-----Профессии-----*/
        int profNumDigit = Integer.parseInt(chromeDriver.findElement(By.cssSelector("#professions > div.stickyTitleWrap > header > ul > li > a > span")).getText());
        if (profNumDigit >= profNumGoal) {
            System.out.println("Тест пройден. Профессий не менее " + profNumGoal);
        } else {
            System.out.println("Ошибка! Профессий меньше " + profNumGoal);
        }

        /*-----Курсы-----*/
        int coursesNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[2]/div[1]/header/ul/li/a/span")).getText());
        if (coursesNumDigit > coursesNumGoal) {
            System.out.println("Тест пройден. Курсов больше " + coursesNumGoal);
        } else {
            System.out.println("Ошибка! Курсов меньше " + coursesNumGoal);
        }

        /*-----Вебинары. Количество-----*/
        int eventsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[3]/div[1]/header/ul/li/a/span")).getText());
        if (eventsNumDigit > eventsMinNum || eventsNumDigit < eventsMaxNum) {
            System.out.println("Тест пройден. Вебинаров больше " + eventsMinNum + " и меньше " + eventsMaxNum);
        } else {
            System.out.println("Ошибка! Вебинаров меньше " + eventsMinNum + " или больше " + eventsMaxNum);
        }

        /*-----Вебинары. Результат поиска-----*/
        Assertions.assertEquals(
                firstEvent,
                chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/a")).getText()
        );
        System.out.println("Тест пройден. Первый вебинар: " + firstEvent);

        /*-----Блоги-----*/
        int postsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[4]/div[1]/header/ul/li/a/span")).getText());
        if (postsNumDigit > postsNumGoal) {
            System.out.println("Тест пройден. Блогов больше " + postsNumGoal);
        } else {
            System.out.println("Ошибка! Блогов меньше " + postsNumGoal);
        }

        /*-----Форумы-----*/
        int topicsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[5]/div[1]/header/ul/li/a/span")).getText());
        if (topicsNumDigit != topicsNumNotGoal) {
            System.out.println("Тест пройден. Форумов НЕ " + topicsNumNotGoal);
        } else {
            System.out.println("Ошибка! Форумов ровно" + topicsNumNotGoal);
        }

        /*-----Тесты-----*/
        int testsNumDigit = Integer.parseInt(chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[6]/div[1]/header/ul/li/a/span")).getText());
        if (testsNumDigit != testsNumNotGoal) {
            System.out.println("Тест пройден. Тестов НЕ " + testsNumNotGoal);
        } else {
            System.out.println("Ошибка! Тестов ровно" + testsNumNotGoal);
        }

        /*-----Вебинары. Результат поиска-----*/
        Assertions.assertEquals(
                companyName,
                chromeDriver.findElement(By.xpath("/html/body/div[1]/div[7]/div/div[2]/div/div/div[7]/div[2]/div/div[2]/div/section/div[2]/h3/a")).getText()
        );
        System.out.println("Тест пройден. В результатах отображается: " + companyName);
    }
}





