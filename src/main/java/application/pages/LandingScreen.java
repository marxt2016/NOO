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

    @FindBy(xpath="/html/body/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div")
    private WebElement list;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div[1]/div")
    private WebElement create;

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

    @FindBy(xpath="//button[@type='submit']")
    private WebElement submit;

    private boolean result = false;


    public boolean headerCheck () {
       return userPict.isDisplayed();

    }

    public boolean fillOutStaffDetails (String fname, String lname, String mname, String bday ) throws Exception {
        create.click();
        Reporter.log("Clicked on Create new Employee", true);

        lastN.sendKeys(fname +Double.toString(Math.random()).substring(2,4));
        String value = lastN.getAttribute("value");
        Reporter.log("Filled Firstname with value = " + value, true);

        firstN.sendKeys(lname);
        Reporter.log("Filled Lastname with value = " + lname, true);

        middleN.sendKeys(mname);
        Reporter.log("Filled Middlename with value = " + mname, true);

        birthday.sendKeys(bday);
        Reporter.log("Filled Birthday with value = " + bday, true);

        sex.click();
        man.click();
        submit.click();

        Reporter.log("Clicked on Submit", true);

        if (Driver.getInstance().findElement(By.partialLinkText(value)).isDisplayed()){
            result = true;
            Reporter.log("List contains new item = " + value, true);
        }else{Reporter.log("New item wasn't found", true);}

       Reporter.log("value = " +Driver.getInstance().findElement(By.partialLinkText(value)).toString(), true);
        return result;

    }
//    public String changeAddress () {
//        editAddress.click();
//        WaitForVisibility.isElementLoaded(street1);
//        String initialValue = street1.getAttribute("value");
//        Reporter.log("Opened Address editing form", true);
//        Reporter.log("Initial street value was = " + street1.getAttribute("value"), true);
//        street1.clear();
//        street1.sendKeys(1 + Double.toString(Math.random()).substring(2,4));
//        Reporter.log("New street value is = " + street1.getAttribute("value"), true);
//        saveAddressChanges.click();
//        Reporter.log("Changes are saved", true);
//        return initialValue;
//    }
//
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
//    public String changePhone () {
//        editPhone.click();
//        WaitForVisibility.isElementLoaded(phone);
//        String initialValue = phone.getAttribute("value");
//        Reporter.log("Initial phone value was = " + phone.getAttribute("value"), true);
//        phone.clear();
//        phone.sendKeys("92790421" + Double.toString(Math.random()).substring(2,4));
//        Reporter.log("New street value is = " + phone.getAttribute("value"), true);
//        savePhoneChanges.click();
//        return initialValue;
//    }
//
//    public String listOperations(){
//        activity.click();
//        startDate.clear();
//        startDate.sendKeys("01/01/2015");
//        endDate.clear();
//        endDate.sendKeys("15/01/2015");
//        search.click();
//        Reporter.log("Results found " + searchResult.getText(), true);
//        return  searchResult.getText();
//    }
}
