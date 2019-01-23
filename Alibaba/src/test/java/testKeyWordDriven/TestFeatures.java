package testKeyWordDriven;

import KeyWordDriven.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import java.io.IOException;

public class TestFeatures extends Features {
    Features objOfFeatures;
    @BeforeMethod
    public void initializeObjects(){
        objOfFeatures = PageFactory.initElements(driver, Features.class);
    }
    @Test
    public void testSignInWithInvalidIdAndPassword() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        objOfFeatures.selectFeature();
    }
}