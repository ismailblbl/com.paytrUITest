package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage {

    public homePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='dropdown-toggle'])[2]")
    public WebElement application;

    @FindBy(xpath = "//*[text()='Hemen Başvur']")
    public WebElement applyNow;

    @FindBy(id = "bsr_frm_website")
    public WebElement website;

    @FindBy(id = "merchant_type")
    public WebElement selectedMerchant;

    @FindBy(xpath = "//*[text()='Şahıs İşletmesi']")
    public WebElement selectIsletme;


}


