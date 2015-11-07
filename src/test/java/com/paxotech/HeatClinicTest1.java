package com.paxotech;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paxotech.qa.framework.LoginPage;
import com.paxotech.qa.framework.ScriptBase;
import com.paxotech.qa.framework.Page.HomePage;

public class HeatClinicTest1 extends ScriptBase {
	
	
	@Test
	public void test() {
		
		 //WebElement loginLink = driver.findElement(By.xpath("//*[@id='cart_info']/a[1]/span"));
		 //loginLink.click();
		
		HomePage homePage= new HomePage(driver);
		//homePage.showloginpage();
		
		homePage.search("hotsauces");
		
		 
		 WebElement emailTextbox = driver.findElement(By.name("j_username"));
		 emailTextbox.sendKeys("forkan.ali12@yahoo.com");
		 
		 WebElement passwordTextbox = driver.findElement(By.name("j_password"));
		 passwordTextbox.sendKeys("A12345");
		 
		 WebElement loginButton = driver.findElement(By.xpath("//*[@id='login']/div/form/div[3]/input"));
		 loginButton.click();
		 
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		 WebElement username= driver.findElement(By.xpath(".//*[@id='cart_info']//a[@class='my-account']"));
		 String text =username.getText();
		 assertThat(text, is(equalTo("md")));
	}
	
	
	

	

}
