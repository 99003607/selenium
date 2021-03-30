/*
 * TestNG in the orangeHRM website.
 */
package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrangeHrmTestNG {
	static String drivername="webdriver.gecko.driver";
	static String driverpath="C:\\\\Users\\\\Training\\\\Documents\\\\selenium\\\\firefox\\\\geckodriver.exe";
	static WebDriver driver;
	
	@Test(priority=0,description="Browser launch",alwaysRun=true)
	public void z()
	{
		System.out.println("z");
		System.setProperty(drivername,driverpath);
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1,description="Signing in",dependsOnMethods="z")
	public void y()
	{
		System.out.println("y");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	//priority->This will execute the function according to the priority.
	//description-> will give description to the function.
	//enabled -> function will run only if the enabled=true
	//dependsOnMethods-> function will run only if parameter in dependsOnMethods will run.
	
	@Test(priority=2,description="Logout",enabled=true,dependsOnMethods="y")
	public void x() throws InterruptedException
	{
		System.out.println("x");
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Welcome Paul")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.linkText("Logout")).click();
	}

}
