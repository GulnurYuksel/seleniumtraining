package org.testinium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testinium.methods.Methods;

public class HomePage {

    Methods methods;
    public HomePage(){
        methods = new Methods();

    }
    public void home(){
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));

    }
    public void logOut(){
        methods.click(By.cssSelector(".checkout-logo"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.cssSelector(".menu.top.login"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//a[.='Çıkış']"));
        methods.waitBySeconds(5);
    }
}
