package api_test;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.mitendra.data.ExcelReader;
import com.mitendra.model.Issue;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Upload_Test_Cases 
{
	@Test
	void uploadTestCases() throws IOException
	{
		// api url
		RestAssured.baseURI = "https://intranet.cogitate.us/redmine/issues.json";
		
		// httprequest
		RequestSpecification httprequest = RestAssured.given();
		
		// add header for auth
		httprequest.header("X-Redmine-API-Key","e6fac3c20aab5ac18469fcd5a357ab3f083a6bbc");
		
		// add header for content type
		httprequest.header("Content-Type", "application/json");
		
		// JSONObject
	JSONObject root = new JSONObject();
	
	JSONObject requestParams = new JSONObject();
	    
	ExcelReader r = new ExcelReader("D://data//testcases.xlsx");
	Issue[] rows = r.Read();
	
	
	    for (int i=0; i<rows.length;i++)
	    {
	    		    	   
	    	requestParams.put("project_id", rows[i].getProjectId());
			requestParams.put("tracker_id",rows[i].getTrackerId());
			requestParams.put("status_id",rows[i].getStatusId());
			requestParams.put("priority_id",rows[i].getPriorityId());
			requestParams.put("subject",rows[i].getSubject());
			requestParams.put("description",rows[i].getDescription());
			requestParams.put("fixed_version_id",rows[i].getFixedVersionId());
			requestParams.put("assigned_to_id",rows[i].getAssignedToId());
			
			root.put("issue", requestParams);
			httprequest.body(root.toJSONString());
			Response response = httprequest.post();
			int statusCode = response.getStatusCode();
			System.out.println("Status of" +i+ " "+statusCode);

	    }
	    
		//System.out.println(root.toJSONString());
		
		
	    
	}

}
