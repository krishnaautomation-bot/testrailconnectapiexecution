package authController;

import java.io.IOException;
import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.TestData;

public class CheckAuthAttributes {
	
	TestData testdata;
	Response resp;
	String responseString;
	
	public void init(String basePath) throws IOException {
		testdata = new TestData();
		RestAssured.baseURI=testdata.properties.getProperty("auth_baseURI");
		RestAssured.basePath=basePath;
	}
	
	public void post_checkauthattributes(HashMap<Object, Object> jsonPayload) throws IOException {
		
		testdata = new TestData();
		
		init(testdata.properties.getProperty("check_auth_attributes"));
		
		resp = RestAssured.given().
				contentType("application/json").
				log().all().body(jsonPayload).post();
		
		resp.prettyPrint();
		responseString = resp.getBody().asString();
		
	}
	
	public int getStatusCode() {
		return resp.getStatusCode();
	}
	
	public String getReseponseCode() {
		return resp.andReturn().jsonPath().getString("code");
	}
	
	public String getResponseMessage() {
		return resp.andReturn().jsonPath().getString("message");
	}
	
	public boolean getResponse(String str) {
		return resp.andReturn().jsonPath().getBoolean(str);
	}
	
	
	
}
