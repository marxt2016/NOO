package core.testng;


import core.driver.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;

import java.io.File;
import java.io.IOException;


/**
 * Created by Olga_Melnikova on 12/11/2016.
 */
public class Listener extends TestListenerAdapter implements ISuiteListener  {


    @Override
    public void onStart(ISuite iSuite) {
        Reporter.log("Starting Suite execution", true);
    }

    @Override
    public void onFinish(ISuite iSuite) {
        Reporter.log("Ending Suite execution", true);

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        Reporter.log("Starting Test execution", true);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("PASSED", true);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        try {
            File scrFile = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.FILE);
            File file = new File("test-output/"+iTestResult.getName()+".jpg");
            FileUtils.copyFile(scrFile, file);
            Reporter.log("<a href='"+ file.getName()+"'> <img src='"+file.getName()+"' height='100' width='100'/> </a>");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        Reporter.log("NOT EXECUTED", true);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
            Reporter.log("Ending Suite execution", true);
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        Reporter.log("Starting Test execution");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        Reporter.log("Ending Test execution");
    }

    // Return method names to the calling function
    private String returnMethodName(ITestNGMethod method) {

        return method.getRealClass().getSimpleName() + "." + method.getMethodName();

    }

}