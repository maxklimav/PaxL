package Pages;

import Base.BaseTest;
import PageFactory.Factory_Pax3;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by MAX on 4/17/17.
 */
public class Page_Pax3 extends BaseTest {

    Factory_Pax3 Factory_Pax3 = new  Factory_Pax3();

    public Page_Pax3(){
        PageFactory.initElements(driver,Factory_Pax3);
    }

    public PopUp_AddedToCart clickOnAddToCartBtn(){
        waitElToBeClicable(Factory_Pax3.eddToCartPax3);
        Factory_Pax3.eddToCartPax3.click();
        return new PopUp_AddedToCart();
    }
}
