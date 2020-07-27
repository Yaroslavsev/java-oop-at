package ru.geekbrains.java.oop.at.page;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.java.oop.at.block.Navigation;
import ru.geekbrains.java.oop.at.block.Search;

public class PageBase extends PageFactory {

    @FindBy(css = "[id=\"top-menu\"]")
    private WebElement header;

    @FindBy(css = "[class=\"site-footer\"]")
    private WebElement footer;

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement pageName;

    private Navigation navigation;

    public PageBase(WebDriver driver){
        initElements(driver, this);
        navigation = new Navigation(driver);
    }

    @Step("Проверяем имя страницы {expectedPageName}")
    public void checkPageName(String expectedPageName){
        Assertions.assertEquals(expectedPageName, pageName.getText());
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }

    public WebElement getPageName() {
        return pageName;
    }

    public Navigation getNavigation() {
        return navigation;
    }
}
