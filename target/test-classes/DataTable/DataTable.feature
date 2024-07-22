Feature: User Registration

Scenario: User registration with different data
Given User is on registration page
When User enters following user details
|name|email|contact|city|
|John|john@gmail.com |99999|London|
|Joy|joy@gmail.com|8888|UK|
|swati|swati@gmail.com|777777|Pune|
|Don|don@gmail.com|66666|Delhi|

Then user registration should be successful