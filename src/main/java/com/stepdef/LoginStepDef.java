package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ocart.pages.LoginPage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

	
	WebDriver driver;
	LoginPage lp=null;
	
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver89.exe");
		driver = new ChromeDriver();
		driver.get("https://eximsoftwares.com/OCart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
		lp.clickMyAccount();
		lp.clicLogin();
	}

	@When("^user enters email and password and click login button$")
	public void user_enters_email_and_password_and_click_login_button() throws Throwable {
	    lp.enterEmail("paritosh2b@gmail.com");
	    lp.enterPass("paritosh007");
	    lp.clickBtn();
	}

	@Then("^user will be on home page$")
	public void user_will_be_on_home_page() throws Throwable {
		 Assert.assertEquals("Account Login", driver.getTitle());
	}

	@Then("^user should see OctaCart logo$")
	public void user_should_see_OctaCart_logo() throws Throwable {
	   lp.verifyLogo();
	}


}
