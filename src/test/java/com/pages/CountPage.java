package com.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountPage {
	WebDriver driver;

	public void browser() {

		// Giving driver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amma\\Desktop\\SWAGLAB_PROJECT\\Driversa\\chromedriver.exe");
		driver = new ChromeDriver();
		// maximizing windows
		driver.manage().window().maximize();
		// Giving waits which is used when network is slow
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		// opening the webpage
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}

	// entering username and password
	public void UserName() throws IOException, InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

	}

	// clicking on login button
	public void LoginBtn() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);

	}

	// checking how many images are there in the page
	public void imageTags() {

		List<WebElement> a = driver.findElements(By.tagName("img"));
		System.out.println(a.size());
	}

}
