package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnePage {
        WebDriver driver;
        WebDriverWait wait;

    public OnePage (WebDriver driver){
        this.driver = driver;
    }

    private final By startButton = By.cssSelector("#start > button");
    private final By validationText = By.cssSelector("#finish> h4");

    public void clickOnStartButton (){
        driver.findElement(startButton).click();
    }
    public String getValidationText (){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(validationText)));
        return driver.findElement(validationText).getText();
    }
}
