package tests;

import org.junit.Test;
import pages.*;
import webDriver.ShareData;

public class CartProductsTest extends ShareData {

    @Test
    public void cartProductsTest() {
        HomePage homePage = new HomePage(webDriver);
        homePage.goToMyAccount();
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.fillLoginForm("toro toro", "dfsghagjh");

        ShopPage shopPage = new ShopPage(webDriver);
        String shopUrl = "https://shop.demoqa.com/shop/";
        webDriver.get(shopUrl);
        shopPage.validatePage("The shop url is wrong!", shopUrl);

        shopPage.addProductToCart(1, 1, 1);
        shopPage.addProductToCart(2, 1, 2);
        shopPage.addProductToCart(3, 1, 1);
        shopPage.goToCart();

        CartPage cartPage = new CartPage(webDriver);
        String cartUrl = "https://shop.demoqa.com/cart/";
        cartPage.validatePage("The url for MyAccount is wrong!", cartUrl);
        cartPage.checkCartItems();
        cartPage.goToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(webDriver);
        String checkoutUrl = "https://shop.demoqa.com/checkout/";
        checkoutPage.validatePage("Checkout link is wrong", checkoutUrl);
        checkoutPage.acceptTerms();
        checkoutPage.placeOrder();

        OrderReceivedPage orderReceivedPage = new OrderReceivedPage(webDriver);
        orderReceivedPage.goToMyAccount();

        OrdersPage ordersPage = new OrdersPage(webDriver);
        String ordersUrl = "https://shop.demoqa.com/my-account/orders/";
        ordersPage.validatePage("Orders link is wrong", ordersUrl);
    }

}
