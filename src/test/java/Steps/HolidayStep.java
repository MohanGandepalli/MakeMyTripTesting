package Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.Holiday;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HolidayStep {
	WebDriver driver;
	private Holiday holidaysearch = new Holiday(DriverFactory.getDriver());

	@Given("user is on the Holidays package page")
	public void user_is_on_the_holidays_package_page() {
		DriverFactory.getDriver().get("https://www.makemytrip.com/");
	}

	@When("user clicks on the cancel")
	public void user_clicks_on_the_cancel() throws InterruptedException {
		holidaysearch.clickOnclose();
	}

	@When("user clicks on Holidays Package button")
	public void user_clicks_on_holidays_package_button() throws InterruptedException {
		holidaysearch.clickOnHolidays();
	}

	@When("user clicks on from for holiday")
	public void user_clicks_on_from_for_holiday() throws InterruptedException {
		holidaysearch.clickOnFrombtn();
	}

	@When("user clicks on the holiday from city")
	public void user_clicks_on_the_holiday_from_city() throws InterruptedException {
		holidaysearch.clickOnfrst();
	}

	@When("user clicks on to for holiday")
	public void user_clicks_on_to_for_holiday() throws InterruptedException {
		holidaysearch.clickOnTobtn();
	}

	@When("user enters the fromcity as {string}")
	public void user_enters_the_fromcity_as(String frmcity) throws InterruptedException {
		holidaysearch.enterFrmcity(frmcity);

	}

	@When("user clicks the Tocity as {string}")
	public void user_clicks_the_tocity_as(String tocty) throws InterruptedException {
		holidaysearch.enterTocity(tocty);

	}

	@When("user clicks on first to city")
	public void user_clicks_on_first_to_city() throws InterruptedException {
		holidaysearch.clickOnfrsttocity();
	}

	@When("user selects Depart date")
	public void user_selects_depart_date() throws InterruptedException {
		holidaysearch.clickOndate();
	}

	@When("user clicks on Rooms")
	public void user_clicks_on_rooms() throws InterruptedException {
		holidaysearch.clickOnApply();
	}

	@Then("user clicks on Holidaypackage search")
	public void user_clicks_on_holidaypackage_search() throws InterruptedException {
		holidaysearch.clickOnsearch();
	}

	@When("user clicks on Package")
	public void user_clicks_on_package() throws InterruptedException {
		holidaysearch.clickOnpackage();
		holidaysearch.switchToNewWindow();

	}

	@When("user clicks on close")
	public void user_clicks_on_close() throws InterruptedException {
		holidaysearch.clickOnCloseass();
	}

	@When("user clicks on Proceed to payment")
	public void user_clicks_on_proceed_to_payment() throws InterruptedException {
		holidaysearch.clickOnProceed();
	}

	@When("user clicks on flights")
	public void user_clicks_on_flights() throws InterruptedException {
		holidaysearch.clickonflights();
	}

	@When("user clicks on Amount")
	public void user_clicks_on_amount() throws InterruptedException {
		holidaysearch.clickonAmount();
	}

	@When("user clicks on category")
	public void user_clicks_on_category() throws InterruptedException {
		holidaysearch.clickoncategory();
	}

	@When("user clicks on filter")
	public void user_clicks_on_filter() throws InterruptedException {
		holidaysearch.clickonApplyfilter();
	}

	@Then("user navigated to the Payment page")
	public void user_navigated_to_the_payment_page() {
		boolean isPaymentPage = holidaysearch.isOnPaymentPage();
		Assert.assertTrue("User is not on the Payment page", isPaymentPage);
	}
}
