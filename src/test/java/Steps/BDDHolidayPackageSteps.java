package Steps;

import com.pages.BDDHolidayPackage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDHolidayPackageSteps {

	BDDHolidayPackage obj = new BDDHolidayPackage(DriverFactory.getDriver());

	@Given("Ussers in on MakeMyTrip LoginPage")
	public void ussers_in_on_make_my_trip_login_page() throws InterruptedException {
		DriverFactory.getDriver().get("https://www.makemytrip.com");
		System.out.println("Popup displayed");
		Thread.sleep(2000);
	}

	@When("Usserr clicks on pop for not logging in")
	public void usserr_clicks_on_pop_for_not_logging_in() throws InterruptedException {
		obj.crosspop();
	}

	@When("Usser selects Holiday Package Tab")
	public void usser_selects_holiday_package_tab() throws InterruptedException {
		obj.holidaynavigate();

	}

	@When("Usser Selects nearest city and clicks on update")
	public void usser_selects_nearest_city_and_clicks_on_update() throws InterruptedException {

		obj.waits();
			obj.pops();	
	}

	@When("Usser enters the to city {string}")
	public void usser_enters_the_to_city(String string) {
		obj.waits();
		obj.tocity(string);
	}

	@When("Usser selects the depature date {string}")
	public void usser_selects_the_depature_date(String string) {
		obj.startdate();
	}

	@When("Usser Selects number of guests")
	public void usser_selects_number_of_guests() {
		obj.guests();
	}

	@When("Usser clicks on search")
	public void usser_clicks_on_search() {
		obj.search();
	}

	@When("Usser cancels popup")
	public void usser_cancels_popup() {
obj.popup1();
	}

	@When("Usser cancels another popup need assistance")
	public void usser_cancels_another_popup_need_assistance() {
obj.popup2();
	}

	@When("Usser selects package")
	public void usser_selects_package() {

	}

	@When("Usser clicks with flights")
	public void usser_clicks_with_flights() {

	}

	@When("Usser clicks on skip")
	public void usser_clicks_on_skip() {

	}

	@When("usser cancels on popup")
	public void usser_cancels_on_popup() {

	}

	@When("Usser clicks on proceed to payment")
	public void usser_clicks_on_proceed_to_payment() {

	}

	@When("Usser clicks on Add Traveller1")
	public void usser_clicks_on_add_traveller1() {

	}

	@When("Usser enters first name {string}")
	public void usser_enters_first_name(String string) {

	}

	@When("Usser enters last name {string}")
	public void usser_enters_last_name(String string) {

	}

	@When("Usser selects date of birth {string}")
	public void usser_selects_date_of_birth(String string) {

	}

	@When("Usser chooses gender from dropdown")
	public void usser_chooses_gender_from_dropdown() {

	}

	@When("Usser clicks on add traveller")
	public void usser_clicks_on_add_traveller() {

	}

	@When("Usser clicks on add travellers")
	public void usser_clicks_on_add_travellers() {

	}

	@When("Usser enter contact email {string}")
	public void usser_enter_contact_email(String string) {

	}

	@When("Usser enters mobile code {string}")
	public void usser_enters_mobile_code(String string) {

	}

	@When("Usser enters mobile number {string}")
	public void usser_enters_mobile_number(String string) {

	}

	@When("Usser Selects GST State from Dropdown")
	public void usser_selects_gst_state_from_dropdown() {

	}

	@When("Usser clicks on no continue")
	public void usser_clicks_on_no_continue() {

	}

	@When("Usser enters UPI Id and clicks on verify")
	public void usser_enters_upi_id_and_clicks_on_verify() {

	}

	@Then("Usser needs to pay")
	public void usser_needs_to_pay() {

	}

}
