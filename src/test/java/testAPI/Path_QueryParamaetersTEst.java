package testAPI;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Path_QueryParamaetersTEst {
  @Test
  public void setupForEndpoint()
  {
	  //https://reqres.in/api/users?page=2
	  
	  given()
	  	.pathParam("apipath","users")
	  	.queryParam("page","1")
	  	
	  .when()
	  .get("https://reqres.in/api/{apipath}")
	  .then()
	  .statusCode(200)
	  .log().body();
	  
	  
	  
	  
	  
  }
}
