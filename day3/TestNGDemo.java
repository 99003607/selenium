/*
 * BeforeMethod
 * AfterMethod
 */
package Firefox;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	//preconditions
	@BeforeMethod
	public void bM()
	{
		System.out.println("First Method");
	}
	@AfterMethod
	public void aF()
	{
		System.out.println("Last Method");
	}
	@Test
	public void a()
	{
		System.out.println("a");
	}
	@Test
	public void b()
	{
		System.out.println("b");
	}
	@Test
	public void c()
	{
		System.out.println("c");
	}
    
}
