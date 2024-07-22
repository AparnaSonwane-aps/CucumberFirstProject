Feature: To test login functionality of Swag Lab

Scenario: User is able to login successfully with valid credentials

Given User is on login page
When User enters <username> and <password>
And User click on login button
Then User is navigated to homepage

Examples:
|username|password|
|standard_user|secret_sauce | 

 
