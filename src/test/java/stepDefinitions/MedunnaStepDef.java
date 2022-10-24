package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MedunnaPage;

public class MedunnaStepDef {
    MedunnaPage medunna = new MedunnaPage();

    @Given("User clicks on sign in button to login")
    public void user_clicks_on_sign_in_button_to_login() {
        medunna.accountSymbol.click();
        medunna.signInbutton.click();

    }

    @Given("User enters {string}")
    public void user_enters(String username) {
    medunna.userName.sendKeys(username);

    }
    @Then("Kullanici {string} girer")
    public void kullaniciGirer(String sifre) {
        medunna.passWord.sendKeys(sifre);

    }


    @Then("User clicks signin button")
    public void userClicksSigninButton () {
        medunna.signIn2.click();
    }
    @Then("User verifies that text \"Authentication information not correct is visible")
    public void user_verifies_that_text_authentication_information_not_correct_is_visible() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
