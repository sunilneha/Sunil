package smarttestCasepageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSmartApptointmentPageObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sunil\\jarfile\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://www.smartappointment.com/");


	}

}
