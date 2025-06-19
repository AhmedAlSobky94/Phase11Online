package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page301 {
    WebDriver driver;
    public Page301(WebDriver driver) {
        this.driver = driver;
    }

    private final By validationMessage301 = By.xpath("//p [contains(text(), '301 status code')]");

    public String getValidationText (){
        return driver.findElement(validationMessage301).getText();
    }
}
