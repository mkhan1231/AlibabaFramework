package testSignInPageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import signInPageObjects.ByInputFromExls;
import pages.HomePageItems;
import java.io.IOException;

public class TestByInputFromExls extends ByInputFromExls {
    HomePageItems objOfHomePage;
    ByInputFromExls objByInput;
    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePageItems.class);
        objByInput = PageFactory.initElements(driver, ByInputFromExls.class);
    }
    //T3ALI_BE _TC01 LogIn by using excel sheet data
    @Test
    public void signInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sleepFor(3);
        objOfHomePage.clikSignIn();
        sleepFor(3);
        objByInput.switchToSignInForm();
        sleepFor(3);
        String[] expectedItems = objByInput.getAssertData("DataFile.xls");
        String[] actualItems = objByInput.getVerificationValue("DataFile.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Test - Passed");
        }
        System.out.println("signInWithInvalidIdAndPassword");
        //implicitWait(driver, 20);
    }
}
