package Steps;

import org.testng.annotations.Test;

import com.pages.SeleniumOneWayFlight;

public class SeleniumOneWayFlightSteps {
	SeleniumOneWayFlight obj=new SeleniumOneWayFlight();
	
	@Test(priority=0)
	public void loadBrowser()
	{
		obj.browser();
	}
	@Test(priority=1)
	public void pop()
	{
		obj.closepop();
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
	public void searchh()
	{
		obj.search();
	}

}
