Feature:US1009 herokuApp Delete Test
  Scenario:Tc15 herokuapp'den delete butonu calismali
    Given User goes to "herOkuAppUrl"
    Then  User clicks addRemove button
    Then  User click Add Element button
    And   User waits for 1 seconds
    Then  User waits until Delete button is visible
    And   User waits for 1 seconds
    And   User validates the visibility of Delete Button
    And   User waits for 1 seconds
    Then  User clicks on Delete button
    And   User waits for 2 seconds
    And   User tests the nonvisibility of Delete Button
    Then  User closes webpage