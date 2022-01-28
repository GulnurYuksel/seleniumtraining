package org.testinium.test;

import org.junit.Test;
import org.testinium.driver.BaseTest;
import org.testinium.pages.HomePage;
import org.testinium.pages.LoginPage;
import org.testinium.pages.ProductPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.textControlTest();
    }

}
