package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HerokuAppPage {
    public HerokuAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//*[text()='Add/Remove Elements']")
    public WebElement AddRemoveElements;



    @FindBy (xpath = "//button[@onclick='addElement()']")
    public WebElement addElements;

    @FindBy (xpath = "//button[@onclick='deleteElement()']")
    public WebElement deleteButtonu;


    @FindBy(xpath = "//input[@id='button']")
    public WebElement clickButton;

    @FindBy(xpath = "//p[.=' down 32']")
    public List<WebElement> down32;

    @FindBy(xpath = "//p[.='click']")
    public List<WebElement> clickText;
}
