
	package stepdefinition;

	import static org.testng.Assert.assertEquals;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;

import PageObjects.tree_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import utilities.LoggerLoad;

	public class DS_Algo_Tree_SD {
		
		WebDriver driver;
		tree_page tree = new tree_page();
		
		@Given("The user opens the DS Algo portal for tree")
		public void the_user_opens_the_ds_algo_portal_for_tree() {
		   tree.signInPage();
		}

		@When("The user enters valid username and password")
		public void the_user_enters_valid_username_and_password() {
		   tree.enterDetails();
		}

		@Then("The user is redirected to the homepage")
		public void the_user_is_redirected_to_the_homepage() {
		   String title = tree.getTitle();
		   assertEquals(title,"NumpyNinja");
		}

		@Given("The user is on the {string} after logged in")
		public void the_user_is_on_the_after_logged_in(String string) {
		    LoggerLoad.info("User is in the home page");
		}

		@When("The user select Tree item from the drop down menu")
		public void the_user_select_tree_item_from_the_drop_down_menu() {
		    LoggerLoad.info("User selects tree from drop down menu");
		    tree.selectTreePage();
		}

		@Then("The user should be directed to {string} Page")
		public void the_user_should_be_directed_to_page(String string) {
			String title = tree.getTitle();
			   assertEquals(title,"Tree");
		}

		
		@When("The user clicks on the Overview of Trees link")
		public void the_user_clicks_on_the_overview_of_trees_link() {
		    tree.clickOverview();
		}

		@Then("The user should then be directed to Overview of Trees Page")
		public void the_user_should_then_be_directed_to_overview_of_trees_page() {
		    LoggerLoad.info("User is in Overview of tree");
		}

		@When("The user clicks {string} button in {string} page")
		public void the_user_clicks_button_in_page(String string, String string2) {
		    tree.clickTryHere();
		}

		@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		    LoggerLoad.info("Try Editor");
		}

		

		@When("The user inputs a python code")
		public void the_user_inputs_a_python_code() {
		    tree.enterValidCode();
		}

		@When("The user clicks the run button")
		public void the_user_clicks_the_run_button() throws InterruptedException {
		    tree.clickRunButton();
		}

		@Then("The user should be presented with Run output for trees")
		public void the_user_should_be_presented_with_run_output_for_trees() {
		   tree.getOutput();
		}
		
		@And("User navigates back to Tree page")
		public void user_navigates_to_Tree_Page() {
			tree.navigateTo("Treehome");
		}
		
		@When("The user clicks on the Terminologies link")
		public void the_user_clicks_on_the_terminologies_link() {
		   tree.clickTerminologies();
		}

		@Then("The user should then be directed to Terminologies Page")
		public void the_user_should_then_be_directed_to_terminologies_page() {
			 String title = tree.getTitle();
			   assertEquals(title,"Terminologies");
		}

		@When("The user clicks on the Types of trees link")
		public void the_user_clicks_on_the_types_of_trees_link() {
		    tree.clickTypesOfTrees();
		}

		@Then("The user should then be directed to Types of trees Page")
		public void the_user_should_then_be_directed_to_types_of_trees_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Types of Trees");
		}

		@When("The user clicks on the Tree Traversals link")
		public void the_user_clicks_on_the_tree_traversals_link() {
		   tree.clickTreeTraversals();
		}

		@Then("The user should then be directed to Tree Traversals Page")
		public void the_user_should_then_be_directed_to_tree_traversals_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Tree Traversals");
		}

		@When("The user clicks on the Traversals Illustration link")
		public void the_user_clicks_on_the_traversals_illustration_link() {
		    tree.clickTraversalsIllustration();
		}

		@Then("The user should then be directed to Traversals Illustration Page")
		public void the_user_should_then_be_directed_to_traversals_illustration_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Traversals-Illustration");
		}

		@When("The user clicks on the Binary Trees link")
		public void the_user_clicks_on_the_binary_trees_link() {
		    tree.clickBinaryTrees();
		}

		@Then("The user should then be directed to Binary Trees Page")
		public void the_user_should_then_be_directed_to_binary_trees_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Binary Trees");
		}

		@When("The user clicks on the Types of Binary Trees link")
		public void the_user_clicks_on_the_types_of_binary_trees_link() {
		    tree.clickTypesOfBinaryTrees();
		}

		@Then("The user should then be directed to Types of Binary Trees\" Page")
		public void the_user_should_then_be_directed_to_types_of_binary_trees_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Types of Binary Trees");
		}

		@When("The user clicks on the Implementation in python link")
		public void the_user_clicks_on_the_implementation_in_python_link() {
		    tree.clickImplementationInPython();
		}

		@Then("The user should then be directed to Implementation in python Page")
		public void the_user_should_then_be_directed_to_implementation_in_python_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Implementation in Python");
		}

		@When("The user clicks on the Binary Tree Traversals link")
		public void the_user_clicks_on_the_binary_tree_traversals_link() {
		    tree.clickBinaryTreeTraversals();
		}

		@Then("The user should then be directed to Binary Tree Traversals Page")
		public void the_user_should_then_be_directed_to_binary_tree_traversals_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Binary Tree Traversals");
		}

		@When("The user clicks on the Implementation Of Binary Trees link")
		public void the_user_clicks_on_the_implementation_of_binary_trees_link() {
		    tree.clickImplementationOfBinaryTrees();
		}

		@Then("The user should then be directed to Implementation Of Binary Trees Page")
		public void the_user_should_then_be_directed_to_implementation_of_binary_trees_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Implementation of Binary Trees");
		}

		@When("The user clicks on the Application of Binary trees link")
		public void the_user_clicks_on_the_application_of_binary_trees_link() {
		     tree.clickApplicationsOfBinaryTrees();
		}

		@Then("The user should then be directed to Application of Binary trees Page")
		public void the_user_should_then_be_directed_to_application_of_binary_trees_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Applications of Binary trees");
		}

		@When("The user clicks on the Binary search trees link")
		public void the_user_clicks_on_the_binary_search_trees_link() {
		    tree.clickBinarySearchTrees();
		}

		@Then("The user should then be directed to Binary search trees Page")
		public void the_user_should_then_be_directed_to_binary_search_trees_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Binary Search Trees");
		}

		@When("The user clicks on the Implementation Of BST link")
		public void the_user_clicks_on_the_implementation_of_bst_link() {
		    tree.clickImplementationOfBST();
		}

		@Then("The user should then be directed to Implementation Of BST Page")
		public void the_user_should_then_be_directed_to_implementation_of_bst_page() {
			String title = tree.getTitle();
			   assertEquals(title,"Implementation Of BST");
		}


	}



