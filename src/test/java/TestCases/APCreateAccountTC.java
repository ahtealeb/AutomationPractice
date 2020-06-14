package TestCases;

import Pages.APCreateAccountPageObjects;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class APCreateAccountTC {

    public void createAccount(WebDriver driver){
        APCreateAccountPageObjects APCAObj = new APCreateAccountPageObjects(driver);

        APCAObj.setTextEmail();
        APCAObj.clickCreateButton();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        APCreateAccountInformationTC APCAI = new APCreateAccountInformationTC();
        APCAI.registerAccount(driver);

    }

}
