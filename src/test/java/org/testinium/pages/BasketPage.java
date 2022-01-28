package org.testinium.pages;

import org.openqa.selenium.By;
import org.testinium.methods.Methods;

public class BasketPage {
    Methods methods;

    public BasketPage(){
        methods = new Methods();

    }
    public void goTobasket(){
        methods.click(By.id("sprite-cart-icon"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(3);
    }
    public void quantity(){
        methods.clearQuantity(By.xpath("//input[@name='quantity']"));
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//input[@name='quantity']"),"3");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".fa.fa-refresh"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".right > .button"));
        methods.waitBySeconds(5);
    }
}
