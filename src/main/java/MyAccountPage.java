import org.openqa.selenium.WebDriver;


public class MyAccountPage extends  MasterPage {


    public MyAccountPage(WebDriver driver) {
        super(driver);
        navigationBlock=new NavigationBlock(driver);
    }
    public NavigationBlock navigationBlock;

}
