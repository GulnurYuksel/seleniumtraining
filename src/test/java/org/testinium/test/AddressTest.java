package org.testinium.test;

import org.junit.Test;
import org.testinium.driver.BaseTest;
import org.testinium.pages.AddressPage;
import org.testinium.pages.BasketPage;
import org.testinium.pages.LoginPage;

public class AddressTest extends BaseTest {

    @Test
    public void address(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        BasketPage basketPage = new BasketPage();
        basketPage.goTobasket();
        basketPage.quantity();
        AddressPage addressPage = new AddressPage();
        addressPage.setAddress();
    }
}
