package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;
    public static void setDriver(WebDriver driver1){
        driver = driver1;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
    }
    public boolean waitForElement(String locatorVariable){
        boolean found = false;
        //driver.findElement(getLocator(locatorVariable));
        WebDriverWait wait = new WebDriverWait(driver,30);
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(getLocator(locatorVariable)));
            //found = true;
            return true;
        }
        catch(Exception e){
            ;
        }
        return found;
    }
    public By getLocator(String name){
        Properties property = new Properties();
        try{
            property.load(new FileInputStream("src\\main\\resources\\linkedIn.loc"));
            String value = property.getProperty(name);
            String locatorType = value.split("!")[0];
            String locatorValue = value.split("!")[1];
            if(locatorType.equals("xpath")){
                return By.xpath(locatorValue);
            }
            else if(locatorType.equals("id")){
                return By.id(locatorValue);
            }
        }
        catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
