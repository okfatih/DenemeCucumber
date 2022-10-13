#Amazon sayfasima gidip siasiyla nuella java  elma armut aratıp sonuçların arama
  # yaptığımız kelimeyi içerdiğini test edelim
Feature: US1007 User searches multiple words
  Scenario Outline: TC1007 searching Amazon List Elements
    Given User is on "amazonUrl"
    Then  User searches for "<wordToBeSearched>"
    And   User verifies that search results include "<wordToBeSearchedKontrol>"
    And User closes webpage

    Examples:
      |wordToBeSearched|wordToBeSearchedKontrol|
    |nutella         |nutella                |
    |java            |java                   |
    |elma            |elma                   |
    |armut           |armut                  |

