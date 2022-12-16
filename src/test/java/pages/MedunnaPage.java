package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaPage {
    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//li[@id='account-menu']")
    public WebElement accountSymbol;

    @FindBy (xpath = "//*[text()='Sign in']")
    public WebElement signInbutton;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passWord;

    @FindBy (xpath = "(//*[text()='Sign in'])[3]")
    public WebElement signIn2;

    @FindBy (xpath = "//*[contains(text(), 'Authentication information not correct.')]")
    public WebElement popUpMessage;
}
