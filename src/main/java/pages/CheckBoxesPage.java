package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxesPage {
    WebDriver driver;

    public CheckBoxesPage (WebDriver driver){
        this.driver = driver;
    }

    //Locators

     private final By firstbox = By.xpath("//input[@type=\"checkbox\"][1]");
     private final By secondbox = By.xpath("//input[@type=\"checkbox\"][2]");


     //Actions

     public void checkFirstBox(){
         driver.findElement(firstbox).click();
     }
     public void ChecksecondBox(){
         driver.findElement(secondbox).click();
     }
     public boolean checkBox0neIsSelected (){
        return driver.findElement(firstbox).isSelected();

     }
     public boolean checkBoxTwoIsSelected (){
         return driver.findElement(secondbox).isSelected();
     }

}
