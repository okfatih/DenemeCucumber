package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BluerentalcarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueCarsStepDefinition {
    BluerentalcarPage brc = new BluerentalcarPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("User goes to BlueCars website")
    public void user_goes_to_blue_cars_website() {
        Driver.getDriver().get(ConfigReader.getProperty("blueCars"));

    }
    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        brc.login.click();

    }
    @Then("User enters wrong email")
    public void user_enters_wrong_email() throws InterruptedException {

        brc.email.sendKeys(ConfigReader.getProperty("wrongEmail"));
    }
    @Then("User enter wrong password")
    public void user_enter_wrong_password() throws InterruptedException {

      brc.pass.sendKeys(ConfigReader.getProperty("wrongPass"));
    }
    @Then("User verifies that login was not successfull")
    public void user_verifies_that_login_was_not_successfull() {
        Assert.assertTrue(brc.failedLogin.isDisplayed());

    }

    @Given("User goes to {string} website")
    public void user_goes_to_website(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }
    @Then("Kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer seconds) {

        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
    @Then("User closes webpage")
    public void user_closes_webpage() {
        Driver.closeDriver();
    }

}
