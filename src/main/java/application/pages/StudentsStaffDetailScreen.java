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
public class StudentsStaffDetailScreen extends AbstractScreen {
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

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div[1]/div[1]/span")
    private WebElement addFirst;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div/div[1]/span")
    private WebElement addCourse;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div/div[1]/span")

    private WebElement addPatent;
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div[2]/div[1]/span")
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
    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement courseNameSuggest;
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
    @FindBy(xpath=".//div[2]/div/div[2]/div/form/div[1]/div[4]/div/div[1]/div/div[1]/div/input")
    private WebElement dissDegree;
    @FindBy(xpath=".//div[3]/div/div/div[3]")
    private WebElement dissDegreeSuggest;
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

//new Item is present in the list
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div[2]/div/span")

    private WebElement listItem;
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div[2]/div[2]/div/span")
    private WebElement listItemPub;
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div[1]/div[2]/div/span")
    private WebElement listItemDiss;
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/span")
    private WebElement listItemCourses;
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div/div[3]/div/div[1]/div/div[2]/div/span")
    private WebElement listItemPatents;



    private boolean resultEducation = false;
    private boolean resultWork = false;
    private boolean resultCourses = false;
    private boolean resultResearches = false;
    private boolean resultPatents = false;
    private boolean resultAll = false;


    public boolean filloutResume (
            String schoolNameValue,
            String specialtyValue,
            String fromSchoolDateValue,
            String toSchoolDateValue,
            String skillsSchoolValue,
            String companyNameValue,
            String positionValue,
            String fromDateValue,
            String toDateValue,
            String rateValue,
            String skillsValue,
            String courseNameValue,
            String courseHoursValue,
            String courseSkillsValue,
            String dissNameValue,
            String dissSpesialtyValue,
            String dissYearValue,
            String dissConsultantValue,
            String dissSkillsValue,
            String pubNameValue,
            String pubDateValue,
            String pubIsbnValue,
            String pubPagesValue,
            String pubCoworkerValue,
            String pubSkillsValue,
            String patentNameValue,
            String patentNumberValue,
            String patentDateValue,
            String patentOwnerValue,
            String patentCoworkerValue,
            String patentSkillsValue

    ) throws Exception {
        if (
        filloutResumeEducation(schoolNameValue, specialtyValue, fromSchoolDateValue, toSchoolDateValue,skillsSchoolValue) &&
        filloutResumeWork(companyNameValue, positionValue, fromDateValue, toDateValue, rateValue, skillsValue) &&
        filloutResumeCourses(courseNameValue, courseHoursValue, courseSkillsValue) &&
        filloutResumeResearches(pubNameValue, pubDateValue, pubIsbnValue, pubPagesValue, pubCoworkerValue, pubSkillsValue,
                                dissNameValue, dissSpesialtyValue, dissYearValue, dissConsultantValue, dissSkillsValue ) &&
        filloutResumePatents(patentNameValue, patentNumberValue, patentDateValue, patentOwnerValue, patentCoworkerValue, patentSkillsValue))
            resultAll = true;
            Reporter.log("Resume sections were filled out = " + resultAll , true);
        return resultAll;
    }

    public boolean filloutResumeEducation (String schoolNameValue, String specialtyValue, String fromDateValue, String toDateValue, String skillsValue) throws Exception {
        resume.click();
        WaitForVisibility.isElementLoaded(addFirst);
        WaitForVisibility.isElementClickable(addFirst);
        Thread.sleep(3000);
        addFirst.click();
        category.click();
        fourthCategoryFromTop.click();
        Reporter.log("Click fourth category from top in the suggest list.", true);
        school.clear();
        school.sendKeys(schoolNameValue);
        Reporter.log("Set school name = " + school.getAttribute("value"), true);
        specialty.clear();
        specialty.sendKeys(specialtyValue);
        Reporter.log("Set specialty name = " + specialty.getAttribute("value"), true);

        fromDate.clear();
        fromDate.sendKeys(fromDateValue);
        toDate.clear();
        toDate.sendKeys(toDateValue);
        Reporter.log("Set from and to dates = " + fromDate.getAttribute("value") +", "+toDate.getAttribute("value"), true);

        skills.clear();
        skills.sendKeys(skillsValue);
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }

        buttonSubmit.click();
        Reporter.log("Click on submit", true);
        Thread.sleep(1000);
        if (listItem.isDisplayed()){
            resultEducation=true;
        }
        return resultEducation;

    }

    public boolean filloutResumeWork (String companyNameValue, String positionValue, String fromDateValue, String toDateValue, String rateValue, String skillsValue) throws Exception {
        addSecond.click();
        compamyName.clear();
        compamyName.sendKeys(companyNameValue);
        Reporter.log("Set company name = " + compamyName.getAttribute("value"), true);
        position.clear();
        position.sendKeys(positionValue);
        Reporter.log("Set position name = " + position.getAttribute("value"), true);
        fromEmplDate.clear();
        fromEmplDate.sendKeys(fromDateValue);
        toEmplDate.clear();
        toEmplDate.sendKeys(toDateValue);
        Reporter.log("Set from and to dates = " + fromEmplDate.getAttribute("value") +", "+toEmplDate.getAttribute("value"), true);
        rate.clear();
        rate.sendKeys(rateValue);
        Reporter.log("Set rate = " + rate.getAttribute("value"), true);
        skills.sendKeys(skillsValue);
        Thread.sleep(1000);
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Reporter.log("Click on submit", true);
        Thread.sleep(1000);
        if (listItem.isDisplayed()){
            resultWork=true;
        }
        return resultWork;
    }

    public boolean filloutResumeCourses (String courseNameValue, String courseHoursValue, String courseSkillsValue) throws Exception {
        courses.click();
        Thread.sleep(2000);
        WaitForVisibility.isElementLoaded(addCourse);
        addCourse.click();
        positionCourse.click();
        Reporter.log("Set position name = " + positionsuggestFirst.getAttribute("value"), true);
        positionsuggestFirst.click();
        courseName.clear();
        courseName.sendKeys(courseNameValue);
        courseNameSuggest.click();
        Reporter.log("Set course name = " + courseName.getAttribute("value"), true);
        courseLevel.click();
        Reporter.log("Set course level = " + courseLevelSuggest.getText(), true);
        courseLevelSuggest.click();
        courseHours.clear();
        courseHours.sendKeys(courseHoursValue);
        Reporter.log("Set course hours = " + courseHours.getAttribute("value"), true);
        skillsCourse.sendKeys(courseSkillsValue);
        Thread.sleep(1000);
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Reporter.log("Click on submit", true);
        Thread.sleep(1000);
        if (listItemCourses.isDisplayed()){
            resultCourses=true;
        }
        return resultCourses;
    }

    public boolean filloutResumeResearches (String pubNameValue, String pubDateValue, String pubIsbnValue, String pubPagesValue, String pubCoworkerValue, String pubSkillsValue,
                                            String dissNameValue, String dissSpesialtyValue, String dissYearValue, String dissConsultantValue, String dissSkillsValue) throws Exception {
        researches.click();
//dissertation
        WaitForVisibility.isElementLoaded(addFirst);
        Thread.sleep(2000);
        addFirst.click();
        dissTopic.sendKeys(dissNameValue);
        dissSpeciality.sendKeys(dissSpesialtyValue);
        dissDegree.click();
        WaitForVisibility.isElementLoaded(dissDegreeSuggest);
        dissDegreeSuggest.click();
        dissYear.sendKeys(dissYearValue);
        dissConsultant.sendKeys(dissConsultantValue);
        Thread.sleep(1000);
        if (dissConsultantSuggest.isDisplayed()){
            dissConsultantSuggest.click();
        }

        skillsDiss.sendKeys(dissSkillsValue);
        Thread.sleep(1000);
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        WaitForVisibility.isElementLoaded(listItemDiss);
        if (listItemDiss.isDisplayed()){
            resultResearches=true;
        }
//publication
        addSecond.click();
        pubType.click();
        pubTypeSuggest.click();
        pubName.clear();
        pubName.sendKeys(pubNameValue);
        Reporter.log("Set publication name = " + pubName.getAttribute("value"), true);
        pubDate.clear();
        pubDate.sendKeys(pubDateValue);
        Reporter.log("Set publication date = " + pubDate.getAttribute("value"), true);
        pubIsbn.clear();
        pubIsbn.sendKeys(pubIsbnValue);
        Reporter.log("Set publication isbn = " + pubIsbn.getAttribute("value"), true);
        pubPages.clear();
        pubPages.sendKeys(pubPagesValue);
        Reporter.log("Set publication pages = " + pubPages.getAttribute("value"), true);
        pubLanguages.click();
        pubLanguagesSuggest1.click();
        pubLanguagesSuggest2.click();
        Thread.sleep(1000);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(3000);
        pubCoworkers.click();
        pubCoworkers.sendKeys(pubCoworkerValue);
        Thread.sleep(1000);
        if (pubCoworkersSuggest.isDisplayed()){
            pubCoworkersSuggest.click();
        }
        skillsPub.sendKeys(pubSkillsValue);
        Thread.sleep(1000);
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Reporter.log("Click on submit", true);
        Thread.sleep(1000);
        if (listItemPub.isDisplayed()){
            resultResearches=true;
        } else {
            resultResearches=false;
        }
        return resultResearches;
    }

    public boolean filloutResumePatents (String patentNameValue, String patentNumberValue, String patentDateValue, String patentOwnerValue, String patentCoworkerValue, String patentSkillsValue) throws Exception {
        patents.click();
        Thread.sleep(3000);
        addPatent.click();
        patentName.clear();
        patentName.sendKeys(patentNameValue);
        Reporter.log("Set patent name = " + patentName.getAttribute("value"), true);
        patentNumber.clear();
        patentNumber.sendKeys(patentNumberValue);
        Reporter.log("Set patent number = " + patentNumber.getAttribute("value"), true);
        patentDate.sendKeys(patentDateValue);
        Reporter.log("Set patent date = " + patentDate.getAttribute("value"), true);
        patentPurpose.click();
        patentPurposeSuggest.click();
        patentOwner.sendKeys(patentOwnerValue);
        patentCoworkers.sendKeys(patentCoworkerValue);
        Thread.sleep(1000);
        patentCoworkersSuggest.click();
        skillsPatent.sendKeys(patentSkillsValue);
        Thread.sleep(1000);
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        buttonSubmit.click();
        Reporter.log("Click on submit", true);
        Thread.sleep(1000);
        if (listItemPatents.isDisplayed()){
            resultPatents=true;
        }
        return resultPatents;
    }

}
