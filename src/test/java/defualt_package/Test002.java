package defualt_package;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test002 {
	
	@Test
	void test1() {
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().statusCode(200)
		.body("data.id[0]", equalTo(7))
		.log().all()
		.body("data.first_name", hasItem("Michael"));
		
	
		
		
		
	}

}
