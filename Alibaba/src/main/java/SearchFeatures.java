import base.CommonAPI;
import reporting.TestLogger;

public class SearchFeatures extends CommonAPI {
    public void searchMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            typeOnElementNEnter(".ui-searchbar-keyword","Pen");
            clearField(".ui-searchbar-keyword");
            navigateBack();
            typeOnElementNEnter(".ui-searchbar-keyword","Jeans");
            clearField(".ui-searchbar-keyword");
            navigateBack();
            typeOnElementNEnter(".ui-searchbar-keyword","Laptop");
    }
}

