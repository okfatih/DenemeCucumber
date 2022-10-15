package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuAppPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class HerOkuStepDefinitions {
    HerokuAppPage heroku = new HerokuAppPage();
    @Given("User goes to {string}")
    public void userGoesTo(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }
    @Then("User clicks addRemove button")
    public void userClicksAddRemoveButton() {
heroku.AddRemoveElements.click();
    }

    @Then("User click Add Element button")
    public void userClickAddElementButton() {
        heroku.addElements.click();
    }

    @Then("User waits until Delete button is visible")
    public void userWaitsUntilDeleteButtonIsVisible() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(heroku.deleteButtonu));
    }

    @And("User validates the visibility of Delete Button")
    public void userValidatesTheVisibilityOfDeleteButton() {
        assert !heroku.deleteButtonu.isDisplayed();
    }

    @Then("User clicks on Delete button")
    public void userClicksOnDeleteButton() {
        heroku.deleteButtonu.click();
    }



    @And("User tests the nonvisibility of Delete Button")
    public void userTestsTheNonvisibilityOfDeleteButton() {
        assert !heroku.deleteButtonu.isDisplayed();
    }


}
