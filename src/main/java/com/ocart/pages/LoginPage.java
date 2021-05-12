package com.ocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(xpath = "//span[@class='caret']")
	private WebElement myaccount;
	
	@FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
	private WebElement login;
	
	@FindBy(xpath = "//input[@placeholder='E-Mail Address']")
	private WebElement email;
	

	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement pass;
	

	@FindBy(xpath="//button")
	private WebElement lgnBtn;
	
	@FindBy(id="logo")
	private WebElement logo;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String text) {
		email.sendKeys(text);
	}
	public void enterPass(String text) {
		pass.sendKeys(text);
	}
	public void clickBtn() {
		lgnBtn.click();
	}
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
	
	public void clickMyAccount() {
		myaccount.click();
	}
	public void clicLogin() {
		login.click();
	}
	
	public void validLogin() {
		enterEmail("paritosh2b@gmail.com");
		enterPass("paritosh007");
		clickBtn();
}
}