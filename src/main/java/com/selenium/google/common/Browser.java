package com.selenium.google.common;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.firefox.*;


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

        String driverToUse = System.getProperty("browser");

        if(StringUtils.isEmpty(driverToUse)) {
            
           FirefoxOptions ff=new FirefoxOptions();
		
		  //Create headless browser using setHeadLess method and set it to true
		  ff.setHeadless(true);
		
		  FirefoxDriver driver=new FirefoxDriver(ff);
            
          return new FirefoxDriver();
        }

        if (driverToUse.equalsIgnoreCase("firefox"))
            return new FirefoxDriver();
        else if (driverToUse.equalsIgnoreCase("ie"))
            return new InternetExplorerDriver();
        else if (driverToUse.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else
            return new FirefoxDriver();
    }

}
