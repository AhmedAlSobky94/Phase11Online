package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPadge {
    WebDriver driver;
    public DynamicLoadingPadge(WebDriver driver) {
        this.driver =driver;
    }
    private final By exampleOneLink = By.partialLinkText("Example 1");

    public OnePage clickONExampleOneLink(){
        driver.findElement(exampleOneLink).click();
        return new OnePage(driver);
    }
}
