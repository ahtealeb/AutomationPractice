package TestCases;

import Pages.APCreateAccountInformationPageObjects;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class APCreateAccountInformationTC {

    public void registerAccount(WebDriver driver){
        APCreateAccountInformationPageObjects APCAIObj = new APCreateAccountInformationPageObjects(driver);

       APCAIObj.registerForm();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        APAuthenticateUserTC APAU = new APAuthenticateUserTC();
        APAU.registerAccount(driver);

    }

}
