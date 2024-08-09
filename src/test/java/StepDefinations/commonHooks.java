package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.*;


public class commonHooks
{
	 WebDriver driver;
	
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.close();
	}

	public WebDriver getDriver()
	{
		return driver;
	}
}
