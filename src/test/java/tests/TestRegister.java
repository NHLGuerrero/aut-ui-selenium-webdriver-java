package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.RegisterPage;

public class TestRegister {
	
	WebDriver driver;
	String PATH_DRIVER = "./src/test/resources/chomedriver/chomedriver.exe";
	String TYPE_DRIVER = "wedriver.chome.driver";
	String URL = "https://demo.guru99.com/test/newtours/";
	RegisterPage register;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty(TYPE_DRIVER,PATH_DRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		register = new RegisterPage(driver);
	}

	@Test
	public void registerUser() {
		register.completeRegisterUser("usertest@gmail.com", "passwordtest123", "passwordtest123");
	} 
	
	public void validateRegisterSucess() {
	register.registerSucess();
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
