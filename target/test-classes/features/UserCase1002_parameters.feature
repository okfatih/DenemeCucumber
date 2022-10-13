Feature: US1002 User searches through parameter
  @parametre
  Scenario: TestCase03 User can do a search with parameters
    Given User is on Amazon
    And User searches for "Java"
    And User verifies that search results include "Java"
    Then User closes the webpage