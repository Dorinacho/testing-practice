package tests;

import org.junit.Test;
import pages.*;
import webDriver.ShareData;

public class CreateLoginAccountTest extends ShareData {

    @Test
    public void createLoginAccount() {
        HomePage homePage = new HomePage(webDriver);
        homePage.goToMyAccount();
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        String myAccountUrl = "https://shop.demoqa.com/my-account/";
        myAccountPage.validatePage("MyAccount page url is wrong", myAccountUrl);
        myAccountPage.fillRegisterForm("toro toro", "toro@ro.com", "dfsghagjh");
        myAccountPage.validatePage("Register page url is wrong", myAccountUrl);
        myAccountPage.logout();
        myAccountPage.fillLoginForm("toro toro", "dfsghagjh");
        myAccountPage.validatePage("Login page url is wrong", myAccountUrl);
        myAccountPage.goToAddresses();
        AdressesPage addressesPage = new AdressesPage(webDriver);
        String addressesUrl = "https://shop.demoqa.com/my-account/edit-address/";
        addressesPage.validatePage("Addresses page url is wrong", addressesUrl);
        addressesPage.goToBillingForm();
        BillingPage billingPage = new BillingPage(webDriver);
        billingPage.fillForm("Dorin","Suciu", "Ramada","Romania",
                "14, Infratirii", "buidling 3, suite 14", "Sarmas",
                "Mures", "547295","0743425635", "d@suciu.com");
        addressesPage.goToShippingForm();
        ShippingPage shippingPage = new ShippingPage(webDriver);
        shippingPage.fillForm("Dorin","Suciu", "Ramada","Romania",
                "14, Infratirii", "buidling 3, suite 14", "Sarmas",
                "Mures", "547295");
    }
}
