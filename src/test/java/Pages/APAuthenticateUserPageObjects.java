package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class APAuthenticateUserPageObjects {

    WebDriver driver = null;

    // Object Loactors
    By text_email = By.id("email");
    By text_passwrd = By.id("passwd");

    By button_sign = By.id("SubmitLogin");

    public APAuthenticateUserPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void signUser(){
        // Enter Email and Password
        driver.findElement(text_email).sendKeys("zyxwso@outlook.com");
        driver.findElement(text_passwrd).sendKeys("Test@1234");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Click Register Button
        driver.findElement(button_sign).click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        /*String ActualTitle = driver.getTitle();
        String ExpectedTitle =
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println(“Assert passed”);*/
    }

}