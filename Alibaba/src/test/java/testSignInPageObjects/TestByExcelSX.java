package testSignInPageObjects;

import base.CommonAPI;
import com.xlsx.api.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import signInPageObjects.LoginPageLatest;
import java.io.File;
import java.io.FileNotFoundException;

public class TestByExcelSX extends CommonAPI {
    LoginPageLatest objLoginPage ;

    @BeforeMethod
    public void initializationOfElements() {
        objLoginPage= PageFactory.initElements(driver, LoginPageLatest.class);
    }
    //Read Data from XLSX file
    @DataProvider(name="DP")
    public Object[][] getTestData() throws FileNotFoundException, Exception {
        File filepath = new File("C:\\Users\\Mahmud Khan\\IdeaProjects\\AlibabaOne\\Alibaba\\data\\testWithXlsxData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet2");
        return data;
    }
    @Test(dataProvider = "DP")
    public  void invalidSignin (String email, String password, String expectedErrorMessage) throws InterruptedException{
        objLoginPage.getLogInPageLatest();
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("alibaba-login-box"));
        objLoginPage.login(email, password);
        String expectedText = expectedErrorMessage;
        String actualText = objLoginPage.getErrorMessage();
        Assert.assertEquals(actualText, expectedText);
    }
}