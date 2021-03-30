/*
* Getting values from the html page
*/
package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingValues {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveEntitlements/reset/1");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.id("txtUsername"));
		firstname.sendKeys("sandesh");
		Thread.sleep(3000);
		String s=firstname.getAttribute("value");
		System.out.println("Firstname: "+s);
		firstname.clear();
		
		WebElement log=driver.findElement(By.id("logInPanelHeading"));
		String s2=log.getText();
		System.out.println("log:"+s2);
		
	}

}
