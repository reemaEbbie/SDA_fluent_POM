package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class Driver {

    private static RemoteWebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            //driver=new ChromeDriver();
            driver=new ChromeDriver(); //--> to switch from Selenium  to Selenium Grid

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        }
        return driver;
    }
}