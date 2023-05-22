package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    @FindBy(id = "reg_username")
//    @FindBy(xpath = "//input[@id='reg_username']")
    private WebElement usernameReg;
    @FindBy(id = "reg_email")
    private WebElement emailReg;
    @FindBy(id = "reg_password")
    private WebElement passwordReg;
    @FindBy(xpath = "//button[@name='register']")
    private WebElement registerButton;
    @FindBy(xpath = "//a[text()='Log out']")
    private WebElement logout;
    @FindBy(id = "username")
    private WebElement usernameOrEmail;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginButton;
    @FindBy(xpath = "//a[text()='Addresses']")
    private WebElement addresses;
    @FindBy(xpath = "//a[text()='Account details']")
    private WebElement accountDetails;
    @FindBy(xpath = "//a[text()='Orders']")
    private WebElement orders;

    @FindBy(xpath = "//p//a[text()='Log out']")
    private WebElement logoutButton;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public void fillRegisterForm(String usernameValue, String emailValue, String passwordValue) {
        usernameReg.sendKeys(usernameValue);
        emailReg.sendKeys(emailValue);
        passwordReg.sendKeys(passwordValue);
        registerButton.click();
//        validatePage("The url is not correct!", "https://shop.demoqa.com/my-account/");
    }

    public void fillLoginForm(String usernameValue, String passwordValue) {
        usernameOrEmail.sendKeys(usernameValue);
        password.sendKeys(passwordValue);
        loginButton.click();
//        validatePage("The url is not correct!", "https://shop.demoqa.com/my-account/");
    }

    public void logout() {
        logout.click();
    }

    public void goToAddresses() {
        addresses.click();
    }

    public void goToOrders() {
        orders.click();
    }

    public void validateAccount(){
        Assert.assertEquals("Account validated","Log out", logout.getText());
    }

    @Override
    public void validatePage(String message, String url) {
        super.validatePage(message, url);
    }

}
