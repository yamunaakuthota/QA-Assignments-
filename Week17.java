
    import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import org.testng.annotations.Test;
	import static org.testng.Assert.assertEquals;

	

public class Week17 {

	
	    @Test(priority=1)
	     void testStatusCode() {

	        Response response = RestAssured.given().when().get("https://reqres.in/api/users/2").thenReturn();

	        int statusCode = response.getStatusCode();
	        assertEquals(statusCode, 200);  // TestNG's assertion
	    }
	    
	    @Test(priority=2)
	    void testfield() {
	    	
	    	Response response= RestAssured.given().when().get("https://reqres.in/api/users/2").thenReturn();
	    	
	    	int id= response.jsonPath().getInt("data.id");
	    	
	    	assertEquals(id, 2);
	    	
	    	String email= response.jsonPath().getString("data.email");
	    	
	    	assertEquals(email, "janet.weaver@reqres.in");
	    }
}
 
