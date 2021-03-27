/*
 * Facebook sign up page
 */
package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=973072061&extra_1=s%7Cc%7C231348943369%7Ce%7Cfacebook%7C&placement=&creative=231348943369&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D973072061%26adgroupid%3D54006406691%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-297690534863%26loc_physical_ms%3D1007773%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIvavltZnQ7wIVVaaWCh2s1wUeEAAYASAAEgLY5_D_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("virat");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("kohli");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("viratkohli@my.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("viratkohli@my.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
		Thread.sleep(3000);
		//day
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("5");
		Thread.sleep(3000);
		//month
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("11");
		Thread.sleep(3000);
		//year
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1988");
		Thread.sleep(3000);
		//radio
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		//signup
		driver.findElement(By.name("websubmit")).click();
		
	}

}
