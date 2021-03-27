/*
 * Drop down
 */
package ex1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		//single selection dropdown(on if tag name is select)
		
		Select dd=new Select(driver.findElement(By.id("select-demo")));
		dd.selectByVisibleText("Sunday");
		Thread.sleep(3000);
		dd.selectByValue("Monday");
		Thread.sleep(3000);
		dd.selectByIndex(3);
		
		Thread.sleep(5000);
		//Multiple selection dropdown
		Select ms=new Select(driver.findElement(By.id("multi-select")));
		if(ms.isMultiple())
		{
			ms.selectByVisibleText("New Jersey");
			ms.selectByVisibleText("New York");
		}
		
		driver.findElement(By.id("printMe")).click();
		driver.findElement(By.id("printAll")).click();
		
		
	}

}
