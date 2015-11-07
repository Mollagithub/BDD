package com.paxotech.qa.framework.Page;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private  WebDriver driver = null;
	

	
	
	@FindBy(how=How.XPATH, using="//*[@id='cart_info']/a[1]/span")
	private WebElement loginLink;
	
	@FindBy(how = How.NAME,using = "q")
	private WebElement searchTextbox;
	
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void showloginpage(){
		loginLink.click();
	}
		
		public void search(String textToSearch){
			searchTextbox.clear();
			searchTextbox.sendKeys(textToSearch);
			
			
		}
		
	
	
	public void verifyUserName(String name){
		 
		 WebElement userName = driver.findElement(By.xpath("//*[@id='cart_info']//a[@class='my-account']"));
		 String text = userName.getText();
		 
		 assertThat(text, is(equalTo(name)));
	}
	

	
	
	
}
