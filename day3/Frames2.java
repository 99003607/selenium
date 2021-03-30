/*
 * Frame inside frame
 */
package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium firefox");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Documents\\selenium\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		Thread.sleep(1000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		
		driver.switchTo().frame(1);
		size = driver.findElements(By.tagName("iframe")).size();         
	    System.out.println("Total Frames --" + size);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Sandesh");
		
	}
}
