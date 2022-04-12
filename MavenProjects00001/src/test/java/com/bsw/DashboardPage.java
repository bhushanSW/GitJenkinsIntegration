package com.bsw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardPage {
    @Test
    public void checkmsg01() {
    	System.setProperty("webdriver.chrome.driver", "chromedriverNew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/Admin/Downloads/B.selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail.");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("741852");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String Msg=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div")).getText();
		driver.close();
		Assert.assertEquals(Msg,"Please enter valid Password");
		

    }
    @Test
    public void checkmsg02() {
    	System.setProperty("webdriver.chrome.driver", "chromedriverNew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/Admin/Downloads/B.selenium/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("kiran@gmail123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		String Msg=driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/div")).getText();
		driver.close();
		Assert.assertEquals(Msg,"Please enter valid email");
		
	
    	
    }
}
