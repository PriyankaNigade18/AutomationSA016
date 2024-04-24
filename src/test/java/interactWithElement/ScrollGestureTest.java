package interactWithElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import mobileDriverSession.DriverSession;

public class ScrollGestureTest {
  @Test
  public void testScroll() throws InterruptedException
  {
	  //create driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //page address
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  
//	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
//			  "elementId",((RemoteWebElement)ele).getId(),
//			  "direction","down",
//			  "percent",0.75
//			  ));	  
	  
	  Utility.scrollDown(driver,ele);
	  
	  Thread.sleep(2000);
	  
	  Utility.scrollUp(driver,ele);
	  
	  Thread.sleep(2000);
	  
	  Utility.scrollDownAsPerCount(driver,ele,3);
	  
	  System.out.println("ScrollDown Gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
