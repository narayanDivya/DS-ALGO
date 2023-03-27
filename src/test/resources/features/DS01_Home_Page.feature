
@HomePage
Feature: Home_Page
  I want to use this template for my feature file

  @tag1 @Home_TC_01
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
  #Added  
    
  @tag2 @Home_TC_02
  Scenario Outline: User is on Home page and click getstarted link on  home page without sign in
    Given The user is on Home page
    When The user clicks on Get Started link on homepage "<option>" without login
    Then The user get warning message "You are not logged in"
      
    
        
  @tag2 @Home_TC_03
  Scenario Outline: User is on Home page and click on dropdown without sign in
    Given The user is on Home page
    When  The user clicks on dropdown "<option>" without login
    Then The user get warning message "You are not logged in"
      
    
   
   @tag3 @Home_TC_04
  Scenario: User is on Home page and click on sign in
   
    When  The user clicks "Sign in"
    Then The user should be redirected to Sign in page
  