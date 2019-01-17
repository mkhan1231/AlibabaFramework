package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static base.CommonAPI.convertToString;

public class SearchPage {
    @FindBy(how = How.CSS, using =".ui-searchbar-keyword")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using =".ui-searchbar-button-icon")
    public static WebElement submitButtonWebElement;

    public WebElement getSearchInputWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }

    public WebElement getSubmitButtonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return submitButtonWebElement;
    }

    public void searchFor(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().sendKeys(value);
    }
    public void submitSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }
    public void clearInput(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }


    public void searchItemsAndSubmitButton()throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = getItemValue();
        for(int i=0; i<list.size(); i++) {
            searchFor(list.get(i));
            submitSearchButton();
            //validate books data
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

    public List<String> getItemValue(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Pen");
        itemsList.add("Jeans");
        itemsList.add("Laptop");
        itemsList.add("Charger");
        itemsList.add("Toothpaste");
        itemsList.add("Key");
        itemsList.add("Painting");
        itemsList.add("Clock");

        return itemsList;
    }
}
