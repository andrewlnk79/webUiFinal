import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoTest {
    WebDriver driver;

    @BeforeAll
    static  void registerDriver(){
        WebDriverManager.chromedriver().setup();


    }
    @BeforeEach
    void initDriver(){
        driver=new ChromeDriver();
    }

    @Test
    void addToCartTest() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        new LoginPage(driver).login("spartalex93@test.test", "123456");
        new MyAccountPage(driver).navigationBlock.clickTshortsButtonInWomenSuggest();
        new TshirtsPage(driver).selectSise("M");
        Thread.sleep(5000);
    }
    @AfterEach
    void teardown(){
        driver.quit();
    }

}
