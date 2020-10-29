package defualt_package;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class test001 {

	
	
	@Test
	void test0001 () {
		//Abdul Hamidi
		Response response =get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int statuscode = response.statusCode();

		Assert.assertEquals(statuscode, 200);
		
		
		System.out.println(statuscode);
		
		
	}
	
	
	void Test_002 () {
		
		given()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.statusCode(201).body("data.id[0]", equalTo (7));
		
		
	
	
	}
}
