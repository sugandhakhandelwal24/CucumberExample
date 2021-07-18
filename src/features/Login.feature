
@LoginFeature
Feature: Login feature
Description: This feature will be used to login the Simplilearn Application

@PositiveLogin @Sanity
Scenario Outline: Verify that when user enters correct username and password they should be able to login successfully

Given User is on the Simplilearn application
When User click on the login link
And User enters correct username "<UserName>"
And User enters correct password "<Password>"
And User clicks on the login button
Then User should be landed to the homepage
And User should see the welcome message

Examples:
|UserName|Password|
|sk24@yopmail.com|Password@123|
#|sk45@yopmail.com|Password@1234|

@NegativeLogin @Sanity
Scenario Outline: Verify that when user enters correct username and password they should be able to login successfully

Given User is on the Simplilearn application
When User click on the login link
And User enters correct username "<UserName>"
And User enters correct password "<Password>"
And User clicks on the login button
Then User should be landed to the homepage
And User should see the welcome message

Examples:
|UserName|Password|
|suggu24@yopmail.com|Password@123|
#|suggu45@yopmail.com|Password@1234|
