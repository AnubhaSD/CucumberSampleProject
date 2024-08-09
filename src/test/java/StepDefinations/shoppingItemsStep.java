package StepDefinations;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import cucumber.api.java.After;
import io.cucumber.java.en.*;
import pageObject.ShoppingItemPOM;
import reusableOperations.propertyOperations;

public class shoppingItemsStep {

	private WebDriver driver;
	ShoppingItemPOM shopItems;
	
	public shoppingItemsStep(commonHooks hooks)
	{
		this.driver=hooks.getDriver();
		shopItems = new ShoppingItemPOM(driver);
	}
	

	@Given("User is on login page")
	public void user_is_on_loginPage() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		

		
		String url = propertyOperations.getPropertyValueByKey("url");
		driver.get(url);

	}

	@When("user provide {string} and {string}")
	public void user_provide_username_and_password(String username, String password) {
//		shopItems = new ShoppingItemPOM(driver);
		shopItems.login_application(username, password);
	}

	@Then("click on login button")
	public void click_on_login() {
		shopItems.click_login();
	}

	
	

}
