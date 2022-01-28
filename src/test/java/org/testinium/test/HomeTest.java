package org.testinium.test;

import org.junit.Test;
import org.testinium.driver.BaseTest;
import org.testinium.pages.HomePage;

public class HomeTest extends BaseTest {

    @Test
    public void homeTest(){
        HomePage homePage = new HomePage();
        homePage.home();

    }

}
