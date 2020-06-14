package TestCases;

import Pages.APAuthenticateUserPageObjects;
import Pages.APShoppingPageObjects;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class APShoppingTC {

    public void userShopping(WebDriver driver){
        APShoppingPageObjects APSObj = new APShoppingPageObjects(driver);

       APSObj.shopping();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

}
