package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionUtils;

public class BasicInfo extends PageBase

{
    WebDriver driver;


    public BasicInfo(WebDriver driver)

    {
        super(driver);
        this.driver = driver;

        Jse = (JavascriptExecutor) driver;
    }


    @FindBy(xpath = "//input[@formcontrolname='nationalId']")
    WebElement NationalIdTextField;

    @FindBy(xpath = "//input[@formcontrolname='monthOfBirth']")
    WebElement MonthOfBirthTextFiled;

    @FindBy(xpath = "//input[@formcontrolname='yearOfBirth']")
    WebElement YearOfBirthTextFiled;


    @FindBy(xpath = "//input[@formcontrolname='sequenceNumber']")
    WebElement SequenceNumberTextFiled;

    @FindBy(id = "mat-radio-19")
    WebElement PolicyEffectiveDate;

    @FindBy(xpath = "/html/body/app-root/app-base/div/app-get-quote/section/div/div/div[2]/app-basic-info/form/div/div[4]/mat-checkbox/label/div\n")
    WebElement Agree;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement ContinueButton;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement ContinueVehicleButton;

    public void basicInfoPage(String nationalID, String month, String year, String seq)

    {

        ActionUtils.fillElement(driver,NationalIdTextField,nationalID);
        ActionUtils.fillElement(driver,MonthOfBirthTextFiled,month);
        ActionUtils.fillElement(driver,YearOfBirthTextFiled,year);
        ActionUtils.fillElement(driver,SequenceNumberTextFiled,seq);
        ActionUtils.clickOnElement(driver,PolicyEffectiveDate);
        ActionUtils.clickOnElement(driver,ContinueButton);
        ActionUtils.clickOnElement(driver,Agree);
        ScrollDown();
        ActionUtils.clickOnElement(driver,ContinueVehicleButton);

    }

}
