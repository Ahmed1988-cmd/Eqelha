package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionUtils;

public class BasicInfo extends PageBase {
    WebDriver driver;


    public BasicInfo(WebDriver driver) {
        super(driver);
        this.driver = driver;

        Jse = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//input[@formcontrolname='sequenceNumber']")
    WebElement SequenceNumberTextFiled;

    @FindBy(id = "mat-radio-19")
    WebElement PolicyEffectiveDate;

    @FindBy(xpath = "/html/body/app-root/app-base/div/app-get-quote/section/div/div/div[2]/app-basic-info/form/div/div[4]/mat-checkbox/label/div\n")
    WebElement Agree;

    @FindBy(xpath = "//section[@id='get-quote']//app-basic-info[@class='ng-star-inserted']/form/button[@type='submit']")
    WebElement ContinueVehicleButton;


    public void basicInfoPage(String seq) throws InterruptedException {
        ActionUtils.fillElement(driver, SequenceNumberTextFiled, seq);
        ActionUtils.clickOnElement(driver, PolicyEffectiveDate);
        ActionUtils.clickOnElement(driver, Agree);
        ScrollDown();
        ActionUtils.clickOnElementUsingJavaScript(driver, ContinueVehicleButton);
        Thread.sleep(3000);


    }

   /*
    public void basicInfoPage( String seq) throws InterruptedException
    {
        Thread.sleep(7000);
        FillElement(SequenceNumberTextFiled,seq);
        ClickOn(PolicyEffectiveDate);
        ClickOn(Agree);
        ScrollDown();
        Thread.sleep(7000);
        ClickOn(ContinueVehicleButton);
        Thread.sleep(7000);


    }

    */

}
