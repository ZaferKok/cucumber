Feature: Kullanici login sayfasina bilgilerini girer ve ana sayfaya gecis yapar

  Background:
    Given Kullainci login sayfasina gider

    @login
    @negative
    Scenario Outline: Kullanici gecersiz kullanici adi veya sifresi ile login islemini gerceklestirememelidir

      When Kullanici kullanici kutusuna gecerli kullanici adini girmelidir
      And Kullainci sifre kutusuna gecersiz bir "<sifre>" girer
      And Kullanici login butonuna tiklamalidir
      Then Kullanici login hata mesaji alir ve login sayfasinda kalir
      # Asagida Kullandigimiz tablo yöntemi ile DDT yani Data Driven Testing yapmis oluyoruz.
      Examples:
        |sifre   |
        |ka.4512!|
        |Ka4512! |
        |Ka.asdc!|
        |Ka.4512,|

