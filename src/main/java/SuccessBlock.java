import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.junit.jupiter.api.*;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;

public class SuccessBlock extends MasterPage {
    public SuccessBlock(WebDriver driver) {
        super(driver);
    }

    private final static String SUCCESS_LOCATOR = "//div[contains(@class,'layer_cart_product')]//h2";
    @FindBy(xpath = SUCCESS_LOCATOR)
    public WebElement successHeader;
    @FindBy(xpath = "//span[@class='ajax_block_cart_total']")
    public WebElement summElement;

    public void checkCorrectSummInCart(String expectedSum) {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SUCCESS_LOCATOR)));

        Assertions.assertAll(
                () -> assertTrue(new SuccessBlock(driver).successHeader.isDisplayed()),
                () -> assertThat(new SuccessBlock(driver).summElement, hasText(expectedSum)));


    }
}

