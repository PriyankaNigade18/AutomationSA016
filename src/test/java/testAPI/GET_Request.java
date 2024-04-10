package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
/*
 * given()
 * Preconditions
 * request Pay load,header,cookies,auth(),query and path param
 * 
 * when()
 * Request
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then()	
 * Validation
 * status code
 * json body(response pay load)
 * 
 */
public class GET_Request 
{
  @Test(priority=1)
  public void singleUser() 
  {
	  given()
	  
	  .when()
	  	.get("https://reqres.in/api/users/2")
	  	
	  .then()
	  	.assertThat()
	  	.statusCode(200)
	  	.body("data.id",equalTo(2))
	  	.body("data.first_name",equalTo("Janet"))
	  	//.log().all();
	  	.log().body();
	  
	  System.out.println("Id tested");
	  System.out.println("Firstname validation done");
	    
  }
  @Test(priority=2)
  public void listOfUsers_GET()
  {
	  
	  //hasItems()-test all elements from collection ,any order allowed and partial match possible
	  //contains()-test all elements from collection ,Order must be same and partial match not possible
	  System.out.println("*****Scenario2: List of Users of page =2 ******");
	  given()
	  
	  .when()
	  .get("https://reqres.in/api/users?page=2")
	  
	  .then()
	  .statusCode(200)
	  .body("page",equalTo(2))
	  .body("data.first_name[3]",equalTo("Byron"))
	  //testing all ids from collection
	  //.body("data.id",hasItems(7,8,9,10,11,12,13))fail
	  //.body("data.id",hasItems(11,12,7,10,9,8))//pass
	  //.body("data.id",hasItems(10,11,12))//pass
	  
	  .body("data.id",contains(7,8,9,10,11,12))//pass
	  //.body("data.id",contains(7,8,9,10,11,12,13))//fail
	  .body("data.id",contains(10,11,12))//fail
	  
	  .log().body();
	  
	  
	  
}
}
