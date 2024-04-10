package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Put_Delete_Request
{
  @Test(priority=1)
  public void PutRequest() 
  {
	  System.out.println("Put request to update user whose id =2");
	  
	  //pay load
	  PojoData p1=new PojoData();
	  p1.setName("Priyanka");
	  p1.setJob("SME");
			  
	  given()
	  	.contentType("application/json")
	  	.body(p1)
	  	
	  .when()
	  	.put("https://reqres.in/api/users/2")
	  
	  .then()
	  .statusCode(200)
	  .log().body();
  }
  
  @Test(priority=2)
  public void deleteRequest()
  {
	  System.out.println("Delete Request in RestAssured");
	  	given()
	  	.when()
	  	.delete("https://reqres.in/api/users/2")
	  	.then()
	  	.statusCode(204)
	  	.log().all();
  }
  
  
  
}
