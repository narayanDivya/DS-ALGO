package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import PageObjects.Linked_page;
import PageObjects.home_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.LoggerLoad;

public class DS_Algo_Linked_SD {
	WebDriver driver;
	Linked_page linkedpage = new  Linked_page();

	@When("The clicks selects Linked List button")
	public void the_clicks_selects_linked_list_button() {
	   linkedpage.selectLinkedList();
	}
	@Then("The user should be directed to Linked List Page")
	public void the_user_should_be_directed_to_Linked_List_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Linked List");
	}


	@When("The user clicks on Introduction")
	public void the_user_clicks_on_introduction() {
	    linkedpage.introduction();
	}

	@Then("The user should then be directed to Introduction Page")
	public void the_user_should_then_be_directed_to_introduction_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Introduction");
	}
	@Then("The user should be presented with Run output for Linked List")
	public void the_user_should_be_presented_with_run_output_for_linked_list() {
	   linkedpage.getOutput();
	}

	@Then("User navigates back to Linked List page")
	public void user_navigates_back_to_linked_list_page() {
	    linkedpage.navigateTo("LLhome");
	}
	@When("The user clicks on Creating Linked List")
	public void the_user_clicks_on_creating_linked_list() {
	    linkedpage.creating_linked_list_page();
	}

	@Then("The user should then be directed to Creating Linked List Page")
	public void the_user_should_then_be_directed_to_creating_linked_list_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Creating Linked LIst");
	}

	@When("The user clicks on Types Of Linked List")
	public void the_user_clicks_on_types_of_linked_list() {
	   linkedpage.typesoflinkedlistlink();
	}

	@Then("The user should then be directed to Types Of Linked List Page")
	public void the_user_should_then_be_directed_to_types_of_linked_list_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Types of Linked List");
	}

	@When("The user clicks on Implement Linked List in python")
	public void the_user_clicks_on_implement_linked_list_in_python() {
	    linkedpage.implementLinkList();
	}

	@Then("The user should then be directed to Implement Linked List in python Page")
	public void the_user_should_then_be_directed_to_implement_linked_list_in_python_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Implement Linked List in Python");
	}

	@When("The user clicks on Traversal in python")
	public void the_user_clicks_on_traversal_in_python() {
	   linkedpage.traversals_illustration_link();
	}

	@Then("The user should then be directed to Traversal in python Page")
	public void the_user_should_then_be_directed_to_traversal_in_python_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Traversal");
	}

	@When("The user clicks on Insertion in python")
	public void the_user_clicks_on_insertion_in_python() {
	   linkedpage.insertion_link();
	}

	@Then("The user should then be directed to Insertion in python Page")
	public void the_user_should_then_be_directed_to_insertion_in_python_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Insertion");
	}

	@When("The user clicks on Deletion in python")
	public void the_user_clicks_on_deletion_in_python() {
	   linkedpage.deletionlink();
	}
	
	@Then("The user should then be directed to Deletion in python Page")
	public void the_user_should_then_be_directed_to_deletion_in_python_page() {
		String title = linkedpage.getTitle();
		   assertEquals(title,"Deletion");
	}
	
	
	
}