package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.ActionUtils;

import javax.swing.*;

public class CreateAccount extends PageBase
{
    WebDriver driver;


    public CreateAccount(WebDriver driver)
    {
        super(driver);
        this.driver = driver;

        Jse = (JavascriptExecutor) driver;


    }

    @FindBy(xpath = "/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")
    WebElement SigninButton;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement EmailAddressText;
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement CreateAccountButton;
    @FindBy(id = "id_gender1")
    WebElement MrCheckBox;
    @FindBy(id = "customer_firstname")
    WebElement FirstNameText;
    @FindBy (id = "customer_lastname")
    WebElement lastnameText;
    @FindBy(id = "email")
    WebElement EmailText;
    @FindBy(id = "passwd")
    WebElement PasswordText;

    //YOUR ADDRESS

    @FindBy(name = "firstname")
    WebElement AddressFirstNameText;
    @FindBy(name = "lastname")
    WebElement AddressLastNameText;
    @FindBy(name = "address1")
    WebElement AddressText;
    @FindBy(name = "city")
    WebElement CityText;
    @FindBy(id = "id_state")
    WebElement StateDrpDown;
    @FindBy(id = "postcode")
    WebElement PostCodeText;
    @FindBy(id = "phone_mobile")
    WebElement MobileNumberText;
    @FindBy(id = "submitAccount")
    WebElement RegisterButton;



    public void CreateNewAccount(String mail)
    {
        ActionUtils.clickOnElement(driver, SigninButton);
        ActionUtils.fillElement(driver, EmailAddressText, mail);
        ActionUtils.clickOnElement(driver, CreateAccountButton);


    }


    public void PersonalInfo(String FirstName,String LastName,String Email,String Pass , String AddressFirstName ,String AddressLastName,String Address,String City,String PostCode,String MobileNumber)

    {
        boolean result = ActionUtils.verifyPageOpened(driver,MrCheckBox,30);

        if (result)
        {
            ActionUtils.clickOnElement(driver,MrCheckBox);
            ActionUtils.fillElement(driver,FirstNameText,FirstName);
            ActionUtils.fillElement(driver,lastnameText,LastName);
            ActionUtils.fillElement(driver,EmailText,Email);
            ActionUtils.fillElement(driver,PasswordText,Pass);
            ActionUtils.fillElement(driver,AddressFirstNameText,AddressFirstName);
            ActionUtils.fillElement(driver,AddressLastNameText,AddressLastName);
            ActionUtils.fillElement(driver,AddressText,Address);
            ActionUtils.fillElement(driver,CityText,City);
            select = new Select(StateDrpDown);
            select.selectByVisibleText("Alabama");
            ActionUtils.fillElement(driver,PostCodeText,PostCode);
            ActionUtils.fillElement(driver,MobileNumberText,MobileNumber);
            ActionUtils.clickOnElement(driver,RegisterButton);


        }

        else
        {
            System.out.println("Not Found");
            Assert.assertFalse(result);
        }
    }


}
