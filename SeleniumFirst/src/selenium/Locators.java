package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page\r\n");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).sendKeys("Prathamesh");

		driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
	}

}
