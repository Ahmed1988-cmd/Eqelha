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


    public void LoginPage(String mail , String pass ) throws InterruptedException
    {
//        Thread.sleep(3000);
//        ClickOn(SignUpHomePage);
        ActionUtils.clickOnElement(driver,SignUpHomePage);

//        Thread.sleep(3000);
//        ClickOn(LoginButton);
        ActionUtils.clickOnElement(driver,LoginButton);

       // Thread.sleep(3000);
        //FillElement(EmailTextField,mail);
        ActionUtils.fillElement(driver,EmailTextField,mail);
        ActionUtils.fillElement(driver,PasswordTexttField,pass);
        //FillElement(PasswordTexttField,pass);

//        Thread.sleep(3000);
//        ClickOn(LoginButton2);
        ActionUtils.clickOnElement(driver,LoginButton2);

        //Thread.sleep(3000);
        // HomePage GetQoutes
        //ClickOn(GetQoutes);
        ActionUtils.clickOnElementUsingJavaScript(driver,GetQoutes);
        Thread.sleep(15000);



    }
}
