package Pages;

import Base.BaseTest;
import PageFactory.Factory_Main;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by MAX on 4/18/17.
 */
public class Page_MainPage extends BaseTest {
    Factory_Main factory_main = new Factory_Main();

    public Page_MainPage(){
        PageFactory.initElements(driver, factory_main);
    }

    public Page_Pax3 clickOnPrimarySHopNowBtn(){
        waitElToBeClicable(factory_main.primaryBtnShopNow);
        factory_main.primaryBtnShopNow.click();
        return new Page_Pax3();
    }

    public String getValueOfCart(){
        waitElToBeClicable(factory_main.valueOfCart);
        return factory_main.valueOfCart.getText();
    }
}
