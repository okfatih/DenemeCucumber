

Feature: US1003 User should be able to use config file with a parameter


  @config
  Scenario: TestCase04 Use of parameteres with config file
    Given User is on "amazonUrl"
    And   User waits for 3 seconds
    And  User verifies that url includes "amazon"
    Then User closes the webpage