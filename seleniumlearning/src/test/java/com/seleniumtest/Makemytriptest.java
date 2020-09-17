package com.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytriptest {

	public static void main(String[] args)
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).click();
	Actions action=new Actions(driver);
	action.sendKeys("Hyd").perform();
	action.sendKeys(Keys.DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();
	action.sendKeys("bom").perform();
	action.sendKeys(Keys.DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();
	
	 driver.findElement(By.xpath("//*[@id=\'SW\']/div[1]/div[2]/div/div/nav/ul/li[1]/a/span[1]")).click();
	
		
	}

}