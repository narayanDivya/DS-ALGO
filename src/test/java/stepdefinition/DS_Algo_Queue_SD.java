package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import PageObjects.Queue_Page_Objects;
import PageObjects.Stack_page_objects;
import PageObjects.array_page;
import PageObjects.home_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_Algo_Queue_SD {
	
	WebDriver driver;
	home_page homePage = new home_page();
	Queue_Page_Objects queue= new Queue_Page_Objects();
	Stack_page_objects stackpage= new Stack_page_objects();
	array_page array=new array_page();
	
	@Given("The user navigates to signIn page")
	public void the_user_navigates_to_sign_in_page() {

		LoggerLoad.info("Queue: User Navigates to Sign In Page");
		queue.navigate_To_Loginpage();
		
	}

	@When("The user enters login credentials and clicks Login button")
	public void the_user_enters_login_credentials_and_clicks_login_button() {

		LoggerLoad.info("Queue: User enters login credentials and click Login button");
		homePage.SendUserName_Password();

	}

	@Then("The user should be redirected to Homepage after logged in")
	public void the_user_should_be_redirected_to_homepage_after_logged_in() {

		String title = homePage.getTitle();
		LoggerLoad.info("Queue: USer redirects to "+title+" page");
		assertEquals(title,"NumpyNinja");
	}

	//@Queue_01
	@Given("The user is on the home page after login")
	public void the_user_is_on_the_home_page_after_login() {
		
		LoggerLoad.info("QUEUE: User is on Homepage after logged in");
		homePage.homepageurl();

	}

	@When("The user select Queue item from the drop down menu")
	public void the_user_select_queue_item_from_the_drop_down_menu() throws InterruptedException {
 
		LoggerLoad.info("QUEUE: User selects Queue from dropdown menu");
		homePage.clickDropdown();
		queue.click_Queue_FromDropDown();
		
	}

	@Then("The user should be directed to Queue Page")
	public void the_user_should_be_directed_to_queue_page() {

		LoggerLoad.info("QUEUE: User is redirected to Queue page");
		String queuepagetitle= queue.queue_Page_Title();
		assertEquals(queuepagetitle,"Queue");
	}

	//@Queue_02
	@Given("The user is on the Queue page after selecting Queue from dropdown after logged in")
	public void the_user_is_on_the_queue_page_after_selecting_queue_from_dropdown_after_logged_in() {

		LoggerLoad.info("QUEUE: User is on Queue page");
		queue.queuePageUrl();
	}

	@When("The user clicks on the Implementation of Queue in Python link")
	public void the_user_clicks_on_the_implementation_of_queue_in_python_link() {

		LoggerLoad.info("QUEUE: User clicks on Implementation of Queue in Python link");
		
		queue.click_Implementation_Of_Queue_In_Python();
	}

	@Then("The user should then be redirected to Implementation of Queue in Python Page")
	public void the_user_should_then_be_redirected_to_implementation_of_queue_in_python_page() throws InterruptedException {

		 LoggerLoad.info("QUEUE: User is redirected to Implementation of Queue in Python page");
		 String implementationofqueueinpythontitle= queue.implementation_Queue_Python_Page_Title();
		 assertEquals(implementationofqueueinpythontitle,"Implementation of Queue in Python");
		
			
	}

	//@Queue_03
	
	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() throws InterruptedException {
	    
		LoggerLoad.info("QUEUE: The User clicks on Try here button");
		Thread.sleep(2000);
		stackpage.click_TryHere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button")
	public void The_user_should_be_redirected_to_a_page_having_an_tryEditor_with_a_Run_button() {

		LoggerLoad.info("QUEUE: The User is Redirected to Page having tryEditor with Run Button");
		String TryHeretitle= stackpage.Stack_TryHere_Page_Title();
		assertEquals(TryHeretitle,"Assessment");
	}
	
	//@Queue_04
	
		@When("The user gets valid Python input for queue")
		public void the_user_gets_input_from_sheet_sheetname_and_row_number_for_implementation_of_queue_in_python() {

			LoggerLoad.info("QUEUE: User sends Valid Input to TryEditor textbox/Implementation of Queue in Python");
			stackpage.TryEditorTextboxInput();
		}

		@And("The user clicks on Run button after Entering valid python code in Queue tryEditor")
		public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_queue_try_editor() {

			LoggerLoad.info("QUEUE: User clicks on Run button with Valid Python code/Implementation of Queue in Python");
			stackpage.ClickRunButton();
		}

		@Then("The user should be presented with Run output in Queue")
		public void the_user_should_be_presented_with_run_output_for_implementation_of_queue_in_python() {

			LoggerLoad.info("QUEUE: User is Presented with Valid output/Implementation of Queue in Python");
			stackpage.PythonOutput();
		}



	

	//@Queue_06
	@Given("The user is on the TryEditor page of Implementation of Queue in Python in Queue")
	public void the_user_is_on_the_try_editor_page_of_implementation_of_queue_in_python_in_queue() {

		LoggerLoad.info("QUEUE: The User in TryHere Editor page for Implementation of Queue page");
		stackpage.StackTryHereUrl();
	}

	@And("User is navigated back to Queue page from TryEditor")
	public void the_user_is_navigated_to_queue_page_from_implementation_of_queue_in_python_in_queue() throws InterruptedException {

		LoggerLoad.info("QUEUE: The User navigates back to QUEUE Page from Implementation of Queue page");
		
		queue.navigate_To_Queuepage();
		Thread.sleep(3000);
	}

	@When("The User Clicks on Implementation using collections link")
	public void the_user_clicks_on_implementation_using_collections_link() {

		LoggerLoad.info("QUEUE: User clicks on Implementation using collections link");
		queue.click_Implementation_Using_Collection();
	}

	@Then("The user should then be redirected to Implementation using collections.deque Page")
	public void the_user_should_then_be_redirected_to_implementation_using_collections_deque_page() {
 
		LoggerLoad.info("QUEUE: User is in Implementation using collections page" );
		String implentationusingcollectiontitle= queue.implementation_Using_Collection_Page_Title();
		assertEquals(implentationusingcollectiontitle,"Implementation using collections.deque");
	}
	
	

	//@Queue_10
	@Given("The user is on the TryEditor page of Implementation using collections.deque.")
	public void the_user_is_on_the_try_editor_page_of_implementation_using_collections_deque() {

		LoggerLoad.info("QUEUE: The User in TryHere Editor page for Implementation using collections.deque page");
	    stackpage.StackTryHereUrl();
	}

	@When("The user clicks on the Implementation using array button")
	public void the_user_clicks_on_the_implementation_using_array_button() {

		LoggerLoad.info("QUEUE: User clicks on Implementation using array link in Queue page");
		queue.click_Implementation_Using_Arrays();
		
	}

	@Then("The user should be redirected to Implementation using array Page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() throws InterruptedException {

		LoggerLoad.info("QUEUE: User is redirected to implementation using array page");
		String implementationusingarraytitle= queue.implementation_Using_Array_Page_Title();
		assertEquals(implementationusingarraytitle,"Implementation using array");
	}
	
	
	

	//@Queue_14
	@Given("The user is on the TryEditor page of Implementation using array.")
	public void the_user_is_on_the_try_editor_page_of_implementation_using_array() {

		LoggerLoad.info("QUEUE: The User in TryHere Editor page for Implementation using array page");
	    stackpage.StackTryHereUrl();
	}
	
	@When("The user clicks on the Queue Operations button")
	public void the_user_clicks_on_the_queue_operations_button() {

		LoggerLoad.info("QUEUE: User clicks on Queue Operation link in Queue page");
		queue.click_Queue_Operation();
	}

	@Then("The user should be redirected to Queue Operations Page")
	public void the_user_should_be_redirected_to_queue_operations_page() {

		LoggerLoad.info("QUEUE: User is redirected to Queue Operation page");
		String queueoperationtitle= queue.queue_Operation_Page_Title();
		assertEquals(queueoperationtitle,"Queue Operations");
	}
	
	

	//@Queue_18
	@Given("The user is on the Try Editor page Queue Operations")
	public void the_user_is_on_the_try_editor_page_queue_operations() {

		LoggerLoad.info("QUEUE: The User in TryHere Editor page for Queue Operations page");
	    stackpage.StackTryHereUrl();
	}

	@And("User Navigates to previous page of Queue Operations")
	public void user_navigates_to_previous_page_of_queue_operations() {

		LoggerLoad.info("QUEUE: The User navigates back to Queue Page from Queue Operations page");
		queue.navigate_To_Previuospage();
	}

	@When("The user clicks on the Practice Questions button of Queue")
	public void the_user_clicks_on_the_practice_questions_button_of_queue() {

		LoggerLoad.info("QUEUE: User clicks on Practice Questions link");
		stackpage.click_Practice_Questions();
	}

	@Then("The user should be redirected to Practice Questions page of Queue")
	public void the_user_should_be_redirected_to_practice_questions_page_of_queue() {

		LoggerLoad.info("QUEUE: The User is Redirected to Practice Questions page");
		
		String practicequestiontitle= stackpage.Practice_Questions_Page_Title();
		assertEquals(practicequestiontitle,"Practice Questions");
	}

	//@Queue_19
	@When("The User is on Practice Questions Page of Queue Operations")
	public void the_user_is_on_practice_questions_page_of_queue_operations() {

		LoggerLoad.info("QUEUE: The User is in Practice Question Page");
		stackpage.PracticeQuestionUrl();
	}

	@Then("The User should be redirected to HomePage from Queue Operations Practice questions page")
	public void the_user_should_be_redirected_to_home_page_from_queue_operations_practice_questions_page() {

		LoggerLoad.info("QUEUE: The User is redirected to HomePage");
		homePage.Navigate_To_Home_Page();
	}

}