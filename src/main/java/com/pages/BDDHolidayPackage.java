
package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BDDHolidayPackage {

	private WebDriver driver;

	// creating constructor
	public BDDHolidayPackage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	// locators
	private By cross = By.xpath("//span[@class='commonModal__close']");
	private By changetab = By.xpath("//li[@data-cy='menu_Holidays']");
	private By startdate = By.xpath("(//div[@aria-label='Tue Sep 17 2024'])[1]");
	private By search = By.xpath("(//button[normalize-space()='Search'])[1]");
	// page actions
	public void waits()
	{

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}

	public void crosspop() throws InterruptedException {
		driver.findElement(cross).click();
		Thread.sleep(2000);
	}

	public void holidaynavigate() throws InterruptedException {
		driver.findElement(changetab).click();
		Thread.sleep(5000);
	}

	public void pops() throws InterruptedException {
Thread.sleep(2000);
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().dismiss();
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='primaryBtnWhite border-btn font16 latoBold'])[1]")));
			// navigate to alert and select nearest city
			WebElement close = driver.findElement(By.xpath("(//div[contains(@class,'cityBadgeWrapper')])[1]"));
			close.click();
			// select yes update my city
			WebElement update = driver.findElement(By.xpath("(//p[@class='primaryBtn fill appendRight16 font16'])[1]"));
			update.click();	
		}catch(Exception e)
		{
			System.out.println("Not found");
		}
		
	}
	public void tocity(String s) {
		// to select city
		WebElement to = driver.findElement(By.cssSelector("label[for='toCity']"));
		to.click();
		// to enter city
		WebElement too = driver.findElement(By.xpath("(//input[@placeholder='To'])[1]"));
		too.sendKeys(s);
		// to select the entered city
		WebElement tooo = driver.findElement(By.xpath("(//div[@class='dest-city-container'])[1]"));
		tooo.click();
	}

	public void startdate() {

		// to select startdate
		driver.findElement(startdate).click();
	}

	public void guests() {
		try {
			WebElement adult = driver.findElement(By.xpath("(//button[@class='addButton'])[1]"));
			adult.click();
			WebElement add1 = driver.findElement(By.xpath("(//div[@class='pointer plus-sign-wrapper'])[1]"));
			add1.click();
		} catch (NotFoundException e) {
			System.out.println("Not required");
		}
		WebElement apply = driver.findElement(By.xpath("(//button[normalize-space()='APPLY'])[1]"));
		apply.click();
		WebElement apply1 = driver.findElement(By.xpath("(//button[normalize-space()='APPLY'])[1]"));
		apply1.click();
	}

	public void search() {
		driver.findElement(search).click();
	}

	public void popup1() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='close closeIcon'])[1]")));
		WebElement closse = driver.findElement(By.xpath("(//span[@class='close closeIcon'])[1]"));
		closse.click();
	}

	public void popup2() {
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
		wait2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[1]")));
		WebElement clossse = driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[1]"));
		clossse.click();
	}

}
