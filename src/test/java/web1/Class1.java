package web1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Class1 {
	
	@Test
	public void Test1(){
		System.out.println("Test 1 is starting.....");
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://localhost:90/ejagruti-ui/");
		System.out.println("Test 1 is Ends.....");
	}
	@Test
	public void Test2(){
		System.out.println("Test 2 is starting.....");
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://localhost:90/ejagruti-ui/");
		System.out.println("Test 2 is Ends.....");
	}
	@Test
	public void Test3(){
		System.out.println("Test 3 is starting.....");
		System.setProperty("webdriver.chrome.driver", "G:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://localhost:90/ejagruti-ui/");
		System.out.println("Test 3 is Ends.....");
	}
}
