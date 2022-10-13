@PracticeAmazon
Feature: Amazon Practice

  Scenario: Amazon sign in Test
    Given kullanici Amazon web sitesine gider
    And sign in butonuna tiklar
    And faker kullanarak e-posta gonderir
    And gonderdigi e-postanin ekran goruntusunu alir
    And continiue'a tiklar
    And There was a problem mesajini dogrular
    And Need help e tiklar
    And  forgot your password e tiklar
    And Password assistance metnini dogrular
    And Geri gider
    Then Create your account butonuna tiklar
    Then Create account metnini dogrular
    And sayfayi kapatir