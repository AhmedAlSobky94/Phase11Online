package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    //1-create Local driver
    WebDriver driver;
    //2-create constructor (don't have return and should have same class name) w hn7tlo ben e aqwas el driver ele hygelo
        public HomePage (WebDriver driver){
    //3-hn3rfo en el local driver ele hena = el driver ele f el base
        this.driver = driver;
    }

    //4-Locator
    //private >> Access Modifier private with height security 3lshan m7desh y3rf y access el locator men bra el class da
    //final >> 3lshan mfesh 7ad y2der y3mel reassign lele locator value

        private final By formAuthenticationLink = By.xpath("//a [@href=\"/login\"]");
    //6-hn3mel locator lel page bta3et el checkBoxPage 3lshan bn navigate leha men home page
        private final By checkBoxPage = By.xpath("//a[@href=\"/checkboxes\"]");
    //8-nfs el fekra b2a l ba2y el pages
        private final By forgetPasswordPage = By.xpath("//a[@href=\"/forgot_password\"]");
        private final By statusCodePage = By.xpath("//a [@href=\"/status_codes\"]");



    //5-Action kol action hykon f function
        public LoginPage clickOnFormAuthenticationLink (){
        driver.findElement(formAuthenticationLink).click();
        //return New object men el new page (alt + enter to create class men el new page)
            return new LoginPage(driver);
    }
    //7-hn3mel return lel check Boxes page 3lshan mn3mlesh leha opject f el base w n2der n3mel leha class
    public CheckBoxesPage clickOnCheckBoxLink (){
            driver.findElement(checkBoxPage).click();
            return new CheckBoxesPage(driver);
    }
    public ForgetPasswordPage clickOnForgetPasswordPage (){
            driver.findElement(forgetPasswordPage).click();
            return new ForgetPasswordPage(driver);
    }
    public StatusCodePage clickOnStatusCodeLink (){
            driver.findElement(statusCodePage).click();
            return new StatusCodePage(driver);
    }


}
