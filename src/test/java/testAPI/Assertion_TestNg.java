package testAPI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_TestNg {
  @Test(enabled=false)
  public void hardAssertTest()
  {
	  String act="Selenium WebDriver is Webui automation library";
	  String exp="Selenium WebDriver is Webui automation library/tool";
	  
	  Assert.assertEquals(act,exp,"Test Fail: Strings are not equals!");
	  System.out.println("Test pass:Strings are equal!");

  }
  @Test
  public void softAssertTest()
  {
	  
	  SoftAssert sf=new SoftAssert();
	  String act="Selenium WebDriver is Webui automation library";
	  String exp="Selenium WebDriver is Webui automation library/tool";
	  
	  sf.assertEquals(act,exp,"Test Fail: Strings are not equals!");
	  
	  System.out.println("Test pass:Strings are equal!");
	  sf.assertAll();

	  
	  
	  
	  
	  
	  
	  
  }
}
