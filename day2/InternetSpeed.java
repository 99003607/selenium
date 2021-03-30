/*
* Internet Speed from fast.com website
*/
package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		String speed=driver.findElement(By.id("speed-value")).getText();
		String units=driver.findElement(By.id("speed-units")).getText();
		System.out.println("Speed:"+speed+" "+units);
		driver.findElement(By.id("show-more-details-link")).click();
		Thread.sleep(15000);
		//upload value
		String upload=driver.findElement(By.id("upload-value")).getText();
		String uunit=driver.findElement(By.id("upload-units")).getText();
		System.out.println("Upload speed:"+upload+" "+uunit);
		
	}

}
