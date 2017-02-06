package tests;

import application.objects.CredentialsFactory;
import application.pages.LoginScreen;
import application.steps.Steps;
import core.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Olga Melnikova on 12.12.2016.
 */
public class LoginNegativeSuite {

    public static final HashMap<String, List<String>> allLogins = CredentialsFactory.generateCredentialsSet();

    @Parameters({"url"})
    @BeforeClass(groups = {"functionality"})
    public void Before(String url) {
        //Using Driver Class Singleton browser invocation new browser session is opened
        // required URL passed as a parameter from TestNG.xml
        WebDriver driver = Driver.getInstance();
        driver.manage().window().maximize();
        driver.get(url);
    }

	@Test(groups = {"functionality"})
	public void loginEmptyFields() throws Exception{
        //test validates error message about incorrect details is displayed - empty details
        LoginScreen loginPage = new LoginScreen();
        Assert.assertTrue(loginPage.emptyLogin().equalsIgnoreCase("Пароль обязателен для заполнения; Email обязателен для заполнения"));
	}

    @Test(groups = {"functionality"})
    public void emptyUsername() throws Exception {
        //test validates error message about incorrect details is displayed - username is  empty, pw - valid
        LoginScreen loginPage = new LoginScreen();
        Assert.assertTrue(Steps.loginWithoutUsername().equalsIgnoreCase("Email обязателен для заполнения"));

    }

    @Test(groups = {"functionality"})
    public void emptyPassword() throws Exception {
        //test validates error message about incorrect details is displayed - username is correct, pw - empty
        LoginScreen loginPage = new LoginScreen();
        Assert.assertTrue(Steps.loginWithoutPassword().equalsIgnoreCase("Пароль обязателен для заполнения"));

    }
    @Test(groups = {"functionality"})
    public void incorrectUsername() throws Exception {
        //test validates error message about incorrect details is displayed - username is correct, pw - valid
        LoginScreen loginPage = new LoginScreen();
        Thread.sleep(2000);
        Assert.assertTrue(Steps.loginWithIncorrectUsername().equalsIgnoreCase("Неправильный email или пароль"));

    }

    @Test(groups = {"functionality"})
    public void incorrectPassword() throws Exception {
        //test validates error message about incorrect details is displayed - username is valid, pw - incorrect
        LoginScreen loginPage = new LoginScreen();

        Assert.assertTrue(Steps.loginWithIncorrectPassword().equalsIgnoreCase("Неправильный email или пароль"));

    }

    @AfterClass(groups = {"functionality"})
    public void After(){
        Driver.getInstance().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        try{
            Driver.close();
        } catch (Exception e){
            System.out.print("Exception" + e);
        }
    }

}
