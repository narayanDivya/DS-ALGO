
@STACK
Feature: Stack feature
Scenario: User logs in
	Given The user opens the DS Algo portal for graph
	When The user enters valid username and password
	Then The user is redirected to the homepage

#Scenario: User launch DS_Algo and redirect to HomePage after login
    #Given The user opens DSAlgo portal link
    #And The user clicks the Get Started button
    #When user redirected to homepage
    #And User is on Home page and click on signIn
    #Then The user should be redirected to Homepage after login
    
@Stack_01
  Scenario: The user is directed to "Stack" Page
    Given The user is on the home page after logged in
    When The user select stack item from the drop down menu
    Then The user should be directed to Stack Page
    #Updated

@Stack_02
  Scenario: The user is able to navigate to "Operations in Stack" page
    Given The user is on the Stack page after selecting Stack from dropdown after logged in
    When The user clicks on the Operations in Stack link
    Then The user should then be redirected to Operations in Stack Page
    #Updated
    
	@Stack_03
  Scenario: The user is able to navigate to a page having an tryEditor
    Given The user is on the Operations in Stack page after logged in
    When The user clicks Try Here button in Operations in stack page
    Then The user should be redirected to a page having an tryEditor operation with a Run button
    #Updated
    
  @Stack_04
  Scenario: The user is able to run code in tryEditor
    #Given The user is in the Stack page after having an tryEditor with a Run button to test
    #When The user gets input from sheet Sheetname and RowNumber
    #And The user clicks on Run button after Entering valid python code in stack tryEditor
    When The user inputs an invalid python code
	  Then The user is presented with an error message
     When The user inputs a python code
	  And The user clicks the run button
    Then The user should be presented with Run output
    #Added
    
  #@Stack_05
  #Scenario: The user is able to get the error message for invalid syntax
  #Given The user is in stack page having an tryEditor with a Run button to test
  #  When The user gets invalid input from sheet Sheetname and RowNumber
   # And The user clicks on Run button after Entering invalid python code in stack tryEditor
    #Then The user should get the error message
   
    #Added

	@Stack_06
  Scenario: The user is able to navigate to "Implementation" Page
    #Given The user is on the TryEditor page of Operation in Stack
    And User is navigated to Stack page
    When The user clicks on the Implementation button on Stack Page
    Then The user should then be redirected to Implementation Page
    #Updated
    
 	@Stack_07
  Scenario: The user is able to navigate to Implementation page having an tryeditor
    Given The user is on the Stack Implementation page after logged in
    When The user clicks Try Here button in stack Implementation page
    Then The user should be redirected to a page having an tryEditor implimentation with a Run button
    #Updated
    
    
  @Stack_08
  Scenario: The user is able to run code in tryEditor
    #Given The user is in the Stack implementation page after having an tryEditor with a Run button to test
    #When The user gets input from sheet Sheetname and RowNumber for implementation
    #And The user clicks on Run button after Entering valid python code in stack tryEditor for implementation
     When The user inputs a python code
	  And The user clicks the run button
    Then The user should be presented with Run output for implementation
   
	 #Added
	 
	#@Stack_09
  #Scenario: The user is able to get the error message for invalid syntax
   # Given The user is in stack page having an tryEditor with a Run button to test implementation
    #When The user gets invalid input from sheet Sheetname and RowNumber in implementation
    #And The user clicks on Run button after Entering invalid python code in stack tryEditor in implementation
    #Then The user should get the error message on Stack implementation
  
 	#Added
     
  @Stack_10
  Scenario: The user is able to navigate to "Applications" in stack Page
   #Given The user is on the TryEditor page of Stack Implementaion.
    And User is navigated to Stack page after logged in
    When The user clicks on the Applications button
    Then The user should be redirected to Applications Page
    #Updated
    
    
  @Stack_11
  Scenario: The user is able to navigate to Applications page having an tryEditor
    Given The user is on the Applications stack page after logged in
    When The user clicks Try Here button in stack Applications page
    Then The user should be redirected to a page having an tryEditor application with a Run button
    #Updated
    
    
  @Stack_12
  Scenario: The user is able to run code in tryEditor
    #Given The user is in the Stack application page after having an tryEditor with a Run button to test
    #When The user gets input from sheet Sheetname and RowNumber in Application
    #And The user clicks on Run button after Entering valid python code in stack tryEditor in Application
    When The user inputs an invalid python code
	  Then The user is presented with an error message
     When The user inputs a python code
	  And The user clicks the run button
    Then The user should be presented with Run output in Application
	 #Added
	  
 #	@Stack_13
 # Scenario: The user is able to get the error message for invalid syntax
  #  Given The user is in stack page having an tryEditor with a Run button to test in Application
  #  When The user gets invalid input from sheet Sheetname and RowNumber in Application
  #  And The user clicks on Run button after Entering invalid python code in stack tryEditor in Application
  #  Then The user should get the error message in Application
	 #Added
    
  @Stack_14
  Scenario: The user is able to navigate to "Practice Questions" in stack Page
    #Given The user is on the Try Editor page Stack Application 
    And User Navigates to previous page
    When The user clicks on the Practice Questions button
    Then The user should be redirected to Practice Questions page
    #Updated
    
   @Stack_15
   Scenario: The user is able to navigate to HomePage
   #When The User is on Practice Questions Page
   Then The User should be redirected to HomePage