package interactWithElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import mobileDriverSession.DriverSession;

public class ClickGestureTest {
  @Test
  public void testClick() 
  {
	  //create session
	  
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //Element
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  
	  //mobile: clickGesture
	  
	  driver.executeScript("mobile: clickGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId()
			  
			  ));
	  
	  System.out.println("Click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
  }
}
