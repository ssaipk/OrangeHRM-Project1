package com.orangehrm.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LeaveFunction {

	WebDriver driver;

	@Test
	public void InitializeBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void Login() {
		try {

			Thread.sleep(1000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			Thread.sleep(1000);
			driver.findElement(By.name("password")).sendKeys("admin123");
			Thread.sleep(1000);
			driver.findElement(By.className("oxd-button")).click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 1)
	public void ConfigureLeavePeriod() {

		try {

			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 2)
	public void ConfigureWorkWeek() {

		try {

			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[5]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[5]/ul/li[3]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.quit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
