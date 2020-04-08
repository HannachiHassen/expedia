package run;

import org.testng.annotations.Test;
import java.io.File;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class API_Test {
@Test
	public void f() {
		//get("https://reqres.in/api/users?page=2");
		Response srvrsd=get("https://reqres.in/api/users?page=2");
		srvrsd.prettyPrint();
		System.out.println(srvrsd.statusCode());
		System.out.println(srvrsd.getTime());
		//System.out.println(srvrsd.getSessionId());
	 }
@Test
public void post() {
	File fi=new File("C:\\Users\\HASSEN\\workspace\\expedia.com\\users.json");
	Response createuser=given().contentType("application/jason").body(fi).post("http://dummy.restapiexample.com/api/v1/create");
	createuser.prettyPrint();
	createuser.then().statusCode(200);
   }
}
