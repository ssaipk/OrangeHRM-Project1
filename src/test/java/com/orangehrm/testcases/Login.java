package com.orangehrm.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {

	WebDriver driver;

	@Test
	public void Loginpage() {
		try {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(3000);
			driver.findElement(By.className("oxd-button")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
