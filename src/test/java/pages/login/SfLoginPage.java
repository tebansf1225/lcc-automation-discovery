package pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DefaultUrl("https://login.stmpa.stm.salesforce.com/")
public class SfLoginPage extends PageObject {
    @FindBy(id = "username")
    private WebElementFacade user;

    @FindBy(id = "password")
    private WebElementFacade pass;

    @FindBy(id = "Login")
    private WebElementFacade submiSftBtn;

    @FindBy(id = "emc")
    private static WebElementFacade fillVerificationCode;

    @FindBy(id = "save")
    private static WebElementFacade click_Verify;

    public void setLoginData(String user, String pass){
        this.user.sendKeys(user);
        this.pass.sendKeys(pass);
    }

    public void setOrgUser(String orgUser){

        this.user.sendKeys(orgUser);
    }

    public void setOrgPass(String orgPass){
        this.pass.sendKeys(orgPass);
    }

    public void submitBtn(){
        this.submiSftBtn.click();
    }

    public void setVerificationCode(String verifyCode){

        fillVerificationCode.sendKeys(verifyCode);
        click_Verify.click();

    }
    public void loginVerification(){
        // Assert.assertEquals("Home",find(By.linkText("Home")).getText());
    }

}
