package Heloo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginmercury {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("userName")).sendKeys("Roshan");
		driver.findElement(By.name("password")).sendKeys("Aware");
		driver.findElement(By.name("submit")).click();
	}
}
