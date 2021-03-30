package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTableValues {
	public static void main(String[] args) {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.className("content"));
		
		
		String s=driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]")).getText();
		System.out.println("String:"+s);
		
	}

}
