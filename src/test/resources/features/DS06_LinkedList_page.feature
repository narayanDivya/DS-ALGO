
@LinkedList

Feature: Tree page DS_ALGO
  I want to use this template for my feature file
	 I want to use this template for my feature file
	Scenario: User logs in
	Given The user opens the DS Algo portal for tree
	When The user enters valid username and password
	Then The user is redirected to the homepage
	
		@Linked001
    Scenario: Validate "Linked List page"
    Given The user is on the "home page" after logged in
    When The clicks selects Linked List button
    Then The user should be directed to Linked List Page
    
     @Linked002
	  Scenario: Validate "Inroduction"
    When The user clicks on Introduction 
	  Then The user should then be directed to Introduction Page
	   When The user clicks "Try Here" button in "Linked List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	   When The user inputs an invalid python code
	  Then The user is presented with an error message
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for Linked List
	  And User navigates back to Linked List page
	  
	  @Linked003
	   Scenario: Validate "Creating Linked List"
    When The user clicks on Creating Linked List 
	  Then The user should then be directed to Creating Linked List Page
	   When The user clicks "Try Here" button in "Linked List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	   When The user inputs an invalid python code
	  Then The user is presented with an error message
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for Linked List
	  And User navigates back to Linked List page
	  
	  
	@Linked003
	   Scenario: Validate "Types Of Linked List"
    When The user clicks on Types Of Linked List 
	  Then The user should then be directed to Types Of Linked List Page
	   When The user clicks "Try Here" button in "Linked List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	   When The user inputs an invalid python code
	  Then The user is presented with an error message
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for Linked List
	  And User navigates back to Linked List page
	
	
	  @Linked004
	   Scenario: Validate "Implement Linked List in python"
    When The user clicks on Implement Linked List in python 
	  Then The user should then be directed to Implement Linked List in python Page
	   When The user clicks "Try Here" button in "Linked List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for Linked List
	  And User navigates back to Linked List page
	  
	   @Linked005
	   Scenario: Validate "Traversal"
    When The user clicks on Traversal in python 
	  Then The user should then be directed to Traversal in python Page
	   When The user clicks "Try Here" button in "Linked List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	   When The user inputs an invalid python code
	  Then The user is presented with an error message
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for Linked List
	  And User navigates back to Linked List page
	  
	   @Linked004
	   Scenario: Validate "Insertion"
    When The user clicks on Insertion in python 
	  Then The user should then be directed to Insertion in python Page
	   When The user clicks "Try Here" button in "Linked List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for Linked List
	  And User navigates back to Linked List page
	  
	  
	    @Linked004
	   Scenario: Validate "Deletion"
    When The user clicks on Deletion in python 
	  Then The user should then be directed to Deletion in python Page
	   When The user clicks "Try Here" button in "Linked List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for Linked List
	  And User navigates back to Linked List page
	  Then User navigates to home page