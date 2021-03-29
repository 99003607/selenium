/*
 * javascript
 */
package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		//first java script
		/*
		driver.findElement(By.className("btn-default")).click();
		//to handle javascript
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		*/
		
		//second javascript
		/*
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.className("btn-lg")).click();
		Thread.sleep(3000);
		//to hadle javascript ok->accept  cancel->dismiss
		driver.switchTo().alert().dismiss();
		*/
		
		//third javascript
		driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button")).click();
		Thread.sleep(1000);
		//to handle javascript enter details
		driver.switchTo().alert().sendKeys("hello");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}

}
