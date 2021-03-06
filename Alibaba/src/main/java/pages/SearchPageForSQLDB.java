package pages;

import base.CommonAPI;
import datasource.DatabaseOperation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static datasource.DatabaseOperation.getItemValue;

public class SearchPageForSQLDB {
    @FindBy(how = How.CSS, using =".ui-searchbar-keyword")
    public static WebElement searchInputWebElement;
    @FindBy(how = How.CSS, using =".ui-searchbar-button-icon")
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }
    public WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }
    public void searchFor(String value){
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        getSearchInputWebElement().clear();
    }
    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException  {
        DatabaseOperation databaseOperation = new DatabaseOperation();
        List<String> list = databaseOperation.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            CommonAPI.driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
            clearInput();
        }
    }
    public WebElement getSearchInputField() {
        return searchInputWebElement;
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputWebElement = searchInputField;
    }
    public void searchItems()throws InterruptedException{
        List<String> itemList = getItemValue();
        for(String st: itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
}
