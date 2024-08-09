package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ShoppingItemPOM 
{
	
	WebDriver driver;
//	
	public ShoppingItemPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	By usrname= By.id("user-name");
	By pwd= By.id("password");
	By btn_login= By.id("login-button");
	
	
	
	
	
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
	
	
	
	
	
	

	


}
