package com.orangehrm.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PerformaceFunction {

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
	public void EmployeeTracker() {

		try {
			driver.findElement(By.xpath("//a[@href='/web/index.php/performance/viewPerformanceModule']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Alex Popoescu");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@role='option']/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 2)
	public void ConfigureKPIs() {

		try {

			driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Alex Popoescu");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@role='option']/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 3)
	public void Myreviews() {
		try {

			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a"))
					.click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
