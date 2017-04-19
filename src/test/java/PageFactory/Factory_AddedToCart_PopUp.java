package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by MAX on 4/18/17.
 */
public class Factory_AddedToCart_PopUp {

    @FindBy(xpath = ".//*[@class='right'][contains(@href,'https://www.paxvapor.com')]")
    public WebElement checkOutBtnPopUp;

}
