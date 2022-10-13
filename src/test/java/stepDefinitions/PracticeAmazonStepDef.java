package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class PracticeAmazonStepDef {
    AmazonPage amazonPage = new AmazonPage();


    @Given("kullanici Amazon web sitesine gider")
    public void kullanici_amazon_web_sitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Given("sign in butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
      amazonPage.topSignIn.click();

    }
    @Given("faker kullanarak e-posta gonderir")
    public void faker_kullanarak_e_posta_gonderir() {


    }

    @Given("continiue'a tiklar")
    public void continiue_a_tiklar() {

    }
    @Given("There was a problem mesajini dogrular")
    public void there_was_a_problem_mesajini_dogrular() {

    }
    @Given("Need help e tiklar")
    public void need_help_e_tiklar() {

    }
    @Given("forgot your password e tiklar")
    public void forgot_your_password_e_tiklar() {

    }
    @Given("Password assistance metnini dogrular")
    public void password_assistance_metnini_dogrular() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() {
    }
    @Given("Geri gider")
    public void geri_gider() {

    }
    @Then("Create your account butonuna tiklar")
    public void create_your_account_butonuna_tiklar() {

    }
    @Then("Create account metnini dogrular")
    public void create_account_metnini_dogrular() {

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }


}
