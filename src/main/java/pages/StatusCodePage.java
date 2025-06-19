package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusCodePage {
    WebDriver driver;
    public StatusCodePage (WebDriver driver){
        this.driver = driver;
    }

    //Locators

    private final By link200 = By.xpath("//a [@href=\"status_codes/200\"]");
    private final By link301 = By.xpath("//a [@href=\"status_codes/301\"]");
    private final By link404 = By.xpath("//a [@href=\"status_codes/404\"]");
    private final By link500 = By.xpath("//a [@href=\"status_codes/500\"]");



    //Actions
    public Page200 clickOnLink200 (){
        driver.findElement(link200).click();
        return new Page200(driver);
    }
    public Page301 clickOnLink301 (){
        driver.findElement(link301).click();
        return new Page301(driver);

    }
    public Page404 clickOnLink404 (){
        driver.findElement(link404).click();
        return new Page404(driver);
    }
    public Page500 clickOnLink500 (){
        driver.findElement(link500).click();
        return new Page500(driver);
    }


}
