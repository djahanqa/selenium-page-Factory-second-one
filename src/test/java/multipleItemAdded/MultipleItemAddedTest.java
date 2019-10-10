package multipleItemAdded;

import base.ScriptBase;

import controller.MultipleItemAddedPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleItemAddedTest extends ScriptBase {
    MultipleItemAddedPage multipleItemAddedPage;


    @BeforeTest
    public void beforetest() { init();
    }


    @Test
    public void verifycartpage()throws InterruptedException{
        log.info("  ** Verified cart page ** Test Starts");
        multipleItemAddedPage = new MultipleItemAddedPage(driver);
        multipleItemAddedPage.itemAdded(driver);
        log.info(" ** verified cart page** Test Ends");

    }

    @Test
    public void verifyQuanity()throws InterruptedException{
        log.info("  ** Verified quantity of the item ** Test Starts");
        multipleItemAddedPage =new MultipleItemAddedPage(driver);
        multipleItemAddedPage.changeQuantity(driver);
        log.info(" ** verified quantity of the item** Test Ends");
    }

    @Test

    public void verifyChangeSize(){
        log.info("  ** veried size change** Test Starts");
        multipleItemAddedPage =new MultipleItemAddedPage(driver);
        multipleItemAddedPage.changeSize(driver);
        log.info(" ** veried size change ** Test Ends");

    }



    @AfterTest
    public void closebrowser(){
//        driver.close();
//        driver.quit();

    }

}