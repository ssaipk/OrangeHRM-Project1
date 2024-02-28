package com.orangehrm.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dashboard {

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
	public void EmployeesonLeave() {
		try {

			driver.findElement(By.xpath("//a[@href='/web/index.php/dashboard/index']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(4000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 2)
	public void EmployeeTimesheets() {

		try {

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@title='Timesheets']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Pauli Collings");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@role='option']/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 3)
	public void MyTimesheets() {

		try {

			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@title='My Timesheet']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 4)
	public void PunchIn() {
		try {

			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@placeholder='Type here']")).sendKeys("Punching In");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			driver.quit();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
