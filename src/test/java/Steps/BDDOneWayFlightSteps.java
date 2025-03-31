package Steps;

import com.pages.BDDOneWayFlight;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDOneWayFlightSteps {
	
	private BDDOneWayFlight obj=new BDDOneWayFlight(DriverFactory.getDriver());
	

@Given("Users is on MakeMyTrip Loginpage")
public void user_is_on_make_my_trip_loginpage() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	DriverFactory.getDriver().get("https://www.makemytrip.com");
	System.out.println("Popup displayed");
	Thread.sleep(2000);
   
}

@When("Userss clicks on pop for not logging in")
public void user_clicks_on_cross_for_not_logging_in() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    obj.crosspop();
    System.out.println("pop closed");
    Thread.sleep(2000);
}

@When("Users search for flight from {string}")
public void user_search_for_flight_from_from(String f) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    obj.fromdest(f);
    Thread.sleep(2000);
}

@When("Users search for flight to {string}")
public void user_search_for_flight_to_to(String t) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    obj.todest(t);
    Thread.sleep(2000);
}

@When("Users enters date {string}")
public void user_enters_date_date(String d) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    obj.dateset(d);
    Thread.sleep(2000);
}

@When("Userss selects flight and proceed to booking by clicking view prices")
public void user_selects_flight_and_proceed_to_booking_by_clicking_view_prices() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    obj.searchflight();
    Thread.sleep(2000);
}


@Then("Users is redirected to flights page")
public void user_is_redirected_to_flights_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Redirected to Selected Flight");
}

}
