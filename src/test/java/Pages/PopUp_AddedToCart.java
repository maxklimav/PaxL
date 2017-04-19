package Pages;

import Base.BaseTest;
import PageFactory.Factory_AddedToCart_PopUp;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by MAX on 4/17/17.
 */
public class PopUp_AddedToCart extends BaseTest{
    Factory_AddedToCart_PopUp Factory_AddedToCart_PopUp = new Factory_AddedToCart_PopUp();

    public PopUp_AddedToCart(){

        PageFactory.initElements(driver,Factory_AddedToCart_PopUp);
    }

    public Page_CheckOutLogin clickOnCheckOutBtn(){
        waitElToBeClicable(Factory_AddedToCart_PopUp.checkOutBtnPopUp);
        Factory_AddedToCart_PopUp.checkOutBtnPopUp.click();
        return new Page_CheckOutLogin();
    }
}
