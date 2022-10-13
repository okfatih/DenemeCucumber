Feature:US1009 herokuApp Delete Test
  Scenario:Tc15 herokuapp'den delete butonu calismali
    Given User goes to "herokuAppUrl"
    Then  User click Add Element button
    Then  User waits until Delete button is visible
    And   User validates the visibility of Delete Button
    Then  User clicks on Delete button
    And   User test the visibility of Delete Button
    Then  User closes webpage