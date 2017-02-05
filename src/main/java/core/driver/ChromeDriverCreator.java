package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverCreator extends WebDriverCreator {

	
	@Override
	public WebDriver factoryMethod(String PATH_TO_DRIVER) {
		System.setProperty("webdriver.chrome.driver", PATH_TO_DRIVER);
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		driver = new ChromeDriver(capabilities);
		return driver;
	}

	@Override
	public WebDriver factoryMethod() {
		driver = new ChromeDriver();
		return driver;
	}

}
