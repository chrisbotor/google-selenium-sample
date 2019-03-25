package com.selenium.google.tests;

import com.selenium.google.common.Browser;
import com.selenium.google.pages.Login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest  {

    public WebDriver driver;

    @BeforeSuite
    public void setUp(){
        this.driver = Browser.getDriver();
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
    }


    @Test
    public void CorrectDetails() {
    	Login login = new Login(driver);
    	login.perform("username", "chrisbotor@gmail.com");
		login.perform("password", "M@y022015!");
    }
    
    
    @Test
	public void BlankUserNameRightPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("password", "M@y022015!");
	
    }
    
    
    @Test
	public void RightUserNameBlankPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("username", "chrisbotor@gmail.com");
		Assert.assertTrue(login.getErrorMsg().contains("Forgot Password"));
    }
    
    
    
	/*
    @Test
	public void blankUserNameRightPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("", "rightpassword");
		Assert.assertTrue(login.getErrorMsg().contains("Enter your email address."));
	}
    */    
	

	/*
	@Test
	public void wrongUserNameRightPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform(" wrongUserName", "rightpassword");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Enter your email address."));
	}
       
	
	@Test
	public void blankUserNameWrongPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("", "wrongpassword");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Username cannot be empty"));
	}
	@Test
	public void blankUserNameBlankPasswordLoginTest(){
		Login login = new Login(driver);
		login.perform("", "");
		Assert.assertTrue(HomePage.getErrorMessage(driver).getText().contains("Username and password cannot be empty"));
	}*/
}
