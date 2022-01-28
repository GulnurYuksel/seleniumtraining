package org.testinium.test;

import org.junit.Test;
import org.testinium.driver.BaseTest;
import org.testinium.pages.FavoritePage;
import org.testinium.pages.HomePage;
import org.testinium.pages.LoginPage;
import org.testinium.pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.catalog();
        productPage.selectProductRand();

    }
    @Test
    public void getAttribute(){
        ProductPage productPage = new ProductPage();
        productPage.attributeTest();
    }
    @Test
    public void getValueTest(){
        ProductPage productPage = new ProductPage();
        productPage.valueControlText();
    }
}
