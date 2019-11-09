package login;

import base.ScriptBase;
import controller.LoginPage;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTest extends ScriptBase {
    LoginPage loginPage;

    @Test
    public void invalidLoginVerify(){
        loginPage=new LoginPage(driver);
        loginPage.invalidSignin("test@gmail.com","gmail1234");
    }

    @Test
    public void validLoginVerify(){
        loginPage=new LoginPage(driver);
        loginPage.validSignin("futureitgroup@gmail.com","admin123");
    }

    @Test
    public void validLoginWithLogOutVerify(){
        loginPage=new LoginPage(driver);
        loginPage.validSigninWithLogOut();
    }

    @Test
    public void invalidCreateAccountVerify(){
        loginPage=new LoginPage(driver);
        loginPage.invalidCreateAccount("hahahehe@yahoo.");
    }

    @Test
    public void invalidSignUpAccountVerify(){
        loginPage=new LoginPage(driver);
        loginPage.invalidSignup("test420@gmail.com",driver,"katlyn","Jenner","test420@gmail.com","admin1234");
    }
    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();
    }


    @Override
    public void onTestStart(ITestContext result) {

    }
}
