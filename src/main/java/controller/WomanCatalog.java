package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;


public class WomanCatalog extends ScriptBase {
    public static final Logger log=Logger.getLogger(WomanCatalog .class.getName());


    public WomanCatalog(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    public void woman(WebDriver driver,String catalogue){

        mouseOver(driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li/a[contains(text(),'"+catalogue+"')]")),driver);
        log.info("concertinate catalogue");


    }
    public void mouseOver(WebElement element,WebDriver driver ){
        Actions action =new Actions(driver);
        element= element;
        action.moveToElement(element).perform();

    }
}