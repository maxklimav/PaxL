package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by MAX on 4/18/17.
 */
public class Factory_VerifyAge_PopUp {
    @FindBy(xpath = "//*[contains(text(),'2. Verify your age')]")
    public List<WebElement> textVerufyYourAge;

    @FindBy(xpath = ".//*[@class='required'][@name='age_verified']")
    public WebElement confirmAgeCheckBox;

    @FindBy(xpath = ".//*[@id='continue_modal_submit']")
    public WebElement continueBtnAgeVerify;

    @FindBy(xpath = ".//*[@id='user_country']")
    public WebElement countrySelectionMenu;

    @FindBy(xpath = ".//*[@id='user_country']/option[2]")
    public WebElement unitedStates;
}
