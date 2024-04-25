package specialScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mobileDriverSession.DriverSession;

public class Lock_UnLock_RotateDevice {
  @Test
  public void testDeviceSetup() throws InterruptedException
  
  {
	  //Create Driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  /*
	  //lock the device
	  ((AndroidDriver)driver).lockDevice();
	  System.out.println("Device is locked!");
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	  
	  System.out.println("Device is Unlocked!");
	   */
	  
	  //Rotate
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  System.out.println(" Screen Rotate is Done!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
