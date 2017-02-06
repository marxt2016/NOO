package application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

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

    @FindBy(xpath=".//*[@id='root']/div/div[2]/div/div/span")
    private static WebElement errorMessage;


    public LandingScreen login (String userName, String pass) {
        user.sendKeys(userName);
        password.sendKeys(pass);
        loginButton.click();
        return new LandingScreen();
    }

    public String emptyLogin(){
        loginButton.click();
        WaitForVisibility.isElementLoaded(errorMessage);
        Reporter.log("The error message is displayed " + errorMessage.getText(), true);
        return errorMessage.getText();
    }
    public String emptyLoginPassword(String userName){
        user.sendKeys(userName);
        loginButton.click();
        WaitForVisibility.isElementLoaded(errorMessage);
        Reporter.log("The error message is displayed " + errorMessage.getText(), true);
        user.clear();
        return errorMessage.getText();
    }

    public String emptyLoginUsername(String pass){
        password.sendKeys(pass);
        loginButton.click();
        WaitForVisibility.isElementLoaded(errorMessage);
        Reporter.log("The error message is displayed " + errorMessage.getText(), true);
        password.clear();
        return errorMessage.getText();
    }

    public String incorrectLoginPassword(String userName, String pass){
        user.sendKeys(userName);
        password.sendKeys(pass);
        loginButton.click();
        WaitForVisibility.isElementLoaded(errorMessage);
        Reporter.log("The error message is displayed " + errorMessage.getText(), true);
        user.clear();
        password.clear();
        return errorMessage.getText();
    }

    public String incorrectLoginUsername(String userName, String pass){
        user.sendKeys(userName);
        password.sendKeys(pass);
        loginButton.click();
        WaitForVisibility.isElementLoaded(errorMessage);
        Reporter.log("The error message is displayed " + errorMessage.getText(), true);
        password.clear();
        user.clear();
        return errorMessage.getText();
    }

}
