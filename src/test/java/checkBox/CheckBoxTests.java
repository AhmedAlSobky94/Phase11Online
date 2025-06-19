package checkBox;

import base.baseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;
import pages.CheckBoxesPage;


public class CheckBoxTests extends baseTests {

@Test(priority = 1)
    public void testCheckBox() throws InterruptedException {
        CheckBoxesPage checkBoxesPage = homePage.clickOnCheckBoxLink();
        //driver.findElement(By.xpath("//a[@href=\"/checkboxes\"]")).click();
        //driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
        checkBoxesPage.checkFirstBox();
        //driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).click();
        checkBoxesPage.ChecksecondBox();
            Thread.sleep(3000);

        Assert.assertTrue(checkBoxesPage.checkBox0neIsSelected());
        Assert.assertFalse(checkBoxesPage.checkBoxTwoIsSelected());
        Assert.assertAll();


}





}
