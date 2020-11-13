package demo;

import org.openqa.selenium.WebDriver;
import quit.Quit;
import setup.Setup;

public class LoginDemo {
    public static void main(String[] args) {
        Setup setup = new Setup();
        WebDriver driver = setup.setup();

        Quit quit = new Quit(driver);
        quit.quit();
    }
}
