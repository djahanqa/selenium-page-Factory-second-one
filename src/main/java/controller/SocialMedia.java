package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.logging.Logger;

public class SocialMedia extends ScriptBase {
    public static final Logger log=Logger.getLogger(SocialMedia .class.getName());

    public SocialMedia(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void socialmediaverify(String social, String title,WebDriver driver) {

        driver.findElement(By.xpath("//*[@class='"+social+"']")).click();
        windowhandle(driver,title);
    }


    public void windowhandle (WebDriver driver,String title) {
        String windowHandleBefore = driver.getWindowHandle();

        for (String windHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windHandle);

        }


        String actualTitle = driver.getTitle();
        String expectedTitle = ""+title+"";
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();

        driver.switchTo().window(windowHandleBefore);


    }
}
