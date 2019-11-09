package contact;

import base.ScriptBase;
import controller.ContactPage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ContactTest extends ScriptBase {

    ContactPage contactPage;

    @Test
    public void verifycontactus() {
        log.info("** Verify Contact Us *** Test Starts");
        contactPage= new ContactPage(driver);
        contactPage.customerService();
        log.info("** Verify Contact Us *** Test Ends");

    }
    @Test
    public void verifymessagesent() {
        log.info("** Verify Contact Us *** Test Starts");
        contactPage= new ContactPage(driver);
        contactPage.messagesent("djahan@yahoo.com","123456","hello");
        log.info("** Verify Contact Us *** Test Ends");
    }
    @Test
    public void varifySendAMessage()throws InterruptedException{
        log.info("** Verify Message Sent *** Test Starts");
        contactPage=new ContactPage(driver);
        contactPage.sendmessage("djahan@yahoo.com","123456","please take a look at my order");
        log.info("** Verify Message Sent *** Test Ends");
    }
    @AfterTest
    public void closebrowser(){
        driver.close();
        driver.quit();
    }

    @Override
    public void onTestStart(ITestContext result) {

    }
}