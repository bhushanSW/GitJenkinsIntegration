package com.bsw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoProjects {
	@Test
	public void Loginpage() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriverNew.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/B.selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
        
	}
	
	@Test
	public void checkmsg() {

		System.setProperty("webdriver.chrome.driver", "chromedriverNew.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/B.selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		String txtHeadingA=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		driver.close();
		Assert.assertEquals(txtHeadingA, "Welcome");                                                                                                    
		
	}

}
