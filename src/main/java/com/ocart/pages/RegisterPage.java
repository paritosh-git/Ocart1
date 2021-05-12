package com.ocart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver;

	@FindBy(xpath = "//span[@class='caret']")
	private WebElement myaccount;

	@FindBy(xpath = "//body//div[1]//ul[1]/li[2]//li[1]/a[1]")
	private WebElement register;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstname;

	@FindBy(id = "input-lastname")
	private WebElement lastname;

	@FindBy(id = "input-email")
	private WebElement email;

	@FindBy(id = "input-telephone")
	private WebElement telephone;

	@FindBy(id = "input-password")
	private WebElement password;

	@FindBy(id = "input-confirm")
	private WebElement confirmPass;

	@FindBy(xpath = "//input[@value='0']")
	private WebElement subscribe;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement button;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkclick;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterFirstName(String text) {
		firstname.sendKeys(text);
	}

	public void enterLastName(String text) {
		lastname.sendKeys(text);
	}

	public void enteremail(String text) {
		email.sendKeys(text);
	}

	public void enterTelephone(String text) {
		telephone.sendKeys(text);
	}

	public void enterpassword(String text) {
		password.sendKeys(text);
	}
	
	public void enterConPassword(String text) {
		confirmPass.sendKeys(text);
	}
	
	public void clicksubscribeYN() {
		subscribe.click();
	}
	public void clickBtn() {
		button.click();
	}
	
	public void clickMyAccount() {
		myaccount.click();
	}
	public void clickRegister() {
		register.click();
	}
	public void checkBoxClick() {
		checkclick.click();
	}


}
