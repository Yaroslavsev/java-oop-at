package ru.geekbrains.java.oop.at.block;

import io.qameta.allure.Step;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.Matchers.not;

public class Search extends PageFactory {

    @FindBy(css = "#professions > div.stickyTitleWrap > header > ul > li > a > span")
    private WebElement profNumString;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div/div[2]/div/div/div[2]/div[1]/header/ul/li/a/span")
    private WebElement coursesNumString;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div/div[2]/div/div/div[3]/div[1]/header/ul/li/a/span")
    private WebElement eventsNumString;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div/div[2]/div/div/div[4]/div[1]/header/ul/li/a/span")
    private WebElement postsNumString;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div/div[2]/div/div/div[5]/div[1]/header/ul/li/a/span")
    private WebElement topicsNumString;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div/div[2]/div/div/div[6]/div[1]/header/ul/li/a/span")
    private WebElement testsNumString;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div/div[2]/div/div/div[3]/div[2]/div/div[1]/div/a")
    private WebElement eventsText;

    @FindBy(xpath = "/html/body/div[1]/div[7]/div/div[2]/div/div/div[7]/div[2]/div/div[2]/div/section/div[2]/h3/a")
    private WebElement companyText;




    @FindBy(css = "[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    private WebElement searchIcon;

    @FindBy(css = "input[class=\"search-panel__search-field\"]")
    private WebElement searchField;



    public Search(WebDriver driver){ initElements(driver, this);
    }

    @Step("Получаем числовое значение секции {sectionName}")
    public int getSectionDigits(String sectionName){
        switch (sectionName) {
            case "Профессии":
                return Integer.parseInt(profNumString.getText());
            case "Курсы":
                return Integer.parseInt(coursesNumString.getText());
            case "Вебинары":
                return Integer.parseInt(eventsNumString.getText());
            case "Блоги":
                return Integer.parseInt(postsNumString.getText());
            case "Форум":
                return Integer.parseInt(topicsNumString.getText());
            case "Тесты":
                return Integer.parseInt(testsNumString.getText());
        }
        throw new RuntimeException("на странице нет раздела " + sectionName);
    }

    @Step("Получаем текстовое значение секции: {sectionName}")
    public WebElement getSectionText(String sectionName){
        switch (sectionName) {
            case "Вебинары":
                return eventsText;
            case "Проекты и компании":
                return companyText;
        }
        throw new RuntimeException("на странице нет раздела " + sectionName);
    }

    public void checkSectionText(String expectedSectionText, String sectionName){
        Assertions.assertEquals(expectedSectionText, getSectionText(sectionName).getText());
    }

    @Step("Нажимаем на кнопку/вводим значание на кнопку/в поле: {nameButton}")
    public WebElement getButton (String nameButton){
        switch (nameButton) {
            case "Иконка поиска": {
                return searchIcon;
            }
            case "Поле поиска": {
                return searchField;
            }
        }
        throw new RuntimeException("на странице нет кнопки " + nameButton);
    }

    @Step("Проверяем, что число из поля {sectionName} больше или равно значению {numGoal}")
    public void greaterThanOrEqualTo(String sectionName, int numGoal){
        MatcherAssert.assertThat(getSectionDigits(sectionName), Matchers.greaterThanOrEqualTo(numGoal));
    }

    @Step("Проверяем, что число из поля {sectionName} больше значения {numGoal}")
    public void greaterThan(String sectionName, int numGoal){
        MatcherAssert.assertThat(getSectionDigits(sectionName), Matchers.greaterThan(numGoal));
    }

    @Step("Проверяем, что число из поля {sectionName} меньше значения {numGoal}")
    public void lessThan(String sectionName, int numGoal){
        MatcherAssert.assertThat(getSectionDigits(sectionName), Matchers.lessThan(numGoal));
    }

    @Step("Проверяем, что число из поля {sectionName} не равно значению {numGoal}")
    public void isNot(String sectionName, int numGoal){
        MatcherAssert.assertThat(getSectionDigits(sectionName), Matchers.is(not(numGoal)));
    }
}
