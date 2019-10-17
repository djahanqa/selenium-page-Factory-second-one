package base;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class ScriptBase {
    public WebDriver driver;
    public static final Logger log=Logger.getLogger(ScriptBase.class.getName());
    public static final String USERNAME="djahanqa";
    public static final String ACCESSKEY="408b817e-0349-4a9b-8405-7ff39a5e6d58";
    public static final String URL="http://"+USERNAME+":"+ACCESSKEY+"@ondemand.saucelabs.com:80/wd/hub";


//    public void init(){
//        String Log4jConfigPath="log4j.properties";
//
//        PropertyConfigurator.configure(Log4jConfigPath);
//        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("http://automationpractice.com/index.php");
//
//    }
//public void saucelab() throws MalformedURLException {
//    DesiredCapabilities caps=new DesiredCapabilities();
//    caps.setCapability("browserName","chrome");
//    caps.setCapability("platform","macOS 10.13");
//    caps.setCapability("version","latest");
//    driver=new RemoteWebDriver(new URL(URL),caps);
//    driver.get("http://automationpractice.com/index.php");



public void beforetest (String browser){
    if (browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        driver = new ChromeDriver();
    }else if(browser.equalsIgnoreCase("firefox")) {
        System.setProperty("webdriver.geckodriver.driver", System.getProperty("user.dir") + "/drivers/geckodriver");


    }else if(browser.equalsIgnoreCase("safari")) {
        System.setProperty("webdriver.safari.notInstalled", "true");
        driver=new SafariDriver();
    }

}
}