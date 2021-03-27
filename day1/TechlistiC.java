package ex1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TechlistiC {
	public static void main(String[] args) {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("hello");
		driver.findElement(By.name("lastname")).sendKeys("12345");
		//radio button
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("exp-2")).click();
		//text box
		driver.findElement(By.id("datepicker")).sendKeys("27/03/2021");
		//checkbox
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		//dropdown
		Select continent=new Select(driver.findElement(By.id("continents")));
		continent.selectByVisibleText("Australia");
		//dropdown
		Select commands=new Select(driver.findElement(By.id("selenium_commands")));
		commands.selectByVisibleText("Wait Commands");
		//button
		driver.findElement(By.id("submit")).click();
	}

}
