Feature: Register Test
  As a user I want to Register successfully

  Background:
    Given I am on homepage
    When I click on register link

  Scenario: verify User Should Navigate To Register Page Successfully
    Then I should be able to navigate to the registration page
    And I should be able to see "Register" page title

  Scenario: User should not be able to register with any empty mandatory field
    Given I click on register button
    When I didn't enter First Name "FirstName"
    Then I should able to see message "First name is required."
    When I didn't enter Last Name "LastName"
    And I should able to see message "Last name is required."
    When I didn't enter Email "Email"
    And I should able to see message "Email is required."
    When I didn't enter Password "Password"
    And I should able to see message "Password is required."
    When I didn't enter Confirm Password "ConfirmPassword"
    And I should able to see message "Password is required."

  Scenario: As a user I should create Account Successfully
    When  I click on register link
    And I Select gender "Female"
    And I Enter firstname "nidhi"
    And I Enter lastname "patel"
    And I Select day "3"
    And I Select month "July"
    And I Select year "1986"
    And I Enter email "roma.patel1@yahoo.com"
    And I Enter password "java1234"
    And I Enter  confirm  password "java1234"
    And I Click On REGISTER button
    Then I should be able to verify message "Your registration completed"

#    Examples:
#
#      | field           | errorMessage            |
#      | FirstName       | First name is required. |
#      | LastName        | Last name is required.  |
#      | Email           | Email is required.      |
#      | Password        | Password is required.   |
#      | ConfirmPassword | Password is required.   |

