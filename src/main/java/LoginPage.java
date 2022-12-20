import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends MasterPage {



    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(id = "passwd")
    public WebElement passwordField;
    @FindBy(id = "SubmitLogin")
    public WebElement submitLoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public  void login(String email, String password){
emailField.sendKeys(email);
passwordField.sendKeys(password);
submitLoginButton.click();

    }


    }
