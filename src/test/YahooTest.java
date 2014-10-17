package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	@BeforeSuite // this will use in begining of to execute more than one file as a batch. write in any one file to execute.
				// once before executing all tests in java files as a batch
	public void beforesuite(){ 
		System.out.println("initialize selenium");
	}
	
	@AfterSuite
		public void aftersuite(){
		System.out.println("shutdown selenium");
	}
	
	
	
	@BeforeTest // before executing all test cases
	  public void beforeTest() {
		  System.out.println("connecting to DB");
	  }
	
	
	 @BeforeMethod // before executing every test case
	  public void beforeMethod() {
		  System.out.println("opening browser");
	  }
	
	
	@Test
  public void testreceivemail() { // some selenium code
	  System.out.println("receiving mail");
  }
  
  @Test
  public void testsendmail() { // some selenium code
	  System.out.println("sending mail");
  }
  @AfterMethod // after executing every test case
  public void aftermethod(){
	  System.out.println("closing browser");
  }
 
  
  @AfterTest // after executing all test cases
  public void closeconnection(){
	  System.out.println("closing connection");
  }
}
