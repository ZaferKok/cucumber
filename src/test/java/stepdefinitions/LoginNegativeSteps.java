package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SaucedemoPage;
import utilities.ConfigReader;

public class LoginNegativeSteps {

    SaucedemoPage saucedemoPage = new SaucedemoPage();

    @When("Kullanici kullanici kutusuna gecerli kullanici adini girmelidir")
    public void kullaniciKullaniciKutusunaGecerliKullaniciAdiniGirmelidir() {

        saucedemoPage.username.sendKeys(ConfigReader.getProperty("username"));

    }

    @And("Kullainci sifre kutusuna gecersiz bir {string} girer")
    public void kullainciSifreKutusunaGecersizBirGirer(String sifre) {

        saucedemoPage.password.sendKeys(sifre);

    }

    @And("Kullanici login butonuna tiklamalidir")
    public void kullaniciLoginButonunaTiklamalidir() {

        saucedemoPage.loginButton.click();

    }

    @Then("Kullanici login hata mesaji alir ve login sayfasinda kalir")
    public void kullaniciLoginHataMesajiAlirVeLoginSayfasindaKalir() {

        Assert.assertTrue(saucedemoPage.errorMessage.isDisplayed());

    }

}
