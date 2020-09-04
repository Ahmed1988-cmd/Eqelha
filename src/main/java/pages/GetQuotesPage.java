package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ActionUtils;

public class GetQuotesPage extends PageBase

{
    WebDriver driver;

    public GetQuotesPage(WebDriver driver)

    {
        super(driver);

        this.driver = driver;
        Jse = (JavascriptExecutor) driver;

    }


    @FindBy(xpath = "/html/body/app-root/app-base/div/app-quotes-list/section/div/div[3]/div[1]/div/div[3]/div[3]/button")
    WebElement BuyQouteButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement checkBoxButton;


    public void GetQoutesPage() throws InterruptedException
    {
        Boolean result = ActionUtils.verifyPageOpened(driver, checkBoxButton, 60);
        if (result)
        {

            ActionUtils.clickOnElement(driver, BuyQouteButton);
            ScrollDown();
            ActionUtils.clickOnElement(driver,checkBoxButton);

        }
        else
        {
            System.out.println("Time OUT!!!!");
            Assert.assertFalse(result);

        }

    }


}
