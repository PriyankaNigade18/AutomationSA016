package interactWithElement;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import mobileDriverSession.DriverSession;

public class AlertHandling {
  @Test
  public void testAlert()
  {
	//create driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  
	  //App
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	   //alerts
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //clic on ele to open alert
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  //Alert will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Text of Alert: "+alt1.getText());
	  alt1.accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
