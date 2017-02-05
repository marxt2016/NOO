package application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Olga Melnikova on 20.01.2017.
 */
public class Header extends AbstractScreen {
    @FindBy(xpath="//a[contains(@href, '/structure')]")
    private WebElement university;

    @FindBy(xpath="//a[contains(@href, '/staff')]")
    private WebElement staff;

    @FindBy(xpath="//a[contains(@href, '/education')]")
    private WebElement education;

    @FindBy(xpath="//a[contains(@href, '/students')]")
    private WebElement students;

    @FindBy(xpath="//a[contains(@href, '/jobmarket')]")
    private WebElement jobmarket;

    @FindBy(xpath="//a[contains(@href, '/settings')]")
    private WebElement settings;

    @FindBy(xpath="//div[3]/div/div")
    private WebElement userPict;

    public void universityClick () {
        university.click();
        Reporter.log("Navigated to university page", true);

    }




}
