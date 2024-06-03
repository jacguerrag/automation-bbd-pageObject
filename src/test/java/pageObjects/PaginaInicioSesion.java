package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PaginaInicioSesion {
	private WebDriver driver;
    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
 
	
	public PaginaInicioSesion(WebDriver driver) {
		this.driver = driver;
		driver.get("https://www.saucedemo.com/");
	}
	
    public void enterUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    

}
