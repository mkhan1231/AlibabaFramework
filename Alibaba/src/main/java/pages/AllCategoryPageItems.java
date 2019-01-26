package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class AllCategoryPageItems extends CommonAPI {

    @FindBy(xpath = "//a[@rel='nofollow'][contains(text(),'All Categories')]")
    public static WebElement allCategoryItems;
    @FindBy(xpath = "//table[@class='cg-nav-wrapper cg-nav-wrapper-row-2']//span[@class='desc'][contains(text(),'Agriculture & Food')]")
    public static WebElement tableWrapOne;
    @FindBy(xpath = "//*[@id=\"category\"]/div[3]/div[1]/div[1]/div/div[1]/h4/a")
    public static WebElement agricultureItems;
    @FindBy(css = "div.cg.cg-page:nth-child(16) div.util-clearfix.cg-container:nth-child(6) div.cg-main div.item.util-clearfix:nth-child(1) div.sub-item-wrapper.util-clearfix div.sub-item:nth-child(2) h4.sub-title > a:nth-child(1)")
    public static WebElement foodItems;
    @FindBy(xpath = "//table[@class='cg-nav-wrapper cg-nav-wrapper-row-2']//span[@class='desc'][contains(text(),'Apparel,Textiles & Accessories')]")
    public static WebElement tableWrapTwo;
    @FindBy(css = "div.cg.cg-page:nth-child(16) div.util-clearfix.cg-container:nth-child(6) div.cg-main div.item.util-clearfix:nth-child(2) div.sub-item-wrapper.util-clearfix div.sub-item:nth-child(1) h4.sub-title > a:nth-child(1)")
    public static WebElement apparelItems;
    @FindBy(xpath = "//*[@id=\"category\"]/div[3]/div[1]/div[2]/div/div[2]/h4/a")
    public static WebElement texAndLeatherItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Fashion-Accessories_p339?spm=a2700.9161164.2.43.506e4e02MWl0eL']")
    public static WebElement fashionItems;
    @FindBy(xpath = "//a[contains(text(),'Timepieces, Jewelry, Eyewear')]")
    public static WebElement jeweleryItems;
    @FindBy(xpath = "//a[contains(text(),'Automobiles & Motorcycles')]")
    public static WebElement autoMobileItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Transportation_p0?spm=a2700.9161164.3.20.506e4e02MWl0eL']")
    public static WebElement transportationItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Luggage-Bags-Cases_p1524?spm=a2700.9161164.4.1.506e4e02MWl0eL']")
    public static WebElement luggageItems;
    @FindBy(xpath = "//a[contains(text(),'Shoes & Accessories')]")
    public static WebElement shoeItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Consumer-Electronics_p44?spm=a2700.9161164.5.1.506e4e02MWl0eL']")
    public static WebElement consutemElectronicItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Home-Appliances_p6?spm=a2700.9161164.5.25.506e4e02MWl0eL']")
    public static WebElement homeApplianceItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Security-Protection_p30?spm=a2700.9161164.5.46.506e4e02MWl0eL']")
    public static WebElement securityItems;
    @FindBy(xpath = "//a[contains(text(),'Telecommunication')]")
    public static WebElement telecommunicationItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Sports-Entertainment_p18?spm=a2700.9161164.7.1.506e4e02MWl0eL']")
    public static WebElement sportsAndEntertainmentItems;
    @FindBy(xpath = "//a[contains(text(),'Gifts & Crafts')]")
    public static WebElement giftAndCraftItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Toys-Hobbies_p26?spm=a2700.9161164.7.43.506e4e02MWl0eL']")
    public static WebElement toysAndHobbiesItems;
    @FindBy(xpath = "//a[contains(text(),'Health & Medical')]")
    public static WebElement healthAndMedicalItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Beauty-Personal-Care_p66?spm=a2700.9161164.8.30.506e4e02MWl0eL']")
    public static WebElement beautyAndPersonalCareItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Furniture_p1503?spm=a2700.9161164.9.91.506e4e02MWl0eL']")
    public static WebElement furnitureItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Lights-Lighting_p39?spm=a2700.9161164.9.70.506e4e02MWl0eL']")
    public static WebElement lightItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Machinery_p43?spm=a2700.9161164.10.1.506e4e02MWl0eL']")
    public static WebElement machineryItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Tools_p1420?spm=a2700.9161164.10.64.506e4e02MWl0eL']")
    public static WebElement toolsItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Hardware_p0?spm=a2700.9161164.10.85.506e4e02MWl0eL']")
    public static WebElement hardwareItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Chemicals_p8?spm=a2700.9161164.11.41.506e4e02MWl0eL']")
    public static WebElement chemicalItems;
    @FindBy(xpath = "//a[contains(text(),'Rubber & Plastics')]")
    public static WebElement rubberAndPlasticItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Energy_p10?spm=a2700.9161164.11.74.506e4e02MWl0eL']")
    public static WebElement energyItems;
    @FindBy(xpath = "//a[@href='http://www.alibaba.com/Environment_p11?spm=a2700.9161164.11.95.506e4e02MWl0eL']")
    public static WebElement environmentItems;
    @FindBy(xpath = "//a[contains(text(),'Packaging & Printing')]")
    public static WebElement packagingAndPrintingItems;
    @FindBy(xpath = "//i[@class='ui2-icon ui2-icon-arrow-up ui2-icon-s']")
    public static WebElement goToTop;

    public void getAllCategoryItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        allCategoryItems.click();
        switchWindow(driver);
    }
    public static void getTableWrapOne(){
        tableWrapOne.click();
    }
    public String getAgricultureItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTableWrapOne();
        agricultureItems.click();
        String title= driver.getTitle();
        return title;
    }
    public String getFoodItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTableWrapOne();
        foodItems.click();
        String title= driver.getTitle();
        return title;
    }
    public static void getTableWrapTwo(){
        tableWrapTwo.click();
    }
    public String getApparelItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTableWrapTwo();
        apparelItems.click();
        String title= driver.getTitle();
        return title;
    }
    public String getTexAndLeatherItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getTableWrapTwo();
        texAndLeatherItems.click();
        String title= driver.getTitle();
        return title;
    }
}
