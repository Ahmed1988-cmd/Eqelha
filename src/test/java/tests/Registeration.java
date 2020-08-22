 package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.CreateAccount;
import pages.GetQuotesPage;
import pages.LoginPage;
import pages.VechileInfoPage;
import java.io.FileReader;
import java.io.IOException;

public class Registeration extends testBase

{

     CreateAccount creaAcounttObj;


                                              //First User
    private static String UserEmail;
    private static String FirstNameText;
    private static String lastnameText;
    private static String EmailText;
    private static String PasswordText;
    private static String AddressFirstNameText;
    private static String AddressLastNameText;
    private static String AddressText;
    private static String CityText;
    private static String PostCodeText;
    private static String MobileNumberText;


                                                     //Second User


    private static String UserEmail2;
    private static String SecondNameText2;
    private static String lastnameText2;
    private static String EmailText2;
    private static String PasswordText2;
    private static String AddressSecondNameText2;
    private static String AddressLastNameText2;
    private static String AddressText2;
    private static String CityText2;
    private static String PostCodeText2;
    private static String MobileNumberText2;




    private static String filePath = "C:\\Users\\ZaZa\\Desktop\\Eqelha\\src\\test\\java\\data\\testData.json";

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
        UserEmail = (String) resultObj.get("UserEmail");
        FirstNameText = (String) resultObj.get("FirstNameText");
        lastnameText = (String) resultObj.get("lastnameText");
        EmailText = (String) resultObj.get("EmailText");
        PasswordText = (String) resultObj.get("PasswordText");
        AddressFirstNameText = (String) resultObj.get("AddressFirstNameText");
        AddressLastNameText = (String) resultObj.get("AddressLastNameText");
        AddressText = (String) resultObj.get("AddressText");
        CityText = (String) resultObj.get("CityText");
        PostCodeText = (String) resultObj.get("PostCodeText");
        MobileNumberText = (String) resultObj.get("MobileNumberText");



                                                                           // second user
        UserEmail2 = (String) resultObj.get("UserEmail2");
        SecondNameText2 = (String) resultObj.get("SecondNameText2");
        lastnameText2 = (String) resultObj.get("lastnameText2");
        EmailText2 = (String) resultObj.get("EmailText2");
        PasswordText2 = (String) resultObj.get("PasswordText2");
        AddressSecondNameText2 = (String) resultObj.get("AddressSecondNameText2");
        AddressLastNameText2 = (String) resultObj.get("AddressLastNameText2");
        AddressText2 = (String) resultObj.get("AddressText2");
        CityText2 = (String) resultObj.get("CityText2");
        PostCodeText2 = (String) resultObj.get("PostCodeText2");
        MobileNumberText2 = (String) resultObj.get("MobileNumberText2");



    }

@Test (priority = 1,alwaysRun = true)
public void FirstUserCanRegister() throws  IOException, ParseException
{
    getDataForTesting();

    creaAcounttObj = new CreateAccount(driver);
    creaAcounttObj.CreateNewAccount(UserEmail);
    creaAcounttObj.PersonalInfo(FirstNameText,lastnameText,EmailText,PasswordText,AddressFirstNameText,AddressLastNameText,AddressText,CityText,PostCodeText,MobileNumberText);

 }

    @Test (priority = 2)
    public void SecondUserCanRegister() throws IOException, ParseException
    {
        getDataForTesting();

        creaAcounttObj = new CreateAccount(driver);
        creaAcounttObj.CreateNewAccount(UserEmail2);
        creaAcounttObj.PersonalInfo(SecondNameText2,lastnameText2,EmailText2,PasswordText2,AddressSecondNameText2,AddressLastNameText2,AddressText2,CityText2,PostCodeText2,MobileNumberText2);

    }



}

