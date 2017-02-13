package application.pages;

import core.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Olga Melnikova on 01.02.2017.
 */
public class StudentsScreen extends AbstractScreen {
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[2]/div/div/div[2]/a")
    private WebElement resume;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/a")
    private WebElement info;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[2]/div/div/div[3]/a")
    private WebElement courses;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[2]/div/div/div[4]/a")
    private WebElement researches;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[2]/div/div/div[5]/a")
    private WebElement patents;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div[1]/span")

    private WebElement addFirst;

    @FindBy(xpath=".//div[3]/div/div[1]/div[2]/div[1]/span")
    private WebElement addSecond;

//______Education_____
    @FindBy(xpath="//form/div[1]/div[2]/div/div/div/div[1]/div/input")
    private WebElement category;

    @FindBy(xpath="html/body/div[3]/div/div/div[4]")
    private WebElement fourthCategoryFromTop;

    @FindBy(xpath="//form/div[1]/div[3]/div/div/div/div[1]/div/input")
    private WebElement school;
    //html/body/div[2]/div/div[2]/div/form/div[1]/div[3]/div/div/div/div[1]/div/input

    @FindBy(xpath="//form/div[1]/div[4]/div/div/div/div[1]/div/input")
    private WebElement specialty;

    @FindBy(xpath="//input[@name='admissionDate']")
    private WebElement fromDate;
    @FindBy(xpath="//input[@name='graduationDate']")
    private WebElement toDate;

    @FindBy(xpath="//div[2]/div/div/div/div/input")
    private WebElement skills;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement buttonSubmit;

    public void filloutResume () throws Exception {
        resume.click();
        WaitForVisibility.isElementLoaded(addFirst);
        addFirst.click();
        category.click();
        fourthCategoryFromTop.click();
        Reporter.log("Click fourth category from top in the suggest list.", true);
        school.clear();
        school.sendKeys("Самарский университет");
        Reporter.log("Set school name = " + school.getText(), true);
        specialty.clear();
        specialty.sendKeys("Специальность 1");

        fromDate.clear();
        fromDate.sendKeys("11112000");
        toDate.clear();
        toDate.sendKeys("11112005");

        skills.clear();
        skills.sendKeys("Математика");

        buttonSubmit.click();
        Thread.sleep(2000);



    }

}
