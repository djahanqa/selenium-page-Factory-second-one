package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;


public class MultipleItemAddedPage extends ScriptBase {
    public static final Logger log=Logger.getLogger(MultipleItemAddedPage .class.getName());

    @FindBy(xpath = "//*[@id='homefeatured']/li[1]//h5[@itemprop='name']")
    WebElement fadedTshirt;
    @FindBy(xpath = "//*/button[@name='Submit']")
    WebElement addtocart;

    @FindBy(xpath = "//*[@id='layer_cart']//span[@title='Continue shopping']")
    WebElement continueshopping;
    @FindBy(xpath = "//div/a[@title='View my shopping cart']")
    WebElement cartPageView;

    @FindBy(xpath = "//*[@id='header_logo']/a/img[@class='logo img-responsive']")
    WebElement homepage;

    @FindBy(xpath = "//*[@id='homefeatured']//a/img[@title='Blouse']")
    WebElement blouse;
    @FindBy(xpath = "//*[@id='homefeatured']/li[2]//a[@title='Add to cart']")
    WebElement addToCart;
    @FindBy(css = "#button_order_cart > span")
    WebElement checkout;
    @FindBy(xpath = "//*[@id='layer_cart']//a[@title='Proceed to checkout']")
    WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id='homefeatured']/li[3]/div/div[2]//a[@title='Printed Dress']")
    WebElement printedDress;

    @FindBy(css = "#//*[@id='quantity_wanted_p']//span/i[@class='icon-plus']")
    WebElement quantity;

    @FindBy(id = "group_1")
    WebElement size;


    public MultipleItemAddedPage(WebDriver driver) {

        PageFactory.initElements(driver, this);


    }
    public void itemAdded(WebDriver driver) throws InterruptedException {
        homepage.click();
        Thread.sleep(5000);
        mouseOver(fadedTshirt, driver);
        fadedTshirt.click();
        addtocart.click();
        Thread.sleep(5000);
        continueshopping.click();
        mouseOver(cartPageView, driver);
        Thread.sleep(5000);
        checkout.click();
        homepage.click();
        mouseOver(blouse, driver);
        addToCart.click();
        Thread.sleep(5000);
        proceedToCheckout.click();



    }
    public void changeQuantity(WebDriver driver) throws InterruptedException {
        homepage.click();
        log.info(" home page Button Clicked");
        mouseOver(printedDress, driver);
        log.info(" Mouseover on printed Dress");
        printedDress.click();
        log.info(" printed dress clicked");
        Thread.sleep(5000);
        looptest(driver);
        log.info(" using for loop added quantity of the shirt");


    }

    public void changeSize(WebDriver driver) {
        homepage.click();
        log.info(" home page Button Clicked");
        mouseOver(printedDress, driver);
        log.info(" Mouseover on printed Dress");
        printedDress.click();
        log.info(" printed dress clicked");
        dropdown(size, "M");
        log.info(" chose M size using drop down button");
    }

    public void dropdown(WebElement element,String value){
        element=size;
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }
    public void mouseOver(WebElement element, WebDriver driver) {
        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();

    }

    public void looptest(WebDriver driver){
        for(int i=0; i<9; i++)
            driver.findElement(By.xpath("//*[@id='quantity_wanted_p']//span/i[@class='icon-plus']")).click();}


}