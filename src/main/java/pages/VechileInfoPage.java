package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionUtils;

import java.time.Clock;

public class VechileInfoPage extends PageBase

{
    WebDriver driver;

    public VechileInfoPage(WebDriver driver)

    {
        super(driver);
        this.driver=driver;

        Jse = (JavascriptExecutor) driver;
    }


    // Click To Continue to 3rd Screen
    @FindBy(xpath = "/html/body/app-root/app-base/div/app-get-quote/section/div/div/div[2]/app-user-info/form/button[2]")
    WebElement ContinueToVechileInfoPage;


    //3rd Screen VechileInfoPage
    @FindBy(xpath = "//input[@formcontrolname='vehicleValue']")
    WebElement VehicleEstimatedValue;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement GetQoutesVehicleButton;


    public void VechileInfoPage (String vechile) throws InterruptedException

    {
        boolean result  = ActionUtils.verifyPageOpened(driver,ContinueToVechileInfoPage,60);
       if(result) {
           ScrollDown();
           ActionUtils.clickOnElement(driver, ContinueToVechileInfoPage);

           ActionUtils.fillElement(driver, VehicleEstimatedValue, vechile);
           ScrollDown();
           ActionUtils.clickOnElement(driver, GetQoutesVehicleButton);

       }
       else
       {
           System.out.println("Time OUT!!!!");
           Assert.assertFalse(result);

       }
    }

}
