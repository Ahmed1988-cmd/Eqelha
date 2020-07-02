package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasicInfo extends PageBase

{
    public BasicInfo(WebDriver driver)


    {
        super(driver);
        Jse = (JavascriptExecutor) driver;
    }

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

    public void basicInfoPage (String seq) throws InterruptedException

    {
        Thread.sleep(2000);
        FillElement(SequenceNumberTextFiled,seq);
        Thread.sleep(3000);
        ClickOn(PolicyEffectiveDate);
        Thread.sleep(3000);
        ScrollDown();
        Thread.sleep(3000);
        ClickOn(Agree);
        ClickOn(ContinueButton);
        Thread.sleep(3000);
        ScrollDown();
        ClickOn(ContinueVehicleButton);


      }

}
