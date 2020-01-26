package com.grp1.Gitart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void First_Test(){
		System.out.println("Test 1 is starting.....");
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://localhost:90/ejagruti-ui/");
		System.out.println("Test 1 is Ends.....");
		driver.quit();
	}
	@Test
	public void Second_Test(){
		System.out.println("Test 2 is starting.....");
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://localhost:90/ejagruti-ui/");
		System.out.println("Test 2 is Ends.....");
		driver.quit();
	}
	@Test
	public void Third_Test(){
		System.out.println("Test 3 is starting.....");
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://localhost:90/ejagruti-ui/");
		System.out.println("Test 3 is Ends.....");
		driver.quit();
	}
}
