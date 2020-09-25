/**
 * 
 */
package com.wordpress.Testcase;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wordpress.page.LoginPage;

/**
 * @author Cliffex Laptop 1
 *
 */
public class VerifyWorepressLogin {
	
	@Test
	public void verifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sunil\\jarfile\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPage login=new LoginPage(driver);
	}

}
