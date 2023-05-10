package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass {
	
	//1.non parameterized constructor
	
	public FlipkartPojo() {
		PageFactory.initElements(driver, this);
	}
	
	//2.private web elements
	@FindAll({
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//input[@name='email']"),
		@FindBy(xpath="//input[@data-testid='royal_email']")
	})
	
	private WebElement VarRef;
	
	@FindBy(xpath ="//input[@aria-label='Password']")
	private WebElement password;
	
	@FindBy(name ="login")
	private WebElement loginbtn;
	
	//3.getters to access web element to outside the class
	public WebElement getVarRef() {
		return VarRef;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	

	
	
	
	
	
	
	
	
	

}
