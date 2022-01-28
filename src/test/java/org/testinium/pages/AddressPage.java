package org.testinium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testinium.methods.Methods;

public class AddressPage {

    Methods methods;
    Logger logger = LogManager.getLogger(AddressPage.class);

    public AddressPage(){
        methods = new Methods();
    }
    public void setAddress(){
        methods.click(By.xpath("//a[@href='#tab-shipping-new-adress']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//table[@class='form ']//input[@value='1']"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-firstname-companyname"), "Ayşe");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-lastname-title"), "Yıldız");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("address-country-id"), "Türkiye");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("address-zone-id"), "İstanbul");
        methods.waitBySeconds(3);
        methods.selectByText(By.id("address-county-id"), "KADIKÖY");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("district"), "Cumhuriyet");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-address-text"), "Halk Cad. Neşe Sok. No:20");
        methods.scrollWithAction(By.id("address-tax-id"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-telephone"), "2163334455");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("address-mobile-telephone"), "5555555555");
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(5);
        String errorMessage = methods.findElement(By.xpath("//span[@class='error']")).getText();
        String expectMessage = "Kart sahibinin adı boş bırakılamaz!";
        Assert.assertEquals(errorMessage,expectMessage);
        //System.out.println("Error: " + errorMessage);
        logger.info("Error: " + errorMessage);
    }

}
