package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class BDDTwoWayFlight {
	
	private WebDriver driver;
	
	//creating constructor
	public BDDTwoWayFlight(WebDriver driver)
	{
		this.driver=driver;
	}
	//locators
	private By cross=By.xpath("//span[@class='commonModal__close']");
	private By twob=By.xpath("//li[@data-cy='roundTrip']");
	private By from=By.xpath("//input[@placeholder='From']");
	private By to=By.xpath("//input[@placeholder='To']");
	private By fromdate=By.xpath("//div[@aria-label='Wed Sep 18 2024']");
	private By todate=By.xpath("//div[@aria-label='Wed Sep 25 2024']");
	private By search=By.xpath("(//a[normalize-space()='Search'])[1]");
	
	//page actions
	
	public void crosspop() throws InterruptedException
	{
		driver.findElement(cross).click();
		Thread.sleep(2000);
	}
	public void twoway()
	{
		driver.findElement(twob).click();
	}
	public void fromdest(String fr) throws InterruptedException
	{
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(from).sendKeys(fr);
		Actions actions=new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	}
	public void todest(String t) throws InterruptedException {
		driver.findElement(By.id("toCity")).click();
		driver.findElement(to).sendKeys(t);
		Actions actions=new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	}
	public void dateset(String d) throws InterruptedException
	{
		//driver.findElement(date).sendKeys(d);
		driver.findElement(fromdate).click();
		Thread.sleep(2000);
	}
	public void todate(String d) throws InterruptedException
	{
		driver.findElement(todate).click();
		Thread.sleep(2000);
	}
	public void searchflight() throws InterruptedException
	{
		driver.findElement(search).click();
		Thread.sleep(2000);
	}

}
