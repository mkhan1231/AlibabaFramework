package test.search;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageItems;
import pages.ProductPageItems;


public class TestProductPageItems extends ProductPageItems {
    HomePageItems objOfHomePage;
    ProductPageItems objOfProductsPage;

    @BeforeMethod
    public void initializationOfElements() {
        objOfHomePage = PageFactory.initElements(driver, HomePageItems.class);
        objOfProductsPage = PageFactory.initElements(driver, ProductPageItems.class);
    }
    //// T3ALI_PP_TC01 Select tools and filter search
    @Test(priority = 1, enabled =false)
    public void testCategories() throws InterruptedException {
        objOfHomePage.categories();
        ProductPageItems productsPage = PageFactory.initElements(driver, ProductPageItems.class);
        objOfProductsPage.toolsSearch();
    }
}
