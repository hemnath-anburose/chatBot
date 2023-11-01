package app.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import app.config.MyLibrary;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;

public class StepDef extends MyLibrary{

	@Given("open android")
	public void open_android() {
		AppiumSetup();
		ImpWait(30);
	}
	@Given("Input Data and Do Calculate Price")
	public void input_data_and_do_calculate_price() {
	    driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Search']")).click();
	    driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).sendKeys("va vaathi");
	    ((AndroidDriver) driver).pressKeyCode(66);
	    
	}
	@Given("some other precondition")
	public void some_other_precondition() {
//	    driver.findElement(By.id("//android.view.ViewGroup[@content-desc='Vaa Vaathi Full Video Song | Vaathi Movie | Dhanush, Samyuktha | GV Prakash Kumar | Venky Atluri - 3 minutes, 15 seconds - Go to channel - Aditya Music Tamil - 58M views - 2 months ago - play video']")).click();
		WebElement Song = driver.findElement(MobileBy.AccessibilityId("Vaa Vaathi Full Video Song | Vaathi Movie | Dhanush, Samyuktha | GV Prakash Kumar | Venky Atluri - 3 minutes, 15 seconds - Go to channel - Aditya Music Tamil - 60M views - 2 months ago - play video"));
		Song.click();
	}
	
}
