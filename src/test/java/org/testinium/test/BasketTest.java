package org.testinium.test;

import org.junit.Test;
import org.testinium.driver.BaseTest;
import org.testinium.pages.BasketPage;
import org.testinium.pages.LoginPage;
import org.testinium.pages.ProductPage;

public class BasketTest extends BaseTest {
    @Test
    public void basket(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.catalog();
        productPage.selectProductRand();
        BasketPage basketPage = new BasketPage();
        basketPage.goTobasket();
        basketPage.quantity();
    }
}
