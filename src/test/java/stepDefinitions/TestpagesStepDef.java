package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.TestCasesPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Random;

public class TestpagesStepDef {
    TestCasesPage testCases = new TestCasesPage();




    @Given("User goes to {string} _")
    public void userGoesTo_(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String userName, String pass, String textTobeSent) {
        userName = Faker.instance().name().username();
        pass = Faker.instance().internet().password();
        textTobeSent = Faker.instance().chuckNorris().fact();


        testCases.userName.sendKeys(userName);
        testCases.password.sendKeys(pass);
        testCases.commets.clear();
        testCases.commets.sendKeys(textTobeSent);


    }


    @When("bir dosya yukler")
    public void bir_dosya_yukler() {
        //testCases.chooseFile.sendKeys("C:\\Users\\Admin\\Desktop\\txtfile.txt");
        String homeDirectory = System.getProperty("user.home");
        String filepath = homeDirectory + "/Desktop/txtfile.txt";
        testCases.chooseFile.sendKeys(filepath);

    }

    @When("checkbox1 i secer")
    public void checkbox1_i_secer() {
        if (!testCases.checkbox1.isSelected()) {
            testCases.checkbox1.click();
        }
        if (testCases.checkbox2.isSelected()) {
            testCases.checkbox2.click();
        }
        if (testCases.checkbox3.isSelected()) {
            testCases.checkbox3.click();
        }
    }

    @When("radio2 yi secer")
    public void radio2_yi_secer() {
        testCases.radioButton2.click();
    }

    @When("selection item3 secer")
    public void selection_item3_secer() {
        testCases.selectItem3.click();
    }

    @When("dropdown itmem4 secer")
    public void dropdown_itmem4_secer() {

        Select select = new Select(testCases.dropDown);
        Random random = new Random();

        int rasgele = random.nextInt(select.getOptions().size() - 1);
        select.selectByIndex(rasgele);
    }

    @When("submite tiklar")
    public void submite_tiklar() {
        testCases.submitButton.click();

    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyanin_yuklendigini_dogrular() {
        Assert.assertTrue(testCases.girilenText.isDisplayed());
    }


}
