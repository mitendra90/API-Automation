package api_test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class TC001_Get_Issues
{
    @Test
	void getIssues()
    {
    	// Specify base URI    	
    	RestAssured.baseURI = "https://intranet.cogitate.us/redmine/issues";
    	
    	// Request object    	 	
    	RequestSpecification httprequest = RestAssured.given().header("X-Redmine-API-Key","e6fac3c20aab5ac18469fcd5a357ab3f083a6bbc");
    	    	
    	// Response object
    	Response response = httprequest.request(Method.GET,"/40264.json");
    	
    	// print response in console window
    	String responseBody = response.getBody().asString();
    	System.out.println(responseBody);
    	
    	// Status code validation
    	int statusCode = response.getStatusCode();
    	System.out.println(statusCode);
    	Assert.assertEquals(200, statusCode);
    	
    }
}
