package mobileDriverSession;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithOptionsClass {
  @Test
  public void testDriverSession() throws MalformedURLException
  {
	  UiAutomator2Options options=new UiAutomator2Options();
	  options.setPlatformName("Android");
	  //options.setCapability("appium:adbExecTimeout",30000);
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("appium:app",path);
	  
	  //Server details
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create driver session
	  AppiumDriver driver=new AndroidDriver(url,options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
