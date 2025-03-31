package Steps;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchHolidayPackage {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//open webpage
		driver.get("https://www.makemytrip.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//close login popup
		WebElement pop=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("commonModal__close")));
		pop.click();
		//navigate to package
		WebElement changetab=driver.findElement(By.xpath("//li[@data-cy='menu_Holidays']"));
		changetab.click();
		try{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[@class='primaryBtnWhite border-btn font16 latoBold'])[1]")));
		//navigate to alert and select nearest city
		WebElement closecity=driver.findElement(By.xpath("(//div[contains(@class,'cityBadgeWrapper')])[1]"));
		closecity.click();
		//select yes update my city
		WebElement update=driver.findElement(By.xpath("(//p[@class='primaryBtn fill appendRight16 font16'])[1]"));
		update.click();
		}catch(NotFoundException e){
			System.out.println("No popup");
		}
		//to select city
		WebElement to=driver.findElement(By.xpath("(//label[@for='toCity'])[1]"));
		to.click();
		//to enter city
		WebElement too=driver.findElement(By.xpath("(//input[@placeholder='To'])[1]"));
		too.sendKeys("Dubai");
		//to select the entered city
		WebElement tooo=driver.findElement(By.xpath("(//div[@class='dest-city-container'])[1]"));
		tooo.click();
		//to select startdate
		WebElement startdate=driver.findElement(By.xpath("(//div[@aria-label='Tue Sep 17 2024'])[1]"));
		startdate.click();
		try {
		WebElement adult=driver.findElement(By.xpath("(//button[@class='addButton'])[1]"));
		adult.click();
		WebElement add1=driver.findElement(By.xpath("(//div[@class='pointer plus-sign-wrapper'])[1]"));
		add1.click();
		}catch(NotFoundException e) {
			System.out.println("Not required");
		}
		WebElement apply=driver.findElement(By.xpath("(//button[normalize-space()='APPLY'])[1]"));
		apply.click();
		WebElement apply1=driver.findElement(By.xpath("(//button[normalize-space()='APPLY'])[1]"));
		apply1.click();
		WebElement Search=driver.findElement(By.xpath("(//button[normalize-space()='Search'])[1]"));
		Search.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='close closeIcon'])[1]")));
		WebElement closse=driver.findElement(By.xpath("(//span[@class='close closeIcon'])[1]"));
		closse.click();
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(40));
		try {
			wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[1]")));
			WebElement clossse=driver.findElement(By.xpath("(//*[name()='path'][@fill-rule='evenodd'])[1]"));
			clossse.click();
		}catch(NoSuchElementException e)
		{
			System.out.println("Not Required");
		}
		try {
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[@title='Goa Delights - Free Catamaran Cruise'][normalize-space()='Goa Delights - Free Catamaran Cruise'])[1]")));
			WebElement choose=driver.findElement(By.xpath("(//p[@title='Goa Delights - Free Catamaran Cruise'][normalize-space()='Goa Delights - Free Catamaran Cruise'])[1]"));
			choose.click();
		}catch(NoSuchElementException e)
		{
			System.out.println("Not Required");
		}


		//windowhandling
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		//clicking first hotel package
		//WebElement withflight=driver.findElement(By.xpath("(//div[contains(@class,'pointer')])[1]"));
		//withflight.click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
				Iterator<String> iterator = windowhandles.iterator();
				while (iterator.hasNext()) {
					String childwindow = iterator.next();
					if (!parentwindow.equalsIgnoreCase(childwindow)) {
						Thread.sleep(2000);
						//switching to sub window
						driver.switchTo().window(childwindow);
						//booking
						try{WebElement skip=driver.findElement(By.xpath("(//button[normalize-space()='SKIP'])[1]"));
						skip.click();}catch(NotFoundException e){
							System.out.println("Excepted");
						}
						driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='close closeIcon'])[1]")));
						WebElement cllose=driver.findElement(By.xpath("(//span[@class='close closeIcon'])[1]"));
						cllose.click();
						WebElement pay=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]/div[1]/span[1]"));
						pay.click();
						wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[@class='latoBold font20 linkText pointer appendTop3 underline'])[1]")));
						WebElement trav1=driver.findElement(By.xpath("(//p[@class='latoBold font20 linkText pointer appendTop3 underline'])[1]"));
						trav1.click();
						WebElement fname1=driver.findElement(By.xpath("(//input[@placeholder='Enter a First Name'])[1]"));
						fname1.sendKeys("Mohan");
						WebElement lname1=driver.findElement(By.xpath("(//input[@placeholder='Enter a Last Name'])[1]"));
						lname1.sendKeys("Krishna");
						driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).sendKeys("23");
						Actions actions=new Actions(driver);
						actions.sendKeys(Keys.ENTER);
						driver.findElement(By.xpath("(//div[contains(text(),'MM')])[1]")).sendKeys("Oct");
						actions.sendKeys(Keys.ENTER);
						driver.findElement(By.xpath("(//div[contains(@class,'css-1wa3eu0-placeholder')])[1]")).sendKeys("2000");
						actions.sendKeys(Keys.ENTER);
						driver.findElement(By.xpath("(//div[@class='react-select-formV2__value-container react-select-formV2__value-container--has-value css-1hwfws3'])[3]")).click();
						actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
					}
				}
}
}


