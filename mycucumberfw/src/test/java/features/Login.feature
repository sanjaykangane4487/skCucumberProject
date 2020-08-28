Feature: Sanjay Business requirement

@smoke 
Scenario: Verify that user can see balance on home page 
	Given user is on netbanking landing page  
	When user login into application with "newuser1" and "newpassword" 
	And cards are displayed 
	
@regression 
Scenario: Verify that user can see balance on home page 
	Given user is on netbanking landing page 
	When user login into application with "newuser" and "newpassword1" 
	And cards are displayed
	
	
@smoke
Scenario: 3Verify that user can see balance on home page 
	Given user is on netbanking landing page 
	When user login into application with "newuser2" and "newpassword" 
	And cards are displayed 
	
@regression 
Scenario: Verify that user can see balance on home page 
	Given user is on netbanking landing page 
	When user login into application with "newuser" and "newpassword2" 
	And cards are displayed 
	
@smoke 
Scenario: Verify that user can see balance on home page 
	Given user is on netbanking landing page 
	When user login into application with "newuser" and "newpassword" 
	And cards are displayed 
	
@regression 
Scenario: Verify that user can see balance on home page 
	Given user is on netbanking landing page 
	When user login into application with "newuser3" and "newpassword" 
	And cards are displayed 
	
@smoke 
Scenario: Verify that user can see balance on home page 
	Given user is on netbanking landing page 
	When user login into application with "newuser" and "newpassword3" 
	And cards are displayed 
	
@regression 
Scenario: Verify that user can see balance on home page 
	Given user is on netbanking landing page 
	When user login into application with "newuser4" and "newpassword" 
	And cards are displayed 
	
@smoke 
Scenario Outline: Test that user is able to login into app 
	Given user is on netbanking landing page 
	When user login into application with <username> and <password> 
	Then Home page is displayed with below details 
		|sanjay|vinayak|kangane|Ganeshheritage|411012|Pune|
	And cards are displayed 
	
	Examples: 
		|username|password|
		|username1|password1|
		|username2|password2|
		|username3|password3|
