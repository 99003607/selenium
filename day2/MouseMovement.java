/*
* Mouse movement to hower over
*/
package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//to move the mouse
		WebElement ele=driver.findElement(By.linkText("Leave"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
				
		ele=driver.findElement(By.linkText("Entitlements"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		
		ele=driver.findElement(By.linkText("Employee Entitlements"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		ele.click();
	}

}
