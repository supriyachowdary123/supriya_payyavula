package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageWrngPass {
	WebDriver driver;
	public void Browser_Wrng_User() { 
		
		//Giving driver paths
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\amma\\Desktop\\SWAGLAB_PROJECT\\Driversa\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//maximizing windows
		driver.manage().window().maximize();
		//Giving waits which is used when network is slow
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}

	public void LoginSwag_Wrng_User() 
	{
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
	}
	
	
	public void UserName_Wrng_User() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		
	}
	
	
	//Giving wrong password
	public void Password_Wrng_User() throws IOException, InterruptedException 
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauc");
		
	}
	
	public void LoginBtn_Wrng_User() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		Thread.sleep(3000);
		driver.close(); // close the current tab
	}
	


}
