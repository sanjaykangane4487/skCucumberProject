Feature: Business requirement is to verify user is able to search vegetables using search box and user can add it to card. 

Background: 
	Given user is on Greencart landing page 
	
Scenario: Search for item and validate result 
	When user searches for "Cucumber" vegetable 
	Then "Cucumber" results are displayed 
	
Scenario: Search for item and validate result 
	When user searches for "Brinjal" vegetable 
	Then "Brinjal" results are displayed 
	And user clicks on plus sign 
	And user clicks on Add to cart button 
	And user click on cart and proceed to checkout 
	And user verifies "Brinjal" has been added in cart 
	
 