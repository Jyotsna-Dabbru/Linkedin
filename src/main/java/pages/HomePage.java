package pages;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    //sign in button
    private String signInButtonLocator = "homePage.signIn";

    public WebElement getSignInButton(){
        return driver.findElement(getLocator(signInButtonLocator));
    }








}
