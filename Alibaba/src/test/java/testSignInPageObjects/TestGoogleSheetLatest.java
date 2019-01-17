package testSignInPageObjects;

import base.CommonAPI;
import googleAPIs.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageItems;
import reporting.TestLogger;
import signInPageObjects.GoogleSheetsPage;
import signInPageObjects.LoginPageLatest;

import java.io.IOException;
import java.util.List;
import java.util.Properties;



public class TestGoogleSheetLatest extends CommonAPI {
    HomePageItems objOfHomePage;
    LoginPageLatest objLoginPage ;
    GoogleSheetsPage objGoogleSheetsPage;



    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePageItems.class);
        objLoginPage= PageFactory.initElements(driver, LoginPageLatest.class);
        objGoogleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);

    }


    @Test /*(enabled = false)*/
    public  void invalidSigninByGoogleSheetApi() throws IOException,InterruptedException {

        //Properties properties = loadProperties();
        //String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String spreadsheetId ="1nO_WGkb6n9bcidHflrLxtiEkvdCvGCNQ73Ceihndn-4";
        //String range = properties.getProperty("GOOGLE.range");
        String range ="Sheet1!A2:D4";
        objOfHomePage.clikSignIn();
        sleepFor(3);
        objGoogleSheetsPage.switchToSignInForm();
        sleepFor(3);

        //TestLogger.log("Using Sheet Number " + range.charAt(5)+ " and fields range  " + range.substring(6));
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId,range);



        for (List cell: getRecords) {
            //objLoginPage.getLogInPageLatest();
            objLoginPage.login(cell.get(1).toString(), cell.get(2).toString());
            String expectedText = cell.get(3).toString();
            String actualText = objLoginPage.getErroMessage();
            //Assert.assertEquals(actualText, expectedText);

        }
    }
}
