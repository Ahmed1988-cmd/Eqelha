package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ActionUtils;

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
  @FindBy(xpath = "//button[@type='submit']")
    WebElement ContinueToVechileInfoPage;


    //3rd Screen VechileInfoPage
    @FindBy(xpath = "//input[@formcontrolname='vehicleValue']")
    WebElement VehicleEstimatedValue;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement GetQoutesVehicleButton;


    public void VechileInfoPage (String vechile) throws InterruptedException

    {
      Thread.sleep(3000);
       ScrollDown();
       ScrollDown();
       ActionUtils.clickOnElement(driver,ContinueToVechileInfoPage);
       ActionUtils.fillElement(driver,VehicleEstimatedValue,vechile);
       ScrollDown();
       ActionUtils.clickOnElement(driver,GetQoutesVehicleButton );
       Thread.sleep(15000);

    }

}
