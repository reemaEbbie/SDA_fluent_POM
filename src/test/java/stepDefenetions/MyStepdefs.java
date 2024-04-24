package stepDefenetions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import utilities.Driver;

public class MyStepdefs {
    @Given("The page displayed")
    public void thePageDisplayed() {
        Driver.getDriver().get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
    }

    @When("Enter valid Credentials and click continue button")
    public void enterValidCredentialsAndClickContinueButton() {
        Faker faker=new Faker();
        RegisterPage registerPage =new RegisterPage(Driver.getDriver());
        String password =faker.internet().password();
        registerPage
                .enterFirstName(faker.name().firstName())
                .enterLastName(faker.name().lastName())
                .enterEmail(faker.internet().emailAddress())
                .enterTelephone(faker.phoneNumber().phoneNumber())
                .enterPassword(password)
                .enterConfirmPassword(password)
                .clickOnTheCheckBox()
                .clickContinue();
    }

    @And("Verify the complete of the Registration")
    public void verifyTheCompleteOfTheRegistration() {
        HomePage homePage =new HomePage(Driver.getDriver());
        homePage.verifyHeaderContent();
    }

    @And("close browser")
    public void closeBrowser() {
        Driver.getDriver().close();
    }
}