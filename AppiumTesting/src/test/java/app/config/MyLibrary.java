package app.config;

import java.awt.AWTException;
import java.awt.Robot;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MyLibrary {
	public static  WebDriver driver;
	public static void AndroidCap(String AppName) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "12");
		caps.setCapability("deviceName", "sdk_gphone64_x86_64");
//		caps.setCapability("App", "{src/test/resources/app/"+AppName+".apk}");
		driver = new AndroidDriver<MobileElement>(new URL("https://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void AppiumSetup() {
		 DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("appium:platformVersion", "12");
		    desiredCapabilities.setCapability("appium:deviceName", "sdk_gphone64_x86_64");
		    desiredCapabilities.setCapability("appium:automationName", "Appium");
		    desiredCapabilities.setCapability("appium:appPackage", "com.google.android.youtube");
		    desiredCapabilities.setCapability("appium:appActivity", "com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
		    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
		    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
		    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
		    desiredCapabilities.setCapability("unicodeKeyboard", "true");                                     
		    desiredCapabilities.setCapability("resetKeyboard", "true");

		    URL remoteUrl = null;
			try {
				remoteUrl = new URL("http://localhost:4723/wd/hub");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	}
	
	public static void ImpWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
}
