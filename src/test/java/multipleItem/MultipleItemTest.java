package multipleItem;

import base.ScriptBase;
import controller.MultipleItemAddedPage;
import controller.MultipleItemPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleItemTest extends ScriptBase {

    MultipleItemPage multipleItemPage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test

    public void verifyfadedTshirt() throws InterruptedException {
        log.info(" ** verify Faded T-shirt ** Test Starts");
        multipleItemPage = new MultipleItemPage(driver);
        multipleItemPage.multipleItemAdded("Faded Short Sleeve T-shirts", driver);
        log.info(" ** verify Faded T-shirt ** Test Ends");
    }

    @Test

    public void verifyBlouse() throws InterruptedException {
        log.info("  ** Verify Blouse ** Test Starts");
        multipleItemPage = new MultipleItemPage(driver);
        multipleItemPage.multipleItemAdded("Blouse", driver);
        log.info(" ** verify Blouse** Test Ends");
    }

    @Test

    public void verifyPrintedDressOne() throws InterruptedException {
        log.info("  ** Verify Printed Dress One** Test Starts");
        multipleItemPage = new MultipleItemPage(driver);
        multipleItemPage.multipleItemAdded("Printed Dress", driver);
        log.info("  ** Verify Printed Dress one ** Test Ends ");

    }

    @Test

    public void verifyPrintedSummerDress() throws InterruptedException {
        log.info("  ** Verify Printed SummerDress ** Test Starts");
        multipleItemPage = new MultipleItemPage(driver);
        multipleItemPage.multipleItemAdded("Printed Summer Dress", driver);
        log.info("  ** Verify Printed SummerDress ** Test Ends");
    }


    @Test

    public void verifyPrintedChiffon() throws InterruptedException {
        log.info("  ** verify PrintedChiffons ** Test Starts");
        multipleItemPage = new MultipleItemPage(driver);
        multipleItemPage.multipleItemAdded("Printed Chiffon Dress", driver);
        log.info("  ** verify PrintedChiffon ** Test Ends");

    }


    @Test
    public void verifyQuanity()throws InterruptedException{
        log.info("  ** Verify Quanity of the dresses ** Test Starts");
        multipleItemPage =new MultipleItemPage(driver);
        multipleItemPage.changeQuantity(driver,"Faded Short Sleeve T-shirts",6);
        log.info("  ** Verify Quanity of the dresses ** Test Ends");
    }

    @Test

    public void verifyChangeSize() throws InterruptedException {
        log.info("  ** erify change sizes of the dress ** Test Starts");
        multipleItemPage =new MultipleItemPage(driver);
        multipleItemPage.changeSize(driver,"Printed Dress",2,"M");
        log.info("  ** erify change sizes of the dress ** Test Ends");

    }
    public void verifyChangeSize2() throws InterruptedException {
        log.info("  ** Verify change sizes of the  dress again ** Test Starts");
        multipleItemPage =new MultipleItemPage(driver);
        multipleItemPage.changeSize(driver,"Printed Dress",2,"S");
        log.info("  ** erify change sizes of the dress again ** Test Ends");
    }

    @AfterTest
    public void closebrowser(){
//        driver.close();
//        driver.quit();

    }

}
