package defualt_package;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Test_post {
	
	@Test
	public void test1_post() {
//	Map<String, Object> map = new HashMap <String,Object>();
//		
//		
//
//	map.put("name", "Abdul");
//	map.put("job", "Tester");
	
	JSONObject  request = new JSONObject ();

	request.put("name", "Abdul");
	request.put("job", "Tester");

	
	System.out.println(request);
	System.out.println(request.toJSONString());

	given()
	.body(request.toJSONString())
	.when()
	.post("https://reqres.in/api/users")
	.then()
	.statusCode(201);
	
	
	
	}

}
