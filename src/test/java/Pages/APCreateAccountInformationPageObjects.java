package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class APCreateAccountInformationPageObjects {

    WebDriver driver = null;

    // Object Loactors
    By rb_title_1 = By.id("id_gender1");
    // By rb_title_2 = By.id("id_gender2");

    By text_first_name = By.id("customer_firstname");
    By text_last_name = By.id ("customer_lastname");

    By text_passowrd = By.id("passwd");

    By text_address = By.id("address1");
    By text_city = By.id("city");
    By list_state = By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form.std.box div.account_creation:nth-child(2) p.required.id_state.select.form-group:nth-child(8) div.selector:nth-child(2) select.form-control:nth-child(2) > option:nth-child(2)");
    By text_postcode = By.id("postcode");
    By list_country = By.cssSelector("body.authentication.hide-left-column.hide-right-column.lang_en:nth-child(2) div.columns-container div.container div.row:nth-child(3) div.center_column.col-xs-12.col-sm-12 form.std.box div.account_creation:nth-child(2) p.required.select.form-group:nth-child(10) div.selector:nth-child(2) select.form-control:nth-child(2) > option:nth-child(2)");
    // driver.findElement(By.cssSelector("div.custom-select.departurePoint.airportSelect"));

    // Select drplist_country = new Select(driver.findElement(By.id("id_country"));
    // By droplist_country = By.xpath("//option[contains(text(),'United States')]");

    By text_mobile = By.id("phone_mobile");

    By button_register = By.id("submitAccount");

    public APCreateAccountInformationPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void registerForm(){
        // Radio Button1 is selected
        driver.findElement(rb_title_1).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Enter First and Last Name
        driver.findElement(text_first_name).sendKeys("Ahmed");

        driver.findElement(text_last_name).sendKeys("Tealeb");

        // Enter Password
        driver.findElement(text_passowrd).sendKeys("Test@1234");

        // Enter Address, City, State, Postal Code and Country
        driver.findElement(text_address).sendKeys("Wall Street");
        driver.findElement(text_city).sendKeys("New York");
        driver.findElement(list_state).click();
        driver.findElement(text_postcode).sendKeys("12345");
        // driver.findElement(drplist_country).sendKeys("United States");
       driver.findElement(list_country).click();

        // Enter Mobile Number
        driver.findElement(text_mobile).sendKeys("123456789");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Click Register Button
        driver.findElement(button_register).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Sign Out from Created User
        driver.findElement(By.className("logout")).click();

        /*String ActualTitle = driver.getTitle();
        String ExpectedTitle =
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println(“Assert passed”);*/
    }

}