package Steps;

import org.testng.annotations.Test;

import com.pages.SeleniumHotelBooking;

public class SeleniumHotelBookingSteps {
	SeleniumHotelBooking obj = new SeleniumHotelBooking();

	@Test(priority = 0)
	public void browseropen() {
		obj.browser();
	}

	@Test(priority = 1)
	public void popup() {
		obj.closepop();
	}

	@Test(priority = 2)
	public void navigation() {
		obj.navigatehotels();
	}

	@Test(priority = 3)
	public void city() {
		obj.choosecity();
	}

	@Test(priority = 4)
	public void start() {
		obj.startdate();
	}

	@Test(priority = 5)
	public void end() {
		obj.enddate();
	}

	@Test(priority = 6)
	public void sel() {
		obj.select();
	}

	@Test(priority = 7)
	public void sub() {
		obj.submit();
	}

	@Test(priority = 8)
	public void selhotel() throws InterruptedException {
		obj.selecthotel();
	}

	@Test(priority = 9)
	public void book() {
		obj.booking();
	}

	@Test(priority = 10)
	public void firstname() {
		obj.fname();
	}

	@Test(priority = 11)
	public void lastname() {
		obj.lname();
	}

	@Test(priority = 12)
	public void emailid() {
		obj.email();
	}

	@Test(priority = 13)
	public void number() {
		obj.num();
	}

	@Test(priority = 14)
	public void pay() {
		obj.paynow();
	}
}
