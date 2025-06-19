package login;

import base.baseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends baseTests {

@Test
    public void testValidUserNameAndPassword () {

        //driver.findElement(By.xpath("//a [@href=\"/login\"]")).click();
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        //driver.findElement(By.id("username")).sendKeys("tomsmith");
        loginPage.insertUsername("tomsmith");
        //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        loginPage.insertPassword("SuperSecretPassword!");
        //driver.findElement(By.xpath("//i [@class=\"fa fa-2x fa-sign-in\"]")).click();
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        //String actual = driver.findElement(By.id("flash")).getText();
        String actual = secureAreaPage.getValidationMessage();
        Assert.assertTrue(actual.contains("You logged into a secure area!"));
        Assert.assertAll();
    }
}


