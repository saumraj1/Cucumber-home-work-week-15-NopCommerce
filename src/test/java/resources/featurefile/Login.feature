Feature: Login Test
  As a user I want to login into nop commerce website
  @smoke@regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should able to see "Welcome, Please Sign In!"
  @sanity@regression
  Scenario: User Should LogOut SuccessFully
    Given I am on homepage
    When I click on login link
    And I enter email "nidhilakhani2598@gmail.com"
    And I enter password "Nidhi123"
    And I click on login button
    Then I should login successfully
    And I should be able to see "Log out" option
  @sanity@regression
  Scenario: verify That User Should LogInSuccessFully WithValid Credentials
    Given I am on homepage
    When I click on login link
    And I enter email "nidhilakhani2598@gmail.com"
    And I enter password "Nidhi123"
    And I click on login button
  @regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
    Login was unsuccessful. Please correct the errors and try again.\nNo customer account found
      | email         | password |                                  errorMessage                                               |
      | abc@gmail.com | abc1234  | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz@yahoo.com | yhp1203  | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | ncp@ymail.com | 123220a  | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |