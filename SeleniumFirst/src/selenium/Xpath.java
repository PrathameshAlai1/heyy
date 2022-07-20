package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\New folder\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page\r\n");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_d')]")).sendKeys("Alai");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_g')]")).sendKeys("prathameshalai0393@gmail.com");

	}

}
