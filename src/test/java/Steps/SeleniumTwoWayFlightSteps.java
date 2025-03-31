package Steps;

import org.testng.annotations.Test;

import com.pages.SeleniumTwoWayFlight;

public class SeleniumTwoWayFlightSteps {
	SeleniumTwoWayFlight obj=new SeleniumTwoWayFlight();

	@Test(priority=0)
	public void loadBrowser()
	{
		obj.browser();
	}
	@Test(priority=1)
	public void pop()
	{
		obj.closepop();
		obj.round();
	}
	@Test(priority=2)
	public void fromm()
	{
		obj.from();
	}
	@Test(priority=3)
	public void too()
	{
		obj.to();
	}
	@Test(priority=4)
	public void start()
	{
		obj.startdate();
	}
	@Test(priority=5)
	public void end()
	{
		obj.enddate();
	}
	@Test(priority=6)
	public void searchh()
	{
		obj.search();
	}

}
