package app.definition;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import app.config.MyLibrary;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Dstv extends MyLibrary {
	
	public static AndroidDriver driver;
	public static WebDriverWait exp ;
	
	public static void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:platformVersion", "12");
	    desiredCapabilities.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
	    desiredCapabilities.setCapability("appium:automationName", "Appium");
	    desiredCapabilities.setCapability("appium:appPackage", "com.dstvmobile.android");
	    desiredCapabilities.setCapability("appium:appActivity", "com.dstv.now.android.ui.splash.SplashActivity");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    exp = new WebDriverWait(driver, 30);
	  }
	
	public static void main(String[] args) throws MalformedURLException {
		setUp();
		driver.findElement(MobileBy.id("EmailOrMobileNumber")).sendKeys("anburosehemnath@gmail.com");
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.widget.EditText")).sendKeys("@Hemsin3175");
		driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.Button")).click();

	}

}
