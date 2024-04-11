package testAPI;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization_Deserialization 
{
	/*
	 * POJO Object----->JSON=Serialization
	 * JSON object ----->POJO Object=De-serialization
	 */
  @Test(priority=1)
  public void testSerialization() throws JsonProcessingException
  {
	  PojoData p1=new PojoData();
	  p1.setName("Kiran");
	  p1.setJob("QA");
	  
	  ObjectMapper map=new ObjectMapper();
	  String jsonData=map.writerWithDefaultPrettyPrinter().writeValueAsString(p1);
	  
	  System.out.println(jsonData);
	  
	
  }
  
  @Test(priority=2)
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  String jsonData="{\n"
	  		+ "  \"name\" : \"Kiran\",\n"
	  		+ "  \"job\" : \"QA\"\n"
	  		+ "}";
	  ObjectMapper map=new ObjectMapper();
	  PojoData p1=map.readValue(jsonData,PojoData.class);
	  
	  System.out.println(p1.getName());
	  System.out.println(p1.getJob());
  }
  
  
  
  
  
}
