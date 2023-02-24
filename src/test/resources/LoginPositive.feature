Feature: Kullanici login sayfasina bilgilerini girer ve ana sayfaya gecis yapar

  Background:
    Given Kullainci login sayfasina gider

    # Keyword Driven Testing
    @regression
    @smokeTest
    @login
    @positive
      # Asagidaki sekilde kullanıcının davranışlarını tanımlayan geliştirmeye BDD yani Behavior Driven Development denir.
    Scenario: Kullanici gecerli kullanici adi ve sifresi ile login islemini gerceklestirebilmelidir
      When Kullanici kullanici kutusuna gecerli kullanici adini girer
      And Kullainci sifre kutusuna gecerli sifresini girer
      And Kullanici login butonuna tiklar
      Then Kullanici ana sayfaya yonlenir