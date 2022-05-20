package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    public static String userName = "developerteam_r8gNdl";
    public static String accessKey = "18cc9MVxuwjSZkBTfNsb";
    private Driver() {
    }
    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> get(){
        if (driver==null){
            String platform = ConfigurationReader.get("platform");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            switch (platform){
                case "browserstack":
                    capabilities.setCapability("platformName", "android");
                    capabilities.setCapability("platformVersion", "12.0");
                    capabilities.setCapability("deviceName", "Samsung Galaxy S21");
                    capabilities.setCapability("app", "bs://d7461817aa0319784acd9ad9be3f50f3c912dd4c");
                    try {
                        driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                case "android":

                    capabilities.setCapability("platformName", "Android");
                    capabilities.setCapability("platformVersion", "11.0");
                    capabilities.setCapability("deviceName", "Pixel_2");
                    capabilities.setCapability("automationName", "UiAutomator2");
                    capabilities.setCapability("app", "C:\\Users\\Ferhat\\IdeaProjects\\ApidemosCucumberBrowserStack\\apidemos.apk");
                    try {
                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                default:

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}