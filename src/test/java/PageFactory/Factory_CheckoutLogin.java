package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by MAX on 4/18/17.
 */
public class Factory_CheckoutLogin {

    @FindBy(xpath = ".//*[@id='login-form']/div/button")
    public WebElement signInBtn;

    @FindBy(xpath = ".//*[@id='login-email']")
    public WebElement emailInputField;

    @FindBy(xpath = ".//*[@id='login-password']")
    public WebElement pwdInputField;

    @FindBy(xpath = ".//*[@id='advice-required-entry-login-email']")
    public WebElement emailAdviceMessage;

    @FindBy(xpath = ".//*[@id='advice-required-entry-login-password']")
    public WebElement pwdAdviceMessage;

    @FindBy(xpath = ".//*[contains(text(),'Invalid login or password')]")
    public WebElement errorMessageInvalidCredentials;
}
