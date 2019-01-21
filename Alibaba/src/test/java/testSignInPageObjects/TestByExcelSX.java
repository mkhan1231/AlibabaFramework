package testSignInPageObjects;

import base.CommonAPI;
import com.xlsx.api.MyDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import signInPageObjects.LoginPageLatest;
import java.io.File;

public class TestByExcelSX extends CommonAPI {
    LoginPageLatest objLoginPage ;

    @BeforeMethod
    public void initializationOfElements() {
        objLoginPage= PageFactory.initElements(driver, LoginPageLatest.class);
    }
    //Read Data from XLSX file
    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        //File filepath = new File(System.getProperty("user.dir") +  "/data/testWithXlsxData");
        File filepath = new File(/*System.getProperty(*/"C:\\Users\\Mahmud Khan\\IdeaProjects\\AlibabaOne\\Alibaba\\data\\testWithXlsxData.xlsx");
        MyDataReader dr = new MyDataReader();
        //Show me where is data file
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet1");
        return data;
    }
    @Test(dataProvider = "DP")
    public  void invalidSignin(String email, String password, String expectedErrorMessage){
        objLoginPage.getLogInPageLatest();
        objLoginPage.login(email, password);
        String expectedText = expectedErrorMessage;
        String actulText = objLoginPage.getErrorMessage();
        //Assert.assertEquals(actulText, expectedText);
    }
}