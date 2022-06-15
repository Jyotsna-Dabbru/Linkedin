package pages;

import org.openqa.selenium.WebElement;

public class UserProfilePage extends BasePage{
    private String getContactInfoLocator="UserProfilePage.contactInfo";

    public WebElement getContactInfo(){
        return driver.findElement(getLocator(getContactInfoLocator));
    }

}
