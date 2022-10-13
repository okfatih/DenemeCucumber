Feature:US1008 DataTables sitesine 5 farkli giris yapalim

  @DataTable
  Scenario Outline: TC13 5 farkli kayit girisi yapilabilmeli

    When User is on "dataTablesUrl"
    Then User  clickson newButton
    Then Enters "<firstName>" for name
    And  User waits for 1 seconds
    Then Enters "<lastName>" for lastName
    And  User waits for 1 seconds
    Then Enters "<position>" for position
    And  User waits for 1 seconds
    Then Enters "<office>" for office
    And  User waits for 1 seconds
    Then Enters "<extension>" for extension
    And  User waits for 1 seconds
    Then Enters "<start-Date>" for startDate
    And  User waits for 1 seconds
    Then Enters "<salary>" for salary
    And  User waits for 1 seconds
    And  User clicks on create button

    When User searches with the "<firstName>"
    Then User validates "<firstName>" the  on names part
    And User closes webpage

    Examples:
    |firstName|lastName|position|office|extension|start-Date|salary|
    |Alim     |Alim    |qa     |ankara | UI        |2022-10-11|10000|
    |Berk     |Kacmaz  |BA     |Berlin |api        |2022-05-11 |50000|
    |Can      |Remzi   |BA     |Bayburt|Java       |2022-12-11 |12000|
    |Rasim    |Kacan   |Sale   |Rio |Backend    |2023-10-11 |40000|
    |Masnim   |Dorf    |Tale   |Nince |Devops    |2021-07-13 |70000|