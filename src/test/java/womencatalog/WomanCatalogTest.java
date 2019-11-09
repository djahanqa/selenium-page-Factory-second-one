package womencatalog;

import base.ScriptBase;
import controller.WomanCatalog;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class WomanCatalogTest extends ScriptBase {
    WomanCatalog womanCatalog;


    @Test
    public void verifyWomancatalog() {
        womanCatalog = new WomanCatalog(driver);
        womanCatalog.woman(driver,"Women");
    }
    @Test
    public void verifyDresscatalog() {
        womanCatalog = new WomanCatalog(driver);
        womanCatalog.woman(driver,"Dresses");
    }

    @Test
    public void verifyTshirtcatalog() {
        womanCatalog = new WomanCatalog(driver);
        womanCatalog.woman(driver,"T-shirts");
    }



    @AfterTest void closebrowser() {


        driver.close();
        driver.quit();
    }


    @Override
    public void onTestStart(ITestContext result) {

    }
}