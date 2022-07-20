package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\ChromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://api.jquery.com/dblclick/");
		
		driver.switchTo().frame(0);
		
		WebElement z=driver.findElement(By.xpath("/html[1]/body[1]/div[1]"));

		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.doubleClick(z).build().perform();
	}

}
