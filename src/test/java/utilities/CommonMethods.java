package utilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CommonMethods {
    public CommonMethods(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@placeholder='Email address']")
    public WebElement EmailWebElement;
    @FindBy(xpath = "//input[@placeholder='Min. 8 Character']")
    public WebElement PasswordWebElement;
    @FindBy(xpath = "//button[@id='sign_in_btn']")
    public WebElement SignInWebElement;
    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginWebElement;
   static Actions actions=new Actions(Driver.getDriver());
    public void loginAsAdmin(String username,String password) {
            Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
            actions.click(EmailWebElement).sendKeys(ConfigReader.getProperty(username)).perform();
            actions.click(PasswordWebElement).sendKeys(ConfigReader.getProperty(password)).perform();
            actions.click(SignInWebElement).perform();
        }
    public void loginAsUser(String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        actions.click(EmailWebElement).sendKeys(ConfigReader.getProperty(username)).perform();
        actions.click(PasswordWebElement).sendKeys(ConfigReader.getProperty(password)).perform();
        actions.click(SignInWebElement).perform();
    }
    }






