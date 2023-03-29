package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ConfigReader;
import utilities.CrossBrowser;

public class Queue_Page_Objects {

	public WebDriver driver = CrossBrowser.getDriver();
	String loginUrl = ConfigReader.getSignInPage();
	String queueHomeUrl= ConfigReader.getQueuePageUrl();
	String impqueueinpythonurl= ConfigReader.getImplementationOfQueueInPythonPageUrl();
	String impusingcollectionurl= ConfigReader.getImplementationUsingCollectionPageUrl();
	String impusingarrayurl= ConfigReader.getImplementationUsingArrayPageUrl();
	String queueoperationUrl= ConfigReader.getQueueOperationPageUrl();
	
	By Queuedropdown = By.xpath("//a[text()='Queue']");
	By imqueueinpython= By.xpath("//a[@href='implementation-lists']");
	By impusingcollection= By.xpath("//a[text()='Implementation using collections.deque']");
	By impusingarray= By.xpath("//a[text()='Implementation using array']");
	By queueoperation= By.xpath("//a[text()='Queue Operations']");
	
	public void navigate_To_Loginpage() {
		
		driver.navigate().to(loginUrl);
	}
	
	public void click_Queue_FromDropDown() {
		
		driver.findElement(Queuedropdown).click();
	}
	
	public String queue_Page_Title()
	{
		String queue_title= driver.getTitle();
		return(queue_title);
	}
	
	public void queuePageUrl()
	{
		driver.get(queueHomeUrl);
	}
	
	public void click_Implementation_Of_Queue_In_Python() {
		
		driver.findElement(imqueueinpython).click();
	}

	public String implementation_Queue_Python_Page_Title()
	{
		String implementation_queue_python_title= driver.getTitle();
		return(implementation_queue_python_title);
	}
	public void implementationQueueInPythonUrl()
	{
		driver.get(impqueueinpythonurl);
	}
	public void navigate_To_Queuepage() {
		
		driver.navigate().to(queueHomeUrl);
	}
	public void click_Implementation_Using_Collection() {
		
		driver.findElement(impusingcollection).click();
	}
	public String implementation_Using_Collection_Page_Title()
	{
		String imp_Using_Collection_title= driver.getTitle();
		return(imp_Using_Collection_title);
	}
	
	public void implementationusingcollectionUrl()
	{
		driver.get(impusingcollectionurl);
	}
	public void click_Implementation_Using_Arrays() {
		
		driver.findElement(impusingarray).click();
	}
	public String implementation_Using_Array_Page_Title()
	{
		String imp_Using_Array_title= driver.getTitle();
		return(imp_Using_Array_title);
	}
	public void implementationusingarrayUrl()
	{
		driver.get(impusingarrayurl);
	}
	
	public void click_Queue_Operation() {
		
		driver.findElement(queueoperation).click();
	}
	
	public String queue_Operation_Page_Title()
	{
		String queue_Operartion_title= driver.getTitle();
		return(queue_Operartion_title);
	}
	public void queueOperationUrl()
	{
		driver.get(queueoperationUrl);
	}
public void navigate_To_Previuospage() {
		
		driver.navigate().to(queueoperationUrl);
	}
}