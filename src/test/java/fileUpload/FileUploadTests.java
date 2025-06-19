package fileUpload;

import base.baseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadTests extends baseTests {
    @Test
    public void testFileUpload () throws InterruptedException {

       //driver.findElement(By.xpath("//a [@href=\"/upload\"]")).click();
        fileUploadPage.clickOnFileUploadLink();

        //WebElement fileupload = driver.findElement(By.id("file-upload"));
        fileUploadPage.chooseFileButtonInsertPath().sendKeys("C:\\Users\\alaa mahfouz\\Downloads\\My ISTQB Course\\New folder\\course photo.jpg");
        //fileupload.sendKeys("C:\\Users\\alaa mahfouz\\Downloads\\My ISTQB Course\\New folder\\course photo.jpg");
        Thread.sleep(3000);
        //driver.findElement(By.id("file-submit")).click();
        fileUploadPage.clickOnUploadButton();
        Thread.sleep(3000);
        //String actualResult = driver.findElement(By.id("uploaded-files")).getText();
        String actualResult = fileUploadPage.getUploadedFileName();
        Assert.assertEquals(actualResult, "course photo.jpg");
        Assert.assertAll();

    }
}
