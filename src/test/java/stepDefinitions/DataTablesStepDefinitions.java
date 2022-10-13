package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorDataTablesPage;

public class DataTablesStepDefinitions {
    EditorDataTablesPage edt = new EditorDataTablesPage();
    @Then("User  clickson newButton")
    public void user_clickson_new_button() {
        edt.newButton.click();

    }
    @Then("Enters {string} for name")
    public void enters_for_name(String firstName) {
        edt.firstName.sendKeys(firstName);
    }
    @Then("Enters {string} for lastName")
    public void enters_for_last_name(String lastName) {
       edt.LastName.sendKeys(lastName);
    }
    @Then("Enters {string} for position")
    public void enters_for_position(String position) {
     edt.position.sendKeys(position);
    }
    @Then("Enters {string} for office")
    public void enters_for_office(String office) {
        edt.office.sendKeys(office);
    }
    @Then("Enters {string} for extension")
    public void enters_for_extension(String extension) {
        edt.exension.sendKeys(extension);
    }
    @Then("Enters {string} for startDate")
    public void enters_for_start_date(String startDate) {
       edt.startDate.sendKeys(startDate);
    }
    @Then("Enters {string} for salary")
    public void enters_for_salary(String salary) {
        edt.salary.sendKeys(salary);
    }
    @And("User clicks on create button")
    public void userClicksOnCreateButton() {
        edt.createButton.click();

    }
    @When("User searches with the {string}")
    public void userSearchesWithThe(String firstName) {
        edt.search.sendKeys(firstName);

    }


    @Then("User validates {string} the  on names part")
    public void userValidatesTheOnNamesPart(String firstName) {
        Assert.assertTrue(edt.aramaSonucilkElement.getText().contains(firstName));
    }
}
