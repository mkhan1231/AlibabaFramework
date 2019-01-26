package test.search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import pages.SearchPageForSQLDB;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearch extends CommonAPI {

    @Test
    public void searchItems() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
    @Test
    public void searchItemsDB () throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            SearchPageForSQLDB searchPageForSQLDB = PageFactory.initElements(driver, SearchPageForSQLDB.class);
            searchPageForSQLDB.searchItemsAndSubmitButton();
    }
}