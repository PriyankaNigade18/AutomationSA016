package specialScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mobileDriverSession.DriverSession;

public class NotificationsTest {
  @Test
  public void testNotification()
  {
	  //create a driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //open notifications
	  ((AndroidDriver)driver).openNotifications();
	  
	  
	  System.out.println("*******Notification Title*********");
	  
	 List<WebElement> title= driver.findElements(AppiumBy.id("android:id/title"));
	  System.out.println("Number of Notifications are: "+title.size());
	  
	  for(WebElement i:title)
	  {
		  //validation-Assertion
//		  Assert.assertTrue(i.getText().contains("Appium Settings"));
//		  System.out.println("Match found!...Test Pass!");
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("*********Notification Silent Subtext**************");
	  
	  WebElement silent=driver.findElement(AppiumBy.id("android:id/text"));
	  
		  System.out.println(silent.getText());
	  
 System.out.println("*********Notification Appium Subtext**************");

	  String text=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
