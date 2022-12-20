import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBlock extends  MasterPage{

    public NavigationBlock(WebDriver driver) {
        super(driver);

    }
    @FindBy(xpath = "//a[@title='Women']")
    private WebElement womenButton;
    @FindBy(xpath = "//ul[contains(@class,'submenu-container')]//a[@title='T-shirts']")
    private WebElement tshirtsInWomenSuggestButton;


     public void clickTshortsButtonInWomenSuggest(){
        actions.moveToElement(womenButton)
                .click()
                .build()
                .perform();
    }

}
