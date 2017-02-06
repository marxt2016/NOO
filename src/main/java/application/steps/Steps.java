package application.steps;

import application.objects.CredentialsFactory;
import application.objects.PersonsFactory;
import application.pages.LoginScreen;
import application.pages.LandingScreen;
import core.driver.Driver;
import org.testng.Reporter;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by qwer on 01.02.2017.
 */
public class Steps {

    public static final HashMap<String, List<String>> allLogins = CredentialsFactory.generateCredentialsSet();
    public static final HashMap<String, List<String>> allPersons = PersonsFactory.generatePersonsSet();

    public static LandingScreen loginTo() throws Exception {
        LoginScreen login = new LoginScreen();
        Thread.sleep(1000);
        LandingScreen landing = login.login(allLogins.get("myuser").get(0), allLogins.get("myuser").get(1));

        Driver.getInstance().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Reporter.log("Logged in with the username  " + allLogins.get("myuser").get(0), true);
        Reporter.log("Login assertion result = "+ landing.headerCheck(), true);

        Driver.getInstance().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return new LandingScreen();
    }

    public static boolean fillOut() throws Exception {
        LandingScreen landing = new LandingScreen();

        return landing.fillOutStaffDetails(allPersons.get("staff").get(0),
                allPersons.get("staff").get(1),
                allPersons.get("staff").get(2),
                allPersons.get("staff").get(3) );
    }

    public static String loginWithoutPassword() throws Exception {
        LoginScreen login = new LoginScreen();
        return login.emptyLoginPassword(allLogins.get("myuser").get(0));
    }

    public static String loginWithoutUsername() throws Exception {
        LoginScreen login = new LoginScreen();
        return login.emptyLoginUsername(allLogins.get("myuser").get(1));
    }

    public static String loginWithIncorrectPassword() throws Exception {
        LoginScreen login = new LoginScreen();

        return login.incorrectLoginPassword(allLogins.get("myuser").get(0), allLogins.get("faultyUser").get(1));
    }

    public static String loginWithIncorrectUsername() throws Exception {
        Reporter.log("Logged in with the username  " + allLogins.get("faultyUser").get(0) + allLogins.get("myuser").get(1), true);
        LoginScreen login = new LoginScreen();
        return login.incorrectLoginUsername(allLogins.get("faultyUser").get(0),allLogins.get("myuser").get(1));
    }



}
