/*
 * TestNG is used with selenium
 */
package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex11 {
	static String drivername="webdriver.gecko.driver";
	static String driverpath="C:\\\\Users\\\\Training\\\\Documents\\\\selenium\\\\firefox\\\\geckodriver.exe";
	static WebDriver driver;
	static
	{
		System.setProperty(drivername,driverpath);
		driver=new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 0)
	public void firstJavaScript() throws InterruptedException
	{
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='easycont']/div/div[@class=\"col-md-6 text-left\"]/div[1]/div[@class='panel-body']/button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	@Test(priority = 1)
	public void secondJavaScript() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@id='easycont']/div/div[@class=\"col-md-6 text-left\"]/div[2]/div/button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void scroll() throws InterruptedException
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 3)
	public void thirdJavaScript() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@id='easycont']/div/div/div[@class='panel panel-primary'][3]/div[@class='panel-body']/button[@class='btn btn-default btn-lg']")).click();
		Thread.sleep(1000);
		//to handle javascript
		driver.switchTo().alert().sendKeys("Sandesh");
		driver.switchTo().alert().accept();
	}
	
	@Test(priority = 4)
	public void closing()
	{
		driver.close();
	}

}
