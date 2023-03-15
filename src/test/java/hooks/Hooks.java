package hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class Hooks {

	public static WebDriver webdriver;
	private static CrossBrowser crossbrowser;
	static Scenario scenario;
	
	@BeforeAll
	public static void launchBrowser()throws Throwable{
		
		//Get Browser type from ConfigReader  
		LoggerLoad.info("Loading config file");
		ConfigReader.readConfig();
		String browser = ConfigReader.getBrowserType();
		
		//Initialize driver from CrossBrowser
		crossbrowser = new CrossBrowser();
		webdriver = crossbrowser.setupDriver(browser);
		LoggerLoad.info("Initializing "+browser+" driver");
		
			
		
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
		
			if(scenario.isFailed()) {
				LoggerLoad.error("Steps failed. Taking a screenshot");
				final byte[] screenshot = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "My screenshot");
				Allure.addAttachment("Myscreenshot",new ByteArrayInputStream(((TakesScreenshot)webdriver).getScreenshotAs(OutputType.BYTES)));
			}
		
	}
	
	
	
	
	
	
	
	//@AfterAll
	//public static void afterAll() throws Throwable{
	//	LoggerLoad.info("Closing driver");
	//	CrossBrowser.closeDriver();
		
		
	//}
	
	
	
}
