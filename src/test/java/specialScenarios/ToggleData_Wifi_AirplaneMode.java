package specialScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mobileDriverSession.DriverSession;

public class ToggleData_Wifi_AirplaneMode {
  @Test
  public void testTogglrSetup() throws InterruptedException 
  {
	  //create driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //wifi
	  System.out.println("Wifi is ON");
	  //ON to OFF
	  
	  ((AndroidDriver)driver).toggleWifi();
  
	  System.out.println("Wifi is OFF");
	  
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("Wifi is ON");
	  
	  
	  
	  ///Interaction with mobile data
	  
	  WebElement ele=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  
	  //swipe left
	  
	  Utility.swipeAction(driver,ele,"left");
	  
	  Thread.sleep(2000);
	  
	  //mobile data ON--->OFF--->ON
	  
	  System.out.println("Mobile Data is ON");
	  
	  ((AndroidDriver)driver).toggleData();
	  
	  
	  System.out.println("Mobile Data is OFF");

	  ((AndroidDriver)driver).toggleData();
	  
	  
	  System.out.println("Mobile Data is ON");
	  
	  //Airplane Mode
	  
	  System.out.println("Airplane mode is OFF");
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("Airplane mode is ON");
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("Airplane mode is OFF");

	  
	  
	  
	  
	  
  
  }
}
