package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPositiveSteps {

    SaucedemoPage saucedemoPage = new SaucedemoPage();

    @Given("Kullainci login sayfasina gider")
    public void kullainciLoginSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("Kullanici kullanici kutusuna gecerli kullanici adini girer")
    public void kullaniciKullaniciKutusunaGecerliKullaniciAdiniGirer() {

        saucedemoPage.username.sendKeys(ConfigReader.getProperty("username"));

    }

    @And("Kullainci sifre kutusuna gecerli sifresini girer")
    public void kullainciSireKutusunaGecerliSifresiniGirer() {

        saucedemoPage.password.sendKeys(ConfigReader.getProperty("password"));
    }

    @And("Kullanici login butonuna tiklar")
    public void kullaniciLoginButonunaTiklar() {

        saucedemoPage.loginButton.click();
    }

    @Then("Kullanici ana sayfaya yonlenir")
    public void kullaniciAnaSayfayaYonlenir() {

        String expectedTitle= "PRODUCTS";
        Assert.assertEquals(expectedTitle, saucedemoPage.title.getText());

    }

}
