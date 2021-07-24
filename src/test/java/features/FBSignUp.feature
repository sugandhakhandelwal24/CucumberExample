@SignUpFeature
Feature: Sign Up feature
Description: This feature will be used to create a new account in facebook

Scenario Outline: Verify that user is able to sign up successfully by creating a new account

Given User is on the facebook page
When User clicks on Create New Account button
And User enters firstname "<FirstName>"
And User enters lastname "<LastName>"
And User enters mobile number "<MobileNum>"
And User enters new password "<Password>"
And User selects month "<Month>"
And User selects date "<Date>"
And User selects year "<Year>"
And User selects gender "<Gender>"
And User click on Sign up button
Then User should see the success message

Examples:
| FirstName | LastName | MobileNum | Password | Month | Date | Year | Gender |
| Sugandha | Khandelwal | 9197117102343 | Password@123 | Jul | 24 | 1992 | Female |

	@DataTable
  Scenario: Verify that user is able to create the new account using cucumber datatable
    Given User has launched the FB application
    When User clicks on the Create New Account Link
    And User creates the new account
      | Field      | Value      |
      | FirstNaame | Raj        |
      | LastName   | Sharma     |
      | MobileNum  | 9999999999 |
      | Password   | abc@abc123 |
    And User click on the SignUp button
    Then user should be able to see the success message

