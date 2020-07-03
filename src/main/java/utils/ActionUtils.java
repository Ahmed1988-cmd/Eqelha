package utils;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionUtils {


                                // click on Element
    public static void clickOnElement(WebDriver driver, WebElement element)

    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            //element = wait.until(ExpectedConditions.visibilityOf(element));
            while (!element.isDisplayed()) {
                element = wait.until(ExpectedConditions.visibilityOf(element));
            }
            element.click();

        } catch (Exception e) {

            System.err.println(e.getMessage());
            System.err.println("Error, Could not find Clickable Element.");
        }
    }


                                     // Method For FillElement
    public static void fillElement(WebDriver driver, WebElement element, String text) {

        if (text != null || text.equalsIgnoreCase(""))


        {

            WebDriverWait wait = new WebDriverWait(driver, 60);
            //element = wait.until(ExpectedConditions.visibilityOf(element));
            try {
                while (!element.isDisplayed()) {
                    element = wait.until(ExpectedConditions.visibilityOf(element));
                }
                element.clear();
                element.sendKeys(text);

            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error, Could not find visible element to enter text into it ");
            }
        } else {
            System.out.println("The entered Text is null or empty.");
        }
    }


                          //Method for click On Element  UsingJavaScript
    public static void clickOnElementUsingJavaScript(WebDriver driver, WebElement element)

    {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        try {
            while (!element.isDisplayed()) {
                element = wait.until(ExpectedConditions.visibilityOf(element));
            }
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

        } catch (Exception e) {
            System.err.println("Error, Could not find Clickable Element with JS");
        }
    }
}
