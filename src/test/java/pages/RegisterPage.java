package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class RegisterPage {
	
	private By btnRegisterLocator = By.linkText("REGISTER");
	private By userNameLocator = By.id("email");
	private By passwordLocator = By.cssSelector("[name=\"password\"]");
	private By confirmPasswordLocator = By.cssSelector("[name=\"confirmPassword\"]");
	private By btnEnviarLocator = By.cssSelector("[name=\"submit\"]");
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void completeRegisterUser(String userName, String password, String confirmPassword) {
		driver.findElement(btnRegisterLocator).click();
		driver.findElement(userNameLocator).sendKeys(userName);
		driver.findElement(passwordLocator).sendKeys(password);
		driver.findElement(confirmPasswordLocator).sendKeys(confirmPassword);
		driver.findElement(btnEnviarLocator).click();
	}
	
	public void registerSucess() {
		List<WebElement> fonts = driver.findElements(By.tagName("font"));
		assertEquals("Note: Your user name is usertest@gmail.com.",fonts.get(5).getText());
	}
}
