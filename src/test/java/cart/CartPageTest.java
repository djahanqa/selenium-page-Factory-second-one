package cart;
import base.ScriptBase;
import controller.CartPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartPageTest extends ScriptBase {

    CartPage cartPage;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifycartpage(){
        log.info("** Verify cart page *** Test Starts");
        cartPage=new CartPage(driver);
        cartPage.shoppingCartSummery("step_current  first",driver);
        log.info("** Verify cart page *** Test Ends");
    }
    @Test
    public void verifycartSiginBar() {
        log.info("** Verify Cart Siging Bar *** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo second",driver);
        log.info("*** Verify Cart Siging Bar *** Test Ends");
    }

    @Test
    public void verifycartAddressBar() {
        log.info("** Verify Cart Address Bar *** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo third",driver);
        log.info("** Verify Cart Address Bar  *** Test Ends");
    }

    @Test
    public void verifycartShoppingBar() {
        log.info("** Verify Shopping Cart Bar*** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo four",driver);
        log.info("** verify Shopping Cart Bar *** Test Ends");
    }


    @Test
    public void verifycartPaymentBar() {
        log.info("** Verify Cart Payment Bar *** Test Starts");
        cartPage = new CartPage(driver);
        cartPage.shoppingCartSummery("step_todo last",driver);
        log.info("** Verify Cart Payment Bar *** Test Ends");

    }

    @Test
    public void verifyfadedTshirt() throws InterruptedException {
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
}