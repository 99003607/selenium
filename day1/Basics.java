/*
 * Basics
 */
package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		*/
		

		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.findElement(By.id("user-message")).sendKeys("hello");
		Thread.sleep(1000);
		driver.findElement(By.id("at-cv-lightbox-close")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("btn-default")).click();
		
		//second
		driver.findElement(By.id("sum1")).sendKeys("1");
		driver.findElement(By.id("sum2")).sendKeys("2");
		driver.findElement(By.className("btn-default")).click();
	}

}
