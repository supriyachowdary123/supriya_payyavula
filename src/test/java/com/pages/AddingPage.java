package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingPage {

	WebDriver driver;

	public void browser() {
		// Giving driver path
		System.setProperty("webdriver.chrome.driver", "Driversa\\chromedriver.exe");
		driver = new ChromeDriver();
		// maximizing windows
		driver.manage().window().maximize();
		// Giving waits which is used when network is slow
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// opening the  swaglabs website
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

	// Adding an item to the cart
	public void AddCart() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
		
		//Removing an item from the cart by clicking on remove
		driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
		Thread.sleep(3000);
	}

}
