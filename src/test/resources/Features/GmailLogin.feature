Feature: Test Gmail login functionality

Scenario Outline: Check login is successful with valid credentials

Given browser is open
And user is on login page
When user enter <username> and <password>
And user clicks on login
Then user is navigated to the home page

Examples: 
| username | password |
| as.sonwane28@gmail.com|KrutikaKK@321|
