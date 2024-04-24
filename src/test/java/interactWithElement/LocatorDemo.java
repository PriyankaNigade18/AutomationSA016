package interactWithElement;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import mobileDriverSession.DriverSession;

public class LocatorDemo {
  @Test
  public void testLocators()
  {
	  
	  AppiumDriver driver=DriverSession.initAndroidSession();
	  
	  //accessibility id
	 WebElement ele1= driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of Element1: "+ele1.getText());
	  ele1.click();
	  
	  //navigate back
	  driver.navigate().back();
	  
	  //xpath
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
	  System.out.println("Text of Element2: "+ele2.getText());
	  ele2.click();
	  
	  //navigate back
	  
	  driver.navigate().back();
	  
	  //className
	  WebElement ele3=driver.findElements(AppiumBy.className("android.widget.TextView")).get(3);
	  System.out.println("Text of Element3: "+ele3.getText());
	  ele3.click();
	  
	  //navigate back
	  driver.navigate().back();
	  
	  //id (resource-id)
	  WebElement ele4=driver.findElements(AppiumBy.id("android:id/text1")).get(3);
	  System.out.println("Text of Element4: "+ele4.getText());
	  ele4.click();
	  
	  //navigate back
	  driver.navigate().back();
	  
	  
	  //androidUIAutomator- works with text only
	  
	  WebElement ele5=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Content\")"));
	  System.out.println("Text of Element5: "+ele5.getText());
	  ele5.click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
