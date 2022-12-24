import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TshirtsPage extends MasterPage {
    public TshirtsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//ul[@id='ul_layered_id_attribute_group_1']//a")
    private List<WebElement> sisesList;
    public  void selectSise(String sise){
        sisesList.stream().filter(s->s.getText().contains(sise)).findFirst().get().click();

    }
    @FindBy(xpath = "//ul[@class='product_list grid row']/li")
    private List<WebElement> tShirtsList;
    @FindBy(xpath ="//a[@title='Add to cart']" )
    private WebElement addToCartButton;
    public  void  addTshirtToCart(String productName){
       actions.moveToElement(tShirtsList.stream().filter(t->t.getText().contains(productName)).findFirst().get())
               .build().perform();
       addToCartButton.click();



    }
}
