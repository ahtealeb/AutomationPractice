package Others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects {

    WebDriver driver = null;

    // Object Loactors
    By textbox_search = By.name("q");

    By button_search = By.className("gNO89b");

    By result_text = By.xpath("//h3[contains(text(),'What is Selenium WebDriver?')]");

    public GoogleSearchPageObjects(WebDriver driver){
        this.driver = driver;
    }

    public void setTextInSearchBox(String text){
        driver.findElement(textbox_search).sendKeys(text);
    }

    public void clickSearchButton(){
        driver.findElement(button_search).submit();
    }

    public WebElement getThirdResult(){
        return driver.findElement(result_text);
    }
}
