package com.CloudeMLM_B01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheWebsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hub.trident1.dev/login");
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
