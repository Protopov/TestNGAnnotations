package packTwo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before UseridGeneration");
	}
	
	@BeforeTest
	public void Coocies()
	{
		System.out.println("Delete the Cookies before starting the test");
		//delete cookies
	}
	
	@AfterTest
	public void Cookisclosw()
	{
		System.out.println("Delete the Cookies after completing all the Tests");
	}	
	
	@AfterMethod
	public void Reportadding()
	{
		System.out.println("This block executes after each method");
	}
	
	
	
	
	
	@Test
	public void OpeningBrowser()
	{
		
	//This open the Browser
	System.out.println("executing open browser Test");
	}

	
	@Test
	public void FlightBooking()
	{
		System.out.println("FlightBooking");
	}
}

