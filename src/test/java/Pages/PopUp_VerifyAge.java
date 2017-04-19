package Pages;

import Base.BaseTest;
import PageFactory.Factory_VerifyAge_PopUp;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

/**
 * Created by MAX on 4/17/17.
 */
public class PopUp_VerifyAge extends BaseTest {

    Factory_VerifyAge_PopUp Factory_VerifyAge_PopUp = new Factory_VerifyAge_PopUp();

    public PopUp_VerifyAge(){
        PageFactory.initElements(driver, Factory_VerifyAge_PopUp);
    }

    public void waitUntilAgeVerifyBoxDisplayed() throws InterruptedException, IOException {
        int i = 0;
        while(Factory_VerifyAge_PopUp.textVerufyYourAge.size() < 1 && i < 10) {
            Thread.sleep(1000);
            i++;
            if (i != 10){
                throw new IOException("Age Verification Box Is Not Presented");
            }
        }
    }

    public void selectUS() throws InterruptedException {
        Factory_VerifyAge_PopUp.countrySelectionMenu.click();
        Factory_VerifyAge_PopUp.unitedStates.click();
    }

    public void checkCheckBox(){
        Factory_VerifyAge_PopUp.confirmAgeCheckBox.click();
    }

    public Page_MainPage clickContinueBtn(){
        Factory_VerifyAge_PopUp.continueBtnAgeVerify.click();
        return new Page_MainPage();
    }
}
