package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionUtils;

public class LoginPage extends PageBase
{
     WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;

    }

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/div[1]/div[2]/div/a")
    WebElement SignUpHomePage;

    @FindBy(xpath = "//*[@id=\"sign-up\"]/div[1]/div/a")
    WebElement LoginButton;

    @FindBy(id = "Email")
    WebElement EmailTextField;

    @FindBy(id = "password")
    WebElement PasswordTexttField;

    @FindBy(xpath = "//button[@name='button']")
    WebElement LoginButton2;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/div[1]/div[1]/div/a[1]")
    WebElement GetQoutes;


    public void LoginPage(String mail , String pass )
    {

        ActionUtils.clickOnElement(driver,SignUpHomePage);
        ActionUtils.clickOnElement(driver,LoginButton);
        ActionUtils.fillElement(driver,EmailTextField,mail);
        ActionUtils.fillElement(driver,PasswordTexttField,pass);
        ActionUtils.clickOnElement(driver,LoginButton2);
        ActionUtils.clickOnElementUsingJavaScript(driver,GetQoutes);

    }
}
