package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;


public class APShoppingPageObjects {

    WebDriver driver = null;
    private WebDriver webdriver;

    // Object Loactors
    // By list_item = By.className("sf-with-ul");
    // By ulist_item = By.cssSelector("");
    public APShoppingPageObjects(WebDriver driver){

        this.driver = driver;
    }

    /*public class HoverableDropdownTest<by> {

        private WebDriver driver;
        private Actions action;

        Consumer< By > hover = (By by) - >
        private final byObj by;

        {
            action.moveToElement(driver.findElement(by))
                    .perform();
        };*/

    public void shopping(){
        // Select “Blouses” Subcategory in “Women” Category
        /*driver.findElement(list_item).
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

       /* hover.accept(By.linkText("Women"));
        hover.accept(By.linkText("Blouses"));*/

        /*Actions action = new Actions(webdriver);
        WebElement element = webdriver.findElement(By.linkText("Women"));
        action.moveToElement(element).moveToElement(webdriver.findElement(By.linkText("Blouses"))).click().build().perform();*/

        // Initialise Actions class object
        /*Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        WebElement womenTab = driver.findElement(By.linkText("WOMEN"));
        WebElement BlousesTab = driver.findElement(By.xpath("//li[@class='sfHoverForce']//a[contains(text(),'Blouses')]"));
        actions.moveToElement(womenTab).moveToElement(BlousesTab).click().perform();*/

        // Select “Blouses” Subcategory in “Women” Category
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement women = driver.findElement(By.cssSelector("ul>li:nth-child(1)>a[title='Women']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(women).perform();//this will hover to women

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("ul>li:nth-child(2)>a[title='Blouses']")).click(); //this will click on Blouses

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath(".//*[text()='Add to cart']")).click();
        WebElement elementButton = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(@title,'Proceed to checkout')]")));
        elementButton.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[text()='Proceed to checkout']")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[text()='Proceed to checkout']")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.name("processCarrier")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//a[contains(@title,'Pay by bank wire')]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[text()='I confirm my order']")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//a[contains(@title,'Back to orders')]")).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public void setWebdriver(WebDriver webdriver) {
        this.webdriver = webdriver;
    }
}