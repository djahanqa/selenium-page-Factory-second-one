package womanTest;

import base.ScriptBase;
import controller.Woman;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomanTest extends ScriptBase {

    Woman woman;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyTshirt() {
        woman = new Woman(driver);
        woman.topssearch(driver,"T-shirts");

    }

    @Test
    public void verifyblouse() {
        woman= new Woman(driver);
        woman.topssearch(driver,"Blouses");
    }

    @Test
    public void verifybCasual() {
        woman= new Woman(driver);
        woman.dressSearch(driver,"Casual Dresses");
    }

    @Test
    public void verifyEvening() {
        woman= new Woman(driver);
        woman.dressSearch(driver,"Evening Dresses");
    }

    @Test
    public void verifySummer() {
        woman= new Woman(driver);
        woman.dressSearch(driver,"Summer Dresses");

    }

    @Test
    public void verifyWomenTshirt(){
        woman=new Woman(driver);
        woman.womenCatalogeFilterTop("Tops","T-shirts",driver);

    }
    @Test
    public void verifyWomenBlouse() {
        woman = new Woman(driver);
        woman.womenCatalogeFilterTop("Tops", "Blouses", driver);
    }
    @Test
    public void verifyWomenCasualDress() {
        woman = new Woman(driver);
        woman.womenCatalogeFilterTop("Dresses", "Casual Dresses", driver);
    }

    @Test
    public void verifyEveningDress() {
        woman = new Woman(driver);
        woman.womenCatalogeFilterTop("Dresses", "Evening Dresses", driver);
    }


    @Test
    public void verifySummerDress() {
        woman = new Woman(driver);
        woman.womenCatalogeFilterTop("Dresses", "Summer Dresses", driver);

    }
    @AfterTest
    void closebrowser() {


//        driver.close();
//        driver.quit();
    }


}
