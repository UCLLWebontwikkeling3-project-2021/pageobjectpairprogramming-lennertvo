import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_LogoutPage extends Page  {

    @FindBy(id="useridLogIn")
    private WebElement useridLoginField;


    @FindBy(id="passwordLogIn")
    private WebElement passwordLogInField;

    @FindBy(id="login")
    private WebElement logInButton;

    public Login_LogoutPage(WebDriver driver){
        super(driver);
        this.driver.get(getPath()+"?command=LogIn");
    }


    public void setUserid(String userid){
        useridLoginField.clear();
        useridLoginField.sendKeys(userid);
    }


    public void setPassword(String password) {
        passwordLogInField.clear();
        passwordLogInField.sendKeys(password);
    }




    public void submit() {
        this.logInButton.click();
    }

    public boolean userIsLoggedOut(){
        try {
            WebElement user = driver.findElement(By.id("isIngelogd"));
        }
        catch (Exception e) {
            return true;
        }
        return false;
    }


}
