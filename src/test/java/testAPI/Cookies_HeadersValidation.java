package testAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Cookies_HeadersValidation 
{
  @Test(priority=1)
  public void getAllCookies()
  {
	  given()
	  
	  .when()
	  	.get("https://www.google.com")
	  .then()
	  .log().cookies();
	  
  }
  
  @Test(priority=2)
  public void testSingleCookie()
  {
	  Response res=given()
	  			  		.when()
			  			.get("https://www.google.com");
	  
	  //single cookie
	  String actCookie=res.getCookie("AEC");
	
	  Assert.assertFalse(actCookie.equals("AQTF6Hy-_EuvljU-BT0O7Xxxe88egXLFW_dG7SifVre7cLpOU4s1mAn56A;Path=/;Domain=.google.com;Secure;HttpOnly;Expires=08/10/24, 3:47 pm;SameSite=lax"),"Test Fail: so the cookeis are same ");
	  System.out.println("Test Pass: AS Cookies always dynamic so it should not be same");
	 
	  
  }
  
  @Test(priority=3)
  public void getAllHeaders()
  {
	given()
	.when()
	.get("https://www.google.com")
	.then()
	.log().headers();
  }
  
  //Content-Type: text/html; charset=ISO-8859-1
  
  
  @Test(priority=4)
  public void validateHeaders()
  {
	  Response res=given()
		.when()
		.get("https://www.google.com");
	  
	 String actHeader=res.getHeader("Content-Type");
	 Assert.assertEquals(actHeader,"text/html; charset=ISO-8859-1","Test Fail: Headers are not matched!");
	 System.out.println("Test Pass: Headers matched!");
	 
	 
	 
  }
}
