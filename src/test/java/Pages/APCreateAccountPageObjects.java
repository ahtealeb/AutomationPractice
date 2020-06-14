package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class APCreateAccountPageObjects {

    WebDriver driver = null;

    // Object Loactors
    By text_email = By.id("email_create");
    By button_createAccount = By.id("SubmitCreate");

    public APCreateAccountPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void setTextEmail(){
        driver.findElement(text_email).sendKeys("zyxwso@outlook.com");
    }
    public void clickCreateButton(){
        driver.findElement(button_createAccount).click();
    }
}