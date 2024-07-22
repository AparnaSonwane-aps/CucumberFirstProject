Feature: To test Google functionality

Scenario: Validate google search is working

Given browser is open
And user is on google search page
When user enters a text in search box
And hits enter
Then user should navigate to result page

