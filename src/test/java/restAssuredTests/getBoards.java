package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getBoards {
	
	String APIKey = "546d70d2177da10df30941ad26520fb3";
	String OAuthToken = "ATTAdae3945295caf487a1ea979f81b44750bc427f1829163e874ab8d2766b50f7789FAC0CEE";
	
	@Test
	public void getBoards() {
		
		//set the base URL
		RestAssured.baseURI = "https://api.trello.com/1/members/me/boards"; 
		
		//create request object
		RequestSpecification httpRequest = RestAssured.given();
		
		// response object
		Response myResponse = httpRequest.get(RestAssured.baseURI+"?key="+APIKey+"&token="+OAuthToken);
		
		System.out.println(myResponse.prettyPrint());
		
		Assert.assertEquals(200, myResponse);
	}

}
