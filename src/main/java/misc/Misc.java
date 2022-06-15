package misc;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

import java.io.FileInputStream;
import java.util.Properties;

public  class Misc {

    public static String getProperty(String key) {
        Properties property = new Properties();
        String value;
        try {
            property.load(new FileInputStream("resources\\application.properties"));
            value = property.getProperty(key);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public static void methodWait(long x) {
        try{
            Thread.sleep(x*1000);
        }
        catch(Exception e){
        }
    }

    public void addScreenshot(Scenario scenario ){
       final byte[] screenshot = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","Search");
    }


}
