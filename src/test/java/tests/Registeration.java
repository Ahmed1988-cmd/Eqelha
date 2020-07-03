package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.BasicInfo;
import pages.LoginPage;
import java.io.FileReader;
import java.io.IOException;

public class Registeration extends testBase{

    LoginPage logObj;
    BasicInfo basicObj;

    private static String userName;
    private static String password;
    private static String nationalId;
    private static String monthOfBirth;
    private static String yearOfBirth;
    private static String sequenceNumber;


    private static String userName2;
    private static String password2;
    private static String nationalId2;
    private static String monthOfBirth2;
    private static String yearOfBirth2;
    private static String sequenceNumber2;

    private static String filePath = "C:\\Users\\ZaZa\\Desktop\\Bawabty2\\src\\test\\java\\data\\testData.json";

    /**
     * this function for reading test data from json file
     * @throws IOException
     * @throws ParseException
     */


    public void getDataForTesting() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(filePath);

        //Read JSON file
        Object dataObj = jsonParser.parse(reader);
        JSONObject resultObj = (JSONObject) dataObj;

        // First User
        userName = (String) resultObj.get("userName");
        password = (String) resultObj.get("password");
        nationalId = (String) resultObj.get("nationalId");
        monthOfBirth = (String) resultObj.get("monthOfBirth");
        yearOfBirth = (String) resultObj.get("yearOfBirth");
        sequenceNumber = (String) resultObj.get("sequenceNumber");


        // Secound User
        userName2 = (String) resultObj.get("userName2");
        password2 = (String) resultObj.get("password2");
        nationalId2 = (String) resultObj.get("nationalId2");
        monthOfBirth2 = (String) resultObj.get("monthOfBirth2");
        yearOfBirth2 = (String) resultObj.get("yearOfBirth2");
        sequenceNumber2 = (String) resultObj.get("sequenceNumber2");


    }

@Test (priority = 1,alwaysRun = true)
public void UserCanRegisteration() throws InterruptedException, IOException, ParseException
{
    getDataForTesting();

    logObj = new LoginPage(driver);
    logObj.LoginPage(userName,password);
    logObj.LoginPage(userName2,password2);

    basicObj = new BasicInfo(driver);
    basicObj.basicInfoPage(nationalId,monthOfBirth,yearOfBirth,sequenceNumber);

 }



}