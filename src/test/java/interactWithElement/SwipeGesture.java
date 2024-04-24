package interactWithElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import mobileDriverSession.DriverSession;

public class SwipeGesture {
  @Test
  public void testSwipe()
  {
	//create driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //complete photos
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  //swipeGesture
//	  driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
//			  		  
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","left",
//			  "percent",0.75
//			  			  ));
	  Utility.swipeAction(driver,ele,"left");
	  
	  
	  System.out.println("Swipe on photos completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
