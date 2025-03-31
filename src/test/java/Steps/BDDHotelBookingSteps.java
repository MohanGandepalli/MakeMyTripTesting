package Steps;

import com.pages.BDDHotelBooking;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDHotelBookingSteps {

	BDDHotelBooking obj = new BDDHotelBooking(DriverFactory.getDriver());

	@Given("Userr is on MakeMyTrip LoginPage")
	public void userr_is_on_make_my_trip_login_page() throws InterruptedException {
		DriverFactory.getDriver().get("https://www.makemytrip.com");
		System.out.println("Popup displayed");
		Thread.sleep(2000);

	}

	@When("Userr clicks on pop for not logging in")
	public void userr_clicks_on_pop_for_not_logging_in() throws InterruptedException {
		obj.crosspop();

	}

	@When("Userr selects Hotel Tab")
	public void userr_selects_hotel_tab() {
		obj.hotelnavigate();
	}

	@When("Userr chooses city from DropDown {string}")
	public void userr_chooses_city_from_drop_down(String d) throws InterruptedException {
		obj.destiny(d);

	}

	@When("Userr selects startdate {string}")
	public void userr_selects_startdate(String st) {
		obj.startdate(st);
	}

	@When("Userr selects enddate {string}")
	public void userr_selects_enddate(String dt) {
		obj.enddate(dt);
	}

	@When("Userr clicks on apply button")
	public void userr_clicks_on_apply_button() {
		obj.apply();
	}

	@When("Userr clicks on search button")
	public void userr_clicks_on_search_button() {
		obj.search();
	}

	@When("Userr is redirected to another window")
	public void userr_is_redirected_to_another_window() throws InterruptedException {
		obj.windowhandling();
	}

	@When("Userr clicks on book button")
	public void userr_clicks_on_book_button() throws InterruptedException {
		obj.booknow();
	}

	@When("Userr enters first name {string}")
	public void userr_enters_first_name(String string) {
		obj.sendfirstname(string);
	}

	@When("Userr enters last name {string}")
	public void userr_enters_last_name(String string) {
		obj.sendlastname(string);
	}

	@When("Userr enters email {string}")
	public void userr_enters_email(String string) {
		obj.sendemail(string);
	}

	@When("Userr enters number {string}")
	public void userr_enters_number(String string) {
		obj.sendnum(string);
	}

	@When("Userr clicks on paynow")
	public void userr_clicks_on_paynow() {
		obj.click();
	}

	@Then("Userr should navigate to card details page")
	public void userr_should_navigate_to_card_details_page() {
System.out.println("User needs to enter card details");
	}

}
