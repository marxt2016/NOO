package application.pages;

import core.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Olga Melnikova on 01.02.2017.
 */
public class PositionScreen extends AbstractScreen {


    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div[1]/div")
    private WebElement create;

    @FindBy(id="name")
    private WebElement positionName;

    @FindBy(xpath=".//div[3]/div/div/div/div[1]/div/input")
    private WebElement positionDivision;

    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement positionSuggest;

    @FindBy(xpath=".//form/div[1]/div[5]/div[2]/div/div/div[1]/div/input")
    private WebElement skills;
    @FindBy(xpath="html/body/div[3]/div/div/div")
    private WebElement skillsSuggest;

    @FindBy(xpath=".//div[2]/div/div[2]/div/form/div[2]/button[1]")
    private WebElement submit;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[1]/div[2]/div/div/div[2]/a")
    private WebElement positionLinkHeader;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div[2]/div/div/div[2]/a")
    private WebElement positionRequirements;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div[3]/div/div[1]/div/div[1]/div/span")
    private WebElement positionReqAdd;

    @FindBy(xpath="html/body/div[3]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[1]/div/input")
    private WebElement positionReqInput;

    @FindBy(xpath=" html/body/div[4]/div/div/div")
    private WebElement positionSkillsSuggest;

    @FindBy(xpath=".//div[3]/div/div[2]/div/form/div[2]/button[1]")
    private WebElement positionSkillSubmit;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div[3]/div/div[2]")
    private WebElement positionSkillAdded;
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div[2]/div/div/div[3]/a")
    private WebElement candidatesLink;
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[2]/div/div[3]/div/div[1]")
    private WebElement candidatesNumber;



    private boolean result = false;
    private boolean resultNewSkill = false;
    private boolean resultCandidatesFound = false;

    public void clickPositions(){
        positionLinkHeader.click();
        create.click();
        Reporter.log("Clicked on Create new Position", true);
    }

    public boolean fillOutPositionDetails (String pName, String pDiv, String pSkills) throws Exception {
        positionName.sendKeys(pName +Double.toString(Math.random()).substring(1,5));
        if (positionName.getAttribute("value").length()<1){
            positionName.sendKeys(pName +Double.toString(Math.random()).substring(1,5));
        }
        Thread.sleep(1000);
        Reporter.log("Filled Position with value = " + positionName.getAttribute("value"), true);
        String value = positionName.getAttribute("value");
        positionDivision.sendKeys(pDiv);
        if (positionSuggest.isDisplayed()){
            positionSuggest.click();
        }

        Reporter.log("Filled Position division with value = " + positionDivision.getAttribute("value"), true);
        skills.sendKeys(pSkills);
        Thread.sleep(2000);
        if (skillsSuggest.isDisplayed()){
            skillsSuggest.click();
        }
        submit.click();
        Reporter.log("Clicked on Submit", true);

        if (Driver.getInstance().findElement(By.partialLinkText(value)).isDisplayed()){
            result = true;
            Reporter.log("List contains new item = " + value, true);
            Driver.getInstance().findElement(By.partialLinkText(value)).click();
        }else{Reporter.log("New item wasn't found", true);}

        return result;
    }

    public boolean addRequirements(String pSkills) throws Exception{
        positionRequirements.click();
        WaitForVisibility.isElementLoaded(positionReqAdd);
        positionReqAdd.click();
        Reporter.log("Clicked on Add new skill-requirement to position", true);
        positionReqInput.sendKeys(pSkills);
        Thread.sleep(3000);
        if (positionSkillsSuggest.isDisplayed()){
            positionSkillsSuggest.click();
        }
        positionSkillSubmit.click();
        Reporter.log("Clicked on Submit", true);
        if (positionSkillAdded.isDisplayed()){
            resultNewSkill = true;
            Reporter.log("New skill was  added to position = " + resultNewSkill, true);
        }
        Thread.sleep(2000);
        candidatesLink.click();
        Thread.sleep(3000);
        if (Integer.parseInt(candidatesNumber.getText().substring(0,1))>0){
            resultCandidatesFound=true;
            Reporter.log("Candidates number = " + candidatesNumber.getText().substring(0,2), true);
        }

        return resultCandidatesFound;
    }


}
