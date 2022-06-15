package pages;

import org.openqa.selenium.WebElement;

public class AfterLoginHomePage extends BasePage{
    private String getUserProfileLocator="AfterLoginHomePage.userProfile";

    public WebElement getUserProfile() {
        return driver.findElement(getLocator(getUserProfileLocator));
    }
}
