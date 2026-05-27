package com.CloudeMLM_B01;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistrationTest {

	@Test
	public void testUserRegistration() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); 
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		// Navigate to registration page
		driver.get("https://hub.trident1.dev/register");
		
		// Your TL's requested automation locator steps will go here...
		Thread.sleep(3000);
		
		driver.quit();
	}
}