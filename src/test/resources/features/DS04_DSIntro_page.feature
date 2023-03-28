@DS_intro
Feature: Intoduction feature

  Scenario: User Launch DS_Algo and Redirected to Homepage
    Given The user opens  DSAlgo portal Signinlink
    When user enters username and password
    Then The user should be redirected to homepage

  @DS_intro2
  Scenario Outline: 
    Given The user is on the "home page" after logged in
    When The user clicks the "Getting Started" button in Data Structure Page introduction Panel
    Then The user is on the "home page" after logged in

  @DS_intro3
  Scenario Outline: 
    Given The user is on the "Data Structures Introduction" after logged in
    When The user clicks Time Complexity link
    Then The user should be redirected to "Time Complexity" page

  @DS_intro4
  Scenario Outline: The user is able to navigate to a page having an tryEditor from Time Complexity page
    Given The user is on the "Time Complexity" after logged in
    When The user clicks "Try Here" button on "Time Complexity" page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user inputs an invalid python code
	  Then The user is presented with an error message
    When The user enter python code with valid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    Then The user clicks on run button
    And User navigates back to Time complexity
   

  @DS_intro5
  Scenario:The user validating "Practice Questions" page
	  When The user clicks on the "Practice Questions" link
	  Then The user should then be directed to Practice Questions Page
	  And User navigates back to "home page"
	