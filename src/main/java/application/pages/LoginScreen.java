package application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Olga Melnikova on 01.02.2017.
 */
public class LoginScreen extends AbstractScreen {
    @FindBy(id="userName")
    private static WebElement user;

    @FindBy(id="password")
    private static WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    private static WebElement loginButton;


    public LandingScreen login (String userName, String pass) {
        user.sendKeys(userName);
        password.sendKeys(pass);
        loginButton.click();
        return new LandingScreen();
    }

}
