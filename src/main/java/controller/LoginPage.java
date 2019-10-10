package controller;

import base.ScriptBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class LoginPage extends ScriptBase {
    @FindBy(xpath ="//a[@class='login']") WebElement signinButton;
    @FindBy(id = "email") WebElement emailSendKey;
    @FindBy(id = "passwd") WebElement passwordSendKey;
    @FindBy(css = "#SubmitLogin > span") WebElement submitButton;
    @FindBy(css = "#center_column > div.alert.alert-danger > ol > li")WebElement signInMessageFailed;
    @FindBy(linkText = "Zaman Dewan")WebElement signInSuccessful;

    @FindBy(xpath = "//*[@id='header']//a[@title='Log me out']")WebElement signOut;

    @FindBy(id = "email_create")WebElement emailCreateInput;
    @FindBy(css = "#SubmitCreate > span")WebElement submitCreateAccountButton;
    @FindBy(xpath= "//*[@id='create_account_error']")WebElement inValidEmailErrorMessage;
    @FindBy(css= "#id_gender1")WebElement titleMrButton;
    @FindBy(id= "customer_firstname")WebElement firstNameSendKey;
    @FindBy(id= "customer_lastname")WebElement lastNameSendKey;
    @FindBy(id = "email")WebElement signupEmail;
    @FindBy(id = "passwd")WebElement signupPassword;
    @FindBy(css = "#submitAccount > span")WebElement submitRegisterButton;
    @FindBy(xpath = "//*[@id=\"center_column\"]/div")WebElement invalidSignpErrorMessage;



    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void invalidSignin(String email, String password){
        signinButton.click();
        emailSendKey.sendKeys(email);
        passwordSendKey.sendKeys(password);
        submitButton.click();
        Assert.assertEquals(signInMessageFailed,signInMessageFailed);
    }

    public void validSignin(String email, String password){
        signinButton.click();
        emailSendKey.sendKeys(email);
        passwordSendKey.sendKeys(password);
        submitButton.click();
        Assert.assertEquals(signInSuccessful,signInSuccessful);
}
    public void validSigninWithLogOut(){
        signOut.click();
    }

    public void invalidCreateAccount(String email){
        signinButton.click();
        emailCreateInput.sendKeys(email);
        submitCreateAccountButton.click();
        Assert.assertEquals(inValidEmailErrorMessage,inValidEmailErrorMessage);

    }


    public void invalidSignup(String email, WebDriver driver, String firstname, String lastname, String signupemail, String signuppassword){
        signinButton.click();
        emailCreateInput.sendKeys(email);
        submitCreateAccountButton.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        titleMrButton.click();
        firstNameSendKey.sendKeys(firstname);
        lastNameSendKey.sendKeys(lastname);
        signupEmail.sendKeys(signupemail);
        signupPassword.sendKeys(signuppassword);
        submitRegisterButton.click();
        Assert.assertEquals(invalidSignpErrorMessage,invalidSignpErrorMessage);
        //email: test420@gmail.com
        //password: admin1234

    }
}

