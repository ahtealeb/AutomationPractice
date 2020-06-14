package Others;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearchTest {
    private static WebDriver driver = null;

    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch(){
        // Get the Project directory and assign it to projectPath variable
        String projectPath = System.getProperty("user.dir");
        System.out.println("projectPath : " +projectPath);

        // Set the Path of the Chrome driver Path and instantiate the driver object
        System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver");
        driver = new ChromeDriver();

        // Navigate to the desired Website
        /*
        * Navigate to Google Website
        */
        driver.get("https://www.google.com/ncr");

        // Enter Text in Search textBox

        // WebElement element = driver.findElement(By.name("q"));
        // element.sendKeys("selenium webdriver");

        GoogleSearchPage.textbox_search(driver).sendKeys("selenium webdriver");

        // Click on Search Button

        // driver.findElement(By.name("btnK")).click();
        // driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        // driver.findElement(By.id("gsr")).sendKeys(Keys.RETURN);
        // element.submit();

        GoogleSearchPage.button_search(driver);

        // Find the Third Result Text contains "What is Selenium WebDriver?"

        // WebElement textDemo = driver.findElement(By.xpath("//h3[contains(text(),'What is Selenium WebDriver?')]"));

        WebElement textDemo = GoogleSearchPage.third_result(driver);

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
