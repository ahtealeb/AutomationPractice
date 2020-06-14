package Others;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    private static WebElement element = null;

    public static WebElement textbox_search(WebDriver driver) {
        element = driver.findElement(By.name("q"));
        return element;
    }

    public static WebElement button_search(WebDriver driver){
       // element = driver.findElement(By.name("btnk"));
        element.submit();
        return element;
    }

    public static WebElement third_result(WebDriver driver){
        element = driver.findElement(By.xpath("//h3[contains(text(),'What is Selenium WebDriver?')]"));
        return element;
    }
}
