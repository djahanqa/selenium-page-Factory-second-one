package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.Logger;

public class OneItemAddedToCartPage extends ScriptBase {
    public static final Logger log=Logger.getLogger(OneItemAddedToCartPage .class.getName());
    @FindBy(xpath = "//*[@id='homefeatured']//a/img[@title='Blouse']")
    WebElement blouse;
    @FindBy(xpath = "//*[@id='homefeatured']/li[2]//a[@title='Add to cart']")
    WebElement addToCart;
    @FindBy(xpath = "//*//span[@title='Continue shopping']")
    WebElement continueShopping;
    @FindBy (xpath = "//*[@id='header']//a[@title='View my shopping cart']")
    WebElement cart;
    @FindBy (css = "#button_order_cart > span")
    WebElement checkout;
    @FindBy (xpath = "//*[@id='center_column']//a[@title='Proceed to checkout']")
    WebElement proceedToCheckout;
    @FindBy (xpath = "//*[@id='columns']//span[@class='navigation_page']")
    WebElement authentication;
    @FindBy(id="email")
    WebElement email;
    @FindBy(id="passwd")
    WebElement password;
    @FindBy(xpath = "//*[@id='SubmitLogin'][@id='SubmitLogin']")
    WebElement signIn;
    @FindBy(name ="processAddress")
    WebElement proceed;

    @FindBy (id="cgv")
    WebElement agreeToTerms;

    @FindBy (xpath = "//*[@id='form']/p/button[@name='processCarrier']")
    WebElement processCarrier;



    public OneItemAddedToCartPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    public void addItemToCart(WebDriver driver,String emailAddress,String pass)throws InterruptedException {
        mouseOver(blouse,driver);
        log.info("Mouse over on blouse");
        addToCart.click();
        log.info("Clicked on add to cart");
        Thread.sleep(5000);
        continueShopping.click();
        log.info("clicked on continue shopping");
        mouseOver(cart,driver);
        log.info("mouse over on cart");
        Thread.sleep(5000);
        checkout.click();
        log.info("Clicked on check out");
        proceedToCheckout.click();
        log.info("Clicked on proceed to Check out");
        Assert.assertEquals(authentication,authentication);
        log.info("");
        email.sendKeys(emailAddress);
        log.info("Email address inout");
        password.sendKeys(pass);
        signIn.click();
        Thread.sleep(5000);
        proceed.click();
        agreeToTerms.click();
        Thread.sleep(5000);
        processCarrier.click();


    }


    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }
}