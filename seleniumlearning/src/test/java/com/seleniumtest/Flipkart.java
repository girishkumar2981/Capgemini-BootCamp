package com.seleniumtest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8639013021");
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("pgk29819980");
		driver.findElement(By.xpath("//html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg")).click();
		
	}

}   