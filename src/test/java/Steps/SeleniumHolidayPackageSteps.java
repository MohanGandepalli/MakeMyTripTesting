package Steps;

import org.testng.annotations.Test;

import com.pages.SeleniumHolidayPackage;

public class SeleniumHolidayPackageSteps {
	SeleniumHolidayPackage obj = new SeleniumHolidayPackage();
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
		obj.navigateholiday();
	}
	@Test(priority=3)
	public void pop1()
	{
		obj.popup1();
	}
	@Test(priority=4)
	public void city()
	{
		obj.city();
	}
	@Test(priority=5)
	public void date()
	{
		obj.startdate();
	}
	@Test(priority=6)
	public void noof()
	{
		obj.nooftourists();
	}
	@Test(priority=7)
	public void sear()
	{
		obj.search();
	}
	@Test(priority=8)
	public void pop2()
	{
		obj.popup2();
	}
	@Test(priority=9)
	public void sele()
	{
		obj.select();
	}
	@Test(priority=10)
	public void winhan() throws InterruptedException
	{
		obj.windowhandling();
	}
	@Test(priority=11)
	public void pop3()
	{
		obj.popup3();
	}
	@Test(priority=12)
	public void pay()
	{
		obj.pay();
	}
	@Test(priority=13)
	public void add()
	{
		obj.addtrav();
	}
	@Test(priority=14)
	public void trav1()
	{
		//obj.firstname();
		//obj.lastname();
		//obj.dob();
	}

}
