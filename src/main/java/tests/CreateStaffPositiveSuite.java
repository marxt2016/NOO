package tests;

import application.objects.CredentialsFactory;
import application.pages.StudentsStaffDetailScreen;
import application.steps.Steps;
import core.driver.Driver;
import org.openqa.selenium.WebDriver;
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
public class CreateStaffPositiveSuite {

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

//	@Test(groups = {"functionality"})
//	public void loginPositive() throws Exception{
//        //test validates personal page header with user pict is displayed
//        Assert.assertTrue(Steps.loginTo().headerCheck());
//	}
//
//    @Test(groups = {"functionality"}, dependsOnMethods = { "loginPositive" })
//    public void createStaff() throws Exception {
//        //test validates employee is created
//        Steps.loginTo();
//        Assert.assertTrue(Steps.createPerson());
//
//   }
//
//    @Test(groups = {"functionality"}, dependsOnMethods = { "loginPositive" })
//    public void logout() throws Exception {
//        //test validates logout is successful
//        Assert.assertTrue(Steps.loginTo().logout().checkLoginScreenIsOpened());
//
//    }

    @Test(groups = {"functionality"})
    public void createStudent() throws Exception {
        //test validates student is created
        Steps.loginTo();
       // Steps.clickOnStudents();
        Steps.createPerson();
        Steps.fillOutResumeStep();
        Thread.sleep(1000);

    }
//
//    @Test(groups = {"functionality"} , dependsOnMethods = { "loginPositive" })
//    public void changePhone() throws Exception {
//        //test validates phone is changed
//        LandingScreen personal = Steps.loginAndOpenSettins() ;
//        personal.settingsClick();
//        String valueForComparison = personal.changePhone();
//        Thread.sleep(3000);
//        Assert.assertTrue(personal.validateChanges(valueForComparison, personal.getPhone(), personal.getEditPhone()));
//
//    }
//
//    @Test(groups = {"functionality"}, dependsOnMethods = { "loginPositive" } )
//    public void listOperations() {
//        //test validates activity items are listed
//        LandingScreen personal = Steps.loginAndOpenSettins();
//        Assert.assertEquals(personal.listOperations(), "Операции за период");
//    }
//
//


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
