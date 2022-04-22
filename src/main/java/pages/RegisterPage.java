package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    // variables
    WebDriver driver;
    //constructor
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }
    // locators
    By registerButton =By.xpath("//a[@class='css-11bzo0h erkcdwb4']") ;
    By parentButton = By.id("parent");
    By parenAge = By.xpath("//input[@value='أقل من 25 سنة']");
    By egyptianResident =By.id("true");
    By submitButton = By.xpath("//button[@type='submit']");
    By mobileButton = By.xpath("//a[@class='css-1tllzea eb3wk1e5']");
    By firstName =By.xpath("//input[@name='firstName']");
    By lastName =By.xpath("//input[@name='lastName']");
    By mobileNumber =By.xpath("//input[@name='mobileNumber']");
    By gender =By.xpath("//input[@name='gender']");
    By password =By.xpath("//input[@name='password']");
    By passwordConfirmation =By.xpath("//input[@name='passwordConfirmation']");
    By acceptButton = By.xpath("//label[@for='termsAndConditionsCheck']");
    By submit =By.xpath("//input[@type='submit']");

    // keywords/ actions
    public void openRegitrationPage(){
        driver.findElement(registerButton).click();
    }
    public void selectParentRole(){
        driver.findElement(parentButton).click();
    }
    public void selectParenAge()
    {
        driver.findElement(parenAge).click();
    }
    public void selectEgyptianResident(){
        driver.findElement(egyptianResident).click();
    }
    public void SubmitData(){
        driver.findElement(submitButton).click();
    }
    public void clickOnUseingMobile(){
        driver.findElement(mobileButton).click();
    }
    public void setFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }
    public void setLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void setMobileNumber(String mobile){
        driver.findElement(mobileNumber).sendKeys(mobile);
    }
    public void setGender(){
        driver.findElement(gender).click();
    }
    public void setPassword(String password1){
        driver.findElement(password).sendKeys(password1);
    }
    public void ConfirmationOfPassword(String passwordConfirm){
        driver.findElement(passwordConfirmation).sendKeys(passwordConfirm);
    }
     public void acceptButton(){
        driver.findElement(acceptButton).clear();
    }
    public void submitData(){
        driver.findElement(submit).click();
    }

}
