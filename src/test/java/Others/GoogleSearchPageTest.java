package Others;

import Others.GoogleSearchPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearchPageTest();
    }

    public static void googleSearchPageTest(){

        // Get the Project directory and assign it to projectPath variable
        String projectPath = System.getProperty("user.dir");
        // System.out.println("projectPath : " +projectPath);

        // Set the Path of the Chrome driver Path and instantiate the driver object
        System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();

        // Create an Object from the GoogleSearchPageObjects
        GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);

        // Navigate to the desired Website
        /*
         * Navigate to Google Website
         */
        driver.get("https://www.google.com/ncr");

        // Enter Text in Search textBox
        searchPageObj.setTextInSearchBox("selenium webdriver");

        // Click on Search Button
        searchPageObj.clickSearchButton();

        WebElement textDemo = searchPageObj.getThirdResult();

        if(textDemo.isDisplayed())
        {
            System.out.println("Element found using text");
        }

        else
            System.out.println("Element not found");

        // Close Browser
        driver.close();
        driver.quit();

        System.out.println("Test Completed Successfully");
    }
}
