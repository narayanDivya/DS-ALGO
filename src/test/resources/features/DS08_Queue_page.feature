@Queue
Feature: Implement Queue feature in DS_ALgo Project

  #Scenario: User logs in
	#Given The user opens the DS Algo portal for graph
	#When The user enters valid username and password
	#Then The user is redirected to the homepage
  


  @Queue_01
  Scenario: The user is directed to "Queue" Page
    Given The user is on the home page after login
    When The user select Queue item from the drop down menu
    Then The user should be directed to Queue Page

  #Updated
  @Queue_02
  Scenario: The user is able to navigate to "Implementation of Queue in Python" page
    Given The user is on the Queue page after selecting Queue from dropdown after logged in
    When The user clicks on the Implementation of Queue in Python link
    Then The user should then be redirected to Implementation of Queue in Python Page

  #Updated
  @Queue_03
  Scenario: The user is able to navigate to a page having an tryEditor
    When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button

  @Queue_04
  Scenario: The user is able to run code in tryEditor
   When The user inputs an invalid python code
	  Then The user is presented with an error message
     When The user inputs a python code
	  And The user clicks the run button
    Then The user should be presented with Run output
   
  @Queue_06
  Scenario: The user is able to navigate to "Implementation using collections.deque" Page
   # Given The user is on the TryEditor page of Implementation of Queue in Python in Queue
    And User is navigated back to Queue page from TryEditor
    When The User Clicks on Implementation using collections link
    Then The user should then be redirected to Implementation using collections.deque Page
    
  #Updated
  @Queue_07
  Scenario: The user is able to navigate to Implementation using collections.deque page having an tryeditor
 		When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button 

  #Updated
  @Queue_08
  Scenario: The user is able to run code in tryEditor
    When The user inputs an invalid python code
	  Then The user is presented with an error message
     When The user inputs a python code
	  And The user clicks the run button
    Then The user should be presented with Run output

  @Queue_10
  Scenario: The user is able to navigate to "Implementation using array" in queue Page
    #Given The user is on the TryEditor page of Implementation using collections.deque.
    And User is navigated back to Queue page from TryEditor
    When The user clicks on the Implementation using array button
    Then The user should be redirected to Implementation using array Page
#
  #Updated
  @Queue_11
  Scenario: The user is able to navigate to Implementation using array page having an tryEditor
     When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button
#
  #Updated
  @Queue_12
  Scenario: The user is able to run code in tryEditor
    When The user inputs a python code
	  And The user clicks the run button
    Then The user should be presented with Run output

  @Queue_14
  Scenario: The user is able to navigate to "Queue Operations" in queue Page
   # Given The user is on the TryEditor page of Implementation using array.
    And User is navigated back to Queue page from TryEditor
    When The user clicks on the Queue Operations button
    Then The user should be redirected to Queue Operations Page
#
  #Updated
  @Queue_15
  Scenario: The user is able to navigate to Queue Operations page having an tryEditor
     When The user clicks Try Here button
    Then The user should be redirected to a page having an tryEditor with a Run button
#
  #Updated
  @Queue_16
  Scenario: The user is able to run code in tryEditor
   
    When The user inputs an invalid python code
	  Then The user is presented with an error message
     When The user inputs a python code
	  And The user clicks the run button
    Then The user should be presented with Run output

  @Queue_18
  Scenario: The user is able to navigate to "Practice Questions" in Queue Page
   # Given The user is on the Try Editor page Queue Operations
    And User Navigates to previous page of Queue Operations
    When The user clicks on the Practice Questions button of Queue
    Then The user should be redirected to Practice Questions page of Queue
#
  #Updated
  @Queue_19
  Scenario: The user is able to navigate to HomePage
    When The User is on Practice Questions Page of Queue Operations
    Then The User should be redirected to HomePage from Queue Operations Practice questions page