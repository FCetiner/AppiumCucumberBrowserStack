package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ApiDemosPage extends BasePage {

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement prefence3;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement wifiCheckBox;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")
    public  WebElement wifiSettingButton;
    
    @AndroidFindBy(id = "android:id/edit")
    public WebElement wifiTextBox;

    @AndroidFindBy(id="android:id/button1")
    public WebElement okButton;
}
