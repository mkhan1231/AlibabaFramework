package testSignInPageObjects;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageItems;
import signInPageObjects.GoogleSheetsPage;
import java.io.IOException;
import java.util.List;

public class TestGoogleSheetsPage extends GoogleSheetsPage {
    HomePageItems objOfHomePage;
    GoogleSheetsPage objGoogleSheetsPage;

    @BeforeMethod
    public void initialization(){
        objOfHomePage = PageFactory.initElements(driver, HomePageItems.class);
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
    }
    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
    @Test
    public void testLogInByInvalidIdPassUsingGoogleSheet() throws IOException, InterruptedException {
        sleepFor(3);
        objOfHomePage.clikSignIn();
        sleepFor(3);
        objGoogleSheetsPage.switchToSignInForm();
        sleepFor(3);
        int i = 0;
        String spreadsheetId = "1nO_WGkb6n9bcidHflrLxtiEkvdCvGCNQ73Ceihndn-4";
        String range = "Sheet1!A2:D";
        List<String> actualErrorMessage = objGoogleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = objGoogleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(3).toString()));
            System.out.println("expected"+row.get(3).toString());
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}
