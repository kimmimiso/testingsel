package restAssuredTests;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;


public class statusValidationTest {

	String APIKey = "546d70d2177da10df30941ad26520fb3";
	
	String OAuthToken = "ATTAdae3945295caf487a1ea979f81b44750bc427f1829163e874ab8d2766b50f7789FAC0CEE";
	
	@Test
	public void validateData() {
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.given()
		.param("key", APIKey)
        .param("token", OAuthToken)
        .param("https://api.trello.com/1/members/me/boards")
        .then()
        .statusCode(200)
		.body("name", hasItems("restAssuredBoard","TestingPostman"))
		.body("id",equalTo("6424de0cd838723ef66b0b24"));
		
	}
}
