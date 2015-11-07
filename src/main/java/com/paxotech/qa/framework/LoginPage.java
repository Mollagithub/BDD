package com.paxotech.qa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how = How.NAME, using = "j_username") 
	private WebElement emailTextbox;
	
	@FindBy(how = How.NAME, using = "j_password") 
	private WebElement passwordTextbox;
	 
	@FindBy(how = How.XPATH, using = "//*[@id='login']/div/form/div[3]/input") 
	private WebElement loginButton ;
	
	

	public void login(String userid, String password){
		this.emailTextbox.sendKeys(userid);
		this.passwordTextbox.sendKeys(password);
		this.loginButton.click();
		
	
	}



}
