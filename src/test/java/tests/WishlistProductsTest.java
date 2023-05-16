package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ShopPage;
import pages.WishlistPage;
import webDriver.ShareData;

public class WishlistProductsTest extends ShareData {

    @Test
    public void wishlistProductTest() {
        HomePage homePage = new HomePage(webDriver);
        homePage.goToMyAccount();
        MyAccountPage myAccountPage = new MyAccountPage(webDriver);
        myAccountPage.fillLoginForm("toro toro", "dfsghagjh");

        ShopPage shopPage = new ShopPage(webDriver);
        String shopUrl = "https://shop.demoqa.com/shop/";
        webDriver.get(shopUrl);
        shopPage.validatePage("The shop url is wrong!", shopUrl);

        shopPage.addProductsToWishlist();
        shopPage.goToWishlist();

        WishlistPage wishlistPage = new WishlistPage(webDriver);
        String wishlistUrl = "https://shop.demoqa.com/wishlist/";
        wishlistPage.validatePage("The wishlist url is not correct!", wishlistUrl);

        wishlistPage.checkWishlistItems();

    }
}
