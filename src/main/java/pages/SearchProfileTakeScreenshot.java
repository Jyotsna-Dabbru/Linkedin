package pages;

import org.openqa.selenium.WebElement;


public class SearchProfileTakeScreenshot extends BasePage{

    private String searchBarLocator="SearchProfileTakeScreenshot.getSearchBar";

    public WebElement getSearchBar(){
        return driver.findElement(getLocator(searchBarLocator));
    }

}
