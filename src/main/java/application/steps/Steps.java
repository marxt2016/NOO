package application.steps;

import application.objects.CredentialsFactory;
import application.objects.PersonsFactory;
import application.pages.Header;
import application.pages.LoginScreen;
import application.pages.LandingScreen;
import application.pages.StudentsStaffDetailScreen;
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
        //LandingScreen landing = login.login(allLogins.get("myuser").get(0), allLogins.get("myuser").get(1));
        LandingScreen landing = login.login(allLogins.get("usertestWork").get(0), allLogins.get("usertestWork").get(1));

        Driver.getInstance().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Reporter.log("Logged in with the username  " + allLogins.get("usertestWork").get(0), true);
        Reporter.log("Login assertion result = "+ landing.headerCheck(), true);

        Driver.getInstance().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return new LandingScreen();
    }

    public static boolean createPerson() throws Exception {
        LandingScreen landing = new LandingScreen();

        return landing.fillOutStaffDetails(allPersons.get("staff").get(0),
                allPersons.get("staff").get(1),
                allPersons.get("staff").get(2),
                allPersons.get("staff").get(3) );
    }

    public static void fillOutResumeStep() throws Exception{
        StudentsStaffDetailScreen resume = new StudentsStaffDetailScreen();
        resume.filloutResume(allPersons.get("staff").get(4),
                allPersons.get("staff").get(5),
                allPersons.get("staff").get(6),
                allPersons.get("staff").get(7),
                allPersons.get("staff").get(8),
                allPersons.get("staff").get(9),
                allPersons.get("staff").get(10),
                allPersons.get("staff").get(11),
                allPersons.get("staff").get(12),
                allPersons.get("staff").get(13),
                allPersons.get("staff").get(14),
                allPersons.get("staff").get(15),
                allPersons.get("staff").get(16),
                allPersons.get("staff").get(17),
                allPersons.get("staff").get(23),
                allPersons.get("staff").get(24),
                allPersons.get("staff").get(25),
                allPersons.get("staff").get(26),
                allPersons.get("staff").get(27),
                allPersons.get("staff").get(28),
                allPersons.get("staff").get(29),
                allPersons.get("staff").get(30),
                allPersons.get("staff").get(31),
                allPersons.get("staff").get(32),
                allPersons.get("staff").get(33),
                allPersons.get("staff").get(34)
                );
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

        LoginScreen login = new LoginScreen();
        return login.incorrectLoginUsername(allLogins.get("faultyUser").get(0),allLogins.get("myuser").get(1));
    }
    public static void clickOnStudents () throws Exception {
        new Header().studentsClick();
    }



}
