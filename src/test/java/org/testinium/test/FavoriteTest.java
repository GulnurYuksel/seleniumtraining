package org.testinium.test;

import org.junit.Test;
import org.testinium.driver.BaseTest;
import org.testinium.pages.FavoritePage;
import org.testinium.pages.LoginPage;

public class FavoriteTest extends BaseTest {
    @Test
    public void FavoriteTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        FavoritePage favoritePage = new FavoritePage();
        favoritePage.scrollAndSelect();
        favoritePage.deleteFavoriteProduct();
    }

}
