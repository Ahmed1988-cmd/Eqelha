package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.BasicInfo;
import pages.LoginPage;
import pages.VechileInfoPage;
import java.io.FileReader;
import java.io.IOException;

public class Registeration extends testBase{

    LoginPage logObj;
    BasicInfo basicObj;
    VechileInfoPage vecObj;


    private static String userName;
    private static String password;
    private static String sequenceNumber;
    private static  String vechiclNumber;


    private static String userName2;
    private static String password2;
    private static String sequenceNumber2;

    private static String filePath = "C:\\Users\\Muhamed.Hawam\\Desktop\\bawbty-master\\src\\test\\java\\data\\testData.json";

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
        sequenceNumber = (String) resultObj.get("sequenceNumber");
       vechiclNumber = (String) resultObj.get("vechiclNumber");


        // Secound User
        userName2 = (String) resultObj.get("userName2");
        password2 = (String) resultObj.get("password2");
        sequenceNumber2 = (String) resultObj.get("sequenceNumber2");


    }

@Test (priority = 1,alwaysRun = true)
public void UserCanRegisteration() throws InterruptedException, IOException, ParseException
{
    getDataForTesting();

    logObj = new LoginPage(driver);
    logObj.LoginPage(userName,password);

    basicObj =new BasicInfo(driver);
    basicObj.basicInfoPage(sequenceNumber);

   vecObj = new VechileInfoPage(driver);
   vecObj.VechileInfoPage(vechiclNumber);


 }

//    @Test (priority = 2 )
//    public void UserCanRegisteration2() throws InterruptedException, IOException, ParseException
//    {
//        getDataForTesting();
//
//        logObj = new LoginPage(driver);
//        logObj.LoginPage(userName2,password2);
//
//        basicObj =new BasicInfo(driver);
//        basicObj.basicInfoPage(sequenceNumber2);
//
//    }

}