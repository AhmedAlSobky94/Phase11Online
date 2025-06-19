package forgetPassword;

import base.baseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.ForgetPasswordPage;
import pages.HomePage;

public class ForgetPasswordTests extends baseTests {

    @Test
    public void testForgetPassword (){
        ForgetPasswordPage forgetPasswordPage = homePage.clickOnForgetPasswordPage();
        //driver.findElement(By.xpath("//a[@href=\"/forgot_password\"]")).click();
        //driver.findElement(By.id("email")).sendKeys("qqq@gmal.com");
        forgetPasswordPage.insertInvalidEmail("ifryihfjr");
        //driver.findElement(By.xpath("//i [@class=\"icon-2x icon-signin\"]")).click();
        forgetPasswordPage.clickOnretRievePasswordButton();
        //String Server_Error = driver.findElement(By.xpath("//body[contains(h1,Internal)]")).getText();
        String serverError = forgetPasswordPage.getValidationMessage();
        System.out.println(serverError);
        Assert.assertEquals("Internal Server Error",serverError);
    }
}
