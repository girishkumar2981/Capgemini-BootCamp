package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	
WebDriver driver;
	
	@BeforeTest
	public void launchApp() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();	  
		driver.manage().window().maximize();
   	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.makemytrip.com/");
	}

	@Test
	public void booking() {
		 driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[1]")).click();
		
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("HYD");
		 
		 driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("DEL");
	}
}
