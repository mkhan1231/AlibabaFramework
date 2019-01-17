package signInPageObjects;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import static org.openqa.selenium.support.How.*;

public class LoginPageLatest extends CommonAPI {
    private WebDriver driver ;

    @FindBy(partialLinkText = "Sign In")
    public static WebElement signInButton;
    @FindBy(how = XPATH, using = ".//*[@id='fm-login-id']")
    public static WebElement account;
    @FindBy(how = ID, using = "fm-login-password")
    public static WebElement passwords;
    @FindBy(how = ID, using = "fm-login-submit")
    public static WebElement submitLogIn;
    @FindBy(how=CSS,using = ".notice-descript")
    public static WebElement signInErrorMesage;

    public LoginPageLatest getLogInPageLatest() {
        signInButton.click();
        return new LoginPageLatest();
    }

    public LoginPageLatest login(String email, String password){
        TestLogger.log("Sending keys to email box");
        sendKeys(account, "account", email);
        sendKeys(passwords,"passwords", password);
        click(submitLogIn,"submitLogIn");
        return new LoginPageLatest();
    }
    public String getErroMessage(){
        String actualText = getText(signInErrorMesage,"signInErrorMesage");
        return actualText;
    }
}
