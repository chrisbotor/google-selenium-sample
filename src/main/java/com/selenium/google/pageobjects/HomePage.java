package com.selenium.google.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * The Class HomePage.
 * 
 * @author Murali
 * 
 */
public class HomePage {

	/** The user textfield. */
    //@FindBy(how= How.ID,using="Email")
    //public WebElement txtEmail;

    /** The password textfield. */
    //@FindBy(how= How.ID,using="Passwd")
    //public WebElement txtPassword;

    /** The button for signing in. */
    //@FindBy(how= How.ID,using="signIn")
    //public WebElement btnLogin;

    /** The label login error msg. */
    //@FindBy(how= How.ID,using="errormsg_0_Email")
    //public WebElement lblLoginErrorMsg;
	
	@FindBy(how= How.ID,using="email")
	public WebElement txtEmail;
	
	@FindBy(how= How.ID,using="pass")
    public WebElement txtPassword;
	
	@FindBy(how= How.ID,using="js_1m")
    public WebElement lblLoginErrorMsg;
	
	@FindBy(how= How.ID,using="loginbutton")
    public WebElement btnLogin;

	@FindBy(partialLinkText="Forgot")
    public WebElement lblLoginErrorMsg1;
	


}
