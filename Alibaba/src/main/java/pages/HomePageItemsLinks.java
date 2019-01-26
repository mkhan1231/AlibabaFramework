package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomePageItemsLinks extends CommonAPI {
    @FindBy(partialLinkText = "One Request, Multipl")
    public static WebElement multipleQuotes;
    @FindBy(xpath = "//a[@title='Get the App']")
    public static WebElement getTheApp;
    @FindBy(xpath = "//a[contains(text(),'Help Center')]")
    public static WebElement helpCenter;
    @FindBy(xpath = "//div[@class='ui-footer-col ui-footer-col-first']//a[@rel='nofollow'][contains(text(),'Report Abuse')]")
    public static WebElement reportAbuse;
    @FindBy(xpath = "//div[@class='ui-footer-col ui-footer-col-first']//a[@rel='nofollow'][contains(text(),'Submit a Dispute')]")
    public static WebElement submitDispute;
    @FindBy(xpath = "//a[contains(text(),'Get Paid for Your Feedback')]")
    public static WebElement getPaidForFeedback;
    @FindBy(xpath = "//*[@id=\"ui-footer\"]/div[1]/div[2]/dl/dd[1]/a")
    public static WebElement aboutAlibaba;
    @FindBy(xpath = "//*[@id=\"ui-footer\"]/div[1]/div[2]/dl/dd[2]/a")
    public static WebElement aboutAlibabaGroup;
    @FindBy(xpath = "//*[@id=\"ui-footer\"]/div[1]/div[2]/dl/dd[3]/a")
    public static WebElement siteMap;
    @FindBy(xpath = "//a[@rel='nofollow'][contains(text(),'All Categories')]")
    public static WebElement allCategories;
    @FindBy(xpath = "//a[contains(text(),'Request for Quotation')]")
    public static WebElement requestQuotation;
    @FindBy(xpath = "//a[contains(text(),'Ready to Ship')]")
    public static WebElement readyToShip;
    @FindBy(xpath = "//a[contains(text(),'Supplier Memberships')]")
    public static WebElement supplierMembership;
    @FindBy(xpath = "//a[contains(text(),'Learning Center')]")
    public static WebElement learningCenter;
    @FindBy(xpath = "//div[@class='ui-footer-col']//a[@rel='nofollow'][contains(text(),'Trade Assurance')]")
    public static WebElement tradeAssurance;
    @FindBy(xpath = "//div[@class='ui-footer-col']//a[@rel='nofollow'][contains(text(),'Business Identity')]")
    public static WebElement businessIdentity;
    @FindBy(xpath = "//div[@class='ui-footer-col']//a[@rel='nofollow'][contains(text(),'Logistics Service')]")
    public static WebElement logisticService;
    @FindBy(xpath = "//div[@class='ui-footer-col']//a[@rel='nofollow'][contains(text(),'Inspection Service')]")
    public static WebElement inspectionService;
    @FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
    public static WebElement privacyPolicy;

    public String multipleQuotesCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        multipleQuotes.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String getTheAppCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTheApp.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String helpCenterCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        helpCenter.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String readyToShipCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readyToShip.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String reportAbuseCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        reportAbuse.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String submitDisputeCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        submitDispute.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String getPaidForFeedbackCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getPaidForFeedback.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String aboutAlibabaCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        aboutAlibaba.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String aboutAlibabaGroupCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        aboutAlibabaGroup.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String siteMapCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        siteMap.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String allCategoriesCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        allCategories.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String requestQuotationCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        requestQuotation.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String supplierMembershipCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        supplierMembership.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String learningCenterCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        learningCenter.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String tradeAssuranceCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tradeAssurance.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String businessIdentityCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessIdentity.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String logisticServiceCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        logisticService.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String inspectionServiceCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        inspectionService.click();
        switchWindow(driver);
        String title=driver.getTitle();
        return title;
    }
    public String privacyPolicyCheck(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        privacyPolicy.click();
        String title=driver.getTitle();
        return title;
    }
}
