package Others;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportsBasicDemo {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        // start reporters
        // ExtentHtmlReporterConfiguration htmlReporter = new ExtentHtmlReporterConfiguration("extentReports.html");
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");

        // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter((ExtentReporter) htmlReporter);

        // creates a toggle for the given test, adds all log events under it
        ExtentTest test1 = extent.createTest("Google Search Test One", "This test validates Google search functionality");

        // Get the Project directory and assign it to projectPath variable
        String projectPath = System.getProperty("user.dir");
        // System.out.println("projectPath : " +projectPath);

        // Set the Path of the Chrome driver Path and instantiate the driver object
        System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();

        test1.log(Status.INFO, "Starting Test Case");

        // Navigate to the desired Website
        /*
         * Navigate to Google Website
         */
        driver.get("https://www.google.com/ncr");
        test1.pass("Navigated to Google.com");

        driver.findElement(By.name("q")).sendKeys("selenium webdriver");
        test1.pass("Entered text in Searchbox");

        driver.findElement(By.className("gNO89b")).submit();
        test1.pass("Pressed Keyboard Enter Key");

        driver.close();
        driver.quit();
        test1.pass("Closed the browser");

        // info(details)
        test1.info("Test Completed");


        // creates a toggle for the given test, adds all log events under it
        ExtentTest test2 = extent.createTest("Google Search Test Two", "This test validates Google search functionality");

        // Get the Project directory and assign it to projectPath variable
        // String projectPath = System.getProperty("user.dir");
        // System.out.println("projectPath : " +projectPath);

        // Set the Path of the Chrome driver Path and instantiate the driver object
        System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();

        test2.log(Status.INFO, "Starting Test Case");

        // Navigate to the desired Website
        /*
         * Navigate to Google Website
         */
        driver.get("https://www.google.com/ncr");
        test2.pass("Navigated to Google.com");

        driver.findElement(By.name("q")).sendKeys("selenium webdriver");
        test2.pass("Entered text in Searchbox");

        driver.findElement(By.className("gNO89b")).submit();
        test2.fail("Pressed Keyboard Enter Key");

        driver.close();
        driver.quit();
        test2.pass("Closed the browser");

        // info(details)
        test2.info("Test Completed");

        // calling flush writes everything to the log file
        extent.flush();
    }
}
