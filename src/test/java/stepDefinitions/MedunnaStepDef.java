package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaPage;
import utilities.Driver;

public class MedunnaStepDef {
    MedunnaPage medunna = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),5);
        wait.until(ExpectedConditions.visibilityOf(medunna.popUpMessage));
        Assert.assertTrue(medunna.popUpMessage.isDisplayed());
    }



}
