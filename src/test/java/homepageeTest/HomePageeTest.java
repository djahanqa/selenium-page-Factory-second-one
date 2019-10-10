package homepageeTest;

import base.ScriptBase;
import controller.Homepagee;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageeTest extends ScriptBase {


    Homepagee homepagee;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyHomePage() {
        log.info("** Verify Home Page *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.verifyContactUS("T-SHIRTS");
        log.info("** Verify Home Page *** Test Ends");
    }

    @Test
    public void searchSleeveQuantity() {
        log.info("** Verify Search  Sleeve Quantity  *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.seachspProducts("SLEEVE", driver, "4");
        log.info("** Verify Search  Sleeve Quantity *** Test Ends");
    }

    @Test
    public void searchHatQuantity() {
        log.info("** Verify Search Hat Quantity  *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.seachspProducts("HAT", driver, "7");
        log.info("** Verify Search Hat Quantity  *** Test Ends");
    }
    @Test
    public void searchDressesQuantity() {
        log.info("** Verify Search Dress Quantity  *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.seachspProducts("DRESS", driver, "7");
        log.info("** Verify Search Dress Quantity  *** Test Ends");
    }

    @Test
    public void searchwomenQuantity() {
        log.info("** Verify Search Woman Quantity *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.catagory(driver, "Women");
        log.info("** Verify Search Woman Quantity  *** Test Ends");
    }

    @Test
    public void searchTshirtsQuantity() {
        log.info("** Verify cart page *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.catagory(driver, "T-shirts");
        log.info("** Verify cart page *** Test Ends");

    }

    @Test
    public void searchpopular() {
        log.info("** verify Search by Popular Item *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.searchByDemand(driver, "homefeatured");
        log.info("** verify Search by Popular Item *** Test Ends");

    }

    @Test
    public void searchbestSeller() {
        log.info("** Verify cart page *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.searchByDemand(driver, "blockbestsellers");
        log.info("** Verify cart page *** Test Ends");
    }

    @Test
    public void information1() {
        log.info("** Verify Information 1 *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "Specials");
        log.info("** Verify Information 1 *** Test Ends");
    }

    @Test
    public void information2() {
        log.info("** Verify Information 2 *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "New products");
        log.info("** Verify Information 2 *** Test Ends");

    }

    @Test
    public void information3() {
        log.info("** Verify Information 3*** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "Best sellers");
        log.info("** Verify Information 3 *** Test Ends");

    }

    @Test
    public void information4() {
        log.info("** Verify Information 4 *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "Our stores");
        log.info("** Verify Information 4 *** Test Ends");
    }

    @Test
    public void information5() {
        log.info("** Verify Information 5 *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "Contact us");
        log.info("** Verify Information 5 *** Test Ends");

    }

    @Test
    public void information6() {
        log.info("** Verify Information 6 *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "Terms and conditions of use");
        log.info("** Verify Information 6 *** Test Ends");
    }

    @Test
    public void information7() {
        log.info("** Verify Information 7 *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "About us");
        log.info("** Verify Information 7 *** Test Ends");
    }

    @Test
    public void information8() {
        log.info("** Verify Information 8 *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.informationTree(driver, "Sitemap");
        log.info("** Verify Information 8 *** Test Ends");

    }


    @Test
    public void myAccount1() {
        log.info("** Verify My Account one *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.myaccount(driver, "My orders");
        log.info("** Verify My Account one *** Test Ends");

    }

    @Test
    public void myAccount2() {
        log.info("** Verify My Account second time *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.myaccount(driver, "My credit slips");
        log.info("** Verify My Account second time*** Test Ends");
    }

    @Test
    public void myAccount3() {
        log.info("** Verify My Account third time *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.myaccount(driver, "My addresses");
        log.info("** Verify My Account third time *** Test Ends");
    }

    @Test
    public void myAccount4() {
        log.info("** Verify My Account for the fourth time *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.myaccount(driver, "Manage my personal information");
        log.info("** Verify My Account for the fourth time *** Test Ends");
    }

    @Test
    public void verifycontactus() {
        log.info("** Verify Contact Us *** Test Starts");
        homepagee = new Homepagee(driver);
        homepagee.customerService();
        log.info("** Verify Contact Us *** Test Ends");
    }

    @AfterTest
    public void closebrowser() {

        driver.close();
        driver.quit();


    }

}