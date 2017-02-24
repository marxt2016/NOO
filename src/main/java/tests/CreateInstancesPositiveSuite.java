package tests;

import application.objects.CredentialsFactory;
import application.pages.PositionScreen;
import application.pages.StudentsStaffDetailScreen;
import application.steps.Steps;
import core.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Olga Melnikova on 12.12.2016.
 */
public class CreateInstancesPositiveSuite {

    public static final HashMap<String, List<String>> allLogins = CredentialsFactory.generateCredentialsSet();

    @Parameters({"url"})
    @BeforeMethod(groups = {"functionality"})
    public void Before(String url) {
        //Using Driver Class Singleton browser invocation new browser session is opened
        // required URL passed as a parameter from TestNG.xml
        WebDriver driver = Driver.getInstance();
        driver.manage().window().maximize();
        driver.get(url);
    }

	@Test(groups = {"functionality"})
	public void loginPositive() throws Exception{
        //test validates personal page header with user pict is displayed
        Assert.assertTrue(Steps.loginTo().headerCheck());
	}

    @Test(groups = {"functionality"}, dependsOnMethods = { "loginPositive" })
    public void createStaff() throws Exception {
        //test validates employee is created
        Steps.loginTo();
        Steps.createPerson("staff");
        Assert.assertTrue(Steps.fillOutResumeStep());

   }

    @Test(groups = {"functionality"}, dependsOnMethods = { "loginPositive" })
    public void logout() throws Exception {
        //test validates logout is successful
        Assert.assertTrue(Steps.loginTo().logout().checkLoginScreenIsOpened());

    }

    @Test(groups = {"functionality"})
    public void createStudent() throws Exception {
        //test validates student is created
        Steps.loginTo();
        Steps.clickOnStudents();
        Steps.createPerson("student");
        Assert.assertTrue(Steps.fillOutResumeStep());


    }

    @Test(groups = {"functionality"})
    public void createPosition() throws Exception {
        //test validates position is created with a requirement for candidates
        Steps.loginTo();
        Assert.assertTrue(Steps.fillOutPositionStep());


    }


    @AfterMethod(groups = {"functionality"})
    public void After(){
        Driver.getInstance().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        try{
            Driver.close();
        } catch (Exception e){
            System.out.print("Exception" + e);
        }
    }

}
