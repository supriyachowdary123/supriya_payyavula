package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkippingPage {
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
	
	
	//clicking on add to cart,cart button,checkout,giving first name and last name and skipping pincode
	public void Skipping() {
		driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("hello");
		
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("hii");
		
		
		
	}
	
	//clicking the continue button
	public void finish() {
		driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
	}
}
