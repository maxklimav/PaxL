package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by MAX on 4/18/17.
 */
public class Factory_Main {

    @FindBy(xpath = ".//*[@class='primary-button']")
    public WebElement primaryBtnShopNow;

    @FindBy(xpath = ".//*[@id='mobile-cart']//*[@class='loaded']")
    public WebElement valueOfCart;
}
