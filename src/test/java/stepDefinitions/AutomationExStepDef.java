package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationPracticePage;

public class AutomationExStepDef {
AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    @Given("User clicks sign in")
    public void user_clicks_sign_in() {
       automationPracticePage.signinButtonu.click();
    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {

    }
    @And("user Create and account bolumune email adresi girer")
    public void userCreateAndAccountBolumuneEmailAdresiGirer() {

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer  And user Register butonuna basar")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer_and_user_register_butonuna_basar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
