/*
* Hyper link text used to click on hyper link
*/
package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//clicking on maintainence
		
		driver.findElement(By.linkText("Maintenance")).click();
		driver.findElement(By.linkText("Access Records")).click();
		driver.findElement(By.id("confirm_password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"frmPurgeEmployeeAuthenticate\"]/div/div/input")).click();
		driver.findElement(By.id("employee_empName")).sendKeys("Odis Adalwin");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[5]/ul/li")).click();
		//driver.findElement(By.className("search_employee")).click();
		//driver.findElement(By.className("search_employee")).click();
		 Thread.sleep(3000);
		//clicking on leave
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		
		Select list=new Select(driver.findElement(By.name("applyleave[txtLeaveType]")));
		list.selectByValue("9");
		
		driver.findElement(By.name("applyleave[txtFromDate]")).click();
		list=new Select(driver.findElement(By.className("ui-datepicker-month")));
		list.selectByVisibleText("Apr");
		driver.findElement(By.linkText("2")).click();
		driver.findElement(By.name("applyleave[txtComment]")).sendKeys("this is a comment");
		driver.findElement(By.id("applyBtn")).click();
		
		
	}

}
