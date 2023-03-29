package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ConfigReader;
import utilities.CrossBrowser;
import utilities.LoggerLoad;

public class Stack_page_objects {

	public WebDriver driver = CrossBrowser.getDriver();
	String url = ConfigReader.getApplicationUrl();
	String stackUrl = ConfigReader.getStackPageUrl();
	String stackoperationurl=ConfigReader.getStackOperationsUrl();
	String stacktryhereurl=ConfigReader.getStackTryEditorUrl();
	String stackimplementationsurl=ConfigReader.getStackImplementationUrl();
	String stackapplicationurl=ConfigReader.getStackApplicationUrl();
	String practicequestionsurl=ConfigReader.getPracticeQuestionUrl();
	
	By operationsinstack= By.xpath("//a[@href='operations-in-stack']");
	By TryHerebutton= By.xpath("//a[@href='/tryEditor']");
	By tryheretextbox= By.xpath("//textarea[@tabindex='0']");
	By runbutton=By.xpath("//button[text()='Run']");
	By pythonooutput= By.id("output");
	By imlementationinstack= By.xpath("//a[@href='implementation']");
	By stackoperations= By.xpath("//a[@href='stack-applications']");
	By practicequestions= By.xpath("//a[text()='Practice Questions']");
	public String Stack_Page_Title()
	{
		String stack_title= driver.getTitle();
		return(stack_title);
	}
	
	public void stackpageurl() {
		
		driver.get(stackUrl);
	}
	public void click_operations_in_stack() {
		// TODO Auto-generated method stub
		driver.findElement(operationsinstack).click();
	}
	
	public String Stack_operation_Page_Title()
	{
		String stack_operationtitle= driver.getTitle();
		return(stack_operationtitle);
	}
	public void stackoperationsurl()
	{
		driver.get(stackoperationurl);
	}
	public void click_TryHere()
	{
		driver.findElement(TryHerebutton).click();
	}
	public String Stack_TryHere_Page_Title()
	{
		String StackTryHereTitle=driver.getTitle();
		return(StackTryHereTitle);
	}
	public void StackTryHereUrl()
	{
		driver.get(stacktryhereurl);
	}
	public void TryEditorTextboxInput()
	{
		driver.findElement(tryheretextbox).sendKeys("print('Hello, world!')");
	}
	public void ClickRunButton()
	{
		driver.findElement(runbutton).click();
	}
	public void PythonOutput()
	{
		String pythoncodeoutput=driver.findElement(pythonooutput).getText();
		System.out.println("Valid PythonCode: "+ pythoncodeoutput);
	}
	public void TryEditorInvalidTextboxInput()
	{
		driver.findElement(tryheretextbox).sendKeys("Invalid Input");
	}
	public void Navigate_To_Stack_Page()
	{
		driver.navigate().to(stackUrl);
	}
	public void click_implementation_in_stack() {
		// TODO Auto-generated method stub
		driver.findElement(imlementationinstack).click();
	}
	public String Stack_implementations_Page_Title()
	{
		String stack_implementationpagetitle= driver.getTitle();
		return(stack_implementationpagetitle);
	}
	public void StackImplementationUrl()
	{
		driver.get(stackimplementationsurl);
	}
	public void click_Applications() {
		// TODO Auto-generated method stub
		driver.findElement(stackoperations).click();
	}
	public String Stack_Application_Page_Title()
	{
		String applicationpagetitle=driver.getTitle();
		return applicationpagetitle;
	}
	public void StackApplicationUrl()
	{
		driver.get(stackapplicationurl);
	}
	public void Navigate_To_previous_application_Page()
	{
		driver.navigate().to(stackapplicationurl);
	}
	public void click_Practice_Questions()
	{
		driver.findElement(practicequestions).click();
	}
	public String Practice_Questions_Page_Title()
	{
		String practicequestionstitle= driver.getTitle();
		return(practicequestionstitle);
	}
	public void PracticeQuestionUrl()
	{
		driver.get(practicequestionsurl);
	}
	public void getOutput() {
		String outputValue = driver.findElement(pythonooutput).getText();
		LoggerLoad.info("Output value is: "+outputValue);
		
	}
	
	
}
