package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page200 {

    WebDriver driver;
    public Page200(WebDriver driver) {
        this.driver = driver;
    }

    private final By validationMessage200 = By.xpath("//p [contains(text(), '200 status code')]");

    public String getValidationText (){
        return driver.findElement(validationMessage200).getText();
    }
}
