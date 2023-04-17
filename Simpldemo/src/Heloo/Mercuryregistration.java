package Heloo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Mercuryregistration {

	WebDriver driver;

	@BeforeSuite
	public void browsera() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.get("https://demo.guru99.com/test/newtours/register.php");


	}
	@BeforeTest
	public void Bt() 
	{
		driver.manage().window().maximize();
	}
	
	@Parameters({"aa","bb","cc","dd","ee","ff","gg","hh","jj","kk","ll"})
	@Test()
	public void Test(String A, String B,String C,  String D, String E, String F, String G, String H, String J, String K, String L ) 
	{
		driver.findElement(By.name("firstName")).sendKeys(A);
		driver.findElement(By.name("lastName")).sendKeys(B);
		driver.findElement(By.name("phone")).sendKeys(C);
		driver.findElement(By.name("userName")).sendKeys(D);

		driver.findElement(By.name("address1")).sendKeys(E);

		driver.findElement(By.name("city")).sendKeys(F);

		driver.findElement(By.name("state")).sendKeys(G);

		driver.findElement(By.name("postalCode")).sendKeys(H);

	

		driver.findElement(By.name("email")).sendKeys(J);
		driver.findElement(By.name("password")).sendKeys(K);

		driver.findElement(By.name("confirmPassword")).sendKeys(L);

		driver.findElement(By.name("submit")).click();

		

	}
}
