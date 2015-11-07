package com.paxotech;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskProcess {
	private WebDriver driver;

       @Before
	    public void setUp(){
    	  // driver=new FirefoxDriver();
	   // driver=new PhantomJSDriver();
    	driver.get("https://www.google.com/");
	    }
	    @Test
	    public void test(){
	    	System.out.println("Hello we cant run");
	    	
	    }
		
	    @After
	    public void tearDown(){
	    	driver.close();
	    	driver.quit();
	    
	    }
}

	


