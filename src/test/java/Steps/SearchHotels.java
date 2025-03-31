package Steps;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchHotels {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		//open webpage
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//close login popup
		WebElement pop=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
		pop.click();
		//navigate to hotels
		WebElement changetab=driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']"));
		changetab.click();
		//hotel page
		WebElement input=driver.findElement(By.xpath("//input[@id='city'][@data-cy='city']"));
		input.click();
		//enter destination city
		actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//startdate
		WebElement startdate=driver.findElement(By.xpath("//div[@aria-label='Wed Sep 18 2024'][@aria-selected='false'][@aria-disabled='false']"));
		startdate.click();
		//end date
		WebElement enddate=driver.findElement(By.xpath("//div[@aria-label='Wed Sep 25 2024'][@aria-selected='false'][@aria-disabled='false']"));
		enddate.click();
		//select
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Apply']"));
		button.click();
		//submit
		WebElement submit=driver.findElement(By.xpath("//button[@class='primaryBtn font24 latoBold widgetSearchBtn']"));
		submit.click();
		//windowhandling
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
				//booking
				WebElement book=driver.findElement(By.xpath("//button[@class='appBtn filled large bkngOption__cta  ']"));
				book.click();
				Thread.sleep(2000);
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				//send first name
				WebElement fname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
				fname.sendKeys("Mohan");
				//send last name
				WebElement lname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
				lname.sendKeys("Krishna");
				//send email id
				WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
				email.sendKeys("sample@mail.com");
				//send mobile number
				WebElement Number=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
				Number.sendKeys("1234567899");
				//click on pay now
				WebElement paynow=driver.findElement(By.xpath("//a[normalize-space()='Pay Now']"));
				paynow.click();
			}
				
				

		}
		
		
		
	}

}
