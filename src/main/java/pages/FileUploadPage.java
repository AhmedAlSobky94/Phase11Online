package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {

    WebDriver driver;

    public FileUploadPage (WebDriver driver){
        this.driver = driver;
    }

    private final By fileUploadLink = By.xpath("//a [@href=\"/upload\"]");
    private final By chooseFileButton = By.id("file-upload");
    private final By uploadButton = By.id("file-submit");
    private final By uploadedFileName = By.id("uploaded-files");


    public void clickOnFileUploadLink(){
        driver.findElement(fileUploadLink).click();
    }
    public WebElement chooseFileButtonInsertPath (){
       return driver.findElement(chooseFileButton);
    }
    public void clickOnUploadButton (){
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFileName (){
        return driver.findElement(uploadedFileName).getText();
    }
}
