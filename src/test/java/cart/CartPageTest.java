package cart;
import base.ScriptBase;
import controller.CartPage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reporting.ExtentsReporting.ExtentTestManager;

import java.net.MalformedURLException;

public class CartPageTest extends ScriptBase {

    CartPage cartPage;


    @Test(alwaysRun = true,priority = 1,description = "verify cart page Test")
    public void verifycartpage(){
        ExtentTestManager.startTest("verifycartpage","This is test");
        log.info("** Verify cart page *** Test Starts");
        cartPage=new CartPage(driver);
        cartPage.shoppingCartSummery("step_current  first",driver);
        log.info("** Verify cart page *** Test Ends");
    }
    @Test(alwaysRun = true,priority = 2,description = "verify cart Signing Bar")
    public void verifycartSigningBar() {
        ExtentTestManager.startTest("verifycartSigningBar","");
        log.info("** Verify Cart Siging Bar *** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo second",driver);
        log.info("*** Verify Cart Siging Bar *** Test Ends");
    }

    @Test(alwaysRun = true,priority = 3,description = "verify cart AddressBar")
    public void verifycartAddressBar() {
        ExtentTestManager.startTest("verifycartAddressBar","");
        log.info("** Verify Cart Address Bar *** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo third",driver);
        log.info("** Verify Cart Address Bar  *** Test Ends");
    }

    @Test(alwaysRun = true,priority = 4,description = "verify cartS hoppingBar")
    public void verifycartShoppingBar() {
        ExtentTestManager.startTest("verifycartShoppingBar","");
        log.info("** Verify Shopping Cart Bar*** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo four",driver);
        log.info("** verify Shopping Cart Bar *** Test Ends");
    }

    @Test(alwaysRun = true,priority = 5,description = "verify cart PaymentBar")
    public void verifycartPaymentBar() {
        ExtentTestManager.startTest("verifycartPaymentBar","");
        log.info("** Verify Cart Payment Bar *** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo last",driver);
        log.info("** Verify Cart Payment Bar *** Test Ends");
    }

    @Test(alwaysRun = true,priority = 6,description = "verify faded Tshirt")
    public void verifyfadedTshirt() throws InterruptedException {
        ExtentTestManager.startTest("verifyfadedTshirt","");
        log.info("** Verify Faded T-shirt *** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.itemAddedToShoppingCart(driver);
        log.info("** Verify Faded T-shirt *** Test Ends");
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