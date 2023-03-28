package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class Intro_page {
		public WebDriver driver = CrossBrowser.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeUrl = ConfigReader.getHomePageUrl();
	String signIn = ConfigReader.getSignInPage();
    String validCode= "print'Hello World'";
    String dspageUrl = ConfigReader.getHomePageUrl();
    String Intro_page  = ConfigReader.getApplicationUrl();
    //String dspractice = ConfigReader.getPracticeQuestionUrl();
	String dspagetimecomplexity = ConfigReader.getApplicationUrl();
    //String dspracticeapplicationurl = ConfigReader.getApplicationUrl();
   // String practicequestionsurl=ConfigReader.getPracticeQuestionUrl();
	
		
	
	
    
    By username = By.id("id_username");
	By password = By.id("id_password");
	By loginbtn = By.xpath("//input[@value='Login']");
	By introductions = By.xpath("//a[@href= 'data-structures-introduction']");
    By complexityLink = By.xpath("//a[@href='time-complexity']");
    By tryherebtn = By.xpath("//a[@href='/tryEditor']");
    By enterCodeLine = By.xpath("//textarea[@tabindex='0']");
    By runButton = By.xpath("//button[contains(text(),'Run')]");
    By practicequestions= By.xpath("//a[text()='Practice Questions']");
    
    
	public void dsalgoportal() {
		driver.get(signIn);

	}

	public void getStarted() {

		driver.findElement(username).sendKeys("Numpy@sdet101");
		driver.findElement(password).sendKeys("testpassword");
		driver.findElement(loginbtn).click();

	}

	//public String getTitle() {
	//	String title = driver.getTitle();
		//return title;
	//}

	public void introduction() {
		driver.findElement(introductions).click();
			
		

	}
	

	public void  complexityLink() {
		driver.findElement(complexityLink).click();
		
		
	}

	public void tryherebtn() {
		driver.findElement(tryherebtn).click();
	}
		

	public void enterValidCode() {
		driver.findElement(enterCodeLine).sendKeys(validCode);
	}
		
		public void clickrunButton() throws InterruptedException {
			
			LoggerLoad.info("User clicked Run button");
			Thread.sleep(1000);
			driver.findElement(runButton).click();	
		}
		
	
		public void clearCode() {
			driver.findElement(enterCodeLine).click();
			driver.findElement(enterCodeLine).sendKeys(Keys.CONTROL,"a");
	driver.findElement(enterCodeLine).sendKeys(Keys.DELETE);
		}
		public void navigateTo(String pageName) {
			String urlName = ConfigReader.geturl(pageName);
			driver.get(urlName);
		}
		
		public void practice_Questions_link() {
			//driver.findElement(introductions).click();
			driver.findElement(practicequestions).click();
			
		}

		
		}
				
			

