import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Piyush on 20-Jul-18.
 */
public class LaunchDriver {

    private WebDriver driver;

    public WebDriver driverLaunch(String browserName) {

        if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        }

        return driver;
    }
}
