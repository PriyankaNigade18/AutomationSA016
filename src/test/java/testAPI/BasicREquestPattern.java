package testAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


//Older way to test api in automation
//Latetest way is to use REstApi static import
public class BasicREquestPattern 
{
  @Test
  public void SingleUser_GET()
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  System.out.println("Status code: "+res.statusCode());
	  System.out.println("Session Id: "+res.sessionId());
	 
	  
	  //validation
	  int acode=res.statusCode();
	  
	  Assert.assertEquals(acode,200);
	  System.out.println("Status code matched!");
	  
	  
  }
}
