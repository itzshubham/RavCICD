package com.a.b;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLaunch {
	
	@Test
	public void testLaunch() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
