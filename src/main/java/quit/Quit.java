package quit;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Quit {
    private WebDriver driver;

    public Quit(WebDriver driver){
        this.driver = driver;
    }

    @After
    public void quit(){
        driver.quit();
    }
}
