package social;

import base.ScriptBase;
import controller.SocialMedia;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class socialMediaTest extends ScriptBase {
    SocialMedia socialMedia;

    @BeforeTest
    public void beforetest() {
        init();
    }

    @Test
    public void verifyfacebook() {
        socialMedia= new SocialMedia(driver);
        socialMedia.socialmediaverify("facebook", "Selenium Framework Public Group | Facebook",driver);
    }
    @Test
    public void verifytwitter() {
        socialMedia= new SocialMedia(driver);
        socialMedia.socialmediaverify("twitter","Selenium Framework (@seleniumfrmwrk) | Twitter",driver);
    }
    @Test
    public void verifyyoutube() {
        socialMedia= new SocialMedia(driver);
        socialMedia.socialmediaverify("youtube","Selenium Framework - YouTube",driver);
    }

    @Test
    public void verifygoogle() {
        socialMedia= new SocialMedia(driver);
        socialMedia.socialmediaverify("google-plus","Sign in - Google Accounts",driver);

    }
    @AfterTest
    public void closeBrowser() {

        driver.close();
        driver.quit();
    }

}

