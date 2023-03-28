
@Register
Feature: Register_Page
  
  @Register_001
  Scenario Outline: User launch home page of ds algo project
  Given The user opens DS Algo portal link for register test
  When The user clicks on "Register" 
  Then The user is directed to the register page
  
  @Register_002
  Scenario Outline: The user is presented with error message for empty fields below Username textbox
  Given The user is on register page
  When The user clicks "Register" button with all fields empty
  Then It should display an error "Please fill out this field" below password textbox
  
  @Register_003
  Scenario: The user is presented with error message for empty fields below Password textbox
  Given The user is on register page
  When The user clicks "Register" button after entering username with other fields empty
  				|username  |
  		   |Numpy@sdet101_1|
   
   Then It should display an error "Please fill out this field" below Password textbox
   
  @Register_004
  Scenario: The user is presented with error message for empty fields below Password Confirmation textbox
  Given The user is on register page
  When  The user clicks "Register" button after entering "username" and "password" with and   Password Confirmation field empty
      | username     | password     |
      | Numpy@sdet101_1 | testpassword |
  Then It should display an error "Please fill out this field." below Password Confirmation textbox
  
  @Register_005
  Scenario: The user is presented with error message for invalid username
  Given The user is on register page
  When  The user enters a "username" with characters other than Letters, digits and "@/./+/-/_"
      | username | password     | password confirmation |
      | &**&**&  | testpassword | testpassword          |
  Then It should display an error message "Please enter a valid username"
  
  @Register_006
  Scenario: The user is presented with error message for username already exists
  Given The user is on register page
  When The user enters a valid existing "username" with "password" and "password confirmation"
      | username     | password  | password confirmation |
      | Numpy@sdet101 | RT56YUabc | RT56YUabc  |
  Then It should display an error message "Username already exists"
  
  @Register_007
  Scenario: The user is presented with error message for password mismatch
  Given The user is on register page
  When The user clicks "Register" button after entering valid "username" and different passwords in "password" and "password confirmation" fields
      | username     | password     | password confirmation |
      | Numpy@sdet101_1 | testpassword | testpassword1   | 
  Then It should display an error message "password_mismatch:The two password fields didn’t match."
  
  @Register_008
 Scenario: The user is presented with error message for password with only numbers
  Given The user is on register page
  When  The user enters a valid "username" and "password" with only numbers
     
      | username     | password | password confirmation |
      | Numpy@sdet101_1 | 12345678 | 12345678 |
  Then It should display an error message "Password can’t be entirely numeric."
  
  @Register_009
  Scenario: The user is presented with error message for password too similar to the username
  Given The user is on register page
  When  The user enters a valid "username" and "password" similar to username
    
      | username     | password   | password confirmation |
      | Numpy@sdet101_1 | testsdet101 | testsdet101       |
  Then It should display an error message "password can’t be too similar to your other personal information."
  
  @Register_010
  Scenario: The user is succesfully able to register 
  Given The user is on register page
  When  The user enters a valid "username" and "password" and "password confirmation"
      
      | username     | password  | password confirmation |
      | Numpy@sdet101_15 | testsdet101 | testsdet101 |
  Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"
  When The user clicks on sign out
  Then The user is signed out

 