package com.orangehrm.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BuzzFunction {

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
	public void Recentposts() {
		try {

			driver.findElement(By.xpath("//a[@href='/web/index.php/buzz/viewBuzz']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//button[@class='oxd-button oxd-button--medium oxd-button--label-warn orangehrm-post-filters-button']"))
					.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 2)
	public void MostLikedPosts() {
		try {

			driver.findElement(By.xpath("//i[@class='oxd-icon bi-heart-fill oxd-button-icon']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 3)
	public void MostCommentedPosts() {
		try {

			driver.findElement(By.xpath("//i[@class='oxd-icon bi-chat-dots-fill oxd-button-icon']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(priority = 4)
	public void AddNewPost() {

		try {

			driver.findElement(By.xpath("//textarea[@class='oxd-buzz-post-input']")).sendKeys("Feeling Happy");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main']")).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
