package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampStepDefinitions {
    HotelMyCampPage hmp = new HotelMyCampPage();
    @Given("User is on {string} webpage")
    public void user_is_on_webpage(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCamp"));
        hmp.loginKutusu.click();
    }
    @Then("User passes valid username")
    public void user_passes_valid_username() {
        hmp.giris.sendKeys(ConfigReader.getProperty("hmcValidUserName"));
    }
    @Then("User passes valid passwprd")
    public void user_passes_valid_passwprd() {

    }
    @Then("User validates that he entered the page")
    public void user_validates_that_he_entered_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
