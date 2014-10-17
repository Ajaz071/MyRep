package test;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooNewsTest {
  @Test
  public void yahoonews(){
	  System.out.println("yahoo news open");
	  //Assert.assertEquals ("good","good1");// expected, actual
	  System.out.println("before assertion error");
	 try{
		 Assert.assertFalse (1<6);
	 }catch(Throwable e){
		 System.out.println("caught the error");
		 // error
		 // code - report the errors in to the report
	 }
	 // Assert.assertTrue(7<5);
	 System.out.println("after assertion error");
  }
 
  @Test
  public void sample(){
	  System.out.println("sample news");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method In");
	    
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test In");
	  //throw new SkipException("skipping for some reason");
		  
  }

}
