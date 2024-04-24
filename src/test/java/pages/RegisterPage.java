package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    By firstNameById = By.id("input-firstname");
    By lastNameById = By.id("input-lastname");
    By emailById = By.id("input-email");
    By telephoneById = By.id("input-telephone");
    By passwordById = By.id("input-password");
    By confirmPasswordById = By.id("input-confirm");
    By continueByXpath =By.xpath("//input[@value='Continue']");
    By checkBoxById = By.xpath("//*[contains(@class,'custom-checkbox')]");

    WebDriver ldriver;
    public RegisterPage(WebDriver gdriver){
        ldriver=gdriver;
    }


    public RegisterPage enterFirstName(String firstName){
        ldriver.findElement(firstNameById).sendKeys(firstName);
        return this;
    }
    public RegisterPage enterLastName(String lastName){
        ldriver.findElement(lastNameById).sendKeys(lastName);
        return this;
    }
    public RegisterPage enterEmail(String email){
        ldriver.findElement(emailById).sendKeys(email);
        return this;
    }
    public RegisterPage enterTelephone(String telephone){
        ldriver.findElement(telephoneById).sendKeys(telephone);
        return this;
    }
    public RegisterPage enterPassword(String password){
        ldriver.findElement(passwordById).sendKeys(password);
        return this;
    }

    public RegisterPage enterConfirmPassword(String password){
        ldriver.findElement(confirmPasswordById).sendKeys(password);
        return this;
    }
    public RegisterPage clickOnTheCheckBox(){
        ldriver.findElement(checkBoxById).click();
        return this;
    }

    public HomePage clickContinue(){
        ldriver.findElement(continueByXpath).click();
        return new HomePage(ldriver);
    }


}