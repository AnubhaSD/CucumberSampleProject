
@test2
Feature: CheckOut the items

Background: 
Given User is on login page
When user provide username and password
 	|username									| password		|
	|standard_user							|secret_sauce	|
Then click on login button
 

 

Scenario: User can checkout the items 
Given user is navigated to the home page
When user clicks on the filter high to low
And adds first two items
And clicks on the cart
And user is navigated to the cart
And user clicks on checkout button
And provide the user information
	|firstname| lastname| zip		|
	| Kunal 	| D				| 95054	|
And press continue button
And user is navigated to next page
Then user clicks on finish


