package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class checkOutCartPOM 
{
	WebDriver driver;
	public checkOutCartPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	By usrname= By.id("user-name");
	By pwd= By.id("password");
	By btn_login= By.id("login-button");
	By logo_home=By.xpath("//div[@class='app_logo' and text()='Swag Labs");
	
	
	By btn_filter= By.xpath("//select[@class='product_sort_container']");
	By price_item1= By.xpath("//div[@class='inventory_item'][1]/div[2]/div[@class='pricebar']/div");
	By btn_addItem1= By.xpath("//div[@class='inventory_item'][1]/div[2]/div[@class='pricebar']/div/following-sibling::button");
	By price_item2= By.xpath("//div[@class='inventory_item'][2]/div[2]/div[@class='pricebar']/div");
	By btn_addItem2= By.xpath("//div[@class='inventory_item'][2]/div[2]/div[@class='pricebar']/div/following-sibling::button");
	By btn_cart= By.xpath("//span[@class='shopping_cart_badge']");
	By btnCheckOut= By.id("checkout");
	By titleCart= By.xpath("//span[@class='title']");
	By checkoutFname= By.xpath("//input[@placeholder='First Name']");
	By checkoutLname= By.id("last-name");
	By checkoutzip= By.id("postal-code");
	By btncontinueCheckout= By.id("continue");
	By btn_Continue= By.name("continue");
	By textTotalAmt= By.xpath("//div[@class='summary_total_label']");
	By btnFinish= By.id("finish");
	
	
	
	
	public void login_application(String username, String password)
	{
		driver.findElement(usrname).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(pwd).sendKeys(password);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	public void click_login()
	{
		driver.findElement(btn_login).click();
	}
	public boolean verifyHomePage()
	{
		 return driver.findElement(By.xpath("//div[@class='app_logo' and text()='Swag Labs']")).isDisplayed();
	}
	
	
	
	public void selectHighToLow()
	{
		driver.findElement(btn_filter).click();
		Select select= new Select(driver.findElement(btn_filter));
		select.selectByVisibleText("Price (high to low)");
	}
	public String displayValueItem1()
	{
		String priceItem1;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		priceItem1= driver.findElement(price_item1).getText();
		return priceItem1;
		
	}
	public void addItem1()
	{
		driver.findElement(btn_addItem1).click();
	}
	public String displayValueItem2()
	{
		String priceItem2;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		priceItem2= driver.findElement(price_item2).getText();
		return priceItem2;
		
	}
	public void addItem2()
	{
		driver.findElement(btn_addItem2).click();
	}
	public void clickCartBtn()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(btn_cart).click();
	}
	
	public boolean verifyCartTitle()
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver.findElement(titleCart).isDisplayed();
	}
	

	
	public void clickCheckOut()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(btnCheckOut).click();
	}
	
	
	public void send_details_checkout(String fname, String lname, String zipcode)
	{
		driver.findElement(checkoutFname).sendKeys(fname);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(checkoutLname).sendKeys(lname);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(checkoutzip).sendKeys(zipcode);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	public void click_continue()
	{
		driver.findElement(btn_Continue).click();
	}
	
	public boolean checkoutDeatils()
	{
		
		String amount=driver.findElement(textTotalAmt).getText();
		System.out.println("Total Amount is: "+amount);
		return driver.findElement(textTotalAmt).isDisplayed();
	}
	
	public void click_finish()
	{
		driver.findElement(btnFinish).click();
	}
}
