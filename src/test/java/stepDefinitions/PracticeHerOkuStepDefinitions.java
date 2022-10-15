package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HerokuAppPage;
import utilities.Driver;

public class PracticeHerOkuStepDefinitions {
HerokuAppPage herokuApp = new HerokuAppPage();
Actions actions = new Actions(Driver.getDriver());


    @Given("User goes to herokuapp.com styled")
    public void userGoesToHerokuappComStyled() {
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/key-click-display-test.html");
    }

    @And("User clicks click button for {int} times")
    public void userClicksClickButtonForTimes(int int1) {
        for (int i = 0; i <=int1 ; i++) {
            herokuApp.clickButton.click();

        }
    }

    @And("User clicks space button for {int} times")
    public void userClicksSpaceButtonForTimes(int int1) {
        for (int i = 0; i <=int1 ; i++) {
            actions.sendKeys(Keys.SPACE).click();

        }
    }

    @Then("Add all the two digid numbers on Down text")
    public void addAllTheTwoDigidNumbersOnDownText() {
    }

    @And("Subtract total length of all click buttons from previous total")
    public void subtractTotalLengthOfAllClickButtonsFromPreviousTotal() {
    }

    @Then("Verify that result is {int}")
    public void verifyThatResultIs(int arg0) {
    }

    @Given("User goes to https:\\/\\/testpages.herokuapp.com\\/styled\\/key-click-display-test.html")
    public void userGoesToHttpsTestpagesHerokuappComStyledKeyClickDisplayTestHtml() {

    }



}
