Feature: US012 ClassWork

  Scenario Outline: TC01_Kullanici sutun basligi ile liste alabilmeli
    Given User goes to "guruUrl"
    And    Kullanici "<Basliklar>" sutunundaki tum degerleri yazdirir
   Then User closes webpage
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

