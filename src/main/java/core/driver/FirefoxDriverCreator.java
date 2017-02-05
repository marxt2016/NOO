package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class FirefoxDriverCreator extends WebDriverCreator {

	@Override
	public WebDriver factoryMethod(String PATH_TO_FILE) {
			FirefoxBinary binary = new FirefoxBinary (new File(PATH_TO_FILE));
			FirefoxProfile profile = new FirefoxProfile();
			WebDriver driver = new FirefoxDriver(binary, profile);
			return driver;
	}
	@Override
	public WebDriver factoryMethod() {
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
