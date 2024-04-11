package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class SameUSerCreate_Update_Delete
{
	int id;
	
  @Test(priority=1)
  public void createUSer() 
  {
	  System.out.println("User created with POST call");
	  //REquest PAyload
	  PojoData p1=new PojoData();
	  p1.setName("Jay");
	  p1.setJob("QA");
	  
	  id= given()
	  	.contentType("application/json")
	  	.body(p1)
	  
	  .when()
	  	.post("https://reqres.in/api/users")
	  	.jsonPath().getInt("id");
	 
	 System.out.println("User created with the id: "+id);
	  	
//	  	.then()
//	  	.log().body();
	  
  }
  
  @Test(priority=2,dependsOnMethods = "createUSer") 
  public void updateSameUSer()
  {
	  //Request payload
	  PojoData p2=new PojoData();
	  p2.setName("Yash");
	  p2.setJob("QA");
	  
	  given()
	  	.contentType("application/json")
	  	.body(p2)
	  	
	  .when()
	  	.put("https://reqres.in/api/users/"+id)
	  
	  .then()
	  .statusCode(200)
	  .body("name",equalTo("Yash"))
	  .log().body();
	  
	  System.out.println("User update with ID : "+id);
	  
	  
	  
  }
  
  @Test(priority=3,dependsOnMethods = "updateSameUSer")
  public void deleteSameUser()
  {
	  given()
	  
	  .when()
	  	.delete("https://reqres.in/api/users/"+id)
	  
	  .then()
	  .statusCode(204)
	  .log().all();
	  System.out.println("USer deleted with same id: "+id);
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
