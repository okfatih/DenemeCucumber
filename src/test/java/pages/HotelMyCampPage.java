package pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginKutusu;



    @FindBy (xpath = "//*[@id='UserName']")
    public WebElement username;

    @FindBy (xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement giris;

    @FindBy (xpath = "//div[@class='validation-summary-errors']")
    public WebElement failedLogin;
}
