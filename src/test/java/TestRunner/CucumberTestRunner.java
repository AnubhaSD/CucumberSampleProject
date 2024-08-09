package TestRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

///////////////////////// Generating html reports

//@CucumberOptions(tags= "@test2",features= "src/test/resources/Features/",glue= {"StepDefinations"}, 
//plugin= {"pretty","html: target/htmlreport.html","json:target/cucumber-reports/CucumberTestReport.json" },
//monochrome = false, dryRun = false)


//////////////////// Generating masterthought repprt
//
//
//@CucumberOptions(tags= "@test2",features= "src/test/resources/Features/",glue= {"StepDefinations"}, 
//plugin= {"pretty","json:target/json-report/cucumber.json" },
//monochrome = false, dryRun = true)

public class CucumberTestRunner extends AbstractTestNGCucumberTests
{
	
	

}