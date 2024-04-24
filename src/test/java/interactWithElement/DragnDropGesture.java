package interactWithElement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import mobileDriverSession.DriverSession;

public class DragnDropGesture {
  @Test
  public void testDragGesture()
  {
	//create driver session
	  AppiumDriver driver = DriverSession.initAndroidSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag n drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  
	  //circle3
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
	  
	  //dragGesture
	  driver.executeScript("mobile: dragGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",685,
			  "endY",1106
			  ));
	  
	  
	  System.out.println("Drag gesture is completed!");
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println("Result text is: "+text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
