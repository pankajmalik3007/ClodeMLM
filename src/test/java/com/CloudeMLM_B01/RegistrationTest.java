package com.CloudeMLM_B01;

import org.junit.jupiter.api.Assertions; // 1. Import JUnit Assertions
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
		
		// Navigate to the wrong registration page
		driver.get("https://hub.trident1.dev/register");
		
		Thread.sleep(3000);
		
		// 2. Get the actual URL that loaded on the browser
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://hub.trident1.dev/actual-correct-register-path"; 
		
		// 3. FORCE validation check. If they don't match, the test fails instantly!
		Assertions.assertEquals(expectedUrl, actualUrl, "The registration page URL is incorrect!");
		
		driver.quit();
	}
}