package interactWithElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import mobileDriverSession.DriverSession;

public class LongclickGesture {
  @Test
  public void testLongClick() 
  {
	  
	  //create driver session
	  AppiumDriver driver = DriverSession.initAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //first circle
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));	  
	  
	  //long click
	  
	  driver.executeScript("mobile: longClickGesture",ImmutableMap.of(
			 "elementId", ((RemoteWebElement)ele).getId(),
			  "duration",4000
			  ));
	  
	  System.out.println("Long click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
