package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPage extends BasePage {
    @FindBy(id = "shipping_first_name")
    private WebElement firstName;
    @FindBy(id = "shipping_last_name")
    private WebElement lastName;
    @FindBy(id = "shipping_company")
    private WebElement company;
    //    @FindBy(id = "shipping_country")
    @FindBy(id = "select2-shipping_country-container")
    private WebElement selectCountry;
    @FindBy(className = "select2-search__field")
    private WebElement selectInput;
    @FindBy(id = "shipping_address_1")
    private WebElement houseNrAndStreet;
    @FindBy(id = "shipping_address_2")
    private WebElement apartment;
    @FindBy(id = "shipping_city")
    private WebElement city;
    @FindBy(id = "select2-shipping_state-container")
    private WebElement county;
    @FindBy(id = "shipping_postcode")
    private WebElement postcode;
    @FindBy(css = " button[name='save_address']")
    private WebElement saveAddress;
    public ShippingPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(String firstNameValue, String lastNameValue, String companyValue, String countryValue,
                         String houseAndStreetValue, String apartmentValue, String cityValue, String countyValue,
                         String postcodeValue) {
        firstName.clear();
        lastName.clear();
        company.clear();
        houseNrAndStreet.clear();
        apartment.clear();
        city.clear();
        postcode.clear();
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
        saveAddress.click();
    }
}
