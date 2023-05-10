package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class Signinpojo extends BaseClass {
	public Signinpojo() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createnewacc;
	
	@FindBy(xpath="(//input[@name='firstname'])[1]")
	private WebElement firstnamebox;
	
	
	@FindBy(name="lastname")
	private WebElement secnametextbox;
	
	@FindBy(name="reg_email__")
	private WebElement mobileoremailbox;
	
	@FindBy(name="reg_passwd__")
	private WebElement password;
	
	//getters

	public WebElement getCreatenewacc() {
		return createnewacc;
	}
	public WebElement getFirstnamebox() {
		return firstnamebox;
	}
	public WebElement getSecnametextbox() {
		return secnametextbox;
	}

	public WebElement getMobileoremailbox() {
		return mobileoremailbox;
	}

	public WebElement getPassword() {
		return password;
	}
	
	
	
}
