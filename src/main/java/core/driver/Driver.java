package core.driver;

import org.openqa.selenium.WebDriver;

public class Driver {


    private static WebDriver driver;

    private Driver() {

    }
    public static synchronized WebDriver getInstance() {
        WebdriverTypes type = WebdriverTypes.getDriverTypeByName(System.getProperty("browser.type"));
        if (driver == null) {
            if (type!=null) {
                switch (type) {
                    case FIREFOX:
                        WebDriverCreator creator = new FirefoxDriverCreator();
                        driver = creator.factoryMethod();
                        break;
                    case CHROME:
                        creator = new ChromeDriverCreator();
                        driver = creator.factoryMethod(Driver.class.getClassLoader().getResource("chromedriver.exe").getPath());

                        break;
                    default:
                        creator = new ChromeDriverCreator();
                        driver = creator.factoryMethod(Driver.class.getClassLoader().getResource("chromedriver.exe").getPath());
                }

            } else{
                WebDriverCreator creator = new ChromeDriverCreator();
                driver = creator.factoryMethod(Driver.class.getClassLoader().getResource("chromedriver.exe").getPath());
            }

        }
        return driver;
    }

    public static boolean isBrowserOpen() {
        return driver != null && driver.manage().window().getSize().getHeight() > 0;
    }

    public static void close() {
        if (isBrowserOpen()) {
            driver.quit();

            driver = null;
        }

    }
}
    //Driver.class.getClassLoader().getResource("IEDriverServer.exe").getPath()


