package org.testinium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginPage {

    Methods methods;
    Logger logger = LogManager.getLogger(LoginPage.class);
    public LoginPage(){
        methods = new Methods();
    }
    public void login(){
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.waitBySeconds(5);
        methods.sendKeys(By.id("login-email"),"gulnuryuksel96@gmail.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-password"),"1q2w3e4rT");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.ky-login-btn"));
        methods.waitBySeconds(7);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));

    }
    public void textControlTest(){ //Login Kontrolü
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println(text);
        logger.info("Alınan text: " + text);
        methods.waitBySeconds(3);
    }
}
