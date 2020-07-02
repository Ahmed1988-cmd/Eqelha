package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VechileInfoPage extends PageBase

{
    public VechileInfoPage(WebDriver driver) {
        super(driver);
        Jse = (JavascriptExecutor) driver;
    }


    @FindBy(xpath = "//input[@formcontrolname='vehicleValue']")
    WebElement VehicleEstimatedValue;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement GetQoutesVehicleButton;


    public void VechileInfoPage (String vechile) throws InterruptedException

    {

        FillElement(VehicleEstimatedValue,vechile);
        Thread.sleep(3000);
        ScrollDown();
        ClickOn(GetQoutesVehicleButton);


    }

}
