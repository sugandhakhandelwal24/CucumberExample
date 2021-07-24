Feature: This feature will help to do the calculator functionality

  Background: 
  Given Calculator application is already open

  Scenario: Add two numbers
    When I add two numbers "2" and "5"
    Then I should get the result as "7"

  Scenario: Multiply two numbers
    When I multiply two number "5" and "4"
    Then I should get the result "20"
