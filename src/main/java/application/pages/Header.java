package application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * Created by Olga Melnikova on 20.01.2017.
 */
public class Header extends AbstractScreen {
    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[1]/div/div/div[2]/div[1]/a")
    private WebElement university;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[1]/div/div/div[2]/div[2]/a")
    private WebElement staff;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[1]/div/div/div[2]/div[3]/a")
    private WebElement education;

    @FindBy(xpath="//a[contains(text(),'Студенты')]")
    private WebElement students;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[1]/div/div/div[2]/div[5]/a")
    private WebElement jobmarket;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[1]/div/div/div[2]/div[6]/a")
    private WebElement settings;

    @FindBy(xpath=".//*[@id='root']/div/div[1]/div[1]/div/div/div[2]/div[7]/a")
    private WebElement userPict;

    public void universityClick () {
        university.click();
        Reporter.log("Navigated to university page", true);

    }

    public void studentsClick () throws Exception {

        Thread.sleep(2000);
        Reporter.log(students.getText(), true);
        students.click();
        Reporter.log("Navigated to students page", true);

    }



}
