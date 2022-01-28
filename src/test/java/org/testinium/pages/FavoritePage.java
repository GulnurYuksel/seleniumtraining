package org.testinium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testinium.methods.Methods;

public class FavoritePage {

    Methods methods;
    public FavoritePage() {
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[7]"));
        methods.waitBySeconds(3);
        for (int i=6; i<=9; i++){
            methods.likeProduct(By.xpath("//i[@class='fa fa-heart']"), i);
            methods.waitBySeconds(3);

        }
        //Favorilere eklenmiş olması kontrolu yapılır
        Assert.assertEquals(methods.getText(By.xpath("//span[.='4']")), "4");
        //Assert.assertEquals(methods.getText(By.cssSelector(".favorite-tag>span")),"4");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='logo-icon']"));
        methods.waitBySeconds(3);
    }
    public void deleteFavoriteProduct(){
        methods.scrollWithAction(By.xpath("//div[@class='menu top my-list']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[.='Favorilerim']"));
        methods.waitBySeconds(3);
        //Attribute taskı
        methods.scrollWithAction(By.xpath("//*[@class='product-cr'][3]"));
        methods.waitBySeconds(3);
        String attrFav = methods.getAttribute(By.xpath("//*[@class='product-cr'][3]"),"id");
        methods.waitBySeconds(3);
        //System.out.println(attrFav);
        String[] attrFavSplit = attrFav.split("-");
        //System.out.println(attrFavSplit[1]);
        String attrFavId = attrFavSplit[1];
        methods.click(By.xpath("//div[@class='hover-menu']//*[@onclick='removeFromFavorites("+attrFavId+");']"));
        methods.waitBySeconds(5);
    }

}
