package Pages;

import Base.BaseTest;
import PageFactory.Factory_CheckoutLogin;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by MAX on 4/17/17.
 */
public class Page_CheckOutLogin extends BaseTest {
    Factory_CheckoutLogin Factory_CheckoutLogin = new Factory_CheckoutLogin();

   public Page_CheckOutLogin(){
       PageFactory.initElements(driver, Factory_CheckoutLogin);
   }

   public void inputInvalidEmail(){
       waitElToBeClicable(Factory_CheckoutLogin.emailInputField);
       Factory_CheckoutLogin.emailInputField.clear();
       Factory_CheckoutLogin.emailInputField.sendKeys("invalidEmail@gmail.com");
   }

    public void inputInvalidPassword(){
        waitElToBeClicable(Factory_CheckoutLogin.pwdInputField);
        Factory_CheckoutLogin.pwdInputField.clear();
        Factory_CheckoutLogin.pwdInputField.sendKeys("invalidPassword");
    }

    public String errorMessageIsPresented(){
        return Factory_CheckoutLogin.errorMessageInvalidCredentials.getText();
    }

    public Page_CheckOutLogin clickcOnSignInBtn(){
       waitElToBeClicable(Factory_CheckoutLogin.signInBtn);
        Factory_CheckoutLogin.signInBtn.click();
       return new Page_CheckOutLogin();
    }
}
