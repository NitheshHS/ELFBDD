Feature: Login feature
  user can login to the app by entering the email and their password
  
  Scenario: As a valid user I will login to the app using valid credentials
  	Given  I will launch browser
  	And Enter the url
  	When home page is displayed I will click on sign in 
  	And enter email and password
  	And click on sign in
  	Then User name should be displayed or not
  	
  Scenario: As a user I will enter invalid credentials for login it should show error message
  	Given  I will launch browser
  	And Enter the url
  	When home page is displayed I will click on sign in
  	And enter invalid email "nithesh@gmail.com" and invalid password "abc"
  	And click on sign in
  	Then error message should be displayed "Invalid password."
  	
  	
