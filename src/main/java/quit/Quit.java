package quit;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import setup.Setup;

public class Quit {
    Setup setup = new Setup();
    private WebDriver driver = setup.returnDriver();

//    @After
    public void quit(){
        driver.quit();
    }
}
