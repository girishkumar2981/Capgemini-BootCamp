package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {
	WebDriver driver1;
	@Test
	public void captureScreenShot() {
		WebDriverManager.chromedriver().setup();
		driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		//SeleniumUtilities.captureScreenShot(driver1,"Browser Started");//
		driver1.findElement(By.xpath("//*[@id='email']")).sendKeys("Learning Automation");
		Assert.assertEquals("xyv", "abg");
	}
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()) {
		//SeleniumUtilities.captureScreenShot(driver1,result.getName());
		}
		driver1.quit();
	}

}