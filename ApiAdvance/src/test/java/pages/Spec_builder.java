package pages;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;

public class Spec_builder {
	
	
	public static RequestSpecBuilder req_spec_builder()
	{
		      RequestSpecBuilder req = new RequestSpecBuilder();
		      req.setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
		      return req;
		
	}

	public static ResponseSpecBuilder res_spec_builder(int code)
	{
		         ResponseSpecBuilder res = new ResponseSpecBuilder();
		         res.expectContentType(ContentType.JSON).expectStatusCode(code).build();
		         return res;
	}
}

