package KeyWordDriven;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import pages.HomePageItems;
import pages.LoginPageObjects;
import signInPageObjects.ByInputFromExls;
import java.io.IOException;

public class Features extends CommonAPI {
    HomePageItems objOfHomePage = PageFactory.initElements(driver, HomePageItems.class);
    LoginPageObjects objOfSignInPage = PageFactory.initElements(driver, LoginPageObjects.class);
    ByInputFromExls objOfByInputFromExls = PageFactory.initElements(driver, ByInputFromExls.class);

    //From Excel file KeyWord ClickSigIn
    public void clickSignIn() throws InterruptedException {
        objOfHomePage.clikSignIn();
    }
    //From Excel file KeyWord SwitchToSignForm
    public void switchToSignInForm() {
        objOfSignInPage.switchToSignInForm();
    }
    //From Excel file KeyWord SignIn
    public void signIn() throws InterruptedException {
        objOfSignInPage.signIn();
    }
    public void selectAction(String featureName) throws InterruptedException {
        switch (featureName) {
            case "ClickSignIn":
                clickSignIn();
                break;
            case "SwitchToSignInForm":
                switchToSignInForm();
                break;
            case "SignIn":
                signIn();
                break;
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }
    public void selectFeature() throws IOException, InterruptedException {
        String[] keyword = objOfByInputFromExls.getDataFromSignInKeyword("keywordDriven.xls");
        for (int i = 0; i < keyword.length; i++) {
            selectAction(keyword[i]);
        }
    }
}

