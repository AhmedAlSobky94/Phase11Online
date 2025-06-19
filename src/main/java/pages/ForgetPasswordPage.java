package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    WebDriver driver;
    public ForgetPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    private final By forgetPasswordLink = By.xpath("//a[@href=\"/forgot_password\"]");
    private final By mailBox = By.id("email");
    private final By retrievePasswordButton = By.xpath("//i [@class=\"icon-2x icon-signin\"]");
    private final By validationMessage = By.xpath("//body[contains(h1,Internal)]");

    public void clickOnForgetPasswordLink (){
        driver.findElement(forgetPasswordLink).click();
    }
    public void insertInvalidEmail (String email){
        driver.findElement(mailBox).sendKeys(email);
    }
    public void clickOnretRievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
    }
    public String getValidationMessage (){
        return  driver.findElement(validationMessage).getText();
    }
}

