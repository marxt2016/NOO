package application.pages;

import core.driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Olga_Melnikova on 01.02.2017.
 */
public class WaitForVisibility {

    public static void isElementLoaded(WebElement elementToBeLoaded) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 25);
        WebElement e = wait.until(ExpectedConditions.visibilityOf(elementToBeLoaded));

    }

    public static void isElementClickable(WebElement elementToBeLoaded) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 25);
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(elementToBeLoaded));

    }
}
