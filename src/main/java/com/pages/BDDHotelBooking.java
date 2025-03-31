package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BDDHotelBooking {
	private WebDriver driver;

	// creating constructor
	public BDDHotelBooking(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	private By cross = By.xpath("//span[@class='commonModal__close']");
	private By changetab=By.xpath("//li[@data-cy='menu_Hotels']");
	private By destination=By.xpath("//label[@for='city']");
	private By startdate=By.xpath("//div[@aria-label='Wed Sep 18 2024']");
	private By enddate=By.xpath("//div[@aria-label='Wed Sep 25 2024']");
	private By Apply=By.xpath("//button[normalize-space()='Apply']");
	private By Search=By.xpath("//button[@class='primaryBtn font24 latoBold widgetSearchBtn']");
	// page actions

	public void crosspop() throws InterruptedException {
		driver.findElement(cross).click();
		Thread.sleep(2000);
	}
	public void hotelnavigate()
	{
		driver.findElement(changetab).click();
	}
	public void destiny(String dt) throws InterruptedException
	{
		driver.findElement(destination).click();
		Actions actions=new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	}
	public void startdate(String st)
	{
		driver.findElement(startdate).click();
	}
	public void enddate(String st)
	{
		driver.findElement(enddate).click();
	}
	public void apply()
	{
		driver.findElement(Apply).click();
	}
	public void search()
	{
		driver.findElement(Search).click();
	}
	public void windowhandling() throws InterruptedException
	{
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		//clicking first hotel
		WebElement click =driver.findElement(By.xpath("(//div[contains(@class,'makeFlex flexOne padding16 relative lftCol')])[1]"));
		click.click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> iterator = windowhandles.iterator();
		while (iterator.hasNext()) {
			String childwindow = iterator.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				Thread.sleep(2000);
				//switching to sub window
				driver.switchTo().window(childwindow);
				String text = driver.findElement(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']")).getText();
				System.out.println(text);
				Thread.sleep(2000);
			}
			}
	}
	public void booknow() throws InterruptedException
	{
		//booking
		WebElement book=driver.findElement(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']"));
		book.click();
		Thread.sleep(2000);
	}
	public void sendfirstname(String fn)
	{
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//send first name
		WebElement fname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fname.sendKeys(fn);
	}
	public void sendlastname(String ln)
	{
		//send last name
		WebElement lname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lname.sendKeys(ln);
	}
	public void sendemail(String em)
	{
		//send email id
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		email.sendKeys(em);
	}
	public void sendnum(String sn)
	{
		//send mobile number
		WebElement Number=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		Number.sendKeys(sn);
	}
	public void click()
	{

		//click on pay now
		WebElement paynow=driver.findElement(By.xpath("//a[normalize-space()='Pay Now']"));
		paynow.click();
	}
}





