package org.testinium.test;

import org.junit.Test;
import org.testinium.driver.BaseTest;
import org.testinium.pages.*;

public class MainTest extends BaseTest {

    @Test
    public void mainTest(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        FavoritePage favoritePage = new FavoritePage();
        ProductPage productPage = new ProductPage();
        BasketPage basketPage= new BasketPage();
        AddressPage addressPage = new AddressPage();

        homePage.home();
        loginPage.login();
        loginPage.textControlTest();
        favoritePage.scrollAndSelect();
        productPage.catalog();
        productPage.selectProductRand();
        favoritePage.deleteFavoriteProduct();
        basketPage.goTobasket();
        basketPage.quantity();
        addressPage.setAddress();
        homePage.logOut();
    }
}
