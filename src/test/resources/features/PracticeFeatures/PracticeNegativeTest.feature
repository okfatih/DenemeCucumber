Feature: medunna login negative test

  Scenario Outline: Negative login test

    Given User goes to "medunnaUrl"
    And    User clicks on sign in button to login
    And   User enters "<username>"
    Then  Kullanici "<sifre>" girer
    Then User clicks signin button
    Then  User verifies that text "Authentication information not correct is visible
    Examples:
      | username | password |
      | asd      | lsdas    |
      | username | password |


