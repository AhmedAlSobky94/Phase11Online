package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page404 {
    WebDriver driver;
    public Page404(WebDriver driver) {
        this.driver = driver;
    }

    private final By validationMessage404 = By.xpath("//p [contains(text(), '404 status code')]");

    public String getValidationText (){
        return driver.findElement(validationMessage404).getText();
    }
}
