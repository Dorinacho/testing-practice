package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPage extends BasePage{
    public BillingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "billing_first_name")
    private WebElement firstName;
    @FindBy(id = "billing_last_name")
    private WebElement lastName;
    @FindBy(id = "billing_company")
    private WebElement company;
    //    @FindBy(id = "billing_country")
    @FindBy(id = "select2-billing_country-container")
    private WebElement selectCountry;
    @FindBy(className = "select2-search__field")
    private WebElement selectInput;

    @FindBy(id = "billing_address_1")
    private WebElement houseNrAndStreet;
    @FindBy(id = "billing_address_2")
    private WebElement apartment;
    @FindBy(id = "billing_city")
    private WebElement city;
    @FindBy(id = "select2-billing_state-container")
    private WebElement county;
    @FindBy(id = "billing_postcode")
    private WebElement postcode;
    @FindBy(id = "billing_phone")
    private WebElement phone;
    @FindBy(id = "billing_email")
    private WebElement email;
    @FindBy(css = " button[name='save_address']")
    private WebElement saveAddress;

    public void fillForm(String firstNameValue, String lastNameValue, String companyValue, String countryValue,
                         String houseAndStreetValue, String apartmentValue, String cityValue, String countyValue,
                         String postcodeValue, String phoneValue, String emailValue) {
        firstName.clear();
        lastName.clear();
        company.clear();
        houseNrAndStreet.clear();
        apartment.clear();
        city.clear();
        postcode.clear();
        phone.clear();
        email.clear();
        firstName.sendKeys(firstNameValue);
        lastName.sendKeys(lastNameValue);
        company.sendKeys(companyValue);
        selectCountry.click();
        selectInput.sendKeys(countryValue);
        selectInput.sendKeys(Keys.ENTER);
        houseNrAndStreet.sendKeys(houseAndStreetValue);
        apartment.sendKeys(apartmentValue);
        city.sendKeys(cityValue);
        county.click();
        selectInput.sendKeys(countyValue);
        selectInput.sendKeys(Keys.ENTER);
        postcode.sendKeys(postcodeValue);
        phone.sendKeys(phoneValue);
        email.sendKeys(emailValue);
        saveAddress.click();
    }

}
