package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import PageObjects.array_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_Algo_Array_SD {
	
	WebDriver driver;
	array_page array = new array_page();

	@Given("The user opens the DS Algo portal for array")
	public void the_user_opens_the_ds_algo_portal_for_array() {
		LoggerLoad.info("User opens ds algo portal for array");
	   array.arraySignIn();
	}

	@When("The user select Arrays item from the drop down menu")
	public void the_user_select_arrays_item_from_the_drop_down_menu() {
		LoggerLoad.info("user selects array from the drop down menu");
	    array.selectArray();
	}
	@Then("The user should be directed to Array Page")
	public void the_user_should_be_directed_to_page() {
		LoggerLoad.info("User directed to array page");
		String title = array.getTitle();
		   assertEquals(title,"Array");
	}
	@When("The user clicks on the Arrays in python link")
	public void the_user_clicks_on_the_arrays_in_python_link() {
		LoggerLoad.info("User clicks on Arrays in python");
	   array.clickArraysInPython();
	}

	@Then("The user should then be directed to Arrays in python Page")
	public void the_user_should_then_be_directed_to_arrays_in_python_page() {
		String title = array.getTitle();
		   assertEquals(title,"Arrays in Python");
	}

	@Then("The user should be presented with Run output for arrays")
	public void the_user_should_be_presented_with_run_output_for_arrays() {
		array.getOutput();
	}

	@Then("User navigates back to Array page")
	public void user_navigates_back_to_array_page() {
		   array.navigateTo("Arrayhome");
		
	}
	@When("The user clicks on the Arrays using List link")
	public void the_user_clicks_on_the_arrays_using_list_link() {
		LoggerLoad.info("User clicks on Arrays using list");
	    array.clickArraysUsingList();
	}

	@Then("The user should then be directed to Arrays Using list Page")
	public void the_user_should_then_be_directed_to_arrays_using_list_page() {
	    String title = array.getTitle();
		   assertEquals(title,"Arrays Using List");
	}

	@When("The user clicks on the Basic operations in Lists link")
	public void the_user_clicks_on_the_basic_operations_in_lists_link() {
	    array.clickBasicOperationsInLists();
	}

	@Then("The user should then be directed to Basic operations in Lists Page")
	public void the_user_should_then_be_directed_to_basic_operations_in_lists_page() {
		String title = array.getTitle();
		   assertEquals(title,"Basic Operations in Lists");
	}

	@When("The user clicks on the Applications of Array link")
	public void the_user_clicks_on_the_applications_of_array_link() {
		LoggerLoad.info("User clicks on Appkications of Array");
	    array.clickApplicationsOfArray();
	}

	@Then("The user should then be directed to Applications of Array Page")
	public void the_user_should_then_be_directed_to_applications_of_array_page() {
		String title = array.getTitle();
		   assertEquals(title,"Applications of Array");
	}
	@Then("User navigates to Practice Questions page")
	public void user_navigates_to_Practice_Questions_page() throws InterruptedException {
	   array.navigateTo("ArrayPractice");
	   Thread.sleep(1000);
	}
	
	@Given("The user is on Practice Questions Page")
	public void the_user_is_on_practice_questions_page() {
		String title = array.getTitle();
		   assertEquals(title,"Practice Questions");
	}

	@When("The user clicks on Search the Array link")
	public void the_user_clicks_on_search_the_array_link() {
		LoggerLoad.info("User clicks on Search the array");
	    array.clickSearchArray();
	}

	@When("The user clicks the Run button")
	public void the_user_clicks_the_run_button() {
	    array.clickRun();
	}

	@Then("The user should be presented with an error message")
	public void the_user_should_be_presented_with_an_error_message() throws InterruptedException {
		 try{
				LoggerLoad.info("User gets the error message in an Alert  ");
				String fetchError = array.getErrorText();
				String ExpectedError="SyntaxError: bad input on line 2";
				LoggerLoad.info("Displayed Error Message  is "+fetchError);
				assertEquals(fetchError,ExpectedError,"Invalid Syntax error message");
				}
				catch(NoSuchElementException e){			   
				   }
	}
	

	@When("The user clicks on Max Consecutive Ones link")
	public void the_user_clicks_on_max_consecutive_ones_link() {
		LoggerLoad.info("User clicks on Max consecutive ones");
		array.clickMaxCOnsecutive();
	}

	@When("The user clicks on Find numbers with even number of digits link")
	public void the_user_clicks_on_find_numbers_with_even_number_of_digits_link() {
		LoggerLoad.info("User clicks on Find numbers with even number of digits");
		array.clickFindEvenNumbers();
	}

	@When("The user clicks on Squares of sorted array link")
	public void the_user_clicks_on_squares_of_sorted_array_link() {
		LoggerLoad.info("User clicks on Squares of sorted array");
		array.clickSortedArray();
		
	}

	

}
