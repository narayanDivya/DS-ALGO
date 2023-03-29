package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class Linked_page {

	public WebDriver driver = CrossBrowser.getDriver();
	String loginUrl = ConfigReader.getSignInPage();
	By datastructuredropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By linkdropdown = By.xpath("//a[text()='Linked List']");
	By output = By.id("output");
	By runButton = By.xpath("//button[contains(text(),'Run')]");
	
	By introduction= By.xpath("//a[@href='introduction']");
	By creatinglinkedlist = By.xpath("//a[@href='creating-linked-list']");
	By practicequestions= By.xpath("//a[text()='Practice Questions']");
	//By practicequestions =  By.xpath("//a[href='/linked-list/practice\']");
	By typesoflinkedlist = By.xpath("//a[@href='types-of-linked-list']");
	By transversallist = By.xpath("//a[@href='traversal']");
	By insertionlink = By.xpath("//a[@href='insertion-in-linked-list']");
	By deletion = By.xpath("//a[@href='deletion-in-linked-list']");
	By implementLinkedListConst = By.xpath("//a[@href='implement-linked-list-in-python']");
	
	
	public void LinkedListSignIn() {
		driver.get(loginUrl);
	}
	
	public void selectLinkedList() {
		driver.findElement(datastructuredropdown).click();
		driver.findElement(linkdropdown).click();
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void getOutput() {
		String outputValue = driver.findElement(output).getText();
		LoggerLoad.info("Output value is: "+outputValue);
		
	}
	
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}
	public void introduction() {
		driver.findElement(introduction).click();
		
	}
	public void implementLinkList() {
		driver.findElement(implementLinkedListConst).click();
	}
	public void creating_linked_list_page() {
		// TODO Auto-generated method stub
		driver.findElement(creatinglinkedlist).click();
	}

	public void typesoflinkedlistlink() {
		driver.findElement(typesoflinkedlist).click();
		
	}

	public void traversals_illustration_link() {
		driver.findElement(transversallist).click();
		
	}

	public void insertion_link() {
		driver.findElement(insertionlink).click();
		
	}

	public void deletionlink() {
		driver.findElement(deletion).click();
		
	}
	
/*	public WebDriver driver = CrossBrowser.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String homeUrl = ConfigReader.getHomePageUrl();
	String signIn = ConfigReader.getSignInPage();
	String validCode= "print'Hello World'";
    String LLhome = ConfigReader.getApplicationUrl();
    //String practicequestionsurl=ConfigReader.getPracticeQuestionUrl();
    
   // String dspractice = ConfigReader.getPracticeQuestionUrl();
	
	 By username = By.id("id_username");
		By password = By.id("id_password");
		By loginbtn = By.xpath("//input[@value='Login']");
		By linkedlist = By.xpath("//a[@href='linked-list']");
		By introduction= By.xpath("//a[@href='introduction']");
		By tryherebtn = By.xpath("//a[@href='/tryEditor']");
		//By tryherebtn = By.xpath("//a[contains(text(),'Try here>>>')]");
		By enterCodeLine = By.xpath("//textarea[@tabindex='0']");
		By runButton = By.xpath("//button[contains(text(),'Run')]");
		
		By creatinglinkedlist = By.xpath("//a[@href='creating-linked-list']");
		By practicequestions= By.xpath("//a[text()='Practice Questions']");
		//By practicequestions =  By.xpath("//a[href='/linked-list/practice\']");
		By typesoflinkedlist = By.xpath("//a[@href='types-of-linked-list']");
		By transversallist = By.xpath("//a[@href='traversal']");
		By insertionlink = By.xpath("//a[@href='insertion-in-linked-list']");
		By deletion = By.xpath("//a[@href='deletion-in-linked-list']");
		By implementLinkedListConst = By.xpath("//a[@href='implement-linked-list-in-python']");
	
		
		public void dsalgoportal() {
		driver.get(signIn);

	}

	public void getStarted() {

		driver.findElement(username).sendKeys("Numpy@sdet101");
		driver.findElement(password).sendKeys("testpassword");
		driver.findElement(loginbtn).click();

	}
	
		

	

	public void linkedlist() {
		driver.findElement(linkedlist).click();
		
	}

	public void introduction() {
		driver.findElement(introduction).click();
		
	}
	public void tryherebtn() {
		driver.findElement(tryherebtn).click();
	}
	public void enterValidCode() {
		driver.findElement(enterCodeLine).sendKeys(validCode);
	}
	
	public void implementLinkList() {
		driver.findElement(implementLinkedListConst).click();
	}
		
		public void clickrunButton() throws InterruptedException {
			
			LoggerLoad.info("User clicked Run button");
			Thread.sleep(1000);
			driver.findElement(runButton).click();	
		}
		public void navigateTo(String pageName) {
			String urlName = ConfigReader.geturl(pageName);
			driver.get(urlName);
		}
		
		public void creating_linked_list_page() {
			// TODO Auto-generated method stub
			driver.findElement(creatinglinkedlist).click();
		}

		public void typesoflinkedlistlink() {
			driver.findElement(typesoflinkedlist).click();
			
		}

		public void traversals_illustration_link() {
			driver.findElement(transversallist).click();
			
		}

		public void insertion_link() {
			driver.findElement(insertionlink).click();
			
		}

		public void deletionlink() {
			driver.findElement(deletion).click();
			
		}

		public void practice_Questions_link() {
			driver.findElement(introduction).click();
			driver.findElement(practicequestions).click();
			
		}
		//public String Practice_Questions_Page_Title()
		//{
		//	String practicequestionstitle= driver.getTitle();
		//	return(practicequestionstitle);
		//}
		//public void PracticeQuestionUrl()
		//{
		//	driver.get(practicequestionsurl);
		//}
		
		
		*/

		
		
}

