package org.testinium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testinium.methods.Methods;

import java.util.Random;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage(){
        methods = new Methods();
    }
    public void catalog(){
        methods.click(By.cssSelector(".common-sprite[href='puan-katalogu']"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//div[@class='sort']/select[1]"),"Yüksek Oylama");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and text()='Tüm Kitaplar']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[.='Hobi']"));
        methods.waitBySeconds(3);
    }
    public void selectProductRand(){
        methods.selectProduct(By.cssSelector(".name.ellipsis"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("button-cart"));
        methods.waitBySeconds(3);
        methods.click(By.id("button-cart"));
        methods.waitBySeconds(3);
    }
    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println(attribute);
        logger.info("Alınan text: " + attribute);
        methods.waitBySeconds(3);
    }
    public void valueControlText(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        String value = methods.getValue(By.id("search-input"));
        System.out.println(value);
        logger.info("Alınan value: " + value);
        Assert.assertEquals("oyuncak", value);
        methods.waitBySeconds(5);
    }
}
