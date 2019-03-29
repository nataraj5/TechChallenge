package StepDefinition;


//import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestDefinition {

	String urlString = "https://petstore.swagger.io/v2/pet";
	String url = "";
	HttpURLConnection con;
	@Given("^User with ID (\\d+)")
	public void user_id(int id) throws IOException{
		url = urlString + "/" + id;
		URL urlnew = new URL(url);
		con =(HttpURLConnection) urlnew.openConnection();
	}
	
	
	@When("^user retrieves the details by id$")
	public void user_retrieves_id() throws IOException{
		 con.setRequestMethod("GET");
	}
	
	@Then("the status code is (\\d+)")
	public void verify_status_code(int statusCode) throws IOException{
		int responseCode = con.getResponseCode();
		assertEquals(responseCode, statusCode);
	}
	

}



