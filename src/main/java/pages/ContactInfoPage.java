package pages;

import org.openqa.selenium.WebElement;

public class ContactInfoPage extends BasePage {
    private String getEmailIdLocator="ContactInfoPage.userEmail";
    private String label = "ContactInfoPage.emailLabel";
    public ContactInfoPage(){
        waitForElement(label);
    }
    public WebElement getEmail(){
        return driver.findElement(getLocator(getEmailIdLocator));
    }
}
