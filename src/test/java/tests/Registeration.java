package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Registeration extends testBase{

    LoginPage logObj;
    private static String userName;
    private static String password;
    private static String userName2;
    private static String password2;
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
         userName = (String) resultObj.get("userName");
         password = (String) resultObj.get("password");
//         userName2 = (String) resultObj.get("userName2");
//         password2 = (String) resultObj.get("password2");
    }



@Test
public void UserCanRegisteration() throws InterruptedException, IOException, ParseException {
    logObj = new LoginPage(driver);
    getDataForTesting();
    logObj.LoginPage(userName,password);
    //logObj.LoginPage(userName2,password2);
}


}