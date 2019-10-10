package base;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.logging.Logger;

public class ScriptBase {
    public WebDriver driver;
    public static final Logger log=Logger.getLogger(ScriptBase.class.getName());
    public static final String USERNAME="";
    public static final String ACCESSKEY="";
    public static final String URL="http://"+USERNAME+":"+ACCESSKEY+"@ondemand.soucelab.com.80/wd/hub";


    public void init(){
        String Log4jConfigPath="log4j.properties";

        PropertyConfigurator.configure(Log4jConfigPath);
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        this.driver = new ChromeDriver();
        this.driver.get("http://automationpractice.com/index.php");

    }

}