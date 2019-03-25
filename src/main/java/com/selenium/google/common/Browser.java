package com.selenium.google.common;

//import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxBinary;


/**
 * The Class Browser.
 * 
 * @author Murali
 *   
 */
public class Browser {

    /**
     * Gets the driver.
     *
     * @return the driver
     */
    public static WebDriver getDriver() {
    	
    	FirefoxBinary firefoxBinary = new FirefoxBinary();
    	firefoxBinary.addCommandLineOptions("-headless");
    	System.setProperty("webdriver.gecko.driver","/opt/geckodriver");
    	FirefoxOptions fo = new FirefoxOptions();
    	fo.setBinary(firefoxBinary);
    	FirefoxDriver driver=new FirefoxDriver(fo);
    
    return driver;
    }

}
