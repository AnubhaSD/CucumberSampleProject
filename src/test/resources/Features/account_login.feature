
Feature: Login page automation


Scenario: User can login to application
 Given User is on login page
 When user provide "<username>" and "<password>"
 Then click on login button
 
	
    
Examples:
 |username									| password		|
 |standard_user							|secret_sauce	|
 #|problem_user							|secret_sauce	|
 #|error_user								|secret_sauce	|
 #|performance_glitch_user		|secret_sauce	|
 
 



