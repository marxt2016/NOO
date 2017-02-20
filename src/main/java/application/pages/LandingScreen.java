package application.pages;

import core.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga Melnikova on 01.02.2017.
 */
public class LandingScreen extends AbstractScreen {
    @FindBy(xpath="//div[3]/div/div")
    private WebElement userPict;

    @FindBy(xpath="html/body/div[2]/div/div/div[2]")
    private WebElement logout;


    @FindBy(xpath="/html/body/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div")
    private WebElement list;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div[2]/div[1]/div")
    private WebElement createStudent;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div[1]/div")
    private WebElement createStaff;

    @FindBy(id="lastName")
    private WebElement lastN;

    @FindBy(id="firstName")
    private WebElement firstN;

    @FindBy(id="middleName")
    private WebElement middleN;

    @FindBy(xpath="//input[@name='birthday']")
    private WebElement birthday;

    @FindBy(xpath=".//div[2]/div/div[2]/div/form/div[1]/div[4]/div/div[2]/div/div[1]/div/input")
    private WebElement sex;

    @FindBy(xpath="html/body/div[3]/div/div/div[1]")
    private WebElement man;

    @FindBy(xpath="//div[5]/div/div/div/div/div/input")
    private WebElement citizen;

    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement Albania;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement submit;

    private boolean result = false;


    public boolean headerCheck () {
       return userPict.isDisplayed();

    }

    public boolean fillOutStaffDetails (String fname, String lname, String mname, String bday, String staffOrStudent ) throws Exception {

        switch(staffOrStudent) {
            case "staff": createStaff.click();
                break;
            case "student":createStudent.click();
                break;
        }

        Reporter.log("Clicked on Create new Employee", true);

        lastN.sendKeys(fname +Double.toString(Math.random()).substring(1,5));
        String value = lastN.getAttribute("value");
        Reporter.log("Filled Firstname with value = " + value, true);

        firstN.sendKeys(lname);
        Reporter.log("Filled Lastname with value = " + firstN.getAttribute("value"), true);

        middleN.sendKeys(mname);
        Reporter.log("Filled Middlename with value = " + middleN.getAttribute("value"), true);

        birthday.sendKeys(bday);
        Reporter.log("Filled Birthday with value = " + birthday.getAttribute("value"), true);

        sex.click();
        man.click();
        citizen.sendKeys("Албания");
        Thread.sleep(1000);
        Albania.click();
        submit.click();


        Reporter.log("Clicked on Submit", true);

        if (Driver.getInstance().findElement(By.partialLinkText(value)).isDisplayed()){
            result = true;
            Reporter.log("List contains new item = " + value, true);
            Driver.getInstance().findElement(By.partialLinkText(value)).click();
            Driver.getInstance().findElement(By.partialLinkText(value)).click();
        }else{Reporter.log("New item wasn't found", true);}
        return result;

    }



    public LoginScreen logout () {
        userPict.click();
        logout.click();
        Reporter.log("Click on logout.", true);
        return new LoginScreen();
    }




//    public boolean validateChanges (String initialValue, WebElement elementToCompare, WebElement formToOpen ){
//        Boolean result = true;
//        formToOpen.click();
//        if (initialValue.equalsIgnoreCase(elementToCompare.getAttribute("value"))){
//            result = false;
//        }
//        Reporter.log("Initial value = " + initialValue + " compared to a new value = " + elementToCompare.getAttribute("value"), true);
//        return result;
//    }
//

}
