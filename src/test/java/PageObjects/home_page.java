package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;


public class home_page {
	
		public WebDriver driver = CrossBrowser.getDriver();
		String url = ConfigReader.getApplicationUrl();
		String homeUrl = ConfigReader.getHomePageUrl();
		
		
		//Application page 
		By startBtn = By.xpath("//button[text()='Get Started']");
		
		//Home page
		By signin = By.linkText("Sign in");
		By username = By.id("id_username");
		By password = By.id("id_password");
		By loginbtn = By.xpath("//input[@value='Login']");
		By Register = By.linkText("Register!");
		By errormsg = By.xpath("//div[contains(text(),'You are not logged in')]");
		
		// Dropdown
		By datastructuredropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
		By arraysdropdown = By.xpath("//a[text()='Arrays']");
		By linkedlistdropdown = By.xpath("//a[text()='Linked List']");
		By stackdropdown = By.xpath("//a[text()='Stack']");
		By Queuedropdown = By.xpath("//a[text()='Queue']");
		By Treedropdown = By.xpath("//a[text()='Tree']");
		By Graphdropdown = By.xpath("//a[text()='Graph']");
		
		
		//Links
		By Introduction = By.linkText("data-structures-introduction");
		By array = By.xpath("//a[@href='array']");
		By linkedlist = By.linkText("linked-list");
		By Stack = By.xpath("//a[@href='stack']");
		By Queue = By.xpath("//a[@href='queue']");
		By tree = By.xpath("//a[@href='tree']");
		By graph = By.xpath("//a[@href='graph']");
		
		public home_page() {
			
			//this.driver = driver;
			
		}
		
		//Dsalgo portal
		public void dsalgoportal() {
			driver.get(url);
			
		}
		
		public void getStarted() {
			
			driver.findElement(startBtn).click();
		}
		public String getTitle() {
			String title=driver.getTitle();
			return title;
		}
		
		public void homepageurl() {
			driver.get(homeUrl);
		}
		
		public void clickDropdown() {
			
			driver.findElement(datastructuredropdown).click();
		}
		public void selectfromDropdown() {
			driver.findElement(stackdropdown).click();
			
		}
		public String errorMsg() {
			driver.findElement(errormsg).isDisplayed();
			String error= driver.findElement(errormsg).getText();
			return error;
		}
		
		public void dsGetStarted() {
			driver.findElement(Queue).click();
	
			
		}
		
		public void signinClick()throws Throwable {
			driver.findElement(signin).click();
			Thread.sleep(2000); //temp code
			driver.findElement(username).sendKeys("Numpy@sdet101"); //temp code
			driver.findElement(password).sendKeys("testpassword"); //temp code
			driver.findElement(loginbtn).click(); //temp code
		}
		public String signinPage() {
			String title = driver.getTitle();
			return title;
			
		}
		
		public void registerClick() {
			driver.findElement(Register).click();
		}
		public String registerPage() {
			String title = driver.getTitle();
			return title;
		}
		
		
	

}
