package APISteps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GETStep {
	Response res;
	@Given("I have the endpoint {string}")
	public void i_have_the_endpoint(String endpoint) {
		RestAssured.baseURI="https://thinking-tester-contact-list.herokuapp.com";
		RestAssured.basePath=endpoint;
	}

	@When("I send the GET request")
	public void i_send_the_get_request() {
		res=RestAssured.given().header("Authorization","Bearer "+"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NmQ1ZjE3ZjlkNTY5NTAwMTMwZTliMDQiLCJpYXQiOjE3MjUzNTYzMDl9.eqcHpXNLsnIFZeAp0FpLo1cRu0nqk5Y4RDiyO7BDsPg").get();
		res.prettyPrint();
	}

	@When("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer int1) {
		assertEquals(res.getStatusCode(),int1.intValue());
	}

	@When("the response body should contain names as {string}")
	public void the_response_body_should_contain_names_as(String string) {
			System.out.println(res.asPrettyString());
			if((res.asString()).contains("Avinash"))
			{
				System.out.println("User is present");
			}
			else
			{
				System.out.println("User not present");
			}
	}

	@When("the response body should contain email as {string}")
	public void the_response_body_should_contain_email_as(String string) {
		System.out.println(res.asPrettyString());
		if((res.asString()).contains("sivateja123@gmail.com"))
		{
			System.out.println("User email is present");
		}
		else
		{
			System.out.println("User email not present");
		}
	}

	@Then("GET is successful")
	public void get_is_successful() {
System.out.println("Get is Successful");
	}

}
