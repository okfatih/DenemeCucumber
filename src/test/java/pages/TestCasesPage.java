package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestCasesPage {
    public TestCasesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='comments']")
    public WebElement commets;

    @FindBy(xpath = "//input[@name='filename']")
    public WebElement chooseFile;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement checkbox1;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkbox2;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement checkbox3;

    @FindBy(xpath = "//input[@value='rd2']")
    public WebElement radioButton2;

    @FindBy(xpath = "//option[@value='ms3']")
    public WebElement selectItem3;


    @FindBy (xpath = "//select[@name='dropdown']")
    public WebElement dropDown;


    @FindBy(xpath = "//input[@value='submit']")
    public WebElement submitButton;

    @FindBy (xpath = "//*[@id='_valuecomments']")
    public WebElement girilenText;

}



/*
//input[@name='username']
 */