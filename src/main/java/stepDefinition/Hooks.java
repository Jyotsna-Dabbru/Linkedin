package stepDefinition;

import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class Hooks {

    WebDriver driver;
    @Before
    public void setUp(){
        //System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        BasePage.setDriver(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
