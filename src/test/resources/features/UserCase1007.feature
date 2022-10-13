Feature: US1007 Concort Hotels Login
  Scenario: TC12 User logins with valid credentials
    Given User is on "HMCUrl" webpage
    Then  User clicks on login button
    And   User passes valid username
    And   User passes valid passwprd
    Then  User clicks on login button
    And   User validates that he entered the page
    Then  User closes webpage