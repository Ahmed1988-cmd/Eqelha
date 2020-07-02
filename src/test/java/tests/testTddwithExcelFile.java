package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasicInfo;
import pages.LoginPage;
import pages.VechileInfoPage;
import java.io.IOException;


public class testTddwithExcelFile extends testBase

{

    // Create Objects
    LoginPage logObj;
    BasicInfo basicObj;
    VechileInfoPage vechileObj;


    @DataProvider(name="ExcelData")
    public Object[][] UserLoginData() throws IOException {
        ExcelReader ER = new ExcelReader();
        return ER.getExcelData();

    }

    @Test(priority = 1, alwaysRun = true, dataProvider = "ExcelData")
    public void userCanLoginSuccefully(String Email , String Paswordd,String sequance,String VehicleEstimatedValue) throws InterruptedException
    {

       logObj = new LoginPage(driver);
       logObj.LoginPage(Email, Paswordd);

       basicObj = new BasicInfo(driver);
       basicObj.basicInfoPage(sequance);
       vechileObj =new VechileInfoPage(driver);
       vechileObj.VechileInfoPage(VehicleEstimatedValue);

    }

}