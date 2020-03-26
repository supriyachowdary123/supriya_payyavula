package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FilterPage {
	WebDriver driver;

	public void browser() {
		//Giving driver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amma\\Desktop\\SWAGLAB_PROJECT\\Driversa\\chromedriver.exe");
		driver = new ChromeDriver();
		//maximizing windows
		driver.manage().window().maximize();
		//Giving waits which is used when network is slow
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
 
	//opening the page
	public void LoginSwag() {
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}

	
	// enter username and password
	public void UserName() throws IOException, InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

	}

	
	//clicking on login button
	public void LoginBtn() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);

	}
	
	
	//selecting one drop down menu
	public void Filter() throws InterruptedException {
	Select dropdown1= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
	dropdown1.selectByVisibleText("Price (high to low)");
	Thread.sleep(3000);
	
	}

}
