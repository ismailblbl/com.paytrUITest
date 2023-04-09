package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.homePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class paytr {
    homePage homePage = new homePage();
    Actions actions = new Actions(Driver.getDriver());

    Select select;
    @Given("visitor goes to paytr homepage")
    public void visitor_goes_to_paytr_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @Given("From the Application tab, click Apply Now")
    public void from_the_application_tab_click_apply_now() {

        homePage.application.click();
        ReusableMethods.bekle(2);
        homePage.applyNow.click();

    }

    @Given("Website enters the information {string}")
    public void website_enters_the_information(String string) {
        homePage.website.sendKeys(string);
    }

    @Given("Authorized Name-Surname enters {string}")
    public void authorized_name_surname_enters(String string) {
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(string).perform();

    }

    @Given("Authorized E-Mail enters {string}")
    public void authorized_e_mail_enters(String string) {
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(string).perform();
    }

    @Given("Authorized Phone enters the information {string}")
    public void authorized_phone_enters_the_information(String string) {
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.bekle(3);
        actions.sendKeys(string).perform();
    }

    @Given("Business type enters {string}")
    public void business_type_enters(String string) {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(3);
        homePage.selectedMerchant.click();
        homePage.selectIsletme.click();
        ReusableMethods.bekle(2);

    }

    @Given("Clicks the Complete application button")
    public void clicks_the_complete_application_button() {
       Driver.quitDriver();
    }

}
