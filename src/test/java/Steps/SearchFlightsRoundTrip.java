package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlightsRoundTrip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open webpage
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//close login popup
		WebElement pop=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
		pop.click();
		//select both sides
		WebElement Select=driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
		Select.click();
		//select from location
		WebElement fromcity=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fromCity")));
		fromcity.click();
		WebElement fromsend = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromsend.sendKeys("Visakhapatnam");
		Actions actions=new Actions(driver);
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//select to location
		WebElement tocity=driver.findElement(By.id("toCity"));
		tocity.click();
		WebElement tosend = driver.findElement(By.xpath("//input[@placeholder='To']"));
		tosend.sendKeys("Delhi");
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//start date
		WebElement startdate=driver.findElement(By.xpath("//div[@aria-label='Wed Sep 18 2024'][@aria-selected='false'][@aria-disabled='false']"));
		startdate.click();
		//end date
		WebElement enddate=driver.findElement(By.xpath("//div[@aria-label='Wed Sep 25 2024'][@aria-selected='false'][@aria-disabled='false']"));
		enddate.click();
		//select
		WebElement search=driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
		search.click();

	}

}
