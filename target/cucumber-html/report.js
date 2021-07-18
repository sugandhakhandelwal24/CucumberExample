$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "Description: This feature will be used to login the Simplilearn Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify that when user enters correct username and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@PositiveLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User is on the Simplilearn application",
  "keyword": "Given "
});
formatter.step({
  "name": "User click on the login link",
  "keyword": "When "
});
formatter.step({
  "name": "User enters correct username \"\u003cUserName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters correct password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be landed to the homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "User should see the welcome message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "sk24@yopmail.com",
        "Password@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that when user enters correct username and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@PositiveLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Simplilearn application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsdef.user_is_on_the_simplilearn_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsdef.user_click_on_the_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters correct username \"sk24@yopmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_enters_correct_username_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters correct password \"Password@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_enters_correct_password_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsdef.user_should_be_landed_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the welcome message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_should_see_the_welcome_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify that when user enters correct username and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User is on the Simplilearn application",
  "keyword": "Given "
});
formatter.step({
  "name": "User click on the login link",
  "keyword": "When "
});
formatter.step({
  "name": "User enters correct username \"\u003cUserName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters correct password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be landed to the homepage",
  "keyword": "Then "
});
formatter.step({
  "name": "User should see the welcome message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "suggu24@yopmail.com",
        "Password@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify that when user enters correct username and password they should be able to login successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFeature"
    },
    {
      "name": "@NegativeLogin"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Simplilearn application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepsdef.user_is_on_the_simplilearn_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepsdef.user_click_on_the_login_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters correct username \"suggu24@yopmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_enters_correct_username_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters correct password \"Password@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_enters_correct_password_something(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_clicks_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be landed to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsdef.user_should_be_landed_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the welcome message",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepsdef.user_should_see_the_welcome_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});