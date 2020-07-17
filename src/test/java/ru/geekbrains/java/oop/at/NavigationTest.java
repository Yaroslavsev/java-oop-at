package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.geekbrains.java.oop.at.base.TestBase;

import java.util.Arrays;

import static java.lang.Thread.sleep;

public class NavigationTest extends TestBase {

    @Test
    public void checkTopics() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer\"]")).isDisplayed();
    }

    @Test
    public void checkEvents() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer\"]")).isDisplayed();
    }

    @Test
    public void checkPosts() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer\"]")).isDisplayed();
    }

    @Test
    public void checkTests() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();
        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer\"]")).isDisplayed();
    }

    @Test
    public void checkCareer() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer\"]")).isDisplayed();
    }

    @Test
    public void checkCourses() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
        chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"]")).isDisplayed();
        chromeDriver.findElement(By.cssSelector("[class=\"site-footer\"]")).isDisplayed();
    }

}


