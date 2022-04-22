package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuestionsClass {
    // variables
    WebDriver driver;
    String URL = "https://www.ta3limy.com/";
    //constructor
    public QuestionsClass(WebDriver driver){
        this.driver = driver;
    }
    // locators
    By faqIcon =By.id("help-menu");
    By commonQuestions = By.xpath("//li[@class='link']");
    By titlePage = By.xpath("//h1[@class='css-16plr1j e19vwfi40']");
    By loginButton = By.xpath("//a[@outline='true']");
    // keywords/ actions
    public void openTa3limyDashboard(){
        driver.navigate().to(URL);
    }
    public void openfaqPage() {
        driver.findElement(faqIcon).click();
        driver.findElement(commonQuestions).click();
    }
    public String title(){
        return driver.findElement(titlePage).getText();
    }
    public void backToRegisterPage(){
        driver.findElement(loginButton).click();
    }

}
