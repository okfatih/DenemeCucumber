Feature: US1005 User employs parameters
  @parametre
  Scenario: TC6 User can login with a parameter
    Given User goes to "blueCars" website
    Then  User clicks on login button
    Then User enters wrong email
    And  Kullanici 1 saniye bekler
    Then User enter wrong password
    And  Kullanici 1 saniye bekler
    And  User verifies that login was not successfull
    Then User closes webpage


