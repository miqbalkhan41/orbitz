package com.orbitz;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzLogin {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\15164\\eclipse-workspace\\Orbitz\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		
		if (driver.getPageSource().contains("ORBITZ"))
			
		{
		 System.out.println("Test Present");
		}
		 
		 else { System.out.println("Test not Present");
		 
		 }
		
		
		WebElement account = driver.findElement(By.xpath("//*[contains(@id,'header-account-menu')]"));
		account.click();
		
		WebElement signin = driver.findElement(By.xpath("//*[contains(@id,'header-account-signin-button')]"));
		signin.click();
		
	
		WebElement EmailAddress  = driver.findElement(By.xpath("//*[contains(@id,'signin-loginid')]"));
		EmailAddress.sendKeys("applicationtesttt@gmail.com");
		
		
		WebElement Password = driver.findElement(By.xpath("//*[contains(@id,'signin-password')]"));
		Password.sendKeys("application");
		
		WebElement SignIn = driver.findElement(By.xpath("//*[contains(@id,'submitButton')]"));
		SignIn.click();
				
		
		
		
		
		
	}
	
	
	
}
