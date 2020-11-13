package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private final WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
    }

    private static final By emailField = By.id("emailAddress");
    private static final By passwordField = By.id("password");
    private static final By loginButton = By.id("loginButton");

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
