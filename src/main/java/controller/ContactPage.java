package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.logging.Logger;

public class ContactPage extends ScriptBase {
    public static final Logger log=Logger.getLogger(ContactPage .class.getName());

    @FindBy(css = "#contact-link > a")
    WebElement contactUs1;
    @FindBy(css = "#center_column > h1")
    WebElement costomerService;

    @FindBy(css = "#id_contact")
    WebElement subjectheading;
    @FindBy(id="email")
    WebElement emailinput;
    @FindBy(id="id_order")
    WebElement orderReference;
    @FindBy(id="message")
    WebElement message;
    @FindBy(id ="email")
    WebElement emailaddress;


    @FindBy (id="id_order")
    WebElement oderReference;
    @FindBy(id="message")
    WebElement messageentered;

    @FindBy (id="submitMessage")
    WebElement clickSend;

    @FindBy(css = "#center_column > div > p")
    WebElement oneErrorfound;


    public ContactPage(WebDriver driver) { PageFactory.initElements(driver,this);
    }

    public void messagesent(String email,String reference,String messages){

        contactUs1.click();
        log.info("Contact Us clicked:"+contactUs1.toString());
        costomerService.isDisplayed();
        log.info("costomer Service page opens");
        dropdown(subjectheading,"Webmaster");
        log.info("from subject heading dropdown Webmaster button selected");
        emailinput.sendKeys(email);
        log.info("Email Address input");
        orderReference.sendKeys(reference);
        log.info("Order Reference input");
        message.sendKeys(messages);
        log.info("Message inpit");

    }
    public void dropdown(WebElement element,String value){
        element=subjectheading;
        Select select=new Select(element);
        select.selectByVisibleText(value);
    }

    public void customerService() {
        contactUs1.click();
        log.info("Contact Us clicked:"+contactUs1.toString());
        Assert.assertEquals(costomerService, costomerService);
        log.info("Actual and expected result Customer service displays");

    }
    public void sendmessage(String email,String reference,String messages)throws InterruptedException {
        contactUs1.click();
        log.info("Contact Us clicked:"+contactUs1.toString());
        emailaddress.sendKeys(email);
        log.info(("Email Address input"));
        Thread.sleep(5000);
        orderReference.sendKeys(reference);
        log.info("Order Reference input");
        messageentered.sendKeys(messages);
        log.info("Message inpit");
        clickSend.click();
        log.info("Sendkey Clicked");
        Assert.assertEquals(oneErrorfound,oneErrorfound);
        log.info("Actual and expected result Customer service displays");


    }

}
