
@Array
Feature: Array page DS_ALGO
  I want to use this template for my feature file
	Scenario: User logs in
	Given The user opens the DS Algo portal for array
	When The user enters valid username and password
	Then The user is redirected to the homepage
	
	@Array001
    Scenario: Validate "Arrays page"
    Given The user is on the "home page" after logged in
    When The user select Arrays item from the drop down menu
    Then The user should be directed to Array Page
    When The user clicks on the Arrays in python link
	  Then The user should then be directed to Arrays in python Page
	  
	  Scenario: Validate "Arrays in python"
	  Given The user is on the "Arrays in python" after logged in
	  When The user clicks "Try Here" button in "Arrays in python" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs an invalid python code
	  Then The user is presented with an error message
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for arrays
	  And User navigates back to Array page
	  
	  @Array002
	  Scenario: Validate "Arrays Using List"
	  
	  When The user clicks on the Arrays using List link
	  Then The user should then be directed to Arrays Using list Page
	  When The user clicks "Try Here" button in "Arrays Using List" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for arrays
	  And User navigates back to Array page
	  
	  @Array003 
	  Scenario: Validate "Basic operations in Lists"
	  
	  When The user clicks on the Basic operations in Lists link
	  Then The user should then be directed to Basic operations in Lists Page
	  When The user clicks "Try Here" button in "Basic operations in Lists" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for arrays
	  And User navigates back to Array page
	  
	   @Array004 
	  Scenario: Validate "Applications of Array"
	  
	  When The user clicks on the Applications of Array link
	  Then The user should then be directed to Applications of Array Page
	  When The user clicks "Try Here" button in "Applications of Array" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	   When The user inputs an invalid python code
	  Then The user is presented with an error message
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for arrays
	  And User navigates to Practice Questions page
	  
	 	  
	  @Array006
	  Scenario: Validate "Search the array"
	  Given The user is on Practice Questions Page
	  When The user clicks on Search the Array link
	  And The user clicks the Run button
	  Then The user should be presented with an error message
	  And User navigates to Practice Questions page
	  
	  @Array007
	  Scenario: Validate "Max consecutive Ones"
	  When The user clicks on Max Consecutive Ones link
	  And The user clicks the Run button
	  Then The user should be presented with an error message
	  And User navigates to Practice Questions page
	  
	  @Array008
	  Scenario: Validate "Find numbers with even number of digits"
	  When The user clicks on Find numbers with even number of digits link
	  And The user clicks the Run button
	  Then The user should be presented with an error message
	  And User navigates to Practice Questions page
	  
	  @Array009
	   Scenario: Validate "Squares of sorted array"
	  When The user clicks on Squares of sorted array link
	  And The user clicks the Run button
	  Then The user should be presented with an error message
	  And User navigates to Practice Questions page
	  Then User navigates to home page