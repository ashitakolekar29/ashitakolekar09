package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import sauceDemo.POMClasses.Homepage;
import sauceDemo.POMClasses.Loginpage;

public class TC02AddToCartFunctionalitySingleProduct {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Documents\\velocity\\Selenium Ashita\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		
		
		Loginpage lp = new Loginpage(driver);
		lp.username();
		System.out.println("enter username");
		
		lp.password();
	     System.out.println("enter password");
		
		
		
		lp.login();
		System.out.println("click on login");
		Thread.sleep(2000);	
		
		Homepage hp = new Homepage(driver);
		hp.addtocart();
         System.out.println("add to cart");
		
		


	}

}
