package testingPurchase;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import purchase.Purchase;
import reporting.TestLogger;

import java.io.IOException;

import static base.CommonAPI.convertToString;

public class TestPurchase extends CommonAPI {


    Purchase objPurchase;


    @BeforeMethod
    public void initializationOfElements() {
        objPurchase = PageFactory.initElements(driver, Purchase.class);
    }

    @Test
    public void searchItems() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objPurchase.orderLifeCycle();
        String expected="Inquiry sent successfully";
        String actual=objPurchase.getSuccessfulOrderMessage();
        Assert.assertEquals(actual,expected);
    }

}
