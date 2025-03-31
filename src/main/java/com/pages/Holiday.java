package com.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Holiday {
	private WebDriver driver;
	private WebDriverWait wait;
	private By close = By.xpath("//span[@class='commonModal__close']");
    private By Holidaysbox=By.xpath("//li[@data-cy='menu_Holidays']");
    private By FrmBtn=By.xpath("//span[normalize-space()='From City']");
    private By Frmtxt=By.xpath("//input[@placeholder='Enter City']");
    private By Frmfirst=By.xpath("//span[@class='appendLeft8 blackText']");
    private By To=By.xpath("//span[contains(text(),'To City/Country/Category')]");
    private By Totxt=By.xpath("//input[@placeholder='To']");
    private By tofirst=By.xpath("//div[normalize-space()='Goa']");
    private By selectDepdate=By.xpath("//div[@aria-label='Fri Sep 20 2024']//p[@class='dateInnerPara'][normalize-space()='20']");
    private By apply=By.xpath("//button[normalize-space()='APPLY']");
    private By flights=By.xpath("//label[contains(text(),'With Flights')]");
    private By amount=By.xpath("//p[contains(text(),'< ₹20,000')]");
    private By category=By.xpath("//li[contains(@class,'disable')]");
    private By applyfilter=By.xpath("//button[normalize-space()='APPLY']");
    private By packagesearch=By.xpath("//button[@id='search_button']");
    private By packageclick=By.xpath("//p[contains(@title,'Goa from Hyderabad - By Bus')]");
	private By Proceed=By.xpath("//span[@class='']");
	private By paymentelement=By.xpath("//div[contains(@class,'reviewBody')]//span[@class='reviewHead'][normalize-space()='Review package']");
    private By closeass=By.xpath("//span[@class='close closeIcon']");
    
    
    
	public Holiday(WebDriver driver) {
			this.driver=driver;
			this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void clickOnclose() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(close).click();
	}
	public void clickOnHolidays() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(Holidaysbox).click();
	}
	public void clickOnFrombtn() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(FrmBtn).click();
	}
	public void enterFrmcity(String frmcty) throws InterruptedException {
		WebElement fromCityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Frmtxt));
		fromCityElement.clear();
		fromCityElement.sendKeys(frmcty);
	}
	public void clickOnfrst() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(Frmfirst).click();
	}
	public void enterTocity(String tocty) throws InterruptedException {
		WebElement toCityElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Totxt));
		toCityElement.clear();
		toCityElement.sendKeys(tocty);
	}
	
	public void clickOnTobtn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(To).click();
	}
	
	public void clickOnfrsttocity() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(tofirst).click();
	}
	
	public void clickOndate() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(selectDepdate).click();
	}
	public void clickOnApply() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(apply).click();
	}
	public void clickOnsearch() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(packagesearch).click();
	}
	
	
	public void clickOnpackage() throws InterruptedException {
		Thread.sleep(10000);
		WebElement packageElement = driver.findElement(packageclick);
		Actions actions = new Actions(driver); 
		actions.doubleClick(packageElement).perform();  
	}
	public void clickOnCloseass() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(closeass).click();
	}
	public void clickOnProceed() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(Proceed).click();
	}
	public void clickonflights() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(flights).click();
	}
	public void clickonAmount() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(amount).click();
	}
	public void clickoncategory() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(category).click();
	}
	public void clickonApplyfilter() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(applyfilter).click();
	}
	public boolean isOnPaymentPage() {
		
		WebElement paymentPageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(paymentelement)); 
	   return paymentPageElement.isDisplayed(); 
	   }
	public void switchToNewWindow() { 
		String parentWindow = driver.getWindowHandle(); 
		for (String windowHandle : driver.getWindowHandles()) { 
			if (!windowHandle.equals(parentWindow)) { 
				driver.switchTo().window(windowHandle);
				break;
				}
			}
		} 
	public void switchToParentWindow() {
		String parentWindow = driver.getWindowHandle(); 
		driver.switchTo().window(parentWindow);
		}

}
