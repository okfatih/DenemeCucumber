Feature: medunna login negative test

  Scenario Outline: Negative login test

    Given User goes to "medunnaUrl"
    And    User clicks on sign in button to login
    And   User waits for 1 seconds
    And   User enters "<username>"
    And   User waits for 2 seconds
    Then  Kullanici "<sifre>" girer
    Then User clicks signin button
    Then  User verifies that text "Authentication information not correct is visible
    Examples:
      | username | password |
      | asd      | lsdas    |
      | username | password |


