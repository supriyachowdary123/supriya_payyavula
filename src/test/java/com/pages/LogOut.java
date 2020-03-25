package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOut {
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
	
	
	//clicking on login button
	public void LoginBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);
		
	}
	
	
	//clicking on menu button
	public void MenuBtn() throws InterruptedException {
	driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
	Thread.sleep(4000);

}
	
	
	//clicking on logout button
	public void LogoutBtn() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(4000);
	}
}
