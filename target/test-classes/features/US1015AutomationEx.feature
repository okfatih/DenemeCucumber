Feature: US1015 Kullanici giris testi
  Scenario: Kullanici sitede hesap olusturur

  
    Given User goes to "automationUrl"
    And User clicks sign in
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer  And user Register butonuna basar
    Then hesap olustugunu dogrulayin