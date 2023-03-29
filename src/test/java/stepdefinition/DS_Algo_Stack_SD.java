package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Stack_page_objects;
import PageObjects.home_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_Algo_Stack_SD {

	WebDriver driver;
	home_page homePage = new home_page();
	Stack_page_objects stackpage= new Stack_page_objects();
	
	//Background
	@Given("The user opens DSAlgo portal link")
	public void The_user_opens_DSAlgo_portal_link() {
	    
		LoggerLoad.info("STACK:Open DSAlgo portal ");
		homePage.dsalgoportal();
		
	}
	@And ("The user clicks the Get Started button")
	public void The_user_clicks_the_Get_Started_button() {
		LoggerLoad.info("STACK:Click Get Started Button");
		homePage.getStarted();
		
	}
	@When("user redirected to homepage")
	public void user_redirected_to_homepage() {
		
	   String title = homePage.getTitle();
	   LoggerLoad.info("STACK: USer is on "+title+" page");
		assertEquals(title,"NumpyNinja");
	}
	
	@And("User is on Home page and click on signIn")
	public void User_is_on_Home_page_and_click_on_signIn() throws Throwable {
		LoggerLoad.info("STACK:User clicks sign in link");
		homePage.signinClick();
		homePage.SendUserName_Password();
	}
	@Then("The user should be redirected to Homepage after login")
	public void The_user_should_be_redirected_to_Homepage_after_login() {
		LoggerLoad.info("STACK: User is on Home page");
		String Title= homePage.getTitle();
		assertEquals(Title,"NumpyNinja");  
	}
	
	
	//@Stack_01
	@Given("The user is on the home page after logged in")
	public void the_user_is_on_the_Home_page_after_logged_in()  {
		
		LoggerLoad.info("STACK: User is on Homepage after logged in");
		homePage.homepageurl();
		
		
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user select stack item from the drop down menu")
	public void the_user_select_stack_item_from_the_drop_down_menu() {
	    
		LoggerLoad.info("STACK: User selects Stack from dropdown menu");
		homePage.clickDropdown();
		homePage.selectfromDropdown();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be directed to Stack Page")
	public void the_user_should_be_redirected_to_Stack_page()  {
	    
		LoggerLoad.info("STACK: User is redirected to Stack page");
		String stacktitlepage= stackpage.Stack_Page_Title();
		assertEquals(stacktitlepage,"Stack");
	    //throw new io.cucumber.java.PendingException();
	}

	//@Stack_02
	@Given("The user is on the Stack page after selecting Stack from dropdown after logged in")
	public void the_user_is_on_the_stack_page_after_selecting_stack_from_dropdown_after_logged_in() throws InterruptedException {
	    
		LoggerLoad.info("STACK: User is on Stack page");
		stackpage.stackpageurl();		
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
	    
		LoggerLoad.info("STACK: User clicks on Operations in Stack link");
		stackpage.click_operations_in_stack();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("The user should then be redirected to Operations in Stack Page")
	public void the_user_should_then_be_redirected_to_page() {
		
	    LoggerLoad.info("STACK: User is redirected to Operations in stack page");
	    String stackoperationtitle= stackpage.Stack_operation_Page_Title();
	    assertEquals(stackoperationtitle,"Operations in Stack");
		
	    //throw new io.cucumber.java.PendingException();
	}

	//@Stack_03
	@Given("The user is on the Operations in Stack page after logged in")
	public void the_user_is_on_the_Operations_in_Stack_page_after_logged_in() {
	    
		LoggerLoad.info("STACK: The User is on Operations in stack page");
		stackpage.stackoperationsurl();
	    //throw new io.cucumber.java.PendingException();
	}
	@When("The user clicks Try Here button in Operations in stack page")
	public void the_user_clicks_Try_Here_button_in_page() {
	    
		LoggerLoad.info("STACK: The User clicks on Try here button in Operations in stack page");
		stackpage.click_TryHere();
		//throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a page having an tryEditor operation with a Run button")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_operation_with_a_run_button() {
	    
		LoggerLoad.info("STACK: The User is Redirected to Page having tryEditor with Run Button");
		String TryHeretitle= stackpage.Stack_TryHere_Page_Title();
		assertEquals(TryHeretitle,"Assessment");
		//throw new io.cucumber.java.PendingException();
	}

//@Stack_04
	@Given("The user is in the Stack page after having an tryEditor with a Run button to test")
	public void the_user_is_in_the_stack_page_after_having_an_try_editor_with_a_run_button_to_test() {
	    
	    LoggerLoad.info("STACK: The User in TryHere Editor page for valid python code/Operations in stack");
	    stackpage.StackTryHereUrl();
	   // throw new io.cucumber.java.PendingException();
	}

	@When("The user gets input from sheet Sheetname and RowNumber")
	public void the_user_gets_input_from_sheet_Sheetname_and_RowNumber() throws Throwable  {
	   
		LoggerLoad.info("STACK: User sends Valid Input to TryEditor textbox");
		stackpage.TryEditorTextboxInput();
	    //throw new io.cucumber.java.PendingException();
	}

	@And("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() throws Throwable {
	    
		LoggerLoad.info("STACK: User clicks on Run button with Valid Python code/Operation in stack");
		stackpage.ClickRunButton();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
	    
		//LoggerLoad.info("STACK: User is Presented with Valid output/Operations in stack");
		//stackpage.PythonOutput();
		stackpage.getOutput();
	    //throw new io.cucumber.java.PendingException();
	}

	
	
//@Stack_06
	@Given("The user is on the TryEditor page of Operation in Stack")
	public void the_user_is_on_the_try_editor_page_of_operation_in_stack() {
	    
		LoggerLoad.info("STACK: The User in TryHere Editor page for OPERATIONS IN STACK page");

			stackpage.StackTryHereUrl();

	    //throw new io.cucumber.java.PendingException();
	}
	
	@And("User is navigated to Stack page")
	public void user_is_navigated_to_Stack_page() throws Throwable {
	    
		LoggerLoad.info("STACK: The User navigates back to Stack Page from OPERATIONS IN STACK page");
		//Thread.sleep(1000);
		stackpage.Navigate_To_Stack_Page();
		//Thread.sleep(1000);
		//throw new io.cucumber.java.PendingException();
	}
	
	@When("The user clicks on the Implementation button on Stack Page")
	public void the_user_clicks_on_the_Implementation_button_on_Stack_page() throws Throwable {
	    
		LoggerLoad.info("STACK: User clicks on Implementation in stack page");
		//Thread.sleep(1000);
		stackpage.click_implementation_in_stack();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("The user should then be redirected to Implementation Page")
	public void the_user_should_then_be_redirected_to_Implementation_page() {
	    
		LoggerLoad.info("STACK: User is in IMPLEMENTATION page" );
		String implentationtitle= stackpage.Stack_implementations_Page_Title();
		assertEquals(implentationtitle,"Implementation");
	    //throw new io.cucumber.java.PendingException();
	}
	
//@Stack_07
	
	@Given("The user is on the Stack Implementation page after logged in")
	public void the_user_is_on_the_Stack_Implementation_page_after_logged_in() {
	    
		LoggerLoad.info("STACK: User is on Implementation Page");
		stackpage.StackImplementationUrl();
		//throw new io.cucumber.java.PendingException();
	}
	
	@When("The user clicks Try Here button in stack Implementation page")
	public void the_user_clicks_Try_Here_button_in_Stack_Implementation_page() {
	    
		LoggerLoad.info("STACK: The User clicks on Try here button in Implementation in stack page");
		stackpage.click_TryHere();
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("The user should be redirected to a page having an tryEditor implimentation with a Run button")
	public void the_user_should_be_redirected_to_a_page_having_an_tryEditor_implimentation_with_a_Run_button() {
	    
		LoggerLoad.info("STACK: The User is Redirected to Page having tryEditor with Run Button");
		String TryHeretitle= stackpage.Stack_TryHere_Page_Title();
		assertEquals(TryHeretitle,"Assessment");
		//throw new io.cucumber.java.PendingException();
	}
	
	//@Stack_08
	
	@Given("The user is in the Stack implementation page after having an tryEditor with a Run button to test")
	public void the_user_is_in_the_Stack_implementation_page_after_having_an_tryEditor_with_a_Run_button_to_test() {
	    
		LoggerLoad.info("STACK: The User in TryHere Editor page for valid python code/Implementation page");
	    stackpage.StackTryHereUrl();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("The user gets input from sheet Sheetname and RowNumber for implementation")
	public void the_user_gets_input_from_sheet_Sheetname_and_RowNumber_for_implementation() {

		LoggerLoad.info("STACK: User sends Valid Input to TryEditor textbox/Implementation page");
		stackpage.TryEditorTextboxInput();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@And("The user clicks on Run button after Entering valid python code in stack tryEditor for implementation")
	public void the_user_clicks_on_Run_button_after_Entering_valid_python_code_in_stack_tryEditor_for_implementation() {

		LoggerLoad.info("STACK: User clicks on Run button with Valid Python code/Implementation");
		stackpage.ClickRunButton();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("The user should be presented with Run output for implementation")
	public void the_user_should_be_presented_with_Run_output_for_implementation() {

		LoggerLoad.info("STACK: User is Presented with Valid output/Implementation");
		stackpage.PythonOutput();
	    //throw new io.cucumber.java.PendingException();
	}
	
	

//@Stack_10
	
	@Given("The user is on the TryEditor page of Stack Implementaion.")
	public void the_user_is_on_the_try_editor_page_of_stack_implementaion() {
	   
		LoggerLoad.info("STACK: The User in TryHere Editor page for IMPLEMENTATION page");
	    stackpage.StackTryHereUrl();
		//throw new io.cucumber.java.PendingException();
	}
	
	@And("User is navigated to Stack page after logged in")
	public void User_is_navigated_to_Stack_page_after_logged_in() throws Throwable {
		LoggerLoad.info("STACK: The User navigates back to Stack Page from IMPLEMENTATION page");
		//Thread.sleep(1000);
		stackpage.Navigate_To_Stack_Page();
		//Thread.sleep(1000);
		//throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on the Applications button")
	public void The_user_clicks_on_the_Applications_button() throws Throwable {
		LoggerLoad.info("STACK: User clicks on Applications link in stack page");
		//Thread.sleep(1000);
		stackpage.click_Applications();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("The user should be redirected to Applications Page")
	public void The_user_should_be_redirected_to_Applications_Page() throws Throwable {

		LoggerLoad.info("STACK: User is redirected to APPLICATIONS page");
		//Thread.sleep(2000);
		String applicationtitle= stackpage.Stack_Application_Page_Title();
		assertEquals(applicationtitle,"Applications");
	}
	

//@Stack_11
	@Given("The user is on the Applications stack page after logged in")
	public void The_user_is_on_the_Applications_stack_page_after_logged_in() {
	    
		LoggerLoad.info("STACK: User is in APPLICATIONS page");
		stackpage.StackApplicationUrl();
	    //throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button in stack Applications page")
	public void The_user_clicks_TryHere_button_in_stack_Applications_page() throws Throwable {
		LoggerLoad.info("STACK: The User clicks on Try here button in Application page");
		//Thread.sleep(2000);
		stackpage.click_TryHere();
		//throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to a page having an tryEditor application with a Run button")
	public void The_user_should_be_redirected_to_a_page_having_an_tryEditor_application_with_a_Run_button() {
		LoggerLoad.info("STACK: The User is Redirected to Page having tryEditor with Run Button/Application Page");
		String TryHeretitle= stackpage.Stack_TryHere_Page_Title();
		assertEquals(TryHeretitle,"Assessment");
		//throw new io.cucumber.java.PendingException();
	}

	//@Stack_12
	@Given("The user is in the Stack application page after having an tryEditor with a Run button to test")
	public void the_user_is_in_the_stack_application_page_after_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("STACK: The User in TryHere Editor page for valid python code/Application page");
	    stackpage.StackTryHereUrl();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("The user gets input from sheet Sheetname and RowNumber in Application")
	public void The_user_gets_input_from_sheet_Sheetname_and_RowNumber_in_Application() {
		LoggerLoad.info("STACK: User sends Valid Input to TryEditor textbox/Application page");
			stackpage.TryEditorTextboxInput();
			//throw new io.cucumber.java.PendingException();
		}
	
	@And("The user clicks on Run button after Entering valid python code in stack tryEditor in Application")
	public void The_user_clicks_on_Run_button_after_Entering_valid_python_code_in_stack_tryEditor_in_Application() {
		LoggerLoad.info("STACK: User clicks on Run button with Valid Python code/Application");
		stackpage.ClickRunButton();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("The user should be presented with Run output in Application")
	public void The_user_should_be_presented_with_Run_output_in_Application() {
		LoggerLoad.info("STACK: User is Presented with Valid output/Application");
		stackpage.PythonOutput();
	    //throw new io.cucumber.java.PendingException();
	}
	

	
//@Stack_14
	@Given("The user is on the Try Editor page Stack Application")
	public void the_user_is_on_the_try_editor_page_Stack_Application() {
		LoggerLoad.info("STACK: The User in TryHere Editor page of Application page");
	    stackpage.StackTryHereUrl();
	  //throw new io.cucumber.java.PendingException();
	}

	@And("User Navigates to previous page")
	public void user_navigates_to_previous_page() throws Throwable {
	    LoggerLoad.info("User Navigates back to Stack Application page");
	    stackpage.Navigate_To_previous_application_Page();
	  //throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() throws Throwable {
		LoggerLoad.info("User clicks on Practice Questions link");
		 
	    stackpage.click_Practice_Questions();
	  //throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() throws Throwable {
		
		LoggerLoad.info("STACK: The User is Redirected to Practice Questions page");
	
		String practicequestiontitle= stackpage.Practice_Questions_Page_Title();
		assertEquals(practicequestiontitle,"Practice Questions");
		//throw new io.cucumber.java.PendingException();
	}

//@Stack_15		
	@When("The User is on Practice Questions Page")
	public void the_User_is_on_Practice_Questions_Page()
	{
		LoggerLoad.info("STACK: The User is in Practice Question Page");
		stackpage.PracticeQuestionUrl();
	}
	@Then("The User should be redirected to HomePage")
	public void the_User_should_be_redirected_to_HomePage()
	{
		LoggerLoad.info("STACK: The User is redirected to HomePage");
		homePage.Navigate_To_Home_Page();
}	}