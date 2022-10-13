Feature: US1005 User can't login blueCars with wrong credentials
  Scenario: TC5 User tries to login with wrong username and password
    Given User goes to BlueCars website
    Then User clicks on login button
    Then User enters wrong email
    And  User enter wrong password
    And User verifies that login was not successfull
    Then User closes webpage