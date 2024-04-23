package mobileDriverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class FirstDriverSession {
  @Test
  public void testDriverSession() throws MalformedURLException
  {
	  //DesiredCapabilities
	  
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("deviceName","pixel_5");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  cap.setCapability("appium:app",path);
	  
	  //connection with server
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create AppiumDriver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session Id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
