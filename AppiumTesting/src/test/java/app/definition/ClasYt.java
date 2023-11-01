package app.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import app.config.MyLibrary;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class ClasYt extends MyLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppiumSetup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Search']")).click();
		driver.findElement(MobileBy.id("com.google.android.youtube:id/search_edit_text")).sendKeys("bittu padam di");
		((AndroidDriver) driver).pressKeyCode(66);
		driver.findElement(MobileBy.xpath("//android.view.ViewGroup[@content-desc='Trisha Illana Nayanthara - Bittu Padam Di Video | G.V. Prakash Kumar, Anandhi - 3 minutes, 35 seconds - Go to channel - SonyMusicSouthVEVO - 18M views - 7 years ago - play video']")).click();
	}

}
