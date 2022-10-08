Feature: UserStry1001 User does a search on Amazon webpage
  Background: common step
    Given User is on Amazon

  @nutella
  Scenario: TestCase01 User searches the Nutella on Amazon

    Then User searches for Nutella
    Then User verifies that search results include Nutella
    And User closes the webpage

    @java
    Scenario: TestCase02 User searches the Java on Amazon
      Then User searches for Java
      And User verifies that search results include Java
      And User closes the webpage