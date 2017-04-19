package AcceptanceTests;


import Base.BaseTest;
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by MAX on 4/17/17.
 */
public class BasicFunctionality extends BaseTest {

    @Test
    public void ableToVerifyAge() throws InterruptedException, IOException {

        PopUp_VerifyAge verifyAge_popUp = new PopUp_VerifyAge();
        verifyAge_popUp.waitUntilAgeVerifyBoxDisplayed();
        verifyAge_popUp.selectUS();
        verifyAge_popUp.checkCheckBox();
        verifyAge_popUp.clickContinueBtn();
        Thread.sleep(2000L);
    }

    @Test
    public void addPax3ToCart() throws InterruptedException {

     Page_MainPage homePage = new Page_MainPage();
     Page_Pax3 pax3_page = homePage.clickOnPrimarySHopNowBtn();
     PopUp_AddedToCart addedToCart_popUp = pax3_page.clickOnAddToCartBtn();
     Page_CheckOutLogin checkOutLogin_page = addedToCart_popUp.clickOnCheckOutBtn();
     Page_MainPage homeOageAfterAddingTocart = new Page_MainPage();
        Assert.assertTrue(Integer.valueOf(homeOageAfterAddingTocart.getValueOfCart()) == 1);
     Thread.sleep(2000L);
    }

    @Test
    public void loginWithInvalidCredentials() throws InterruptedException {
        Page_CheckOutLogin checkOutLogin_page = new Page_CheckOutLogin();
        checkOutLogin_page.inputInvalidEmail();
        checkOutLogin_page.inputInvalidPassword();
        Page_CheckOutLogin checkOutLogin_pageAfterInvalidInput = checkOutLogin_page.clickcOnSignInBtn();
        Assert.assertEquals(checkOutLogin_pageAfterInvalidInput.errorMessageIsPresented(),"Invalid login or password.");
        Thread.sleep(4000);
    }
}
