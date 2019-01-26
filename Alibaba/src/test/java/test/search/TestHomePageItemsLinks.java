package test.search;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageItemsLinks;

public class TestHomePageItemsLinks extends HomePageItemsLinks {
    HomePageItemsLinks objHomePageItemsLinks;

    @BeforeMethod
    public void initializationOfElements() {
        objHomePageItemsLinks = PageFactory.initElements(driver, HomePageItemsLinks.class);
    }
    @Test
    public void testMultipleQuotesCheck(){
        String actual=objHomePageItemsLinks.multipleQuotesCheck();
        String expected="Request for Quotation - Alibaba.com";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testgetTheAppCheck(){
        String actual=objHomePageItemsLinks.getTheAppCheck();
        String expected="Alibaba.com Download";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testhelpCenterCheck(){
        String actual=objHomePageItemsLinks.helpCenterCheck();
        String expected="Alibaba.com Help Center";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testreadyToShipCheck(){
        String actual=objHomePageItemsLinks.readyToShipCheck();
        String expected="Ready for shipping- Alibaba Wholesale Channel";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testreportAbuseCheck(){
        String actual=objHomePageItemsLinks.reportAbuseCheck();
        String expected="Alibaba Manufacturer Directory - Suppliers, Manufacturers, Exporters &amp; Importers ";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testsubmitDisputeCheck(){
        objHomePageItemsLinks.submitDisputeCheck();
    }
    @Test
    public void testgetPaidForFeedbackCheck(){
        String actual=objHomePageItemsLinks.getPaidForFeedbackCheck();
        String expected="Join Alibaba User Research Survey";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testaboutAlibabaCheck(){
        String actual=objHomePageItemsLinks.aboutAlibabaCheck();
        String expected="about alibaba.com";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testaboutAlibabaGroupCheck(){
        String actual=objHomePageItemsLinks.aboutAlibabaGroupCheck();
        String expected="Alibaba Group";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testsiteMapCheck(){
        String actual=objHomePageItemsLinks.siteMapCheck();
        String expected="Alibaba.com Site Map";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testallCategoriesCheck(){
        String actual=objHomePageItemsLinks.allCategoriesCheck();
        String expected="Manufacturers, Suppliers and Exporters Directory on Alibaba.com";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testrequestQuotationCheck(){
        String actual=objHomePageItemsLinks.requestQuotationCheck();
        String expected="Request for Quotation - Alibaba.com";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testsupplierMembershipCheck(){
        String actual=objHomePageItemsLinks.supplierMembershipCheck();
        String expected="Alibaba.com Seller Channel Memberships";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testlearningCenterCheck(){
        String actual=objHomePageItemsLinks.learningCenterCheck();
        String expected="7 Steps to Launch Your Alibaba Business";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testtradeAssuranceCheck(){
        String actual=objHomePageItemsLinks.tradeAssuranceCheck();
        String expected="Trade Assurance– Alibaba.com: Protect Your Orders From Payment to Delivery.";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testbusinessIdentityCheck(){
        String actual=objHomePageItemsLinks.businessIdentityCheck();
        String expected="Business Identity";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testlogisticServiceCheck(){
        String actual=objHomePageItemsLinks.logisticServiceCheck();
        String expected="Ocean Shipping Service - Alibaba.com";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testinspectionServiceCheck(){
        String actual=objHomePageItemsLinks.inspectionServiceCheck();
        String expected="Inspection Solutions - Alibaba.com";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testprivacyPolicyCheck(){
        String actual=objHomePageItemsLinks.privacyPolicyCheck();
        String expected="Alibaba.com Rules Center";
        Assert.assertEquals(actual,expected);
    }
}
