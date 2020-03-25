package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovePage {
	WebDriver driver;
	public void browser() { 
		
		
		//Giving driver paths
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\amma\\Desktop\\SWAGLAB_PROJECT\\Driversa\\chromedriver.exe");
		driver = new ChromeDriver();
		//maximizing windows
		driver.manage().window().maximize();
		//Giving waits which is used when network is slow
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void LoginSwag() 
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	
	//entering username and password
	public void UserName() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		
	}
	
	
	
	public void LoginBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);
		
	}
	 
	
	//Adding item to the cart and clicking on cart button
	public void CartBtn() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[contains(@class,'svg-inline--fa fa-shopping-cart fa-w-18 fa-3x')]")).click();
		Thread.sleep(3000);
	}
   
	//Remove an item from the cart
	public void Remove() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='btn_secondary cart_button']")).click();
		Thread.sleep(4000);
	}
	
	//Clicking on continue shopping
	public void Continue() throws InterruptedException {
	driver.findElement(By.xpath("//a[@class='btn_secondary']")).click();
	Thread.sleep(4000);
	}
}
