@practiceForm
Feature: Form doldurma

  Scenario Outline: Practice form doldurma


    Given User goes to "testPageUrl" _
    When username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
    And bir dosya yukler
    And checkbox1 i secer
    And radio2 yi secer
    And selection item3 secer
    And dropdown itmem4 secer
    And submite tiklar
    Then dosyanin yuklendigini dogrular

    Examples:
      | kullanici adi | sifre | metin alani |
      | k.adi         | sifre | metin       |
      | k.adi         | sifre | metin       |
      | k.adi         | sifre | metin       |
