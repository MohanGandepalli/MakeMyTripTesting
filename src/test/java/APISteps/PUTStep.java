package APISteps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PUTStep {
	Response res;
	@Given("I have the endspoint {string}")
	public void i_have_the_endspoint(String endpoint) {
		RestAssured.baseURI = "https://thinking-tester-contact-list.herokuapp.com";
		RestAssured.basePath = endpoint;
	}

	@When("I send the PUT request {string}")
	public void i_send_the_put_request(String bodys) {
		bodys= "{\r\n"
				+ "    \"firstName\": \"John\",\r\n"
				+ "    \"lastName\": \"Doe\",\r\n"
				+ "    \"birthdate\": \"1970-01-01\",\r\n"
				+ "    \"email\": \"jdoe@fake.com\",\r\n"
				+ "    \"phone\": \"8005555555\",\r\n"
				+ "    \"street1\": \"1 Main St.\",\r\n"
				+ "    \"street2\": \"Apartment A\",\r\n"
				+ "    \"city\": \"Anytown\",\r\n"
				+ "    \"stateProvince\": \"KS\",\r\n"
				+ "    \"postalCode\": \"12345\",\r\n"
				+ "    \"country\": \"USA\"\r\n"
				+ "}";
		res=RestAssured.given().header("Authorization","Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmQ1ZjE3ZjlkNTY5NTAwMTMwZTliMDQiLCJpYXQiOjE3MjUzNTYzMDl9.eqcHpXNLsnIFZeAp0FpLo1cRu0nqk5Y4RDiyO7BDsPg").header("Content-Type", "application/json").body(bodys).put();
	
	}

	@When("the response status codes should be {int}")
	public void the_response_status_codes_should_be(Integer int1) {
		assertEquals(res.getStatusCode(),int1.intValue());
	}

	@Then("the response body shoulds contain {string}")
	public void the_response_body_shoulds_contain(String string) {
		System.out.println(res.asPrettyString());
		if((res.asString()).contains("id"))
		{
			System.out.println("id is present");
		}
		else
		{
			System.out.println("id not present");
		}
	}

}
