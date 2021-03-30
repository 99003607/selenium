/*
* Controlling Sliders in web page
*/
package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Sliders {
	public static void main(String[] args) {
		System.out.println("Selenium");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training\\Documents\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
		driver.manage().window().maximize();
		
	     
	    WebElement ele=driver.findElement(By.xpath("//*[@id=\"slider1\"]/div/input"));
	    Actions move=new Actions(driver);
	    Action action=(Action) move.dragAndDropBy(ele, 80, 0).build();
	    action.perform();
	}

}
