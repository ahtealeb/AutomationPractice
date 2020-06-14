package TestCases;

import Pages.APAuthenticateUserPageObjects;
import Pages.APCreateAccountInformationPageObjects;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class APAuthenticateUserTC {

    public void registerAccount(WebDriver driver){
        APAuthenticateUserPageObjects APAUObj = new APAuthenticateUserPageObjects(driver);

       APAUObj.signUser();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        APShoppingTC APShop = new APShoppingTC();
        APShop.userShopping(driver);
    }

}
