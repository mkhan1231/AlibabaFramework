package test.search;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AllCategoryPageItems;


public class TestAllCategoryPageItems extends AllCategoryPageItems {
    AllCategoryPageItems objAllCategoryPageItems;

    @BeforeMethod
    public void initializationOfElements() throws InterruptedException{
        objAllCategoryPageItems = PageFactory.initElements(driver, AllCategoryPageItems.class);
        objAllCategoryPageItems.getAllCategoryItems();
        Thread.sleep(5000);
    }
    @Test
    public void testGetAgricultureItems(){
        String expected="Agriculture Market";
        String actual=objAllCategoryPageItems.getAgricultureItems();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testGetFoodItems(){
        String expected="Food & Beverage Market";
        String actual=objAllCategoryPageItems.getFoodItems();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testGetApparelItems(){
        String expected="Apparel";
        String actual=objAllCategoryPageItems.getApparelItems();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testGetTexAndLeatherItems(){
        String expected="Textiles & Leather Products";
        String actual=objAllCategoryPageItems.getTexAndLeatherItems();
        Assert.assertEquals(actual,expected);
    }
}
