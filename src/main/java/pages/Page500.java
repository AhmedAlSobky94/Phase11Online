package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page500 {
    WebDriver driver;
    public Page500(WebDriver driver) {
        this.driver = driver;
    }
    private final By validationMessage500 = By.xpath("//p [contains(text(), '500 status code')]");

    public String getValidationText (){
        return driver.findElement(validationMessage500).getText();
    }
}
