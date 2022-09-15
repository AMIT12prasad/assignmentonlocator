package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crmacess {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://crmaccess.vtiger.com/log-in/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("disko@123");

	}

}
