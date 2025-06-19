package statusCode;

import base.baseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.*;

public class StatusCodeTests extends baseTests {

    @Test(priority = 1)
    public void testStatusCode200() {
        //driver.findElement(By.xpath("//a [@href=\"/status_codes\"]")).click();\
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        //driver.findElement(By.xpath("//a [@href=\"status_codes/200\"]")).click();
        Page200 page200 = statusCodePage.clickOnLink200();
        //String text = driver.findElement(By.xpath("//p [contains(text(), '200 status code')]")).getText();
        String text = page200.getValidationText();
        System.out.println(text);
        Assert.assertTrue(text.contains("This page returned a 200 status code."));
        Assert.assertAll();
    }

    @Test(priority = 2)
    public void testStatusCode301() {
        //driver.findElement(By.xpath("//a [@href=\"/status_codes\"]")).click();
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        //driver.findElement(By.xpath("//a [@href=\"status_codes/301\"]")).click();
        Page301 page301 = statusCodePage.clickOnLink301();
        //String text = driver.findElement(By.xpath("//p [contains(text(), 'This page returned a 301 status code.')]")).getText();
        String text = page301.getValidationText();
        System.out.println(text);
        Assert.assertTrue(text.contains("This page returned a 301 status code."));
        Assert.assertAll();


    }
    @Test(priority = 3)
    public void testStatusCode404() {
        //driver.findElement(By.xpath("//a [@href=\"/status_codes\"]")).click();
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        //driver.findElement(By.xpath("//a [@href=\"status_codes/404\"]")).click();
        Page404 page404 = statusCodePage.clickOnLink404();
        //String text = driver.findElement(By.xpath("//p [contains(text(), 'This page returned a 404 status code.')]")).getText();
        String text = page404.getValidationText();
        System.out.println(text);

        Assert.assertTrue(text.contains("This page returned a 404 status code."));
        Assert.assertAll();
}
    @Test(priority = 4)
    public void testStatusCode500() {
        //driver.findElement(By.xpath("//a [@href=\"/status_codes\"]")).click();
        StatusCodePage statusCodePage = homePage.clickOnStatusCodeLink();
        //driver.findElement(By.xpath("//a [@href=\"status_codes/500\"]")).click();
        Page500 page500 = statusCodePage.clickOnLink500();
        //String text = driver.findElement(By.xpath("//p [contains(text(), 'This page returned a 500 status code.')]")).getText();
        String text = page500.getValidationText();
        System.out.println(text);

        Assert.assertTrue(text.contains("This page returned a 500 status code."));
        Assert.assertAll();

}
}
