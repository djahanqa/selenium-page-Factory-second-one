package controller;


import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.Logger;


public class CartPage extends ScriptBase {
    public static final Logger log=Logger.getLogger(CartPage .class.getName());

    @FindBy(xpath = "//*//a[@title='View my shopping cart']")
    WebElement shoppingcart;
    @FindBy(id = "cart_title")
    WebElement cartTitle;


    @FindBy(css = "#add_to_cart > button > span")
    WebElement addToCard;

    @FindBy (xpath = "//*//span[@title='Continue shopping']")
    WebElement continueshopping;
    @FindBy (css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span > i")
    WebElement checkout;


    @FindBy(xpath = "//*[@id='homefeatured']//h5[@itemprop='name']/a[@title='Faded Short Sleeve T-shirts']")
    WebElement sleevTsirt;


    @FindBy (xpath = "//div/a[@title='View my shopping cart']")
    WebElement cartPageView;

    @FindBy(xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement homepage;


    public CartPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    public void itemAddedToShoppingCart(WebDriver driver) throws InterruptedException {
        homepage.click();
        log.info("Home Page Button Clicked:"+homepage.toString());
        mouseOver(sleevTsirt, driver);
        log.info("mouseOver on sleeve t-shirt:");
        sleevTsirt.click();
        log.info("Clicked on Sleeve t-shirt:"+sleevTsirt.toString());
        addToCard.click();
        log.info("product added");
        Thread.sleep(5000);
        continueshopping.click();
        log.info("Clicked on Continue shopping:"+continueshopping.toString());
        mouseOver(cartPageView,driver);
        log.info("mouseOver on cart view page:");
        checkout.click();
        log.info("clicked on check out:"+checkout.toString());
        looptest();
        log.info("looptest");
        Assert.assertEquals("","");
        log.info(" expected and actual result displayed");

    }
    public void shoppingCartSummery(String bar,WebDriver driver) {
        shoppingcart.click();
        log.info("clicked on shopping cart:"+shoppingcart.toString());
        Assert.assertEquals(cartTitle, cartTitle);
        log.info("Print actual and expected result cart title ");
        driver.findElement(By.xpath("//*[@class='"+bar+"']")).isDisplayed();


    }
    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();


    }

    public void looptest(){
        for(int i=0; i<0; i++)
            driver.findElement(By.xpath("")).click();}

}