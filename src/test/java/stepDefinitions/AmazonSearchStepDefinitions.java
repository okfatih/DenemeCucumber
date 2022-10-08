package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonSearchStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();
    @Given("User is on Amazon")
    public void user_is_on_amazon() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @Then("User searches for Nutella")
    public void user_searches_for_nutella() {
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
    }
    @Then("User verifies that search results include Nutella")
    public void user_verifies_that_search_results_include_nutella() {
        Assert.assertTrue(amazonPage.aramaSonucu.getText().contains("Nutella"));
    }
    @Then("User closes the webpage")
    public void user_closes_the_webpage() {

    }
    @Then("User searches for Java")
    public void user_searches_for_java() {
        amazonPage.aramaKutusu.sendKeys("Java"+ Keys.ENTER);
    }
    @Then("User verifies that search results include Java")
    public void user_verifies_that_search_results_include_java() {
        Assert.assertTrue(amazonPage.aramaSonucu.getText().contains("Java"));
    }


}
