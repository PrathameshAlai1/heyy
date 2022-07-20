package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amaz {
	
	public static void main (String args[]) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	
	WebElement element = driver.findElement(By.xpath("//span[@class='icp-nav-flag icp-nav-flag-in']"));
	Actions ac = new Actions(driver);
	ac.moveToElement(element).build().perform();
	Thread.sleep(2000);
	List<WebElement> x = driver.findElements(By.xpath("//a[contains(@href,'#switch-lang')]/span/i"));
	x.get(1).click();
	Thread.sleep(2000);

	}

}
