package com.selenium_utility;

import com.testng.AfterMethod;
import com.testng.ChromeDriver;
import com.testng.File;
import com.testng.ITestResult;
import com.testng.TakesScreenshot;
import com.testng.Test;
import com.testng.WebDriver;

public class SeleniumUtility {
	public static void captureScreenShot(WebDriver driver2,String screenShotName) {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver2;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("src/test/resources/ScreenShots/"+screenShotName+".png"));
			System.out.println("ScreenShot Taken");
			
		}catch(Exception e) {
			System.out.println("Exception during taking screenshot ");
			
		}
		
	}
	public class CaptureScreenShot {
		WebDriver driver1;
		@Test
		public void captureScreenShot() {
			WebDriverManager.chromedriver().setup();
			driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("https://www.facebook.com/");
			SeleniumUtilities.captureScreenShot(driver1,"Browser Started");
			driver1.findElement(By.xpath("//*[@id='email']")).sendKeys("Learning Automation");
			Assert.assertEquals("xyv", "abg");
		}
		@AfterMethod
		public void tearDown(ITestResult result) {
			if(ITestResult.FAILURE == result.getStatus()) {
			SeleniumUtilities.captureScreenShot(driver1,result.getName());
			}
			driver1.quit();
		}

	}
}

}
