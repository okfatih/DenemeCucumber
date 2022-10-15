Feature: US0013 Parametre Kullanimş
  @gr6
  Scenario: TC01 Parametre Kullanimi
    Given User goes to "amazonUrl"
    Then  User waits for 2 seconds
    Then  User searches for Nutella
    And   User verifies that search results include "HamPetrol"
