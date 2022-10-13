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
    @Given("User searches for {string}")
    public void user_searches_for(String wordTobeSearched) {
        amazonPage.aramaKutusu.sendKeys(wordTobeSearched,Keys.ENTER);
    }
    @Given("User verifies that search results include {string}")
    public void user_verifies_that_search_results_include(String wordTobeSearched) {
        Assert.assertTrue(amazonPage.aramaSonucu.getText().contains(wordTobeSearched));

    }

    @Given("User is on {string}")
    public void user_is_on(String goWebPage) {
        Driver.getDriver().get(ConfigReader.getProperty(goWebPage));

    }

    @Then("User waits for {int} seconds")
    public void user_waits_for_seconds(Integer secondss) {
        try {
            Thread.sleep(secondss*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Then("User verifies that url includes {string}")
    public void user_verifies_that_url_includes(String GoUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(GoUrl));


    }

}
