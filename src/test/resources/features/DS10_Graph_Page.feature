
@Graph
Feature: Graph page DS_ALGO
  I want to use this template for my feature file
	Scenario: User logs in
	Given The user opens the DS Algo portal for graph
	When The user enters valid username and password
	Then The user is redirected to the homepage
	
	@Graph001
    Scenario: Validate "Graph - Graph"
    Given The user is on the "home page" after logged in
    When The user select Graph item from the drop down menu
    Then The user should be directed to Graph main Page
    When The user clicks on the Graphs link
	  Then The user should then be directed to Graphs Page
	  Given The user is on the "Graphs" after logged in
	  When The user clicks "Try Here" button in "Graphs" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for graphs
	  And User navigates back to Graph page
	  
	  @Graph002
	   Scenario: Validate "Graph representations"
	  
	  When The user clicks on Graph representations link
	  Then The user should then be directed to Graph representations Page
	  When The user clicks "Try Here" button in "Graph representations" page
	  Then The user should be redirected to a page having an tryEditor with a Run button to test
	  When The user inputs a python code
	  And The user clicks the run button
	  Then The user should be presented with Run output for graphs
	  And User navigates back to Graph page
	  