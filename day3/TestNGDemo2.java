/*
 * BeforeClass
 * AfterClass
 */
package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDemo2 {
	static String drivername="webdriver.gecko.driver";
	static String driverpath="C:\\\\Users\\\\Training\\\\Documents\\\\selenium\\\\firefox\\\\geckodriver.exe";
	static WebDriver driver;
	
	
	//preconditions
	@BeforeClass
	public void bC()
	{
		System.out.println("First Method");
		System.setProperty(drivername,driverpath);
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void aC() throws InterruptedException
	{
		System.out.println("Last Method");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Welcome Paul")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}
	@Test
	public void a()
	{
		System.out.println("a");
		System.out.println("y");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test
	public void b()
	{
		System.out.println("b");
	}
	@Test
	public void c()
	{
		System.out.println("c");
	}
}
