package com.CloudeMLM_B01;

import org.junit.jupiter.api.Test; // Import JUnit Test annotation
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchTheWebsite {

	@Test // This annotation tells Maven to run this method and generate reports!
	public void testLoginPages() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new"); // Runs smoothly in Jenkins background
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://hub.trident1.dev/login");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}