package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTwoWayFlight {
	
	 private WebDriver driver;
	    private WebDriverWait wait;
	    private Actions actions;

	    public SeleniumTwoWayFlight() {
	        // Default constructor
	    }

	    public void browser() {
	        ChromeOptions cp = new ChromeOptions();
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(cp);
	        driver.manage().window().maximize();
	        driver.get("https://www.makemytrip.com/");
	       
	        
	        // Initialize WebDriverWait and Actions after driver setup
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        actions = new Actions(driver);
	    }

	    public void closepop() {
	        // close login popup
	        WebElement pop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
	        pop.click();
	    }
	    public void round()
	    {
	    	//select both sides
			WebElement Select=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
			Select.click();
	    }

	    public void from() {
	        // select from location
	        WebElement fromcity = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
	        fromcity.click();
	        WebElement fromsend = driver.findElement(By.xpath("//input[@placeholder='From']"));
	        fromsend.sendKeys("Visakhapatnam");
	        actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    }

	    public void to() {
	        // select to location
	        WebElement tocity = driver.findElement(By.id("toCity"));
	        tocity.click();
	        // enter location
	        WebElement tosend = driver.findElement(By.xpath("//input[@placeholder='To']"));
	        tosend.sendKeys("Delhi");
	        // selected entered location
	        actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	    }

	    public void startdate() {
	        // start date
	        WebElement startdate = driver.findElement(
	                By.xpath("//div[@aria-label='Wed Sep 18 2024']"));
	        startdate.click();
	    }
	    public void enddate()
	    {
	    	//end date
			WebElement enddate=driver.findElement(By.xpath("//div[@aria-label='Wed Sep 25 2024'][@aria-selected='false'][@aria-disabled='false']"));
			enddate.click();
	    }

	    public void search() {
	        // select
	        WebElement search = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
	        search.click();
	    }

}
