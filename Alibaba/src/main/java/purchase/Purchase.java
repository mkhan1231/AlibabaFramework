package purchase;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

public class Purchase extends CommonAPI {
    @FindBy(how = How.CSS, using = ".ui-searchbar-keyword")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using = ".ui-searchbar-button-icon")
    public static WebElement submitButtonWebElement;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[4]/div[1]/div/div[2]/div/div[1]/div/div/div[2]/h2/a")
    public static WebElement itemLaptop;
    @FindBy(how = How.XPATH, using = "//a[contains(text(), 'Start Order')]")
    public static WebElement initiateOrder;
    @FindBy(how = How.ID, using = "quantity_60736684508")
    public static WebElement confirmQuantity;
    @FindBy(how = How.ID, using = "price_60736684508")
    public static WebElement myPrice;
    @FindBy(how = How.NAME, using = "freeSample")
    public static WebElement askingSample;
    @FindBy(how = How.ID, using = "content")
    public static WebElement giveDescription;
    @FindBy(how = How.XPATH, using = "//*[@id=\"soForm_1\"]/div[2]/div/div/div/div[3]/div/span/i")
    public static WebElement shippingModeDropdown;
    @FindBy(how = How.XPATH, using = "/html/body/div[5]/div/div/ul/li[4]")
    public static WebElement shippingModeSelect;
    @FindBy(how = How.XPATH, using = "//button[@class='next-btn next-btn-primary next-btn-large']")
    public static WebElement startingOrder;
    @FindBy(how = How.XPATH, using = "/html/body/div[6]")
    public static WebElement loginWindow;
    @FindBy(how = How.ID, using = "fm-login-id")
    public static WebElement account;
    @FindBy(how = How.ID, using = "fm-login-password")
    public static WebElement password;
    @FindBy(id = "fm-login-submit")
    public static WebElement loginSubmit;
    @FindBy(xpath = "//div[@class='ui2-feedback-title']")
    public static WebElement queryConfirmation;

    public void orderLifeCycle() {
        searchInputWebElement.clear();
        searchInputWebElement.sendKeys("Laptop");
        submitButtonWebElement.click();
        implicitWait(driver, 5);
        itemLaptop.click();
        switchWindow(driver);
        initiateOrder.click();
        switchWindow(driver);
        implicitWait(driver, 5);
        confirmQuantity.clear();
        confirmQuantity.sendKeys("100");
        myPrice.clear();
        myPrice.sendKeys("5");
        askingSample.click();
        implicitWait(driver, 5);
        giveDescription.clear();
        implicitWait(driver, 5);
        giveDescription.sendKeys("This is a demo order, for testing purpose. Not real order");
        shippingModeDropdown.click();
        shippingModeSelect.click();
        startingOrder.click();
        implicitWait(driver, 5);
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("alibaba-login-box"));
        account.clear();
        account.sendKeys("mahmud8118@gmail.com");
        password.clear();
        password.sendKeys("qazplm123");
        loginSubmit.click();
        //System.out.println(queryConfirmation.getText());
    }

    public String getSuccessfulOrderMessage(){
        String expected =queryConfirmation.getText();
        return expected;
    }
}







































