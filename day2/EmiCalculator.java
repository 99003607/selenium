package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmiCalculatorSlider {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		//loan amount slider
		WebElement ele=driver.findElement(By.id("loanamountslider"));
		Actions act=new Actions(driver);
		//here x and y values are pixels
		act.dragAndDropBy(ele, 200, 0).build().perform();
		Thread.sleep(1000);
		
		//loan interest slider
		ele=driver.findElement(By.id("loaninterestslider"));
		act.dragAndDropBy(ele, 200, 0).build().perform();
		Thread.sleep(1000);
		
		//loan tenure
		ele=driver.findElement(By.id("loantermslider"));
		act.dragAndDropBy(ele, 300, 0).build().perform();
		Thread.sleep(1000);
		
		
		
	}

}
