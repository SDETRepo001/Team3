package defualt_package;

import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class test001 {

	
	
	//@Test
	void test0001 () {
		// baryali
		Response response =get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString()+"as string************************************************");
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
//		System.out.println(response.getHeader("content-type"));
//		System.out.println(response.getTime());
		System.out.println("first test");
		
		int statuscode = response.statusCode();

		Assert.assertEquals(statuscode, 200);
		
		
		System.out.println(statuscode);
		
		
	}
	
	//@Test 
	void Test_002 () {
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().log().all();
		//.statusCode(201).body("data.id[0]", equalTo (7));
		
		
	
	
	}
	@Test 
		void Test_003 () {
			given()
			.get("https://reqres.in/api/users?page=2")
			.then()
			.statusCode(200).body("data.id[0]", equalTo (7)).and().log().all();
			
			
		
		
		}
	}

