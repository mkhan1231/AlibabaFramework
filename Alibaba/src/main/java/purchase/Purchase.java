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

    public String searchAProduct(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchInputWebElement.clear();
        searchInputWebElement.sendKeys("Laptop");
        submitButtonWebElement.click();
        implicitWait(driver, 5);
        String title = driver.getTitle();
        System.out.println("Laptop Search Page Titel: " + title);
        return title;
    }
    public String goToSearchedProduct(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        itemLaptop.click();
        switchWindow(driver);
        String title = driver.getTitle();
        System.out.println("Specific Laptop Search Page Titel: " + title);
        return title;
    }
    public String initiateSpecificOrder(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        initiateOrder.click();
        switchWindow(driver);
        implicitWait(driver, 15);
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
        String title = driver.getTitle();
        System.out.println("Specific Laptop Search Page Titel: " + title);
        return title;
    }
    public String loginToOrder(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        implicitWait(driver, 5);
        (new WebDriverWait(driver, 5)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("alibaba-login-box"));
        account.clear();
        account.sendKeys("mahmud8118@gmail.com");
        password.clear();
        password.sendKeys("qazplm123");
        loginSubmit.click();
        String title = driver.getTitle();
        System.out.println("Order Confirmation Page Titel: " + title);
        return title;
    }
    public String getSuccessfulOrderMessage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String expected =queryConfirmation.getText();
        System.out.println(expected);
        return expected;
    }
    public void orderLifeCycle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchAProduct();
        goToSearchedProduct();
        initiateSpecificOrder();
        loginToOrder();
    }
}







































