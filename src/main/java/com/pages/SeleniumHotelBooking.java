package com.pages;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

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

public class SeleniumHotelBooking {
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions actions;

	public SeleniumHotelBooking() {
		// Default constructor
	}

	public void browser() {
		ChromeOptions cp = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(cp);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		// Initialize WebDriverWait and Actions after driver setup
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		actions = new Actions(driver);
	}

	public void closepop() {
		// close login popup
		WebElement pop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
		pop.click();
	}

	public void navigatehotels() {
		// navigate to hotels
		WebElement changetab = driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']"));
		changetab.click();
	}

	public void choosecity() {
		// hotel page
		WebElement input = driver.findElement(By.xpath("//input[@id='city'][@data-cy='city']"));
		input.click();
		// enter destination city
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	public void startdate() {
		// startdate
		WebElement startdate = driver.findElement(
				By.xpath("//div[@aria-label='Wed Sep 18 2024'][@aria-selected='false'][@aria-disabled='false']"));
		startdate.click();
	}

	public void enddate() {
		// end date
		WebElement enddate = driver.findElement(
				By.xpath("//div[@aria-label='Wed Sep 25 2024'][@aria-selected='false'][@aria-disabled='false']"));
		enddate.click();
	}

	public void select() {
		// select
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		button.click();
	}

	public void submit() {
		// submit
		WebElement submit = driver
				.findElement(By.xpath("//button[@class='primaryBtn font24 latoBold widgetSearchBtn']"));
		submit.click();
	}

	public void selecthotel() throws InterruptedException {
		// windowhandling
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		// clicking first hotel
		WebElement click = driver
				.findElement(By.xpath("(//div[contains(@class,'makeFlex flexOne padding16 relative lftCol')])[1]"));
		click.click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		Iterator<String> iterator = windowhandles.iterator();
		while (iterator.hasNext()) {
			String childwindow = iterator.next();
			if (!parentwindow.equalsIgnoreCase(childwindow)) {
				Thread.sleep(2000);
				// switching to sub window
				driver.switchTo().window(childwindow);
				String text = driver.findElement(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']")).getText();
				System.out.println(text);
				Thread.sleep(2000);
			}
		}
	}

	public void booking() {
		// booking
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']")));
		WebElement book = driver.findElement(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']"));
		book.click();
	}

	public void fname() {

		// send first name
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='fName'])[1]")));
		WebElement fname = driver.findElement(By.xpath("(//input[@id='fName'])[1]"));
		fname.sendKeys("Mohan");
	}

	public void lname() {
		// send last name
		WebElement lname = driver.findElement(By.xpath("(//input[@id='lName'])[1]"));
		lname.sendKeys("Krishna");
	}

	public void email() {
		// send email id
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		email.sendKeys("sample@mail.com");
	}

	public void num() {
		// send mobile number
		WebElement Number = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		Number.sendKeys("1234567899");
	}

	public void paynow() {
		// click on pay now
		WebElement paynow = driver.findElement(By.xpath("//a[normalize-space()='Pay Now']"));
		paynow.click();
	}
}
