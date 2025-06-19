package wait;

import base.baseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPadge;
import pages.OnePage;

import static org.testng.AssertJUnit.assertEquals;

public class DynamicLoadingTests extends baseTests {
    @Test
    public void testExampleOne(){
        DynamicLoadingPadge dynamicLoadingPadge = homePage.clickOnDynamicLoadingLink();
        OnePage onePage = dynamicLoadingPadge.clickONExampleOneLink();
        onePage.clickOnStartButton();
        assertEquals("Hello World!", onePage.getValidationText());

    }
}
