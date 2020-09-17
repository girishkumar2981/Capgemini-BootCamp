package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartTestMethods {

	 WebDriver driver;
	    
	    public void insertapp1()
	    {
	    	WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
	    }
}
