package hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class Hooks {

	public static WebDriver webdriver;
	private static CrossBrowser crossbrowser;
	
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
	
	
	
	//@AfterAll
	//public static void afterAll() throws Throwable{
	//	LoggerLoad.info("Closing driver");
	//	CrossBrowser.closeDriver();
		
		
	//}
	
	
	
}
