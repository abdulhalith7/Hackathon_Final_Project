package stepDefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.CucumberBaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	WebDriver driver;
	Properties property;
	
	@Before
	public void setup() throws MalformedURLException, IOException 
	{
		driver=CucumberBaseClass.initializeBrowser();
		
		property=CucumberBaseClass.getProperties();
		driver.get(property.getProperty("appUrl"));
		CucumberBaseClass.getLogger().info("***** Url has been Successfully Opened *****");
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() 
	{
		driver.quit();
		CucumberBaseClass.getLogger().info("***** Url has been Successfully Closed *****");
	}
	
	@AfterStep
    public void addScreenshot(Scenario scenario) {
        
    	//For Taking ScreenShot in Reports:
        if(scenario.isFailed()) {
        	
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        	            
        }
        else {
        	TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	scenario.attach(screenshot, "image/png",scenario.getName());
        }
	}
	

}
