@computer
Feature: Computer Page Test
  As a user i should Build my own computer successfully

  Background:
  As a user i should be navigate to home page
    Given I am on Home page
    When I Click on Computer Tab


  Scenario: As a user I should navigate to Computer page Successfully.

    Then  I should able to verify "Computers" text

  Scenario: As a user I should navigate to Desktops page Successfully.

    When I click on Desktop Tab
    Then I should able to Verify "Desktops" text

  Scenario Outline: As a user I able to build my own computer successfully
    When I click on Desktop Tab
    And I  click on "Build your own computer"
    And I  select processor "<processor>"
    And I  Select RAM "<ram>"
    And I  Select HDD "<hdd>"
    And I  Select OS "<os>"
    And I  Select Software "<software>"
    And I  click on ADD TO CART Button
    Then I should be able to verify message"The product has been added to your shopping cart"

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |