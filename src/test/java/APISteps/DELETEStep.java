package APISteps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETEStep {
	Response res;
		@Given("I have the endpointeds {string}")
		public void i_have_the_endpointeds(String endpoint) {
			RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
			RestAssured.basePath=endpoint;
		}

		@When("I send the DELETE request {string}")
		public void i_send_the_delete_request(String bodys) {
			
			res=RestAssured.given().header("Authorization","Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmQ1ZjE3ZjlkNTY5NTAwMTMwZTliMDQiLCJpYXQiOjE3MjUzNTYzMDl9.eqcHpXNLsnIFZeAp0FpLo1cRu0nqk5Y4RDiyO7BDsPg").header("Content-Type", "application/json").delete();
			
		}
		@Then("the responses statuss codes should be {int}")
		public void the_responses_statuss_codes_should_be(Integer int1) {
			assertEquals(res.getStatusCode(),int1.intValue());

		}



}
