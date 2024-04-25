package specialScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mobileDriverSession.DriverSession;

public class WorkingWithApp {
  @Test
  public void testApplicationStatus() 
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  System.out.println("Application current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));
	  
	  //terminate app
	  ((AndroidDriver)driver).terminateApp("io.appium.android.apis");
	  
	
	  System.out.println("After terminate Application current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //Activate app
	  
	  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
	  
	    System.out.println("After activate Application current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  
	  //unInstall app
	    
	    
	   ((AndroidDriver)driver).removeApp("io.appium.android.apis");
	  
	    System.out.println("After Uninstall Application current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //Install app
	    
	    String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	    ((AndroidDriver)driver).installApp(path);
	  
	    System.out.println("After Installation Application current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

	  //Activate app
		  
		  ((AndroidDriver)driver).activateApp("io.appium.android.apis");
		  
		    System.out.println("After activate Application current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

		    
		    
		  //Running app in Background
		    
		    ((AndroidDriver)driver).runAppInBackground(Duration.ofMillis(5000));
		    
		    System.out.println("After Background execution Application current state: "+((AndroidDriver)driver).queryAppState("io.appium.android.apis"));

		    
		    
		    
		    
		    
		    
	    
	    
	    
	    
	    
	  
  }
}
