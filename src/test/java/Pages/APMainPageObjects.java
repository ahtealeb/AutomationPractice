package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class APMainPageObjects {

    WebDriver driver = null;

    // Object Loactors
    By button_sign = By.className("login");

    public APMainPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignButton(){
        driver.findElement(button_sign).click();
    }
}