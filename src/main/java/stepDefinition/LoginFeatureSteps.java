package stepDefinition;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;
import misc.Misc;

import java.util.concurrent.TimeUnit;

public class LoginFeatureSteps {
    //WebDrvier driver;
    //HomePage page;
    @Given("User is in the homepage")
    public void user_is_in_the_homepage() {
        //HomePage page = new HomePage();
        BasePage.driver.get(Misc.getProperty("url"));
        //System.out.println("1");
    }
    @When("User clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        HomePage page = new HomePage();
        page.getSignInButton().click();

    }
    @Then("User is navigated to sign in page")
    public void user_is_navigated_to_sign_in_page() {
        //System.out.println("2");
    }

    @And("User enters Email id")
    public void user_enters_email_id() {
        LoginPage page = new LoginPage();
        page.getEmailId().sendKeys(Misc.getProperty("email"));

    }
    @And("User enters password")
    public void user_enters_password() {
        LoginPage page = new LoginPage();
        page.getPassword().sendKeys("Oso@8381");
    }

    @When("User clicks on Sign in")
    public void user_clicks_on_sign_in() {
        LoginPage page = new LoginPage();
        page.getSignInUser().click();
    }

    @When("Click on user profile")
    public void click_on_user_profile() {
        AfterLoginHomePage page = new AfterLoginHomePage();
        page.getUserProfile().click();
    }
    @Then("User information page is opened")
    public void user_information_page_is_opened() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Then("User clicks on Contact Info")
    public void user_clicks_on_contact_info() {
        UserProfilePage page = new UserProfilePage();
        page.getContactInfo().click();
    }
    @And("verifies the email-Id")
    public void verifies_the_email_id() {
        ContactInfoPage page = new ContactInfoPage();
        String actual=page.getEmail().getText();
        String expected=Misc.getProperty("email");
        Assert.assertEquals(expected,actual);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button(Scenario scenario) {
        SearchProfileTakeScreenshot page=new SearchProfileTakeScreenshot();
        page.getSearchBar().click();
        page.getSearchBar().sendKeys("Jatin Thacker");
        page.getSearchBar().sendKeys(Keys.ENTER);
        Misc.methodWait(10);

    }
    @And("User clicks on View Full Profile of searched user")
    public void user_clicks_on_view_full_profile_of_searched_user() {

    }
    @Then("User takes screenshot")
    public void user_takes_screenshot() {

    }

}
