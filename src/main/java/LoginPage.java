import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "email")
    public WebElement emailField;
    @FindBy(id = "passwd")
    public WebElement password;
    @FindBy(id = "SubmitLogin");
    public WebElement submitLoginButton;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
