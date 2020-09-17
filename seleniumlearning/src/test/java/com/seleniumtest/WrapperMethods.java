package com.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WrapperMethods {

	 WebDriver driver;
	    
	    public void insertapp1(String url)
	    {
	    	WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
	    }
	    public void enterbyid1()
		{
	    	driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8639013021");
		}
	    public void clickbyId1()
	    {
	    	driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("pgk29819980");	    }
	    
	    /*public void click()
	    {
	    	 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
			 
	    }*/
	    public void click1()
	    {
	    	driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	    }
	    
	 
}
