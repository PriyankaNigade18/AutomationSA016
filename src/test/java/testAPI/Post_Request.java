package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Post_Request
{
	/*
	 * To create POST request: Request pay load
	 * 1.Using HashMap
	 * 2.Using POJO class -plain old Java object
	 */
  @Test(priority=1)
  public void postUsingHashMap()
    {
	  System.out.println("Post request using HashMap");
	  //request payload
	  HashMap<String,Object> map=new HashMap<String,Object>();
	  map.put("name","Jay");
	  map.put("job","QA");
	  
	  given()
	  	.contentType("application/json")
	  	.body(map)
	  	
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .body("name",equalTo("Jay"))
	  .log().all();
	  
  }
  
  
  
  
  
  @Test(priority=2)
  public void postUsingPojo()
    {
	  System.out.println("Post request using Pojo");
	  
	  //request pay laod
	  PojoData p1=new PojoData();
	  p1.setName("Sarang");
	  p1.setJob("Devloper");
			  
	  
	  given()
	  	.contentType("application/json")
	  	.body(p1)
	  	
	  .when()
	  .post("https://reqres.in/api/users")
	  
	  .then()
	  .statusCode(201)
	  .body("job",equalTo("Devloper"))
	  
	  .log().all();
	  
  }
}
