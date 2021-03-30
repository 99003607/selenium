package Day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IciciCarLoan {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=al&WT.mc_id=null");
		driver.manage().window().maximize();
		Robot rb = new Robot();
		//loan type
		driver.findElement(By.id("carRelbtn")).click();
		driver.findElement(By.linkText("New Car Loan")).click();
		//mobile number
		driver.findElement(By.id("MOBILENUM")).sendKeys("9876543210");
		//firstname
		driver.findElement(By.id("CUSTFIRSTNAME")).sendKeys("Dj");
		//lastname
		driver.findElement(By.id("CUSTLASTNAME")).sendKeys("Vishal");
		//location
		driver.findElement(By.id("CUSTCOMMUCITY")).sendKeys("Bengaluru");
		//residence type
		driver.findElement(By.id("residancebtn")).click();
		driver.findElement(By.linkText("Owned")).click();
		
		//current residence
			//year
		driver.findElement(By.id("yrbtn")).click();
		driver.findElement(By.linkText("2019")).click();
			//month
		driver.findElement(By.id("mnthbtn")).click();
		driver.findElement(By.linkText("Apr")).click();
		//datepicker
		//driver.findElement(By.className("datepicker")).click();
		driver.findElement(By.id("DATEOFBIRTH")).sendKeys("14081990");
		//dealer
		
		driver.findElement(By.xpath("//div[@id='SPDLR']/div/div/div/label")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("DEALERNAME")).sendKeys("NANAVATI MOTORS PVT LTD");
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//carmodel
		driver.findElement(By.id("CAR_MODEL_NAME")).sendKeys("TOYOTA INNOVA CRYSTA");
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//cityname
		driver.findElement(By.id("CITY_NAME")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		//month and year of manufacturing
			//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[4]/div/div/div[13]/div[2]/div/div[2]/div/button")).click();
		
		//type of employement
		driver.findElement(By.id("selSalbtn")).click();
		driver.findElement(By.linkText("Salaried")).click();
		Thread.sleep(1000);
		
		//scrolling
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		
		//company name
		driver.findElement(By.id("EMPLOYERNAME")).sendKeys("L AND T INVESTMENT MANAGEMENT");
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		//joining date(year,month)
		driver.findElement(By.xpath("//div[@id='JDCE']/div/div/div/button")).click();
		driver.findElement(By.linkText("2019")).click();
		driver.findElement(By.xpath("//div[@id='JDCE']/div/div/div/button[@id='mnthbtn']")).click();
		driver.findElement(By.linkText("Apr")).click();
		
		//total year of experience
		driver.findElement(By.xpath("//div[@id='TWE']/div/div/div/button")).click();
		driver.findElement(By.linkText("2")).click();
		
		//monthly salary
		driver.findElement(By.id("MONTHLY_NET_HM_SAL")).sendKeys("30000");
		
		//grossed fixed salary
		driver.findElement(By.id("GROSS_FIXED_M_SAL")).sendKeys("50000");
		
		//currently emi paid
		driver.findElement(By.id("TOTAL_CURR_EMI_PAID")).sendKeys("5000");
		Thread.sleep(3000);
		//check eligibility
		driver.findElement(By.id("eligibility-btn")).click();
		
		
	}

}
