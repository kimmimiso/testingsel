package restAssuredTests;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createBoards {

	String APIKey = "546d70d2177da10df30941ad26520fb3";
	String OAuthToken = "ATTAdae3945295caf487a1ea979f81b44750bc427f1829163e874ab8d2766b50f7789FAC0CEE";
	String boardName = "restAssuredBoard";
	
	@Test
	public void createBoard() {
		
			//set the base URL
			RestAssured.baseURI = "https://api.trello.com/1/boards"; 
				
			//create request object
			RequestSpecification httpRequest = RestAssured.given();
			
			httpRequest.header("Content-Type","application/json");
			
			Response myResponse = httpRequest.post(RestAssured.baseURI+"/?name="+boardName+"&key="+APIKey+"&token="+OAuthToken);
			
			int statusCode = myResponse.getStatusCode();
			
			Assert.assertEquals(200, statusCode);
			
			System.out.println("The test passed and board created with status Code- "+ statusCode);
		
	}
	
	
	
	
	
	
}
