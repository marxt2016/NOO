package application.pages;

import core.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.awt.*;
import java.awt.event.KeyEvent;

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

    @FindBy(xpath="//div[@id='root']/div/div/div[2]/div/div/div[3]/div/div[2]/div/span")
    private WebElement addSecond;

//______Education_____
    @FindBy(xpath="//form/div[1]/div[2]/div/div/div/div[1]/div/input")
    private WebElement category;

    @FindBy(xpath="html/body/div[3]/div/div/div[4]")
    private WebElement fourthCategoryFromTop;

    @FindBy(xpath="//form/div[1]/div[3]/div/div/div/div[1]/div/input")
    private WebElement school;


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

    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement skillsSuggest;

//_______Work Experience______

    @FindBy(xpath="//form/div/div[2]/div/div/div/div/div/input")
    private WebElement compamyName;

    @FindBy(xpath="//div[3]/div/div/div/div/div/input")
    private WebElement position;

    @FindBy(xpath="//input[@name='employmentDate']")
    private WebElement fromEmplDate;
    @FindBy(xpath="//input[@name='dismissalDate']")
    private WebElement toEmplDate;
    @FindBy(xpath=" .//*[@id='rate']")
    private WebElement rate;

//_____Courses_________
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div/div/div[1]/div/input")
    private WebElement positionCourse;
    @FindBy(xpath="html/body/div[3]/div/div/div[1]")
    private WebElement positionsuggestFirst;
    @FindBy(xpath="//div[3]/div/div/div/div/div/input")
    private WebElement courseName;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[4]/div/div[1]/div/div[1]/div/input")
    private WebElement courseLevel;
    @FindBy(xpath="html/body/div[3]/div/div/div[5]")
    private WebElement courseLevelSuggest;
    @FindBy(xpath=".//*[@id='hours']")
    private WebElement courseHours;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[2]/div[2]/div/div/div/div[1]/div/input")
    private WebElement skillsCourse;

//____Researches_________
    //Diss
    @FindBy(xpath=".//*[@id='topic']")
    private WebElement dissTopic;
    @FindBy(xpath=".//*[@id='speciality']")
    private WebElement dissSpeciality;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[4]/div/div[1]/div/div[1]/div/input")
    private WebElement dissRate;
    @FindBy(xpath=".//*[@id='year']")
    private WebElement dissYear;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[5]/div/div/div/div[1]/div/input")
    private WebElement dissConsultant;
    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement dissConsultantSuggest;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[6]/div[2]/div/div/div[1]/div/input")
    private WebElement skillsDiss;
    //Pub
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[2]/div/div/div/div[1]/div/input")
    private WebElement pubType;
    @FindBy(xpath="html/body/div[3]/div/div/div[1]")
    private WebElement pubTypeSuggest;
    @FindBy(xpath=".//*[@id='name']")
    private WebElement pubName;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[4]/div/div[1]/div/input")
    private WebElement pubDate;
    @FindBy(xpath=".//*[@id='isbn']")
    private WebElement pubIsbn;
    @FindBy(xpath=".//*[@id='pageStart']")
    private WebElement pubPages;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[5]/div/div/div/div[1]/div/input")
    private WebElement pubLanguages;
    @FindBy(xpath="html/body/div[3]/div/div/div[1]/div/input")
    private WebElement pubLanguagesSuggest1;
    @FindBy(xpath="html/body/div[3]/div/div/div[2]/div/input")
    private WebElement pubLanguagesSuggest2;

    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[6]/div/div/div/div[1]/div/input")
    private WebElement pubCoworkers;
    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement pubCoworkersSuggest;

    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[1]/div[7]/div[2]/div/div/div[1]/div/input")
    private WebElement skillsPub;


//_____Patents______
    @FindBy(xpath=".//*[@id='name']")
    private WebElement patentName;
    @FindBy(xpath=".//*[@id='number']")
    private WebElement patentNumber;
    @FindBy(xpath=".//form/div[1]/div[3]/div/div[2]/div/input")
    private WebElement patentDate;
    @FindBy(xpath=".//form/div[1]/div[3]/div/div[3]/div/div[1]/div/input")
    private WebElement patentPurpose;
    @FindBy(xpath="html/body/div[3]/div/div/div[2]")
    private WebElement patentPurposeSuggest;
    @FindBy(xpath=".//form/div[1]/div[4]/div/div/div/div[1]/div/input")
    private WebElement patentOwner;
    @FindBy(xpath=".//div[5]/div/div/div/div[1]/div/input")
    private WebElement patentCoworkers;
    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement patentCoworkersSuggest;
    @FindBy(xpath="html/body/div[2]/div/div[2]/div/form/div[2]/div[2]/div/div/div/div[1]/div/input")
    private WebElement skillsPatent;



    public void filloutResume () throws Exception {
        resume.click();
        WaitForVisibility.isElementLoaded(addFirst);
//Education
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
        fromDate.sendKeys("12112000");
        toDate.clear();
        toDate.sendKeys("11112005");

        skills.clear();
        skills.sendKeys("Физика");
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Thread.sleep(1000);
//Work experience
        addSecond.click();
        compamyName.clear();
        compamyName.sendKeys("companyname");
        position.clear();
        position.sendKeys("manager");
        fromEmplDate.clear();
        fromEmplDate.sendKeys("12112005");
        toEmplDate.clear();
        toEmplDate.sendKeys("11112010");
        rate.clear();
        rate.sendKeys("10000");
        skills.sendKeys("Физика");
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Thread.sleep(1000);
//Courses
        courses.click();
        addFirst.click();
        positionCourse.click();
        positionsuggestFirst.click();
        courseName.clear();
        courseName.sendKeys("coursename");
        courseLevel.click();
        courseLevelSuggest.click();
        courseHours.clear();
        courseHours.sendKeys("1200");
        skillsCourse.sendKeys("Физика");
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Thread.sleep(1000);
//Researches
        researches.click();
        addSecond.click();
        pubType.click();
        pubTypeSuggest.click();
        pubName.clear();
        pubName.sendKeys("publication name");
        pubDate.clear();
        pubDate.sendKeys("11111999");
        pubIsbn.clear();
        pubIsbn.sendKeys("123-/''$%^&*@!(){} QWERT");
        pubPages.clear();
        pubPages.sendKeys("123");
        pubLanguages.click();
        pubLanguagesSuggest1.click();
        pubLanguagesSuggest2.click();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        pubCoworkers.click();
        pubCoworkers.sendKeys("Тестовый");
        pubCoworkersSuggest.click();
        skillsPub.sendKeys("Физика");
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Thread.sleep(1000);
//Patents
        patents.click();
        addFirst.click();
        patentName.clear();
        patentName.sendKeys("patent name");
        patentNumber.clear();
        patentNumber.sendKeys("123!@#^%^@$(^^%())<>");
        patentDate.sendKeys("11112010");
        patentPurpose.click();
        patentPurposeSuggest.click();
        patentOwner.sendKeys("test");
        patentCoworkers.sendKeys("тестовый");
        patentCoworkersSuggest.click();
        skillsPatent.sendKeys("Математика");
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Thread.sleep(1000);

    }

}
