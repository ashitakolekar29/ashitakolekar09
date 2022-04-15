package sauceDemo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Homepage
{
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id ='react-burger-menu-btn']")
	private WebElement menu;
	
	
	@FindBy(xpath="//a[@id ='logout_sidebar_link']")
	private WebElement logout;

 	@FindBy(xpath = "//button[@id ='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocart;

 	
	public Homepage(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver, this);
	}
	
	public void menu()
	{
		menu.click();
	}
	public void logout()
	{
		logout.click();
	}
	
	public void addtocart()
	{
		addtocart.click();
	}

	
	
	}
