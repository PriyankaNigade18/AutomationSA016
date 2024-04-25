package specialScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import mobileDriverSession.DriverSession;

public class KeyWithKeyEvent {
  @Test
  public void testTextWriting() 
  {
	 AppiumDriver driver= DriverSession.initAndroidSession();
	 
	 //views
	 driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 
	 //WebElement
	 WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	 
	 //scroll 3
	 Utility.scrollDownAsPerCount(driver,ele,3);
	 
	 
	 //Text area
	 driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	 
	 //input
	 WebElement input=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	 
	 input.sendKeys("Hello All");
	 
	 
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.T));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.E));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.S));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.T));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.E));
	 ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.R));
	 
	 
	 Utility.capture(driver);
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
