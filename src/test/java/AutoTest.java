import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;

public class AutoTest {
    WebDriver driver;
    TshirtsPage tshirtsPage;

    @BeforeAll
    static  void registerDriver(){
        WebDriverManager.chromedriver().setup();


    }
    @BeforeEach
    void initDriver(){
        driver=new ChromeDriver();
        tshirtsPage=new TshirtsPage(driver);

    }

    @Test
    void addToCartTest() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        new LoginPage(driver).login("spartalex93@test.test", "123456");
        new MyAccountPage(driver).navigationBlock.clickTshortsButtonInWomenSuggest();
        new TshirtsPage(driver).selectSise("M");
        tshirtsPage.selectSise("M");
        tshirtsPage.addTshirtToCart("Faded");
        Assertions.assertAll(
                () -> Assertions.assertTrue(new SuccessBlock(driver).successHeader.isDisplayed()),
                () -> assertThat(new SuccessBlock(driver).summElement, hasText("$18.51")));





    }
    @AfterEach
    void teardown(){
        driver.quit();
    }

}
