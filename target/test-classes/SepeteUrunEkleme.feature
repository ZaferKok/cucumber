Feature: Kullanıcı sepete bir urun ekeler ve sepet simgesi uzerinde bu urun sayısındaki artisi görür

  Background:
    Given Kullanici ana sayfaya gider

  @smoke
  Scenario: Sepete bir ürün eklenince sepet simegesi üzerindeki sayı bir artsın.

    When Kullanici Cookies ile ilgili onayi kabul eder
    And Kullanici ust menu bardan Pricing linkine tiklar
    And Kullanici bir paketi buy now butonu ile sepete ekler
    And Kullanici ana sayfaya tekrar geri gider
    Then  Kullanici sepet simgesi uzerindeki rakami dogrular
