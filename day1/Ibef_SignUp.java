/*
* IBEF Signup page
*/
package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ibef_SignUp {
	public static void main(String[] args) {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ibef.org/ibefusers/signupRequest");
		driver.manage().window().maximize();
		
		//firstname and lastname
		driver.findElement(By.id("signupFname")).sendKeys("virat");
		driver.findElement(By.id("signupLname")).sendKeys("kohli");
		
		//gender
		driver.findElement(By.xpath("//*[@id=\"userSignUpForm\"]/div/div/div[2]/ul[1]/li/span[2]/span/a")).click();
		
		//emailID
		driver.findElement(By.id("signupEmail")).sendKeys("viratkohli@my.com");
		
		//password
		driver.findElement(By.name("signupPassword")).sendKeys("123456789");
		
		//confirm password
		driver.findElement(By.name("signupCPassword")).sendKeys("123456789");
		
		//organization
		driver.findElement(By.name("signupUserOrg")).sendKeys("allindia");
		
		//contactno
		driver.findElement(By.name("signupUserContact")).sendKeys("1234567890");
		
		//captcha
		String captcha=driver.findElement(By.className("captchaContainer")).getText();
		System.out.println("output:"+captcha);
		driver.findElement(By.id("captchaResult")).sendKeys(captcha);
	}

}
