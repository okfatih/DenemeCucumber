package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@id='nav-link-accountList']")
    public  WebElement topSignIn;
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucu;

    @FindBy (xpath = ("//*[@id=\"CardInstanceuYRpF8aABZjLaqr20zoLFw\"]/div/div/a/span"))
    public WebElement belowSignIn;

    @FindBy (xpath = ("//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']"))
    public WebElement table;

    @FindBy (xpath = "//html")
    public WebElement homepage;
}
