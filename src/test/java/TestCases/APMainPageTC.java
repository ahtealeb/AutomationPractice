package TestCases;

import Pages.APMainPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class APMainPageTC {
    WebDriver driver = null;

    @BeforeTest
    public void setUpTest(){
        // Get the Project directory and assign it to projectPath variable
        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath : " +projectPath);

        // Set the Path of the Chrome driver Path and instantiate the driver object
        System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();

        Dimension d = new Dimension(1024,768);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);

        /*//To Delay execution for 10 sec. as to view the resize browser
        Thread.sleep(10000);*/
    }

    @Test
    public void automationPracticeMainPage(){
        // Create an Object from the Automation Practice Main Page Objects
        APMainPageObjects APMainPageObj = new APMainPageObjects(driver);

        // Navigate to the desired Website
        /*
         * Navigate to Automation Practice Website
         */
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // Click on Sign in  Button
        APMainPageObj.clickSignButton();

        APCreateAccountTC APCA = new APCreateAccountTC();
        APCA.createAccount(driver);
    }

    @AfterTest
    public void tearDownTest(){
        // Close Browser
        driver.close();
        driver.quit();
        System.out.println("Test Completed Successfully");
    }
}
