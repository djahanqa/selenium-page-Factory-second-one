package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class Woman extends ScriptBase {
    public static final Logger log=Logger.getLogger(Woman .class.getName());
    @FindBy(xpath = "//*//a[@title='Women']")
    WebElement title;
    @FindBy(xpath = "//*[@id='block_top_menu']//a[@title='Tops']")
    WebElement tops;
    @FindBy(xpath = "//*/ul/li[1]//a[@title='Dresses']")
    WebElement dresses;
    @FindBy(css = "#block_top_menu > ul > li:nth-child(1) > a")


    WebElement womenTab;
    @FindBy(css = "#categories_block_left > h2")
    WebElement womenFilterTab;


    public Woman(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void topssearch(WebDriver driver, String design) {
        title.click();
        log.info("title clicked");
        tops.isDisplayed();
        log.info("tops displayed");
        mouseOver(driver.findElement(By.xpath("//*//a[@title='" + design + "']")), driver);
        log.info("concertinate design");


    }

    public void dressSearch(WebDriver driver, String dress) {
        title.click();
        log.info("title clicked");
        dresses.isDisplayed();
        log.info("Dresses displayed");
        mouseOver(driver.findElement(By.xpath("//*//li[1]//li//a[@title='" + dress + "']")), driver);
        log.info("concertinate dress");

    }

    private void mouseOver(WebElement element, WebDriver driver) {

        Actions action = new Actions(driver);
        element = element;
        action.moveToElement(element).perform();


    }

    public void womenCatalogeFilterTop(String filterCatagory, String dressCatagory, WebDriver driver) {
        womenTab.click();
        if (womenFilterTab.isDisplayed()) {
            driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li/a[contains(text(),'" + filterCatagory + "')]")).click();

            if (womenFilterTab.isDisplayed()) {
                driver.findElement(By.xpath("//*[@id='categories_block_left']/div/ul/li/a[contains(text(),'" + dressCatagory + "')]")).isDisplayed();

            } else {
                System.out.println("Women Filter tab not found " + womenFilterTab);
            }

        } else System.out.println("Women Filter Tab not found " + womenFilterTab);

    }
}