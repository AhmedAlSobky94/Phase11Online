package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;


public class baseTests {

   protected WebDriver driver;
   protected SoftAssert Assert =new SoftAssert();
   //reference object
   protected HomePage homePage;
   protected StatusCodePage statusCodePage;
   protected FileUploadPage fileUploadPage;

    @BeforeClass
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //lma n3rf object f el base hykon m7tag qema ysht3'al beha f bndelo el driver bt3na bta3 el base
        // l2n el constructor f elclass bta3o mtwq3 eno ygelo driver ele hwa el base driver.
        homePage = new HomePage(driver);
        statusCodePage = new StatusCodePage(driver);
        fileUploadPage = new FileUploadPage(driver);


    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
