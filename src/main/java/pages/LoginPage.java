package pages;

import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    //email id
    private String emailIdFieldLocator= "LoginPage.emailId";
    private String getPasswordLocator = "LoginPage.password";
    private String signInUserLocator="LoginPage.signInUser";

    public WebElement getEmailId(){
        return driver.findElement(getLocator(emailIdFieldLocator));
    }

    //password

    public WebElement getPassword(){
        return driver.findElement(getLocator(getPasswordLocator));
    }

    //sign in to linkedin user

    public WebElement getSignInUser(){
        return driver.findElement(getLocator(signInUserLocator));
    }
}
