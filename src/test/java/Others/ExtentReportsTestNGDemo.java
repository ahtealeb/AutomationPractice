package Others;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ExtentReportsTestNGDemo {
    WebDriver driver;
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @BeforeSuite
    public void setUp(){
        // start reporters
        // ExtentHtmlReporterConfiguration htmlReporter = new ExtentHtmlReporterConfiguration("extentReports.html");
        htmlReporter = new ExtentHtmlReporter("extentReports.html");

        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter((ExtentReporter) htmlReporter);
    }

    @BeforeTest
    public void setUpTest(){
        // Get the Project directory and assign it to projectPath variable
        String projectPath = System.getProperty("user.dir");
        // System.out.println("projectPath : " +projectPath);

        // Set the Path of the Chrome driver Path and instantiate the driver object
        System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void test1() throws IOException {
        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("Google Search Test One", "This test validates Google search functionality");

        driver.get("https://www.google.com/ncr");
        test1.pass("Navigated to Google.com");

        // log(Status, details)
        test1.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test1.info("This step shows usage of info(details)");

        // log with snapshot
        test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test1.addScreenCaptureFromPath("screenshot.png");
    }

    @Test
    public void test2() throws IOException {
        // creates a toggle for the given test, adds all log events under it
        ExtentTest test2 = extent.createTest("Google Search Test Two", "This test validates Google search functionality");

        // log(Status, details)
        test2.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test2.info("This step shows usage of info(details)");

        // log with snapshot
        test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test2.addScreenCaptureFromPath("screenshot.png");
    }

    @AfterTest
    public void tearDownTest(){
        // Close Browser
        driver.close();
        driver.quit();

        System.out.println("Test Completed Successfully");
    }

    @AfterSuite
    public void tearDown(){
        // calling flush writes everything to the log file
        extent.flush();
    }
}
