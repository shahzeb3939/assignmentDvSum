package setup;

import component.Login;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
    private WebDriver driver;

    @Before
    public WebDriver setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://devqa.dvsum.com/login");

        Login login = new Login(driver);
        login.setEmailField("testautomation@dvsum.com");
        login.setPasswordField("1@Qwerty");
        login.clickLoginButton();

        return driver;
    }

//    public static void main(String[] args){
//        Setup setup = new Setup();
//        setup.setUp();
//    }
}
