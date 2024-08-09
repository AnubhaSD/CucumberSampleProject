package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObject.ShoppingItemPOM;
import pageObject.checkOutCartPOM;

public class checkOutCartStep 
{
	
	private WebDriver driver;
	checkOutCartPOM checkOut;
	public checkOutCartStep(commonHooks hooks)
	{
		this.driver= hooks.getDriver();
		checkOut= new checkOutCartPOM(driver);
		
	}
	
	@When("user provide username and password")
	public void user_provide_username_and_password(DataTable dataTable) 
	{
		checkOut.login_application(dataTable.cell(1, 0), dataTable.cell(1, 1));
		
	}
//	@Then("click on login button")
//	public void click_on_shopItems_button() {
//		checkOut.click_login();
//	}
//	
	@Given("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

		checkOut.verifyHomePage();

	}

	
	@When("user clicks on the filter high to low")
	public void user_clicks_on_the_filter_high_to_low() {
		checkOut.selectHighToLow();
	}

	@And("adds first two items")
	public void adds_first_two_items() {
		checkOut.addItem1();
		checkOut.displayValueItem1();

		checkOut.addItem2();
		checkOut.displayValueItem2();
	}

	@And("clicks on the cart")
	public void clicks_on_the_cart() {
		checkOut.clickCartBtn();
	}

	@And("user is navigated to the cart")
	public void user_is_navigated_to_the_cart() {
		checkOut.verifyCartTitle();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	
	
	
	
	
	


	@And("user clicks on checkout button")
	public void user_clicks_on_checkout_button() 
	{
	   checkOut.clickCheckOut();
	}

	@And("provide the user information")
	public void provide_the_user_information(DataTable dataTable) {
	   checkOut.send_details_checkout(dataTable.cell(1, 0), dataTable.cell(1, 1), dataTable.cell(1, 2));
	}

	@And("press continue button")
	public void press_continue_button() {
	   checkOut.click_continue();
	}

	@And("user is navigated to next page")
	public void user_is_navigated_to_next_page() 
	{
	    checkOut.checkoutDeatils();
	}
	@Then("user clicks on finish")
	public void click_on_finish()
	{
		checkOut.click_finish();
	}




}
