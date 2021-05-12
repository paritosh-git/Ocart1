package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.ocart.pages.RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDef {
	WebDriver driver;
	RegisterPage rp =null;
	
	
	
	@Given("^user should be on home page for register$")
	public void user_should_be_on_home_page_for_register() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver89.exe");
		driver = new ChromeDriver();
		driver.get("https://eximsoftwares.com/OCart/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		rp = new RegisterPage(driver);
		rp.clickMyAccount();
	}

	@When("^user clicks on register page$")
	public void user_clicks_on_register_page() throws Throwable {
	
		rp.clickRegister();
	   
	}

	@When("^user fills all details$")
	public void user_fills_all_details() throws Throwable {
		rp.enterFirstName("Paritosh");
		rp.enterLastName("Patil");
		rp.enteremail("paritosh2b@gmail.com");
		rp.enterTelephone("7020350492");
		rp.enterpassword("paritosh007");
		rp.enterConPassword("paritosh007");
		rp.clicksubscribeYN();
		rp.checkBoxClick();
	}

	@When("^click submit button$")
	public void click_submit_button() throws Throwable {
		rp.clickBtn();
	}

	@Then("^user should get successfull register msg$")
	public void user_should_get_successfull_register_msg() throws Throwable {
		
//		String actmsg = driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]")).getText();
//		String expMessage ="Your Account Has Been Created!";
//		System.out.println("actmsg>>" + expMessage);
//		 Assert.assertEquals(actmsg, expMessage);
//		 driver.quit();
	}


}