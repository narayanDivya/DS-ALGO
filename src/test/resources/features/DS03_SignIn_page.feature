
@SignIn
Feature: Implement Sign_In Feature

  @SignIn
  Scenario: The user should luanch DS_Algo portal and redirect to login page
   Given The User is on DS_Algo portal page
   And Click on Get Started button
    When User navigates to HomePage
  #  And Clicks on Sign In link
   # Then The User should be redirected to login Page

  @SignIn_01
  Scenario: Verifying Register link
   When The user clicks on register link on signin page
   Then The user redirected to Registration page from signin page

  @SignIn_02
 Scenario: The User is on Registartion page and redirect to login page
   Given The User is on Registration page
   When User clicks on Login link
    Then User should redirect to login page

  @SignIn_03
  Scenario Outline: User on login page and login with invalid inputs
    When The user enter invalid <username> and <password>
    And click login button to verify
    Then Check whether user is in Login page with invalid credentials

    Examples: 
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |

  @SignIn_04
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel
    When The user enter Username and Password from <Sheetname> and <RowNumber>
    Then click login button to check
    


    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
      | Sheet1    |         4 |
      | Sheet1    |         5 |
      | Sheet1    |         6 |
      
 @SignIn_05
 Scenario:  Verifying signout link
 Given 	The user is in the Home page with valid  log in
 When 	The user clicks Sign out link
 Then 	Then the user stays in homepage after Signout
