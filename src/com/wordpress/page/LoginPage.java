/**
 * 
 */
package com.wordpress.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Cliffex Laptop 1
 *
 * THus class will store all the locatore and 
 */
public class LoginPage {
	
	WebDriver driver;
	
	
	 By username=By.id("user_login");
	 By passowrd=By.xpath(".//input[@id='user_pass'");
	 By login=By.name("wp-submit");
	 
	 
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
 
	  public void typeUserName()
	  {
		  driver.findElement(username).sendKeys("admin");
	  }
	  
	  public void typePassword()
	  {
		  driver.findElement(passowrd).sendKeys("demo123");
	  }
	  public void clickOnLoginButton()
	  {
		  driver.findElement(login).click();
	  }
}
