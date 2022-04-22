package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.QuestionsClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.String;
import org.json.*;
import pages.RegisterPage;

import java.io.FileReader;

public class TestFaq {
    WebDriver driver;
    QuestionsClass faq ;
    RegisterPage register;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        faq = new QuestionsClass(driver);
        register = new RegisterPage(driver);
    }
    @Test
    public void openQuestionsPage() throws IOException, ParseException {
        driver.manage().window().maximize();
        faq.openTa3limyDashboard();
        faq.openfaqPage();
         }
    public  void assertTitlePageMeetFaq() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("TestDataFiles/commonQs.json");
        Object obj = jsonParser.parse(reader);
        String title = faq.title();
        Assert.assertEquals(title , "obj.commonQuestions.titleOfPage");
    }
    @Test
    public void RegistrationData(){
        register.openRegitrationPage();
        register.selectParentRole();
        register.selectParenAge();
        register.selectEgyptianResident();
        register.SubmitData();
        register.clickOnUseingMobile();
        register.setFirstName("safaa");
        register.setLastName("ithm");
        register.setMobileNumber("01155447788");
        register.setGender();
        register.setPassword("Safaa123456");
        register.ConfirmationOfPassword("Safaa123456");
        register.acceptButton();
        register.submitData();
    }
   /* @Test(description = "create new account")
    public void createNewAccount() throws IOException, ParseException {
        faq.backToRegisterPage();
        JSONParser jsonParser= new JSONParser();
        FileReader fileReader = new FileReader("TestDataFiels/commonQs.json");
//Read Json file
        Object obj = jsonParser.parse(fileReader);
        JSONObject jsonObject = (JSONObject)obj;
        for (int i =0;i<Array.size();i++){
            JSONObject address = (JSONObject) array.get(i);

            String firstname = (String) address.get("safa");
            String lastname = (String) address.get("othman");
            String mobile = (String) address.get("01122336655");


        }*/

}
