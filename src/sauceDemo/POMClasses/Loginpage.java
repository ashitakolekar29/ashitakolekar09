package sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage
{
	private  WebDriver driver;

	
	
	@FindBy(xpath="//input[@id ='user-name']")
	private WebElement username;
	
	
	@FindBy(xpath="//input[@id ='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id ='login-button']")
	private WebElement login;
	
	public Loginpage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
      public void username() 
      {
    	  username.sendKeys("standard_user");
    	  
      }	
      public void password() 
      {
    	  password.sendKeys("secret_sauce");
    	  
      }	

      public void login()
      {
    	  login.click();
      }
      
      
}