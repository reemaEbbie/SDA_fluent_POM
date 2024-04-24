package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver ldriver;
    public HomePage(WebDriver gdriver){
        ldriver=gdriver;
    }
    By headerByTagName = By.tagName("h1");

    public void verifyHeaderContent(){
        String header=ldriver.findElement(headerByTagName).getText();
        Assert.assertTrue(header.contains("Your Account Has Been Created!"));
    }
}