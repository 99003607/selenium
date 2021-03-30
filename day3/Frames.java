/*
* Frames in selenium
*/
package Firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium firefox");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Training\\Documents\\selenium\\firefox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Sandesh");
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
	}

}
