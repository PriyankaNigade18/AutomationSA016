package specialScenarios;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import mobileDriverSession.DriverSession;

public class PerformanceDataTest {
  @Test
  public void testPerformance()
  {
	  //create session
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  
	  System.out.println("******Performance Parameters**********");
	  
	  List<String> datatypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  
	  for(String i:datatypes)
	  {
		  System.out.println(i);
	  }
	  
	  /*cpuinfo
	  memoryinfo
	  batteryinfo
	  networkinfo	  */
	  
	  System.out.println("*******Performance data for Network***********");
	  List<List<Object>> netData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
	  
	  System.out.println(netData);
	  
	  
	  
	  
	  System.out.println("*******Performance data for Battery***********");
	  List<List<Object>> batData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	  
	  System.out.println(batData);
	  
	  
	  System.out.println("*******Performance data for Memory***********");
	  List<List<Object>> memData=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
	  
	  System.out.println(memData);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
