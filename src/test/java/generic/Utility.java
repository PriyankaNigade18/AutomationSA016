package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class Utility {

	
	
	public static void scrollDown(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",0.75
				  ));
	}
	
	
	public static void scrollDownAsPerCount(AppiumDriver driver,WebElement ele,int count)
	{
		for(int i=1;i<=count;i++) 
		{
				
			System.out.println("Count is: "+i);
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","down",
				  "percent",0.75
				  ));
		}
	}
	
	
	
	public static void swipeAction(AppiumDriver driver,WebElement ele,String dir)
	{
		driver.executeScript("mobile: swipeGesture",ImmutableMap.of(
				"elementId",((RemoteWebElement)ele).getId(),
				  "direction",dir,
				  "percent",0.75
				  			  ));
	}
	
	
	
	
	
	
	public static void scrollUp(AppiumDriver driver,WebElement ele)
	{
		driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
				  "elementId",((RemoteWebElement)ele).getId(),
				  "direction","up",
				  "percent",0.75
				  ));
	}
	
	
	
	
	
	
	
	
}
